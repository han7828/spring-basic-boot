package com.example.springbasicboot.valid;

import com.example.springbasicboot.valid.Dto.SingUpFormDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/valid")
public class validContoller {
    @GetMapping
    public String form() {
        return "redirect:/valid/form.html";
    }
    @PostMapping
    public String reaadForm(@Valid SingUpFormDto form) {
        return "redirect:/valid/seccess.html";
    }
}
