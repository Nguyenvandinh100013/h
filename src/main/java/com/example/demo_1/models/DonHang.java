package com.example.demo_1.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DonHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date ngayDat;

    private Date ngayGiao;

    private String diaChiGiao;

    private Long tongTien;

    private Long userId;

    private Long thuocId;

    // Getter và Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public String getDiaChiGiao() {
        return diaChiGiao;
    }

    public void setDiaChiGiao(String diaChiGiao) {
        this.diaChiGiao = diaChiGiao;
    }

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getThuocId() {
        return thuocId;
    }

    public void setThuocId(Long thuocId) {
        this.thuocId = thuocId;
    }
}