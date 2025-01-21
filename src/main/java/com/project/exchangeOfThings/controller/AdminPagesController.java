package com.project.exchangeOfThings.controller;

import com.project.exchangeOfThings.evtity.User;
import com.project.exchangeOfThings.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminPagesController {
    private final UserRepository userRepository;

    @GetMapping("/addUser")
    public Object getAddUserPage() {
        return new ModelAndView("admin/addUser");
    }

    @GetMapping("/allUsers")
    public String showAllUsers(ModelMap model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "/admin/allUsers";
    }
}
