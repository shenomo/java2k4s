package main.ilyazamkovoy.controllers;

import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.entity.FlightEntity;
import main.ilyazamkovoy.entity.PlaneEntity;
import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.form.FlightForm;
import org.apache.poi.hssf.record.formula.functions.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import main.ilyazamkovoy.form.PlaneForm;
import main.ilyazamkovoy.repositories.PlaneRepository;
import main.ilyazamkovoy.services.PlaneService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by zamkovoyilya on 05/05/16.
 */

@Controller
@RequestMapping("/planes")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @Qualifier("planeRepository")
    @Autowired
    PlaneRepository planeRepository;

    @RequestMapping(value = "/addNewPlane", method = RequestMethod.GET)
    public String planeForm(ModelMap modelMap){


        List list = planeService.findAll();

        modelMap.addAttribute("planeList", list);
        modelMap.addAttribute("planeForm", new PlaneForm());

        return "addPlane";
    }



    @RequestMapping(value = "/addNewPlane", method = RequestMethod.POST)
    public String addNewPlane(@ModelAttribute("planeForm") @Valid PlaneForm planeForm, BindingResult result, ModelMap modelMap){
//
//        AdminEntity adminEntity = (AdminEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        planeService.saveNewPlane(planeForm);

        String message = "plane added";

        modelMap.addAttribute("message", message);

        return "redirect: /planes/addNewPlane";

    }

}
