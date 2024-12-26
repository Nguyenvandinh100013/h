package com.example.demo_1.controller;

import com.example.demo_1.models.Thuoc;
import com.example.demo_1.service.ThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/thuoc")
public class ThuocController {

    @Autowired
    private ThuocService thuocService;

    @GetMapping
    public List<Thuoc> getAllThuoc() {
        return thuocService.getAllThuoc();
    }

    @GetMapping("/{id}")
    public Thuoc getThuocById(@PathVariable Long id) {
        return thuocService.getThuocById(id);
    }

    @PostMapping
    public Thuoc saveThuoc(@RequestBody Thuoc thuoc) {
        return thuocService.saveThuoc(thuoc);
    }

    @PutMapping("/{id}")
    public Thuoc updateThuoc(@PathVariable Long id, @RequestBody Thuoc thuoc) {
        return thuocService.saveThuoc(thuoc);
    }

    @DeleteMapping("/{id}")
    public void deleteThuoc(@PathVariable Long id) {
        thuocService.deleteThuoc(id);
    }
}