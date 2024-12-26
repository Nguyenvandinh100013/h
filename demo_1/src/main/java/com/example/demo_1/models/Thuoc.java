package com.example.demo_1.models;

import jakarta.persistence.*;


    @Entity
    public class Thuoc {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String ten;
        private Double gia;
        // Getter và Setter

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public Double getGia() {
            return gia;
        }

        public void setGia(Double gia) {
            this.gia = gia;
        }
    }
