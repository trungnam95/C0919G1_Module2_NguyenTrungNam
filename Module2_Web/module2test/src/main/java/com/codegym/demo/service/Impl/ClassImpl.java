package com.codegym.demo.service.Impl;

import com.codegym.demo.entity.LopHoc;
import com.codegym.demo.repositories.ClassRepository;
import com.codegym.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassImpl implements ClassService {
    @Autowired
    private ClassRepository classRepository;
    @Override
    public void save(LopHoc lopHoc) {
        classRepository.save(lopHoc);
    }
}
