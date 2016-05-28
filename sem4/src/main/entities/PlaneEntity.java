package main.entities;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class PlaneEntity extends MainEntity{
    private Long id;

    private String name;

    private String serialNumber;

    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
