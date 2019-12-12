package com.codegym.casestudymodule2.repositories;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;
import com.codegym.casestudymodule2.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongRepository extends PagingAndSortingRepository<HopDong,Long> {
    Iterable<HopDong> findAllByDichVu(DichVu dichVu);
    Iterable<HopDong> findAllByKhachHang(KhachHang khachhang);
}
