package com.codegym.crud.controller;

import com.codegym.crud.entity.Customer;
import com.codegym.crud.service.CustomerService;
import com.codegym.crud.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/")
    public ModelAndView listCustomers(@RequestParam("name") Optional<String> name, Pageable pageable){
        Page<Customer> customers;
        if(name.isPresent()){
            customers = customerService.findAllByNameContaining(name.get(), pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("customer/home");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
//    @GetMapping("/")
//    public ModelAndView listCustomer(Pageable pageable) {
//        Page<Customer> customers=customerService.findAll(pageable);
//        ModelAndView modelAndView = new ModelAndView("customer/home");
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }
//    @GetMapping("/")
//    public ModelAndView searchCustomer(Pageable pageable,@RequestParam("name") Optional<String> name){
//        Page<Customer> customers;
//        ModelAndView modelAndView = new ModelAndView("/customer/home");
//        if(name.isPresent()){
//            customers = customerService.findAllByNameContaining(name.get(), pageable);
//            modelAndView.addObject("name",name);
//        } else {
//            customers = customerService.findAll(pageable);
//        }
//
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }

    @GetMapping("/create")
    public ModelAndView formCreate() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute("customer") Customer customer,RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Create successfully");
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView formEdit(@PathVariable int id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Edit successfully");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public ModelAndView formDelete(@PathVariable int id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/delete");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("success","Delete successfully");
        return "redirect:/";
    }
//    @GetMapping("/delete/{id}")
//    public String formDelete(@PathVariable int id) {
//        customerService.remove(id);
//        return "redirect:/";
//    }
    @GetMapping("/view/{id}")
    public ModelAndView viewCustomer(@PathVariable int id){
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/view");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
