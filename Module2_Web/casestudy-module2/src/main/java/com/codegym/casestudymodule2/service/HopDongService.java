package com.codegym.casestudymodule2.service;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;
import com.codegym.casestudymodule2.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface HopDongService {
    Iterable<HopDong> findAllByDichVu(DichVu dichVu);
    void deleteById(Long id);
    void save(HopDong hopDong);
    Iterable<HopDong> findAll();
    Iterable<HopDong> findAllByKhachHang(KhachHang khachhang);
}
