package com.sdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/metodo")
public class JSONController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody jConvertidor metodoGet() {

        jConvertidor metodo = new jConvertidor();
        metodo.setValor("METODO GET");
        return metodo;

    }

}

