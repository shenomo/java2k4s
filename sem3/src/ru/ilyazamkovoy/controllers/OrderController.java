package ru.ilyazamkovoy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ilyazamkovoy.form.FlightForm;
import ru.ilyazamkovoy.repositories.FlightRepository;
import ru.ilyazamkovoy.services.FlightService;

/**
 * Created by zamkovoyilya on 07/05/16.
 */


@Controller
@RequestMapping("/home")
public class OrderController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightRepository flightRepository;

    FlightForm flightForm;



    @RequestMapping(method = RequestMethod.POST)
    public String makeOrderForUser(ModelMap modelMap, @RequestParam String flightIdentity){

        //TODO как вытащить сессию юзера???

        //TODO нужен сам flight, чтобы у него уменьшить quality




        return "homePage";
    }







}
