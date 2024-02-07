package com.example.springbasicboot.project.random_page;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/random")
public class RandomPageController {

    @GetMapping("/color")
    public String randomColor (Model model) {
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        String rgb = "rgb(" + red + ", " + green + ", " + blue + ")";

        model.addAttribute("backgroundColor", rgb);
        return "/random";
    }

    @GetMapping("/number/{n}")
    public int randomNumber(@PathVariable int n) {
        Random random = new Random();
        return random.nextInt(n);
    }
}
