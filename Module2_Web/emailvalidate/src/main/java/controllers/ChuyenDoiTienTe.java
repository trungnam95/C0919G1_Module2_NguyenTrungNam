package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChuyenDoiTienTe {
    @GetMapping("chuyendoitiente")
    public String tiente(){
        return "chuyendoitiente";
    }
    @PostMapping("/result")
    public String ChuyenDoi(Model model, @RequestParam("rate") float rate,@RequestParam("USD") float USD){
        float result =rate*USD;
        model.addAttribute("result",result);
        return "chuyendoitiente";
    }
}
