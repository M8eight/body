package com.videohub.repositories.userRepositories;

import com.videohub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT COUNT(u) FROM User u")
    long countUser();

    Optional<User> findUserByLogin(String username);

    boolean existsUserByLogin(String email);

     boolean existsUserByEmail(String email);
}
