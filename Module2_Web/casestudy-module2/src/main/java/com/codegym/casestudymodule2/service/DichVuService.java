package com.codegym.casestudymodule2.service;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.LoaiDichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DichVuService {
    Iterable<DichVu> findAllByLoaiDichVu(LoaiDichVu loaiDichVu);
    Iterable<DichVu> findAllByDienTichBetween(int dientichbatdau, int dientichketthuc);
    Page<DichVu> findAll(Pageable pageable);
    Page<DichVu> findAllByChiPhiThueBetween(double chiphithuebatdau, double chiphithueketthuc, Pageable pageable);
    void save(DichVu dichVu);
}


