package com.codegym.casestudymodule2.entity;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "dichvu")
public class DichVu {
    @Id
    @Column(name="iddichvu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDichVu;

    @Column(name = "tendichvu")
    private String tenDichVu;

    @Column(name = "dientich")
    private int dienTich;

    @Column(name="sotang")
    private int soTang;

    @Column(name = "songuoitoida")
    private String soNguoiToiDa;

    @Column(name = "chiphithue")
        private double chiPhiThue;
//    @Column(name = "idkieuthue")
//    private int idKieuThue;
    @Column(name="trangthai")
    private String trangThai;
    @ManyToOne
    @JoinColumn(name="idloaidichvu")
    private LoaiDichVu loaiDichVu;
    @OneToMany(targetEntity = HopDong.class)
    private List<HopDong> hopDongs;
    public Long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public String getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(String soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

//    public int getIdKieuThue() {
//        return idKieuThue;
//    }
//
//    public void setIdKieuThue(int idKieuThue) {
//        this.idKieuThue = idKieuThue;
//    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LoaiDichVu getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public DichVu() {
    }

    public DichVu(String tenDichVu, int dienTich, int soTang, String soNguoiToiDa, double chiPhiThue, String trangThai) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.soNguoiToiDa = soNguoiToiDa;
        this.chiPhiThue = chiPhiThue;
//        this.idKieuThue = idKieuThue;
        this.trangThai = trangThai;
    }
}
