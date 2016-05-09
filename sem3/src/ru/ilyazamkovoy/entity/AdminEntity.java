package ru.ilyazamkovoy.entity;

import javax.persistence.*;

/**
 * Created by zamkovoyilya on 09/05/16.
 */
@Entity
@Table(name = "admin", schema = "public", catalog = "Sem3DB")
public class AdminEntity {

    private Long id;
    private String email;


    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminEntity)) return false;

        AdminEntity that = (AdminEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
