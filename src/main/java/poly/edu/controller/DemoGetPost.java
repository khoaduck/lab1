package poly.edu.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller 
public class DemoGetPost {
@RequestMapping("/home/showForm")
public String showForm(@RequestParam ("page") Optional<Integer> otpPage, 
                        @RequestParam ("username") Optional<String> otpUN,
                    @RequestParam("password") Optional<String> otpPW,
                Model model  ) {
    model.addAttribute("test","tôi tên Khoa");
    model.addAttribute("page", otpPage.orElse(0));
    model.addAttribute("username", otpUN.orElse("Ko biết"));
    model.addAttribute("password", otpPW.orElse("123"));
    return "home/showForm";
}
}
