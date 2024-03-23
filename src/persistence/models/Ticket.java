package persistence.models;

import java.time.LocalTime;
import java.util.Date;

public class Ticket {

    private String id;
    private String origin;
    private String destination;
    private Date date;
    private LocalTime time;
    private String dni;
    private String company;

    public Ticket(String id, String origin, String destination, Date date, LocalTime time, String dni, String company) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.dni = dni;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
