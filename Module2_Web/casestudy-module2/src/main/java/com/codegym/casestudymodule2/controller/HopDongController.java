package com.codegym.casestudymodule2.controller;

import com.codegym.casestudymodule2.entity.DichVu;
import com.codegym.casestudymodule2.entity.HopDong;
import com.codegym.casestudymodule2.entity.KhachHang;
import com.codegym.casestudymodule2.entity.LoaiDichVu;
import com.codegym.casestudymodule2.service.DichVuService;
import com.codegym.casestudymodule2.service.HopDongService;
import com.codegym.casestudymodule2.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HopDongController {
    @Autowired
    private HopDongService hopDongService;
    @Autowired
    private DichVuService dichVuService;
    @Autowired
    private KhachHangService khachHangService;

    @ModelAttribute("dichvu")
    public Iterable<DichVu> dichVu() {
        return dichVuService.findAll();
    }

    @ModelAttribute("khachhang")
    public Iterable<KhachHang> khachHang(Pageable pageable) {
        return khachHangService.findAll(pageable);
    }

    @GetMapping("registerservice")
    public ModelAndView formCreateHopDong() {
        ModelAndView modelAndView = new ModelAndView("hopdong");
        modelAndView.addObject("hopdong", new HopDong());
        return modelAndView;
    }

    @PostMapping("registerservice")
    public ModelAndView createHopDong(@ModelAttribute("hopdong") HopDong hopDong, HttpServletResponse response,
                                      HttpServletRequest request) {
        hopDongService.save(hopDong);
        KhachHang khachHang=khachHangService.findById(hopDong.getKhachHang().getIdKhachHang());
        ModelAndView modelAndView = new ModelAndView("hopdong");
        modelAndView.addObject("hopdong", new HopDong());
        Iterable<HopDong> listHopDong=hopDongService.findAllByKhachHang(khachHang);
        for(HopDong hopdong:listHopDong){
            String cookieValue=hopdong.getIdHopDong()+"_"+hopdong.getKhachHang().getIdKhachHang()+"_"+hopdong.getDichVu().getIdDichVu()+"_"+hopdong.getNgayLamHopDong()+"_"+
                    hopdong.getNgayKetThuc();
            Cookie cookie=new Cookie("hopdong" +hopdong.getKhachHang().getIdKhachHang(),cookieValue);
            cookie.setMaxAge(60);
            cookie.setPath("/history");
            response.addCookie(cookie);
        }

        modelAndView.addObject("message", "create hop dong succesfully");
        return modelAndView;
    }
    @GetMapping("displayhopdong")
    public ModelAndView displayHopDong() {
        Iterable<HopDong> hopDongs = hopDongService.findAll();
        ModelAndView modelAndView = new ModelAndView("hopdongall");
        modelAndView.addObject("allhopdong",hopDongs);
        return modelAndView;
    }
    @GetMapping("/deletehopdong/{id}")
    public String delete(@PathVariable("id") Long id){
        hopDongService.deleteById(id);
        return "redirect:/displayhopdong";
    }
}
