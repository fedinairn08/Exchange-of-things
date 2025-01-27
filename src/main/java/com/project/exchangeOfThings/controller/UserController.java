package com.project.exchangeOfThings.controller;

import com.project.exchangeOfThings.dto.UserDTO;
import com.project.exchangeOfThings.evtity.User;
import com.project.exchangeOfThings.repository.UserRepository;
import com.project.exchangeOfThings.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
    private final ModelMapper modelMapper;
    private final UserService userService;

    @GetMapping("/user/add")
    public Object getAddUserPage() {
        return new ModelAndView("admin/addUser");
    }

    @PostMapping("/user/add")
    public String addUser(@Valid UserDTO userDTO, BindingResult bindingResult, ModelMap model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("success", false);
            model.addAttribute("message",  "Заполните все поля!");
            return "/admin/addUser";
        }

        userRepository.save(modelMapper.map(userDTO, User.class));
        model.addAttribute("message", "Пользователь добавлен");
        model.addAttribute("success", true);
        return "/admin/addUser";
    }

    @GetMapping("/user/all")
    public String showAllUsers(ModelMap model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "/admin/allUsers";
    }

    @GetMapping("/user/edit/{id}")
    public String getEditUserPage(@PathVariable("id") Long id, ModelMap model) {
        User user = userRepository.findById(id).get();
        model.addAttribute("user", user);
        return "/admin/editUser";
    }

    @PostMapping("/user/edit")
    public String editUser(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            modelMap.addAttribute("success", false);
            modelMap.addAttribute("message",  "Заполните все поля!");
            return "/admin/editUser";
        }

        userService.editUser(userDTO);
        return "redirect:/admin/user/all";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
        return "forward:/admin/user/all";
    }
}
