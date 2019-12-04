package com.codegym.casestudymodule2.controller;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;
import com.codegym.casestudymodule2.entity.KhachHang;
import com.codegym.casestudymodule2.entity.LoaiDichVu;
import com.codegym.casestudymodule2.service.DichVuService;
import com.codegym.casestudymodule2.service.HopDongService;
import com.codegym.casestudymodule2.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HopDongController {
    @Autowired
    private HopDongService hopDongService;
    @Autowired
    private DichVuService dichVuService;
    @Autowired
    private KhachHangService khachHangService;
    @ModelAttribute("dichvu")
    public Iterable<DichVu> dichVu(Pageable pageable){
        return dichVuService.findAll(pageable);
    }
    @ModelAttribute("khachhang")
    public Iterable<KhachHang> khachHang(Pageable pageable){
        return khachHangService.findAll(pageable);
    }
    @GetMapping("registerservice")
    public ModelAndView formCreateHopDong(){
        ModelAndView modelAndView=new ModelAndView("hopdong");
        modelAndView.addObject("hopdong",new HopDong());
        return modelAndView;
    }
    @PostMapping("registerservice")
    public ModelAndView createHopDong(@ModelAttribute("hopdong") HopDong hopDong){
        hopDongService.save(hopDong);
        ModelAndView modelAndView=new ModelAndView("hopdong");
        modelAndView.addObject("hopdong",new HopDong());
        modelAndView.addObject("message","create hop dong succesfully");
        return modelAndView;
    }
}
