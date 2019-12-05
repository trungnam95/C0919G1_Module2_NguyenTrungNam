package com.codegym.casestudymodule2.service.Impl;

import com.codegym.casestudymodule2.entity.KhachHang;
import com.codegym.casestudymodule2.repositories.KhachHangRepository;
import com.codegym.casestudymodule2.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhachHangSerrviceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public Page<KhachHang> findAllByHoTenContaining(String name, Pageable pageable) {
        return khachHangRepository.findAllByHoTenContaining(name, pageable);
    }

    @Override
    public KhachHang findById(Long id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        khachHangRepository.deleteById(id);
    }

}
