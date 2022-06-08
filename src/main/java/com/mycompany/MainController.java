package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // Map to the Home Page
    @GetMapping("")
    public String showHomePage() {
        return "index";
    }

}
