package com.codegym.provinces.service.Impl;

import com.codegym.provinces.entity.Province;
import com.codegym.provinces.repositories.ProvincesRepository;
import com.codegym.provinces.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvincesRepository provincesRepository;

    @Override
    public Iterable<Province> findAll() {
        return provincesRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provincesRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provincesRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provincesRepository.deleteById(id);
    }
}
