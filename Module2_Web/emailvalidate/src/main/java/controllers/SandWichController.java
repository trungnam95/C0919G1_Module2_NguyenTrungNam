package controllers;
import Model.SandWich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandWichController {
    @GetMapping("/sandwich")
    public ModelAndView sandwich() {
        SandWich sandWich = new SandWich();
        sandWich.setChecksandwich((new String []{}));
        ModelAndView modelAndView = new ModelAndView("sandwich", "command", sandWich);
        return modelAndView;
    }
    @PostMapping("/addsandwich")
    public String addEmployee(@ModelAttribute("sandwich") SandWich sandWich, BindingResult result, ModelMap modelMap){
        modelMap.addAttribute("abc", sandWich.getChecksandwich());
        return "result";
    }
    @ModelAttribute("webFrameworkList")
    public List<String> getWebFrameworkList() {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Lettuce");
        webFrameworkList.add("Tomato");
        webFrameworkList.add("Mustard");
        webFrameworkList.add("Spouts");
        return webFrameworkList;
    }
}