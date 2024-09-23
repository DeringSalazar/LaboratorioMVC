/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class AppointList implements IPerson<Appointment> {
    
    private final List<Appointment> appointList;

    public AppointList() {
        appointList = new ArrayList<>();
    }

    @Override
    public boolean add(Appointment appoint) {
        Appointment current = get(appoint);
        if(current!= null){
            return false;
        }else{
            appointList.add(appoint);
            return true;
        }
    }

    @Override
    public Appointment get(Appointment appoint) {
        for(Appointment current : appointList){
            if (current.getDate() == appoint.getDate() && current.getHour().equals(appoint.getHour()) && current.getCustomer() == appoint.getCustomer()) {
                return current;
            }
        }return null;
    }

    @Override
    public boolean set(Appointment appoint) {
        if (appoint != null) {
            Appointment current = get(appoint);
            if (current!= null) {
                appointList.remove(current);
                appointList.add(appoint);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Appointment appoint) {
        if (appoint != null && get(appoint)!= null) {
            appointList.remove(appoint);
            return true;
        }
        return false;
    }

    @Override
    public List getAll() {
        if (appointList.isEmpty()) {
            return null;
        }
        return appointList;
    }
    
}
