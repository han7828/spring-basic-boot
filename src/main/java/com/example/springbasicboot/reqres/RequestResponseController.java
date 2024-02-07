package com.example.springbasicboot.reqres;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/contries")
public class RequestResponseController {
    static HashMap<String, String> contries = new HashMap<>();
    static {
        contries.put("한국","서울");
        contries.put("미국","워싱턴D.C");
        contries.put("프랑스","파리");
        contries.put("몽골","울란바토르");
        contries.put("아르헨티나","부에노스아이레스");
    }
    static HashMap<String, Contries> contries2 = new HashMap<>();
    static {
        contries2.put("한국", new Contries("한국", "서울"));
        contries2.put("미국", new Contries("미국", "위싱턴D.C"));
        contries2.put("한국", new Contries("한국", "서울"));
        contries2.put("한국", new Contries("한국", "서울"));
        contries2.put("한국", new Contries("한국", "서울"));
    }
    @GetMapping("/{name}")
    public String searchContries(@PathVariable String name, Model model) {
        String capital = contries.get(name);
        if ( capital == null ){
            throw new RuntimeException("찾으려는 국가가 없습니다.");
        }
        model.addAttribute("name", name);
        model.addAttribute("capital", capital);
        return "/contries";
    }
    @GetMapping("/searchCapital")
    public String searchCapital(@RequestParam("name") String name, Model model) {
        String capital = contries.get(name);
        if ( capital == null ){
            throw new RuntimeException("찾으려는 국가가 없습니다.");
        }
        model.addAttribute("name", name);
        model.addAttribute("capital", capital);
        return "/contries";
    }
    @PostMapping("/addCountry")
    public String addCountry(@RequestParam String name, @RequestParam String capital) {
        contries.put(name, capital);
        return "redirect:/";
    }
    @PostMapping("/addCountry2")
    public void addCountry2(@RequestBody Contries contries) {
        contries2.put(contries.getName(), contries);
    }
}
