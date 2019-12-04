package com.codegym.casestudymodule2.controller;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.LoaiDichVu;
import com.codegym.casestudymodule2.service.DichVuService;
import com.codegym.casestudymodule2.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DichVuController {
    @Autowired
    private LoaiDichVuService loaiDichVuService;
    @Autowired
    private DichVuService dichVuService;
    @ModelAttribute("loaidichvu")
    public Iterable<LoaiDichVu> loaiDichVu(Pageable pageable){
        return loaiDichVuService.findAll(pageable);
    }
    @GetMapping("displaydichvu/{id}")
    public ModelAndView displayDichVu(@PathVariable("id") Long id) {
        LoaiDichVu loaiDichVu = loaiDichVuService.findById(id);
        Iterable<DichVu> dichVus = dichVuService.findAllByLoaiDichVu(loaiDichVu);
        ModelAndView modelAndView = new ModelAndView("viewdichvuvilla");
        modelAndView.addObject("loaidichvus", loaiDichVu);
        modelAndView.addObject("dichvulist", dichVus);
        return modelAndView;
    }

    @GetMapping("displaydichvu")
    public ModelAndView listDichVu(
            @RequestParam(value = "chiphithuebatdau", required = false) Double s1, @RequestParam(value = "chiphithueketthuc", required = false) Double s2, Pageable pageable) {
        Page<DichVu> dichVus;
        ModelAndView modelAndView = new ModelAndView("alldichvu");
        if(s1==null || s2 ==null){
            dichVus=dichVuService.findAll(pageable);
        }else{
            dichVus=dichVuService.findAllByChiPhiThueBetween(s1,s2,pageable);
        }
        modelAndView.addObject("searchfrom", s1);
        modelAndView.addObject("searchto", s2);
        modelAndView.addObject("listalldichvu", dichVus);
        return modelAndView;
    }
    @GetMapping("createservice")
    public ModelAndView formCreateService(){
        ModelAndView modelAndView = new ModelAndView("formcreate");
        modelAndView.addObject("dichvu", new DichVu());
        return modelAndView;
    }
    @PostMapping("createservice")
    public ModelAndView createService(@ModelAttribute("dichvu") DichVu dichVu){
        dichVuService.save(dichVu);
        ModelAndView modelAndView=new ModelAndView("formcreate");
        modelAndView.addObject("dichvu",new DichVu());
        modelAndView.addObject("message","create successfully");
        return modelAndView;
    }
}
