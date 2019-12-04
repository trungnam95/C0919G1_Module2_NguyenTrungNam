package com.codegym.casestudymodule2.service.Impl;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.LoaiDichVu;
import com.codegym.casestudymodule2.repositories.DichVuRepository;
import com.codegym.casestudymodule2.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    private DichVuRepository dichVuRepository;
    @Override
    public Iterable<DichVu> findAllByLoaiDichVu(LoaiDichVu loaiDichVu) {
        return dichVuRepository.findAllByLoaiDichVu(loaiDichVu);

    }

    @Override
    public Iterable<DichVu> findAllByDienTichBetween(int dientichbatdau, int dientichketthuc) {
        return dichVuRepository.findAllByDienTichBetween(dientichbatdau, dientichketthuc);
    }

    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return dichVuRepository.findAll(pageable);
    }

    @Override
    public Page<DichVu> findAllByChiPhiThueBetween(double chiphithuebatdau, double chiphithueketthuc, Pageable pageable) {
        return dichVuRepository.findAllByChiPhiThueBetween(chiphithuebatdau, chiphithueketthuc,pageable);
    }

    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }


}
