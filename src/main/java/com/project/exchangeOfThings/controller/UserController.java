package com.project.exchangeOfThings.controller;

import com.project.exchangeOfThings.dto.UserDTO;
import com.project.exchangeOfThings.repository.UserRepository;
import com.project.exchangeOfThings.utils.DataMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/admin/addUser")
    public String addUser(@Valid UserDTO userDTO,
                          BindingResult bindingResult,
                          ModelMap model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("success", false);
            model.addAttribute("message",  "Заполните все поля!");
            return "/admin/addUser";
        }

        userRepository.save(DataMapper.toUser(userDTO));
        model.addAttribute("message", "User added successfully");
        model.addAttribute("success", true);
        return "/admin/addUser";
    }
}
