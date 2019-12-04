package com.codegym.casestudymodule2.service;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;

public interface HopDongService {
    Iterable<HopDong> findAllByDichVu(DichVu dichVu);
    void save(HopDong hopDong);
}
