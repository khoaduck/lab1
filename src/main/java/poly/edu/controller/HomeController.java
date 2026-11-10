package poly.edu.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    // Gom phần dữ liệu dùng chung cho cả 3 trang
    private void addCommonData(Model model) {
        model.addAttribute("appName", "Product Portal");
        model.addAttribute("subject", "SOF3022 - Spring Boot MVC");
        model.addAttribute("semester", "Summer 2026");
        model.addAttribute("message", "Chào mừng bạn đến với hệ thống quản lý sản phẩm");
    }

    @RequestMapping("/")
    public String index(Model model) {
        addCommonData(model);
        return "home/index";
    }

    @RequestMapping("/home/about")
    public String about(Model model) {
        addCommonData(model);
        return "home/about";
    }

    @RequestMapping("/home/help")
    public String help(Model model) {
        addCommonData(model);
        return "home/help";
    }
    
}