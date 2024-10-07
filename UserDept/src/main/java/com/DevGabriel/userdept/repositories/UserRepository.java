package com.DevGabriel.userdept.repositories;

import com.DevGabriel.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
