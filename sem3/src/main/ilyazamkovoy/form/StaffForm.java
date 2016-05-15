package main.ilyazamkovoy.form;

/**
 * Created by zamkovoyilya on 07/05/16.
 */


public class StaffForm {


    private Long id;
    private String identity;
    private String login;
    private String passw;
    private String flightidentity;

    public String getFlightidentity() {
        return flightidentity;
    }

    public void setFlightidentity(String flightidentity) {
        this.flightidentity = flightidentity;
    }

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
}

