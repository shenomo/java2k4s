package main.ilyazamkovoy.controllers;

import main.ilyazamkovoy.entity.FlightEntity;
import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.services.UserService;
import org.dom4j.rule.Mode;
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
import main.ilyazamkovoy.form.FlightForm;
import main.ilyazamkovoy.form.PlaneForm;
import main.ilyazamkovoy.repositories.FlightRepository;
import main.ilyazamkovoy.repositories.PlaneRepository;
import main.ilyazamkovoy.services.FlightService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Controller
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    UserService userService;


    @Qualifier("flightRepository")
    @Autowired
    FlightRepository flightRepository;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String showFlightFromForUser(ModelMap modelMap) {


        List list = flightService.findAll();

        modelMap.addAttribute("flightList", list);
        modelMap.addAttribute("flightForm", new FlightForm());

        return "flight";
    }


    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public String clientMakeOrder( @ModelAttribute("flightForm") @Valid FlightForm flightForm, BindingResult result, ModelMap modelMap) {

        UserEntity userEntity = (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        FlightEntity flightEntity = flightService.getFlightByIdentity(flightForm.getIdentity());

        if (flightEntity != null) {
            userService.updateFlightIdentity(flightForm.getIdentity(), userEntity.getEmail());

            String congrats = "congrats!";

            modelMap.addAttribute("message", congrats);

            return "redirect:/flight/showUser";
        } else {
            String congrats = "sorry, we dont have that flight";

            modelMap.addAttribute("message", congrats);

            return "flight";
        }
    }


    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    public String usersFlightsList(ModelMap modelMap) {

        UserEntity userEntity = (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        FlightEntity flightEntity = flightService.getFlightByIdentity(userEntity.getFlightIdentity());

        modelMap.addAttribute("flight", flightEntity);

        return "showUsersFlight";


    }


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminAddFlight(ModelMap modelMap) {

        List list = flightService.findAll();

        modelMap.addAttribute("flightList", list);
        modelMap.addAttribute("flightForm", new FlightForm());

        return "/adminFlight";

    }


    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String adminAddNewFlight(ModelMap modelMap, @ModelAttribute("flightForm") @Valid FlightForm flightForm, BindingResult result) {

        if (flightService.getFlightByIdentity(flightForm.getIdentity()) == null) {
            flightService.saveNewFlight(flightForm);

            String message = "flight added";
            modelMap.addAttribute("message", message);

            return "/adminFlight";
        } else {

            String message = "this flight already in use";
            modelMap.addAttribute("message", message);

            return "redirect:/flight/admin";

        }

    }


}
