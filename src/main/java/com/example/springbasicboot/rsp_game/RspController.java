package com.example.springbasicboot.rsp_game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rsp")
public class RspController {
    @GetMapping
    public String home() {
        return "/rsp_game/rsp";
    }

    @PostMapping
    public String rsp(@RequestParam("id") String id) {
        System.out.println(id);
        return null;
    }
}