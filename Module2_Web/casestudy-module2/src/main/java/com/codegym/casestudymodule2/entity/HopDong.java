package com.codegym.casestudymodule2.entity;

import org.hibernate.annotations.GeneratorType;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="hopdong")
public class HopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idhopdong")
    private Long idHopDong;

    @Column(name="ngaylamhopdong")
    private Date ngayLamHopDong;

    @Column(name="ngayketthuc")
    private Date ngayKetThuc;
    @ManyToOne
    @JoinColumn(name = "iddichvu")
    private DichVu dichVu;
    @ManyToOne
    @JoinColumn(name="idkhachhang")
    private KhachHang khachHang;

    public HopDong(Date ngayLamHopDong, Date ngayKetThuc) {
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
    }

    public HopDong() {
    }

    public Long getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(Long idHopDong) {
        this.idHopDong = idHopDong;
    }

    public Date getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(Date ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
}
