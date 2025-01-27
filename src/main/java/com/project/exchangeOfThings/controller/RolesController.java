package com.project.exchangeOfThings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RolesController {
    @GetMapping("/page/admin")
    public Object getAdminPage() {
        return new ModelAndView("admin/adminPage");
    }

    @GetMapping("/page/moder")
    public Object getModerPage() {
        return new ModelAndView("moder/moderPage");
    }

    @GetMapping("/page/user")
    public Object getUserPage() {
        return new ModelAndView("user/userPage");
    }
}
