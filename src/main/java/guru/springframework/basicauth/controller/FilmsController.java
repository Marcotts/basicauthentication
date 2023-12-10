package guru.springframework.basicauth.controller;

import guru.springframework.basicauth.model.TousLesFilms;
import guru.springframework.basicauth.repository.TousLesFilmsRepository;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class FilmsController {
    private TousLesFilmsRepository tousLesFilmsRepository;

    public FilmsController(TousLesFilmsRepository tousLesFilmsRepository) {
        this.tousLesFilmsRepository = tousLesFilmsRepository;
    }

    @GetMapping("/films/all")
    public ResponseEntity<List<TousLesFilms>> getUsers() throws IOException {

        return ResponseEntity.ok(this.tousLesFilmsRepository.findAllMyAll());
    }

    @GetMapping("/films/one/{id}")
    public ResponseEntity<List<TousLesFilms>> getUsers2(@PathVariable(value = "id") long id) throws IOException {

        return ResponseEntity.ok(this.tousLesFilmsRepository.findMyQuery(id));
    }

    @GetMapping("/films/ones/{id}")
    public ResponseEntity<String> getUsers3(@PathVariable(value = "id") long id) throws IOException {

        return ResponseEntity.ok(this.tousLesFilmsRepository.findMyQuery3(id).toString());
    }

    @GetMapping("/films/range/{idKeyLower}&{idKeyHigher}")
    public ResponseEntity<List<TousLesFilms>> getUsers3(@PathVariable(value = "idKeyLower") long id1, @PathVariable(value = "idKeyHigher") long id2) throws IOException {

        return ResponseEntity.ok(this.tousLesFilmsRepository.findMyQuery2(id1,id2));
    }

}
