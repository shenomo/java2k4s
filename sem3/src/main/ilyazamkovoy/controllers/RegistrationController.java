package main.ilyazamkovoy.controllers;

import main.ilyazamkovoy.form.StaffForm;
import main.ilyazamkovoy.form.UserForm;
import main.ilyazamkovoy.repositories.UserRepository;
import main.ilyazamkovoy.services.StaffService;
import main.ilyazamkovoy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    UserService userService;

    @Qualifier("userRepository")
    @Autowired
    UserRepository userRepository;

    @Autowired
    StaffService staffService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUserRegistrationFrom(ModelMap modelMap){

        modelMap.addAttribute("userForm", new UserForm());
        return "registration_user";
    }

    @RequestMapping(value = "/staff",method = RequestMethod.GET)
    public String getStaffRegistrationForm(ModelMap modelMap){

        modelMap.addAttribute("staffForm", new StaffForm());

        return "registration_staff";

    }



    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String newUser(@ModelAttribute("userForm") @Valid UserForm userForm, BindingResult result) {


        if(userService.getUserByEmail(userForm.getEmail())!=null){
            result.addError(new FieldError("userForm", "email", "email already in use "));
        }

        if(result.hasErrors()){
            return "registration_user";
        }



        userService.saveNewUser(userForm);
        return "redirect:/flight/client";
    }

    @RequestMapping(value = "/staff",method = RequestMethod.POST)
    public String newStaff(@ModelAttribute("staffForm") @Valid StaffForm staffForm, BindingResult result){

        if(staffService.getStaffByLogin(staffForm.getLogin())!=null){
            result.addError(new FieldError("staffForm", "login", "login already in use"));
        }

        if(result.hasErrors()){
            return "registration_staff";
        }


        staffService.saveNewStaff(staffForm);

        return "redirect:/staff/showFlightToStaff";
    }


}




