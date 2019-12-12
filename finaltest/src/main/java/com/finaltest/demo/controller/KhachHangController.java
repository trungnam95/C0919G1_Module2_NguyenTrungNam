package com.finaltest.demo.controller;

import com.finaltest.demo.entity.KhachHang;
import com.finaltest.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/")
    public ModelAndView viewKhachHang(@RequestParam(value = "s", required = false) String s, @PageableDefault(size = 3)
            Pageable pageable) {
        Page<KhachHang> khachHangs;
        ModelAndView modelAndView = new ModelAndView("home");
        if (s != null) {
            khachHangs = khachHangService.findAllByHoTenContaining(s, pageable);
//            khachHangs = khachHangService.findAllById(id,pageable);
            modelAndView.addObject("search", s);
//            modelAndView.addObject("searchmakh",id );
        } else {
            khachHangs = khachHangService.findAll(pageable);
        }

        modelAndView.addObject("khachhang", khachHangs);
        return modelAndView;
    }

    @GetMapping("create")
    public ModelAndView formCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("khachhang", new KhachHang());
        return modelAndView;
    }

    @PostMapping("create")
    public ModelAndView createSinhVien(@Validated @ModelAttribute("khachhang") KhachHang khachHang, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("create");
            return modelAndView;
        }
        khachHangService.save(khachHang);
        ModelAndView modelAndView = new ModelAndView("create");
//        modelAndView.addObject("khachhang", new KhachHang());
        modelAndView.addObject("message", "create khachhang sucessfully");
        return modelAndView;
    }

    @GetMapping("edit/{id}")
    public ModelAndView editForm(@PathVariable("id") Long id) {
        KhachHang khachHang = khachHangService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("khachhang", khachHang);
        return modelAndView;
    }

    @PostMapping("edit")
    public ModelAndView edit(@Validated @ModelAttribute("khachhang") KhachHang khachHang, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("edit");
            return modelAndView;
        }
        khachHangService.save(khachHang);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("khachhang", khachHang);
        modelAndView.addObject("message", "edit khachhang sucessfully");
        return modelAndView;
    }
//    @GetMapping("delete/{id}")
//    public String delete(@PathVariable("id")Long id){
//        khachHangService.remove(id);
//        return "redirect:/";
//    }
    @GetMapping("delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        KhachHang khachHang = khachHangService.findById(id);
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("khachhang", khachHang);
            return modelAndView;

    }

    @PostMapping("delete")
    public String deleteCustomer(@ModelAttribute("customer") KhachHang khachHang) {
        khachHangService.remove(khachHang.getId());
        return "redirect:/";
    }
}
