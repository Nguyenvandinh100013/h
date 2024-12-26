package com.example.demo_1.repository;

import com.example.demo_1.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}