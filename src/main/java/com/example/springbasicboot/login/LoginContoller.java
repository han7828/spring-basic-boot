package com.example.springbasicboot.login;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/login")
public class LoginContoller {
    @GetMapping
    public String home() {
        return "redirect:/login/login.html";
    }
    @GetMapping("/signup")
    public String signUp() {
        return "redirect:/login/signup.html";
    }
    @PostMapping("/createDto")
    public String signUpForm(@Valid LoginDto loginDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/login/signup.html";
        }
        return "redirect:/login/login.html";
    }
    @GetMapping("/signup/faild")
    public String signUpFaild() {
        return "redirect:/login/signup.html";
    }
    @GetMapping("/signup/seccess")
    public String signUpSeccess() {
        return "redirect:/login/login.html";
    }
    @PostMapping("/login")
    public String login(Model model) {
        LoginDto loginDto = new LoginDto();
        if( model.getAttribute("email") != loginDto.getEmail()) {
            return "redirect:/login/faild";
        }
        return "redirect:/login/after-login.html";
    }
    @GetMapping("/login/faild")
    public String loginFaild() {
        return "redirect:/login/login.html";
    }
    @GetMapping("/login/seccess")
    public String loginSeccess() {
        return "redirect:/login/after-login.html";
    }
}
