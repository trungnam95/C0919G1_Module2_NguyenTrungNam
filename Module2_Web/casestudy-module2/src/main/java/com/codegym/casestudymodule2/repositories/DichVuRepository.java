package com.codegym.casestudymodule2.repositories;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.LoaiDichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DichVuRepository extends JpaRepository<DichVu,Long> {
    Iterable<DichVu> findAllByLoaiDichVu(LoaiDichVu loaiDichVu);
    Iterable<DichVu> findAllByDienTichBetween(int dientichbatdau, int dientichketthuc);
    Page<DichVu> findAllByChiPhiThueBetween(double chiphithuebatdau,double chiphithueketthuc,Pageable pageable);
}
