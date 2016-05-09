package ru.ilyazamkovoy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ilyazamkovoy.entity.FlightEntity;
import ru.ilyazamkovoy.form.FlightForm;
import ru.ilyazamkovoy.repositories.FlightRepository;
import ru.ilyazamkovoy.services.FlightService;

/**
 * Created by zamkovoyilya on 05/05/16.
 */
@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightRepository flightRepository;


    @Override
    public void saveNewFlight(FlightForm flightForm) {
        FlightEntity flightEntity = new FlightEntity();

        flightEntity.setDepartureTime(flightForm.getDepartureTime());
        flightEntity.setArrivingTime(flightForm.getArrivingTime());
        flightEntity.setFromDirection(flightForm.getFromDirection());
        flightEntity.setToDirection(flightForm.getToDirection());
        flightEntity.setIdentity(flightForm.getIdentity());

        flightRepository.saveAndFlush(flightEntity);

    }
}
