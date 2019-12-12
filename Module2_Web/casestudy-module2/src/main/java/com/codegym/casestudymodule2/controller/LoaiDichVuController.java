package com.codegym.casestudymodule2.controller;

import com.codegym.casestudymodule2.entity.LoaiDichVu;
import com.codegym.casestudymodule2.service.DichVuService;
import com.codegym.casestudymodule2.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoaiDichVuController {
    @Autowired
    private LoaiDichVuService loaiDichVuService;
    @Autowired
    private DichVuService dichVuService;
    @GetMapping("/")
    public ModelAndView loaiDichVu(Pageable pageable) {
        Page<LoaiDichVu> loaiDichVus=loaiDichVuService.findAll(pageable);
        ModelAndView modelAndView=new ModelAndView("home");
        modelAndView.addObject("allloaidichvu",loaiDichVus);
        return modelAndView;
    }

}
