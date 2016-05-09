package ru.ilyazamkovoy.form;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
public class FlightForm {

    private String departureTime;
    private String arrivingTime;
    private String fromDirection;
    private String toDirection;
    private String identity;
    private String quality;

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

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
}
