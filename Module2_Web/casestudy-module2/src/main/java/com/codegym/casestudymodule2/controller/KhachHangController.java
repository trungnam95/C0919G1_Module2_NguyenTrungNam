package com.codegym.casestudymodule2.controller;

import com.codegym.casestudymodule2.entity.KhachHang;
import com.codegym.casestudymodule2.service.HopDongService;
import com.codegym.casestudymodule2.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;


@Controller
public class KhachHangController {
    @Autowired
    private HopDongService hopDongService;
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("createcustomer")
    public ModelAndView formCreateCustomer() {
        ModelAndView modelAndView = new ModelAndView("khachhang");
        modelAndView.addObject("khachhang", new KhachHang());
        return modelAndView;
    }

    @PostMapping("createcustomer")
    public ModelAndView createCustomer(@Validated @ModelAttribute("khachhang") KhachHang khachHang, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("khachhang");
            return modelAndView;
        }
        khachHangService.save(khachHang);
        ModelAndView modelAndView = new ModelAndView("khachhang");
//        modelAndView.addObject("khachhang", new KhachHang());
        modelAndView.addObject("message", "create customer sucessfully");
        return modelAndView;
    }

    @GetMapping("displaycustomer")
    public ModelAndView listCustomers(@RequestParam(value = "s", required = false) String s, @PageableDefault(size = 4) Pageable pageable) {
        Page<KhachHang> khachHangs;
        ModelAndView modelAndView = new ModelAndView("allkhachhang");
        if (s != null) {
            khachHangs = khachHangService.findAllByHoTenContaining(s, pageable);
            modelAndView.addObject("search", s);
        } else {
            khachHangs = khachHangService.findAll(pageable);
        }

        modelAndView.addObject("allkhachhang", khachHangs);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView formEdit(@PathVariable Long id) {
        KhachHang khachHang = khachHangService.findById(id);
        ModelAndView modelAndView = new ModelAndView("editcustomer");
        modelAndView.addObject("editcustomer", khachHang);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editCustomer(@Validated @ModelAttribute("editcustomer") KhachHang khachHang, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("editcustomer");
            return modelAndView;
        }
        khachHangService.save(khachHang);
        ModelAndView modelAndView = new ModelAndView("editcustomer");
        modelAndView.addObject("editcustomer", khachHang);
        modelAndView.addObject("message", "Update customer successfully");
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        khachHangService.deleteById(id);
        return "redirect:/displaycustomer";
    }
}
