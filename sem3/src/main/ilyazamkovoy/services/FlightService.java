package main.ilyazamkovoy.services;

import main.ilyazamkovoy.entity.FlightEntity;
import main.ilyazamkovoy.form.FlightForm;

import java.util.List;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
public interface FlightService {

    void saveNewFlight(FlightForm flightForm);

    List findAll();

    FlightEntity getFlightByIdentity(String identity);

    List<FlightEntity> getAllFromDirection(String direct);

    List<FlightEntity> getAllToDirection(String direction);

    List<FlightEntity> findAllByFormDirectionAndToDirection(String form, String to);

}
