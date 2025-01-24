package com.project.exchangeOfThings.controller;

import com.project.exchangeOfThings.dto.UserDTO;
import com.project.exchangeOfThings.evtity.User;
import com.project.exchangeOfThings.repository.UserRepository;
import com.project.exchangeOfThings.utils.DataMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/addUser")
    public Object getAddUserPage() {
        return new ModelAndView("admin/addUser");
    }

    @PostMapping("/addUser")
    public String addUser(@Valid UserDTO userDTO, BindingResult bindingResult, ModelMap model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("success", false);
            model.addAttribute("message",  "Заполните все поля!");
            return "/admin/addUser";
        }

        userRepository.save(DataMapper.toUser(userDTO));
        model.addAttribute("message", "Пользователь добавлен");
        model.addAttribute("success", true);
        return "/admin/addUser";
    }

    @GetMapping("/allUsers")
    public String showAllUsers(ModelMap model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "/admin/allUsers";
    }
}
