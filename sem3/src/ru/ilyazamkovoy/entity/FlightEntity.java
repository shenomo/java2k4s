package ru.ilyazamkovoy.entity;

import javax.persistence.*;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Entity
@Table(name = "flight", schema = "public", catalog = "Sem3DB")
public class FlightEntity {
    private Long id;
    private String departureTime;
    private String arrivingTime;
    private String fromDirection;
    private String toDirection;
    private String identity;
    private String quality;
    private String price;

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Id
    @Column(name = "id")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "departure_time")
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Basic
    @Column(name = "arriving_time")
    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    @Basic
    @Column(name = "from_direction")
    public String getFromDirection() {
        return fromDirection;
    }

    public void setFromDirection(String fromDirection) {
        this.fromDirection = fromDirection;
    }

    @Basic
    @Column(name = "to_direction")
    public String getToDirection() {
        return toDirection;
    }

    public void setToDirection(String toDirection) {
        this.toDirection = toDirection;
    }


    @Basic
    @Column(name = "price")
    public String getPrice() {return price;}

    public void setPrice(String price) {this.price = price;}


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
