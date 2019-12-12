package com.codegym.casestudymodule2.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
    @NotEmpty
    @Pattern(regexp = "^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})){0,3}$",
    message = "name is invalid")
    private String hoTen;

    @Column(name="ngaysinh")
//    @Pattern( regexp="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$",message = "Birthday is invalid")
    private Date ngaySinh;

    @Column(name = "socmtnd")
    @NotNull
    @Pattern(regexp="^[\\d]{9}$",message = "ID must be 9 digits")
    private String idCard;

    @Column(name="sdt")
    @NotEmpty
    @Pattern(regexp="(09|01[2|6|8|9])+([0-9]{8})\\b",message = "Phone number is invalid")
    private String sDT;

    @Column(name="email")
    @NotEmpty
    @Pattern(regexp="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "Email is invalid")
    private String email;

    @Column(name = "diachi")
    @NotEmpty
    private String diaChi;

//    @OneToMany(targetEntity = HopDong.class)
//    private List<HopDong> hopDongs;

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

//    public List<HopDong> getHopDongs() {
//        return hopDongs;
//    }
//
//    public void setHopDongs(List<HopDong> hopDongs) {
//        this.hopDongs = hopDongs;
//    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }
}
