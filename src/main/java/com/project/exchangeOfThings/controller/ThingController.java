package com.project.exchangeOfThings.controller;

import com.project.exchangeOfThings.dto.ThingDTO;
import com.project.exchangeOfThings.enums.ThingStatus;
import com.project.exchangeOfThings.evtity.Thing;
import com.project.exchangeOfThings.evtity.User;
import com.project.exchangeOfThings.repository.ThingRepository;
import com.project.exchangeOfThings.utils.DataMapper;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class ThingController {
    private final ThingRepository thingRepository;

    @GetMapping("/addThing")
    public Object getAddThingPage() {
        return new ModelAndView("user/addThing");
    }

    @PostMapping("/addThing")
    public String addThing(@Valid ThingDTO thingDTO, BindingResult bindingResult, ModelMap model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("success", false);
            model.addAttribute("message",  "Название вещи должно быть заполнено!");
            return "/user/addThing";
        }

        thingDTO.setThingStatus(ThingStatus.NOT_EXPOSED);
        thingRepository.save(DataMapper.toThing(thingDTO));
        model.addAttribute("message", "Вещь добавлена");
        model.addAttribute("success", true);
        return "/user/addThing";
    }

    @GetMapping("/allThings")
    public String showAllUsers(ModelMap model) {
        List<Thing> things = thingRepository.findAll();
        model.addAttribute("things", things);
        return "/user/allThings";
    }
}
