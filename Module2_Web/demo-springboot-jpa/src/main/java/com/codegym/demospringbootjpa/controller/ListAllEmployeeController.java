package com.codegym.demospringbootjpa.controller;

import com.codegym.demospringbootjpa.entity.Employee;
import com.codegym.demospringbootjpa.service.EmployeeCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ListAllEmployeeController {
    @Autowired
    EmployeeCreationService employeeService;

    @GetMapping("/listallemployee")
    public ModelAndView creationQuery() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Employee> employee = employeeService.findAll();
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @GetMapping("/listallemployee/{name}")
    public ModelAndView nameCreationQuery(@PathVariable("name") String name) {
        ModelAndView modelAndView = new ModelAndView("listbyname");
        List<Employee> employee = employeeService.findByName(name);
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
}
