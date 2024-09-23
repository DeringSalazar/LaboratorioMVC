/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class Appointment {
    
    private LocalDate date;
    private String hour;
    private Customer customer;
    private Medical medical;
    private String reason;

    public Appointment(LocalDate date, String hour, Customer customer, Medical medical, String reason) {
        this.date = date;
        this.hour = hour;
        this.customer = customer;
        this.medical = medical;
        this.reason = reason;
    }

    public Appointment(LocalDate date, String hour, Customer customer) {
        this(date,hour,customer,null,null);
    }
    
    

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Appointment{" + "date=" + date + ", hour=" + hour + ", customer=" + customer + ", medical=" + medical + ", reason=" + reason + '}';
    }
    
    
    
}
