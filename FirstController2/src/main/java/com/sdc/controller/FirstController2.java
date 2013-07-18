package com.sdc.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.IOException;


@Controller
@RequestMapping("/hi")
public class FirstController2 {

    @RequestMapping(method = RequestMethod.POST)
    public String printWelcome2(ModelMap model) {
        model.addAttribute("message", "Metodo POST");
        return "hello";
    }
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Metodo GET");
        return "hello";



    }

}
