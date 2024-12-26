package com.example.demo_1.service;
import com.example.demo_1.models.Thuoc;
import com.example.demo_1.repository.ThuocRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ThuocService {

    private final ThuocRepository thuocRepository;

    public ThuocService(ThuocRepository thuocRepository) {
        this.thuocRepository = thuocRepository;
    }

    public List<Thuoc> getAllThuoc() {
        return thuocRepository.findAll();
    }

    public Thuoc getThuocById(Long id) {
        return thuocRepository.findById(id).orElse(null);
    }

    public Thuoc saveThuoc(Thuoc thuoc) {
        return thuocRepository.save(thuoc);
    }

    public void deleteThuoc(Long id) {
        thuocRepository.deleteById(id);
    }
}
