package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String handleEvent (Model model) {
        List<String> events = new LinkedList<>();
        events.add("Hogmanay");
        events.add("Burns' Supper");
        events.add("Saint Patrick's Day");
        events.add("Summer Solstice");
        events.add("Oktoberfest");
        events.add("Winter Solstice");

        model.addAttribute("events", events);
        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

}
