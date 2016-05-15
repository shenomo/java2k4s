package main.ilyazamkovoy.entity;

import javax.persistence.*;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Entity
@Table(name = "flight", schema = "public", catalog = "Sem3DB")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "departure_time")
    private String departureTime;

    @Basic
    @Column(name = "arriving_time")
    private String arrivingTime;

    @Basic
    @Column(name = "from_direction")
    private String fromDirection;

    @Basic
    @Column(name = "to_direction")
    private String toDirection;

    @Basic
    @Column(name = "identitynumber")
    private String identity;


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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightEntity that = (FlightEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (departureTime != null ? !departureTime.equals(that.departureTime) : that.departureTime != null)
            return false;
        if (arrivingTime != null ? !arrivingTime.equals(that.arrivingTime) : that.arrivingTime != null) return false;
        if (fromDirection != null ? !fromDirection.equals(that.fromDirection) : that.fromDirection != null)
            return false;
        if (toDirection != null ? !toDirection.equals(that.toDirection) : that.toDirection != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivingTime != null ? arrivingTime.hashCode() : 0);
        result = 31 * result + (fromDirection != null ? fromDirection.hashCode() : 0);
        result = 31 * result + (toDirection != null ? toDirection.hashCode() : 0);
        return result;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
