package main.ilyazamkovoy.controllers;

import main.ilyazamkovoy.entity.FlightEntity;
import main.ilyazamkovoy.entity.StaffEntity;
import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.form.FlightForm;
import main.ilyazamkovoy.form.StaffForm;
import main.ilyazamkovoy.form.UserForm;
import main.ilyazamkovoy.repositories.StaffRepository;
import main.ilyazamkovoy.services.FlightService;
import main.ilyazamkovoy.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import main.ilyazamkovoy.repositories.UserRepository;
import main.ilyazamkovoy.services.UserService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by zamkovoyilya on 07/05/16.
 */
@Controller
@RequestMapping("/staff")
public class StaffContoller {

    @Autowired
    StaffService staffService;

    @Qualifier("staffRepository")
    @Autowired
    StaffRepository staffRepository;

    @Autowired
    FlightService flightService;


    @RequestMapping(value = "/adminStaff", method = RequestMethod.GET)
    public String showStaffList(ModelMap modelMap) {


        List list = staffService.findAll();

        modelMap.addAttribute("staffList", list);
        modelMap.addAttribute("staffForm", new StaffForm());

        return "staffList";
    }


    @RequestMapping(value = "/adminStaff", method = RequestMethod.POST)
    public String addNewStaff(@ModelAttribute("staffForm") @Valid StaffForm staffForm, BindingResult result, ModelMap modelMap) {

        if (staffService.getStaffByLogin(staffForm.getLogin()) != null) {
            result.addError(new FieldError("staffFrom", "login", "login already in use "));
        }


        if (result.hasErrors()) {
            return "staffList";
        }

        staffService.saveNewStaff(staffForm);
        String message = "staff added";

        modelMap.addAttribute("message", message);

        return "staffList";

    }

    @RequestMapping(value = "/showFlightToStaff", method = RequestMethod.GET)
    public String showStaffFlight(ModelMap modelMap){

        StaffEntity staffEntity = (StaffEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        FlightEntity flightEntity = flightService.getFlightByIdentity(staffEntity.getFlightIdentity());

        FlightForm flightForm = new FlightForm();

        flightForm.setArrivingTime(flightEntity.getArrivingTime());
        flightForm.setDepartureTime(flightEntity.getDepartureTime());
        flightForm.setFromDirection(flightEntity.getFromDirection());
        flightForm.setToDirection(flightEntity.getToDirection());

        modelMap.addAttribute("flightForm", flightForm);

        return "staffFlight";
    }


}
