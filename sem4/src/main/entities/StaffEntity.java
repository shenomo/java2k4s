package main.entities;

import main.entities.enums.Role;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class StaffEntity extends MainEntity{

    private Long id;

    private String identity;

    private String login;

    private String passw;

    private String flightIdentity;

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFlightIdentity() {
        return flightIdentity;
    }

    public void setFlightIdentity(String flightIdentity) {
        this.flightIdentity = flightIdentity;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }


}
