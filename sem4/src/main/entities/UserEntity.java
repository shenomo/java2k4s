package main.entities;

import main.entities.enums.Role;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class UserEntity extends MainEntity{

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String passw;

    private String flightIdentity;

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }


    public String getFlightIdentity() {
        return flightIdentity;
    }

    public void setFlightIdentity(String flightIdentity) {
        this.flightIdentity = flightIdentity;
    }


}
