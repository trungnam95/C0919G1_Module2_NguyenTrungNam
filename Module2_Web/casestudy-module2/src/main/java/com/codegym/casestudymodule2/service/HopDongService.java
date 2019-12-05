package com.codegym.casestudymodule2.service;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface HopDongService {
    Iterable<HopDong> findAllByDichVu(DichVu dichVu);
    void save(HopDong hopDong);
    Page<HopDong> findAll(Pageable pageable);
}
