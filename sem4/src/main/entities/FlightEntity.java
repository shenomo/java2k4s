package main.entities;

/**
 * Created by zamkovoyilya on 27/05/16.
 */

public class FlightEntity extends MainEntity{

    private Long id;

    private String departureTime;

    private String arrivingTime;

    private String fromDirection;

    private String toDirection;

    private String identity;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


}
