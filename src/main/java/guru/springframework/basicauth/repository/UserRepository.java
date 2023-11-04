package guru.springframework.basicauth.repository;

import guru.springframework.basicauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
