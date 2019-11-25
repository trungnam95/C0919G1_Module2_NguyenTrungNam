package com.codegym.provinces.service;

import com.codegym.provinces.entity.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
