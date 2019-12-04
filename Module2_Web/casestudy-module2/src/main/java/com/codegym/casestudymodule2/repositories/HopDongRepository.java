package com.codegym.casestudymodule2.repositories;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HopDongRepository extends JpaRepository<HopDong,Long> {
    Iterable<HopDong> findAllByDichVu(DichVu dichVu);
}
