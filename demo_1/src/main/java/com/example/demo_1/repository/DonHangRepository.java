package com.example.demo_1.repository;

import com.example.demo_1.models.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonHangRepository extends JpaRepository<DonHang, Long> {
}