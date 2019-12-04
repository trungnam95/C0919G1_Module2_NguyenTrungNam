package com.codegym.casestudymodule2.service.Impl;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;
import com.codegym.casestudymodule2.repositories.HopDongRepository;
import com.codegym.casestudymodule2.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HopDongServiceImpl implements HopDongService {
    @Autowired
    private HopDongRepository hopDongRepository;
    @Override
    public Iterable<HopDong> findAllByDichVu(DichVu dichVu) {
        return hopDongRepository.findAllByDichVu(dichVu);
    }

    @Override
    public void save(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }
}
