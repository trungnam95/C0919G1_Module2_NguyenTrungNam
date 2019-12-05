package com.codegym.casestudymodule2.repositories;

import com.codegym.casestudymodule2.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<KhachHang,Long> {
    Page<KhachHang> findAllByHoTenContaining(String name, Pageable pageable);
}
