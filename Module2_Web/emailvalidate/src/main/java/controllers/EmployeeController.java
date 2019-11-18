package controllers;
import Model.Employee;
import javafx.beans.binding.Binding;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @GetMapping("/employee")
    public String createEmployee(ModelMap modelMap){
        modelMap.addAttribute("employee",new Employee());
        return "employee/create";
    }
    @PostMapping("/addemployee")
    public String addEmployee(@ModelAttribute("employee")Employee employee, BindingResult result,ModelMap modelMap){
            modelMap.addAttribute("name",employee.getName());
            modelMap.addAttribute("id",employee.getId());
            modelMap.addAttribute("contactNumber",employee.getContactNumber());
            return "employee/info";
    }
}
