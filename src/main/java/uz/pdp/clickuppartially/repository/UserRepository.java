package uz.pdp.clickuppartially.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.clickuppartially.entity.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
