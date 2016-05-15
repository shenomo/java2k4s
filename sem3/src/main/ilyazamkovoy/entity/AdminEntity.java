package main.ilyazamkovoy.entity;

import main.ilyazamkovoy.entity.enums.Role;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;

/**
 * Created by zamkovoyilya on 09/05/16.
 */
@Entity
@Table(name = "admin", schema = "public", catalog = "Sem3DB")
public class AdminEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Basic
    @Column(name = "login")
    private String login;


    @Basic
    @Column(name = "passw")
    private String passw;

    @Enumerated(EnumType.STRING)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminEntity)) return false;

        AdminEntity that = (AdminEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return login != null ? login.equals(that.login) : that.login == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        return result;
    }
}
