package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InterestController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam double amount,
            @RequestParam double rate,
            @RequestParam double time,
            @RequestParam String type,
            Model model) {

        double result = 0;

        if (type.equals("simple")) {
            result = (amount * rate * time) / 100;
        } else {
            double total = amount * Math.pow((1 + rate / 100), time);
            result = total - amount;
        }

        model.addAttribute("result", result);
        return "index";
    }
}