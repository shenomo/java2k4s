package main.ilyazamkovoy.controllers;

import main.ilyazamkovoy.entity.FlightEntity;
import main.ilyazamkovoy.response.FlightResponse;
import main.ilyazamkovoy.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by zamkovoyilya on 16/05/16.
 */
@Controller
@RequestMapping("/stat")
public class StatController {
    @Autowired
    FlightService flightService;

    @RequestMapping(method = RequestMethod.GET)
    public String ftlReturn() {


        return "statTemplate";
    }


    @RequestMapping(value = "/show")
    public
    @ResponseBody
    List<FlightResponse> statMethod(@RequestParam(value = "from") String from,
                                    @RequestParam(value = "to") String to) {
        List<FlightEntity> list = new LinkedList<>();
        List<FlightResponse> resp = new LinkedList<>();
        if (!Objects.equals(from, "") && Objects.equals(to, "")) {
            list = flightService.getAllFromDirection(from);
        }
        if (Objects.equals(from, "") && !Objects.equals(to, "")) {
            list = flightService.getAllToDirection(to);
            System.out.println("ppdpasdp");
        }
        if (!Objects.equals(from, "") && !Objects.equals(to, "")) {
            list = flightService.findAllByFormDirectionAndToDirection(from, to);
        }

        for (FlightEntity flight : list) {
            FlightResponse flightResp = new FlightResponse();
            flightResp.setToDirection(flight.getToDirection());
            flightResp.setFromDirection(flight.getFromDirection());
            flightResp.setArrivingTime(flight.getArrivingTime());
            flightResp.setDepartureTime(flight.getDepartureTime());

            resp.add(flightResp);
        }

        return resp;
    }


}
