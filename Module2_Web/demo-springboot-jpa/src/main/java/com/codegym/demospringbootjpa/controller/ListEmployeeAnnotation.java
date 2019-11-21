package com.codegym.demospringbootjpa.controller;

import com.codegym.demospringbootjpa.entity.Employee;
import com.codegym.demospringbootjpa.service.EmployeeAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ListEmployeeAnnotation {
    @Autowired
    EmployeeAnnotationService employeeAnnotationService;
    @GetMapping("/listallemployee/annotation")
    public ModelAndView annotationQuery(){
        ModelAndView modelAndView=new ModelAndView("listannotation");
        List<Employee> employee=employeeAnnotationService.findAll();
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
    @GetMapping("/listallemployee/annotation/{name}/{age}")
    public ModelAndView nameAgeAnnotaionQuery(@PathVariable("name") String name,@PathVariable("age") int age){
        ModelAndView modelAndView=new ModelAndView("listnameandageannotation");
        Employee employee=employeeAnnotationService.findByNameAndAge(name, age);
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
}
