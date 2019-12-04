package com.codegym.casestudymodule2.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="loaidichvu")
public class LoaiDichVu {
    @OneToMany(targetEntity = DichVu.class)
    private List<DichVu> dichVus;
    @Column(name="idloaidichvu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idLoaiDichVu;
    @Column(name ="tenloaidichvu")
    private String tenLoaiDichVu;

    public LoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public LoaiDichVu() {
    }

    public Long getIdLoaiDichVu() {
        return idLoaiDichVu;
    }

    public void setIdLoaiDichVu(Long idLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }
}
