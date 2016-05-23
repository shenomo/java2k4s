package main.ilyazamkovoy.form;

import main.ilyazamkovoy.entity.FlightEntity;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
public class FlightForm {

    private String departureTime;
    private String arrivingTime;
    private String fromDirection;
    private String toDirection;
    private String identity;

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public String getFromDirection() {
        return fromDirection;
    }

    public void setFromDirection(String fromDirection) {
        this.fromDirection = fromDirection;
    }

    public String getToDirection() {
        return toDirection;
    }

    public void setToDirection(String toDirection) {
        this.toDirection = toDirection;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public static FlightForm fromEntity(FlightEntity flightEntity) {
        FlightForm flightForm = new FlightForm();
        flightForm.setArrivingTime(flightEntity.getArrivingTime());
        flightForm.setDepartureTime(flightEntity.getDepartureTime());
        flightForm.setFromDirection(flightEntity.getFromDirection());
        flightForm.setToDirection(flightEntity.getToDirection());
        return flightForm;
    }
}
