package com.project.exchangeOfThings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RolesController {
    @GetMapping("/admin/adminPage")
    public Object getAdminPage() {
        return new ModelAndView("admin/adminPage");
    }

    @GetMapping("/moder/moderPage")
    public Object getModerPage() {
        return new ModelAndView("moder/moderPage");
    }

    @GetMapping("/user/userPage")
    public Object getUserPage() {
        return new ModelAndView("user/userPage");
    }
}
