package guru.springframework.basicauth.controller;

import guru.springframework.basicauth.model.TousLesFilms;
import guru.springframework.basicauth.repository.TousLesFilmsRepository;
import guru.springframework.basicauth.repository.UserRepository;
import guru.springframework.basicauth.exceptions.ResourceNotFoundException;
import guru.springframework.basicauth.model.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class UserController {
    private UserRepository userRepository;
    private TousLesFilmsRepository tousLesFilmsRepository;

    public UserController(UserRepository userRepository, TousLesFilmsRepository tousLesFilmsRepository) {
        this.userRepository = userRepository;
        this.tousLesFilmsRepository = tousLesFilmsRepository;
    }

    @PostMapping("/user/save")
    public User saveUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<User>> getUsers() throws IOException {

        return ResponseEntity.ok(this.userRepository.findAll());
    }


    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable(value = "id") long id) {
        User user = this.userRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("Utilisateur non trouvé"));
        return ResponseEntity.ok().body(user);
    }

    @PutMapping("user/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable(value = "id") Long id){
        return this.userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setSurname(newUser.getSurname());
                    user.setEmail(newUser.getEmail());
                    user.setUsername(newUser.getUsername());
                    user.setPassword(newUser.getPassword());
                    return this.userRepository.save(user);
                })
                .orElseGet(()->{
                    newUser.setId(id);
                    return this.userRepository.save(newUser);
                });
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity<Void> removeUser(@PathVariable(value = "id") Long id){
        User user =this.userRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("User not found"+id)
        );

        this.userRepository.delete(user);
        return ResponseEntity.ok().build();
    }


}
