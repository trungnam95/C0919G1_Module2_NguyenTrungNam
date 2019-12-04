package com.codegym.taogiohang.controller;

import com.codegym.taogiohang.entity.Cart;
import com.codegym.taogiohang.entity.Product;
import com.codegym.taogiohang.entity.ProductList;
import com.codegym.taogiohang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("list")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ModelAndView listProduct(@RequestParam(value = "s", required = false) String s, @PageableDefault(size = 4) Pageable pageable) {
        Page<Product> product;
        ModelAndView modelAndView = new ModelAndView("product/list");
        if (s != null) {
            product = productService.findAllByNameProductContaining(s, pageable);
            modelAndView.addObject("search", s);
        } else {
            product = productService.findAll(pageable);
        }
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/product/create")
    public ModelAndView formCreate() {
        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/product/create")
    public ModelAndView createProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("product/create");
            return modelAndView;
        }
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "Create Product successfully");
        return modelAndView;
    }

    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.remove(id);
        return "redirect:/product";
    }

    @GetMapping("/product/edit/{id}")
    public ModelAndView formEdit(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("product/edit");
            modelAndView.addObject("product", product);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("page/error");
            return modelAndView;
        }
    }

    @PostMapping("/product/edit")
    public ModelAndView editProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("product/create");
            return modelAndView;
        }
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("product/edit");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Update product successfully");
        return modelAndView;
    }

    @GetMapping("/product/view/{id}")
    public ModelAndView viewProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("product/view");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @ModelAttribute("list")
    public ProductList setUpProduct() {
        return new ProductList();
    }

    @GetMapping("/product/addtocart/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute("list") ProductList productList) {
        Product product = productService.findById(id);
//        productList.add(product);
//        ModelAndView modelAndView=new ModelAndView("product/listadd");
//        modelAndView.addObject("productlist",productList);
//        return "redirect:/product";
//        if (product != null) {
        if (productList.containsKey(id)) {
            Cart item = productList.get(id);
            item.setProduct(product);
            item.setQuantity(item.getQuantity() + 1);
            productList.put(id, item);
        } else {
            Cart item = new Cart();
            item.setProduct(product);
            item.setQuantity(1);
            productList.put(id, item);
        }
        ModelAndView modelAndView = new ModelAndView("product/listadd");
        modelAndView.addObject("list", productList);
        return "redirect:/product";
    }


    //    @PostMapping("/product/addtocart/{id}")
//    public ModelAndView cartSuccess(@PathVariable Long id,@ModelAttribute("list") ProductList productList){
//        ModelAndView modelAndView=new ModelAndView("product/list");
//        modelAndView.addObject("message","add to complete");
//        return modelAndView;
//    }
    @GetMapping("/productlist/delete/{id}")
    public String deleteProductList(@PathVariable Long id, @ModelAttribute("list") ProductList productList) {
        productList.remove(id);
        ModelAndView modelAndView = new ModelAndView("product/listadd");
        modelAndView.addObject("list", productList);
        return "product/listadd";
    }

    @GetMapping("/product/cart")
    public ModelAndView formCart(@ModelAttribute("list") ProductList productList) {
        return new ModelAndView("product/listadd");
    }

    @PostMapping("/product/totalpay")
    public String totalPrice(@ModelAttribute("list") ProductList productList, Model model, Pageable pageable) {
        int totalpay = 0;
        for (Cart cart : productList.values()) {
            totalpay += cart.getTotal();
        }
//        model.addAttribute("product",productService.findAll(pageable));
        model.addAttribute("total", totalpay);
        return "product/listadd";
    }

//    @GetMapping("/productlist/delete")
//    public ModelAndView deleteAll(@ModelAttribute("list") ProductList productList) {
//        productListService.removeAll(productList);
//        ModelAndView modelAndView = new ModelAndView("product/listadd");
//        modelAndView.addObject("list", productList);
//        return modelAndView;
//    }
}
