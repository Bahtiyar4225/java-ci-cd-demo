package com.ci_cd_ogreniyorum.demo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerhabaController {

    @GetMapping("/")
    public String anaSayfa() {
        return "Tebrikler! CI/CD Pipeline basariyla calisiyor! 🚀";
    }
}
