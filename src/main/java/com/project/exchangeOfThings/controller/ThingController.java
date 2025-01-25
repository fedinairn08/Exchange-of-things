package com.project.exchangeOfThings.controller;

import com.project.exchangeOfThings.dto.ThingDTO;
import com.project.exchangeOfThings.evtity.Thing;
import com.project.exchangeOfThings.repository.ThingRepository;
import com.project.exchangeOfThings.service.ThingService;
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
    private final ThingService thingService;

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

        thingService.saveThing(thingDTO);
        model.addAttribute("message", "Вещь добавлена");
        model.addAttribute("success", true);
        return "/user/addThing";
    }

    @GetMapping("/allThings")
    public String showAllThings(ModelMap model) {
        List<Thing> things = thingRepository.findAll();
        model.addAttribute("things", things);
        return "/user/allThings";
    }
}
