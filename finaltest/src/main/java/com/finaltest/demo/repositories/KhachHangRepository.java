package com.finaltest.demo.repositories;

import com.finaltest.demo.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Long> {
    Page<KhachHang> findAllByHoTenContaining(String name, Pageable pageable);
    Page<KhachHang> findAllById(Long id,Pageable pageable);
}
