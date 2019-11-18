package controllers;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private static Pattern pattern;
    private Matcher matcher;
    //Khai bao regex
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public HomeController(){
        pattern=Pattern.compile(EMAIL_REGEX);
    }
    @GetMapping(value = "/login")
    public String home(Locale locale, Model model){
        return "home";
    }
    @PostMapping(value = "/validate")
    public String user(@RequestParam("email") String email, ModelMap modelMap){
        boolean isvalid=this.validate(email);
        if(!isvalid){
            modelMap.addAttribute("message", "Email is invalid");
            return "home";
        }
        modelMap.addAttribute("email", email);
        return "success";
    }

    private boolean validate(String regex) {
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
