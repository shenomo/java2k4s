package ru.ilyazamkovoy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ilyazamkovoy.repositories.UserRepository;
import ru.ilyazamkovoy.services.UserService;

/**
 * Created by zamkovoyilya on 07/05/16.
 */
@Controller
@RequestMapping("/staffList")
public class StaffContoller {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;


    @RequestMapping(method = RequestMethod.GET)
    public String showStaffList(){




        //TODO как возвратить list с персоналом




        return "stafflist";
    }


}
