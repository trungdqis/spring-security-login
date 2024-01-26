package com.trungdq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/admin/login")
    public String viewAdminLoginPage() {
        return "admin/admin_login";
    }

    @GetMapping("/user/login")
    public String viewUserLoginPage() {
        return "user/user_login";
    }

    @GetMapping("/admin/home")
    public String viewAdminHomePage() {
        return "admin/admin_home";
    }

    @GetMapping("/user/home")
    public String viewUserHomePage() {
        return "user/user_home";
    }
}
