package ru.ilyazamkovoy.controllers;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ilyazamkovoy.form.FlightForm;
import ru.ilyazamkovoy.form.PlaneForm;
import ru.ilyazamkovoy.repositories.FlightRepository;
import ru.ilyazamkovoy.repositories.PlaneRepository;
import ru.ilyazamkovoy.services.FlightService;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Controller
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightRepository flightRepository;

    FlightForm flightForm;


    @RequestMapping(method = RequestMethod.POST)
    public String makeReservation(ModelMap modelMap, @RequestParam String departureTime, @RequestParam String arrivingTime,
                                  @RequestParam String fromDirection, @RequestParam String toDirection, @RequestParam String identity) {


        //TODO узнать как вытаскивать сессию, чтобы понимать кто делает бронь

        return "homePage";
    }
    

    @RequestMapping(method = RequestMethod.POST)
    public String adminAddFlight(ModelMap modelMap, @RequestParam String departureTime, @RequestParam String arrivingTime,
                                 @RequestParam String fromDirection, @RequestParam String toDirection, @RequestParam String identity,
                                 @RequestParam String quality) {

        if (flightRepository.findOneByIdentity(identity) == null) {

            flightForm.setDepartureTime(departureTime);
            flightForm.setArrivingTime(arrivingTime);
            flightForm.setFromDirection(fromDirection);
            flightForm.setToDirection(toDirection);
            flightForm.setIdentity(identity);
            flightForm.setQuality(quality);

            flightService.saveNewFlight(flightForm);

            String congrats = "new Flight has been added";
            modelMap.put("congrats_message", congrats);

            return "addFlight";

        }else{

            String error = "sorry, this flight all ready added";

            modelMap.put("error_message", error);

            return "addFlight";
        }

    }


    @RequestMapping(method = RequestMethod.GET)
    public String showFlightList(ModelMap modelMap){


        //TODO как вернуть list со всеми полетами



        return "Flight";

    }


}
