package com.codegym.casestudymodule2.controller;

import com.codegym.casestudymodule2.entity.HopDong;
import com.codegym.casestudymodule2.service.DichVuService;
import com.codegym.casestudymodule2.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller

public class HistoryBookingController {
    @Autowired
    private DichVuService dichVuService;
    @Autowired
    private KhachHangService khachHangService;
    @GetMapping("/history")
    public ModelAndView getHistory(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView("history");
        Cookie[] cookies=request.getCookies();
        List<HopDong> hopDongList=new ArrayList<>();
        for (int i = 0; i <cookies.length ; i++) {
            if(cookies[i].getName().contains("hopdong")){
                HopDong hopDong=new HopDong();
                String[] cookieValue=cookies[i].getValue().split("\\_");
                hopDong.setIdHopDong(Long.parseLong(cookieValue[0]));
                hopDong.setKhachHang(khachHangService.findById(Long.parseLong(cookieValue[1])));
                System.out.println((cookieValue[1]));
                hopDong.setDichVu(dichVuService.findById(Long.parseLong(cookieValue[2])));
                hopDong.setNgayLamHopDong(Date.valueOf(cookieValue[3]));
                hopDong.setNgayKetThuc(Date.valueOf(cookieValue[4]));
                hopDongList.add(hopDong);
            }
        }
        modelAndView.addObject("historyhopdong",hopDongList);
        return modelAndView;
    }

}
