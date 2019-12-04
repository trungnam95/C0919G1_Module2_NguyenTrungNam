package com.codegym.casestudymodule2.controller;

import com.codegym.casestudymodule2.entity.KhachHang;
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
public class KhachHangController {
    @Autowired
    private HopDongService hopDongService;
    @Autowired
    private KhachHangService khachHangService;
    @GetMapping("createcustomer")
    public ModelAndView formCreateCustomer(){
        ModelAndView modelAndView=new ModelAndView("khachhang");
        modelAndView.addObject("khachhang",new KhachHang());
        return modelAndView;
    }
    @PostMapping("createcustomer")
    public ModelAndView createCustomer(@ModelAttribute("khachhang") KhachHang khachHang){
        khachHangService.save(khachHang);
        ModelAndView modelAndView=new ModelAndView("khachhang");
        modelAndView.addObject("khachhang",new KhachHang());
        modelAndView.addObject("message","create customer sucessfully");
        return modelAndView;
    }
}
