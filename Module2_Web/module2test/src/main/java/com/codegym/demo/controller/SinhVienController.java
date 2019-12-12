package com.codegym.demo.controller;

import com.codegym.demo.entity.LopHoc;
import com.codegym.demo.entity.School;
import com.codegym.demo.entity.SinhVien;
import com.codegym.demo.service.ClassService;
import com.codegym.demo.service.SchoolService;
import com.codegym.demo.service.SinhVienService;
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
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private ClassService classService;
    @ModelAttribute("listschool")
    public Iterable<School>listChool(Pageable pageable){
        return schoolService.findAll(pageable);
    }
    @GetMapping("/")
    public ModelAndView sinhvien(@RequestParam(value = "s", required = false) String s, @PageableDefault(size = 1)
            Pageable pageable) {
        Page<SinhVien> sinhViens;
        ModelAndView modelAndView = new ModelAndView("sinhvien/home");
        if (s != null) {
            sinhViens = sinhVienService.findAllByNameContaining(s, pageable);
            modelAndView.addObject("search", s);
        } else {
            sinhViens = sinhVienService.findAll(pageable);
        }

        modelAndView.addObject("sinhvien", sinhViens);
        return modelAndView;
    }
    @GetMapping("create")
    public ModelAndView formCreate(){
        ModelAndView modelAndView=new ModelAndView("sinhvien/create");
        modelAndView.addObject("sinhvien",new SinhVien());
        return modelAndView;
    }
    @PostMapping("create")
    public ModelAndView createSinhVien(@Validated @ModelAttribute("sinhvien") SinhVien sinhVien, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("sinhvien/create");
            return modelAndView;
        }
        sinhVienService.save(sinhVien);
        ModelAndView modelAndView = new ModelAndView("sinhvien/create");
//        modelAndView.addObject("khachhang", new KhachHang());
        modelAndView.addObject("message", "create sinhvien sucessfully");
        return modelAndView;
    }
    @GetMapping("edit/{id}")
    public ModelAndView editForm(@PathVariable("id") Long id){
        SinhVien sinhVien=sinhVienService.findById(id);
        ModelAndView modelAndView=new ModelAndView("sinhvien/edit");
        modelAndView.addObject("sinhvien",sinhVien);
        return modelAndView;
    }
    @PostMapping("edit")
    public ModelAndView edit(@Validated @ModelAttribute("sinhvien") SinhVien sinhVien,BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("sinhvien/edit");
            return modelAndView;
        }
        sinhVienService.save(sinhVien);
        ModelAndView modelAndView = new ModelAndView("sinhvien/edit");
        modelAndView.addObject("sinhvien", sinhVien);
        modelAndView.addObject("message", "edit sinhvien sucessfully");
        return modelAndView;
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")Long id){
        sinhVienService.remove(id);
        return "redirect:/";
    }
    @GetMapping("add/{id}")
    public ModelAndView add(@PathVariable("id") Long id){
        ModelAndView modelAndView=new ModelAndView("sinhvien/add");
        School school=schoolService.findById(id);
        modelAndView.addObject("school",school);
        return modelAndView;
    }
    @PostMapping("add")
    public ModelAndView saveStudent(@RequestParam(value = "nameclass")String name,@RequestParam(value = "id")Long id){
        LopHoc lopHoc=new LopHoc();
        lopHoc.setName(name);
        lopHoc.setSchool(schoolService.findById(id));
        classService.save(lopHoc);
        ModelAndView modelAndView=new ModelAndView("sinhvien/addsuccess");
        return modelAndView;
    }
}
