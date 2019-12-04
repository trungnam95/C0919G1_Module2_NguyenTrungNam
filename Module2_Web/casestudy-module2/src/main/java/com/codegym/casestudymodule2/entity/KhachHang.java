package com.codegym.casestudymodule2.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "khachhang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idkhachhang")
    private Long idKhachHang;

    @Column(name = "hoten")
    private String hoTen;

    @Column(name="ngaysinh")
    private Date ngaySinh;

    @Column(name = "socmtnd")
    private String idCard;

    @Column(name="sdt")
    private String sDT;

    @Column(name="email")
    private String email;

    @Column(name = "diachi")
    private String diaChi;

    @OneToMany(targetEntity = HopDong.class)
    private List<HopDong> hopDongs;

    public KhachHang(String hoTen, Date ngaySinh, String idCard, String sDT, String email, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.idCard = idCard;
        this.sDT = sDT;
        this.email = email;
        this.diaChi = diaChi;
    }

    public KhachHang() {
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<HopDong> getHopDongs() {
        return hopDongs;
    }

    public void setHopDongs(List<HopDong> hopDongs) {
        this.hopDongs = hopDongs;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }
}
