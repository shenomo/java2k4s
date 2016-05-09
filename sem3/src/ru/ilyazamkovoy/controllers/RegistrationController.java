package ru.ilyazamkovoy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ilyazamkovoy.form.UserForm;
import ru.ilyazamkovoy.repositories.UserRepository;
import ru.ilyazamkovoy.services.UserService;

import javax.naming.Binding;
import javax.validation.Valid;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;


    UserForm userForm;


    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String getRegistrationFrom(ModelMap modelMap){

        modelMap.addAttribute("userForm", new UserForm());
        return "registration_user";
    }



    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public String newUser(@ModelAttribute("userform") @Valid UserForm userForm, BindingResult result) {


        if(userService.getUserByMail(userForm.getEmail())!=null){

            result.addError(new FieldError("userform", "email", "email already in use "));
        }

        if(result.hasErrors()){
            return "registration_user";
        }



        userService.saveNewUser(userForm);
        return "redirect:/flight";
    }


}



