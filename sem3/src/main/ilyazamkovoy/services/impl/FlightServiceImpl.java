package main.ilyazamkovoy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import main.ilyazamkovoy.entity.FlightEntity;
import main.ilyazamkovoy.form.FlightForm;
import main.ilyazamkovoy.repositories.FlightRepository;
import main.ilyazamkovoy.services.FlightService;

import java.util.List;

/**
 * Created by zamkovoyilya on 05/05/16.
 */
@Service
public class FlightServiceImpl implements FlightService {

    @Qualifier("flightRepository")
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

        flightRepository.save(flightEntity);

    }

    @Override
    public List findAll() {

        List list = flightRepository.findAll();

        return list;
    }

    @Override
    public FlightEntity getFlightByIdentity(String identity) {

        FlightEntity flightEntity = flightRepository.findOneByIdentity(identity);

        return flightEntity;
    }

    @Override
    public List<FlightEntity> getAllFromDirection(String direct) {
        return flightRepository.findAllByFromDirection(direct);
    }

    @Override
    public List<FlightEntity> getAllToDirection(String direction) {
        return flightRepository.findAllByToDirection(direction);
    }

    @Override
    public List<FlightEntity> findAllByFormDirectionAndToDirection(String form, String to) {
        return flightRepository.findAllByFromDirectionAndToDirection(form, to);
    }
}
