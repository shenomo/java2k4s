package main.ilyazamkovoy.controllers;

import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.entity.StaffEntity;
import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.form.EnterForm;
import main.ilyazamkovoy.form.UserForm;
import main.ilyazamkovoy.services.AdminService;
import main.ilyazamkovoy.services.StaffService;
import main.ilyazamkovoy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by zamkovoyilya on 12/05/16.
 */

@Controller
@RequestMapping("/login")
public class EnterController {

    @Autowired
    UserService userService;


    @Autowired
    StaffService staffService;


    @Autowired
    AdminService adminService;


    @RequestMapping(method = RequestMethod.GET)
    public String sendUserForm(ModelMap modelMap) {

        modelMap.addAttribute("enterForm", new EnterForm());

        return "enter";

    }


    @RequestMapping(value = "/auf",method = RequestMethod.GET)
    public String enterUser(@ModelAttribute("enterForm") @Valid EnterForm enterForm, BindingResult result, ModelMap modelMap) {

        UserEntity userEntity = null;
        AdminEntity adminEntity = null;
        StaffEntity staffEntity = null;

        try {
            userEntity = (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){

        }
        try{
            adminEntity = (AdminEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){

        }

        try{
            staffEntity = (StaffEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){

        }

        if (userEntity != null) {

            return "redirect:/flight/client";

        } else if (adminEntity != null) {

            return "redirect:/flight/admin";

        } else if (staffEntity != null) {

            return "redirect:/staff/showFlightToStaff";
        } else {

            String message = "sorry, you are wrong";

            modelMap.addAttribute("message", message);

            return "enter";

        }

    }


}
