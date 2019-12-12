package com.finaltest.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Entity
@Table(name = "khachhang")
public class KhachHang {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkhachhang")
    private Long id;

    @Column(name = "loaikhachhang")
    @NotEmpty
    private String loaiKhachHang;

    @Column(name = "hoten")
    @NotEmpty
    private String hoTen;

    @Column(name = "gioitinh")
    @NotEmpty
    private String gioiTinh;

    @Column(name = "sodienthoai")
    @NotEmpty
    @Pattern(regexp="(09|01[2|6|8|9])+([0-9]{8})\\b",message = "Phone number is invalid")
    private String soDienThoai;


    @Column(name = "socmnd")
    @NotEmpty
    private String soCmnd;

    @Column(name = "email")
    @NotEmpty
    @Pattern(regexp="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "Email is invalid")
    private String email;

    @Column(name="diachi")
    @NotEmpty
    private String diaChi;

    @Column(name = "ngaysinh")
    @NotNull
    private Date ngaySinh;
    public KhachHang() {
    }

    public KhachHang(@NotEmpty String loaiKhachHang, @NotEmpty String hoTen, @NotEmpty String gioiTinh, @NotEmpty String soDienThoai, @NotEmpty String soCmnd, @NotEmpty String email, @NotEmpty String diaChi, Date ngaySinh) {
        this.loaiKhachHang = loaiKhachHang;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.soCmnd = soCmnd;
        this.email = email;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Long getId() {
        return id;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
