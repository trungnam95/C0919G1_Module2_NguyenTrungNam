package com.codegym.demo.controller;

import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import com.codegym.demo.service.SchoolService;
import com.codegym.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class SchoolController {
    @Autowired
    private SinhVienService sinhVienService;
    @Autowired
    private SchoolService schoolService;
    @GetMapping("listschool")
    public ModelAndView listSchool(Pageable pageable){
        Page<School> schools=schoolService.findAll(pageable);
        ModelAndView modelAndView=new ModelAndView("school/homeschool");
        modelAndView.addObject("school",schools);
        return modelAndView;
    }
    @GetMapping("createschool")
    public ModelAndView formCreateSchool(){
        ModelAndView modelAndView=new ModelAndView("school/createschool");
        modelAndView.addObject("school",new School());
        return modelAndView;
    }
    @PostMapping("createschool")
    public ModelAndView createSchool(@ModelAttribute("school")School school){
        schoolService.save(school);
        ModelAndView modelAndView=new ModelAndView("school/createschool");
        modelAndView.addObject("message","create school successfully");
        return modelAndView;
    }
    @GetMapping("viewschool/{id}")
    public ModelAndView viewSchool(@PathVariable("id") Long id){
        School school = schoolService.findById(id);
//        if(school == null){
//            return new ModelAndView("/error404");
//        }

        Iterable<SinhVien> sinhViens = sinhVienService.findAllBySchool(school);

        ModelAndView modelAndView = new ModelAndView("school/view");
        modelAndView.addObject("school", school);
        modelAndView.addObject("sinhvien", sinhViens);
        return modelAndView;
    }
}
