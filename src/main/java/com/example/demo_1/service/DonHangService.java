package com.example.demo_1.service;

import com.example.demo_1.models.DonHang;
import com.example.demo_1.repository.DonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonHangService {

    @Autowired
    private DonHangRepository donHangRepository;

    public List<DonHang> getAllDonHang() {
        return donHangRepository.findAll();
    }

    public DonHang getDonHangById(Long id) {
        return donHangRepository.findById(id).orElse(null);
    }

    public DonHang saveDonHang(DonHang donHang) {
        return donHangRepository.save(donHang);
    }

    public void deleteDonHang(Long id) {
        donHangRepository.deleteById(id);
    }
}