package ru.ilyazamkovoy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ilyazamkovoy.form.PlaneForm;
import ru.ilyazamkovoy.repositories.PlaneRepository;
import ru.ilyazamkovoy.services.PlaneService;

/**
 * Created by zamkovoyilya on 05/05/16.
 */

@Controller
@RequestMapping("/planes")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @Autowired
    PlaneRepository planeRepository;

    PlaneForm planeForm;

    @RequestMapping(method = RequestMethod.POST)
    public String addNewPlane(ModelMap modelMap, @RequestParam String name, @RequestParam String serialNumber,
                              @RequestParam String status){

        if(planeRepository.findOneBySerialNumber(serialNumber) != null){

            planeForm.setName(name);
            planeForm.setSerialNumber(serialNumber);
            planeForm.setStatus(status);

            planeService.saveNewPlane(planeForm);

            String congrats = "this plane successfully add";
            modelMap.put("congrats_message", congrats);

            return "AddPlane";
        }else {

            String error = "sorry, this plane all ready in use";

            modelMap.put("error_message", error);

            return "AddPlane";
        }
    }


    @RequestMapping(method = RequestMethod.GET)
    public String showPlaneList(ModelMap modelMap){



        //TODO как вернуть list со всеми самолетами


        return "plane";
    }


}
