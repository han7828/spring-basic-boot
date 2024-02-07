package com.example.springbasicboot.reqres;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/countries")
public class countryController {
    static HashMap<String, Contries> countries = new HashMap<>();
    static {
        countries.put("한국", new Contries("한국", "서울"));
        countries.put("미국", new Contries("미국", "위싱턴D.C"));
        countries.put("프랑스", new Contries("프랑스", "파리"));
        countries.put("독일", new Contries("독일", "베를린"));
        countries.put("영국", new Contries("영국", "런던"));
    }

    @GetMapping
    public ArrayList<Contries> countries() {
        return new ArrayList<>(countries.values());
    }

//    @PostMapping("")
    public Contries addCountry(@RequestParam String name, @RequestParam String capital) {
        countries.put(name, new Contries(name, capital));
        return countries.get(name);
    }

//    @PostMapping("")
    public Contries addCountry2(@RequestBody Contries contries) {
        countries.put(contries.getName(), contries);
        return countries.get(contries.getName());
    }

//    @PostMapping("")
    public Contries addCountry3(@ModelAttribute Contries contries) {
        countries.put(contries.getName(), contries);
        return countries.get(contries.getName());
    }
    @PostMapping("/4")
    public ResponseEntity<Contries> addCountry4(@ModelAttribute Contries contries) {
        countries.put(contries.getName(), contries);
        return new ResponseEntity<>(countries.get(contries.getName()), HttpStatus.UNAUTHORIZED);
    }
}
