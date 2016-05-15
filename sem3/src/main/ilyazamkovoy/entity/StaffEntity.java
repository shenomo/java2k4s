package main.ilyazamkovoy.entity;

import main.ilyazamkovoy.entity.enums.Role;

import javax.persistence.*;

/**
 * Created by zamkovoyilya on 07/05/16.
 */

@Entity
@Table(name = "staff", schema = "public", catalog = "Sem3DB")
public class StaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "identity")
    private String identity;

    @Basic
    @Column(name = "login")
    private String login;

    @Basic
    @Column(name = "passw")
    private String passw;

    @Basic
    @Column(name = "flightIdentity")
    private String flightIdentity;

    @Enumerated(EnumType.STRING)
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
