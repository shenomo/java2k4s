package ru.ilyazamkovoy.entity;

import javax.persistence.*;

/**
 * Created by zamkovoyilya on 07/05/16.
 */

@Entity
@Table(name = "staff", schema = "public", catalog = "Sem3DB")
public class StaffEntity {

    private Long id;
    private String first_name;
    private String last_name;
    private String identity;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Basic
    @Column(name = "name")
    public String getFirst_name() {
        return first_name;
    }

    @Basic
    @Column(name = "name")
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Basic
    @Column(name = "identity")
    public String getIdentity() {return identity;}

    public void setIdentity(String identity) {this.identity = identity;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StaffEntity)) return false;

        StaffEntity that = (StaffEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (first_name != null ? !first_name.equals(that.first_name) : that.first_name != null) return false;
        return last_name != null ? last_name.equals(that.last_name) : that.last_name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
        result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
        return result;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }



}
