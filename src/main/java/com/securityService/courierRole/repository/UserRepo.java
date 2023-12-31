package com.securityService.courierRole.repository;

import com.securityService.courierRole.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long id);

    boolean existsByEmail(String email);
    boolean existsByEmailAndPassword(String email, String password);

    Optional<User> findByEmail(String email);
    User findUserByEmail(String email);
}
