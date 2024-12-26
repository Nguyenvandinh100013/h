package com.example.demo_1.controller;

import com.example.demo_1.models.DonHang;
import com.example.demo_1.service.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/don-hang")
public class DonHangAdminController {

    @Autowired
    private DonHangService donHangService;

    @GetMapping
    public List<DonHang> getAllDonHang() {
        return donHangService.getAllDonHang();
    }

    @GetMapping("/{id}")
    public DonHang getDonHangById(@PathVariable Long id) {
        return donHangService.getDonHangById(id);
    }

    @PostMapping
    public DonHang saveDonHang(@RequestBody DonHang donHang) {
        return donHangService.saveDonHang(donHang);
    }

    @PutMapping("/{id}")
    public DonHang updateDonHang(@PathVariable Long id, @RequestBody DonHang donHang) {
        return donHangService.saveDonHang(donHang);
    }

    @DeleteMapping("/{id}")
    public void deleteDonHang(@PathVariable Long id) {
        donHangService.deleteDonHang(id);
    }
}