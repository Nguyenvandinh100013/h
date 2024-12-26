package com.example.demo_1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo_1.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

