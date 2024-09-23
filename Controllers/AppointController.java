/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Appointment;
import Models.Customer;
import Models.IPerson;
import Models.Medical;
import Views.IView;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sebas
 */
public class AppointController {
    
    private IPerson<Appointment> model;
    private IView<Appointment> view;
    
    public AppointController(IPerson model, IView view) {
        this.model = model;
        this.view = view;
    }
    
    public void insert(LocalDate date, String hour, Customer customer, Medical medical, String reason){
        Appointment appoint;
        appoint = new Appointment(date,hour,customer,medical,reason);
        if (model.add(appoint)){
           view.showMessage("Cita agregado.");
        }else{
           view.showErrorMessage("Error al agregar la cita");
        }
    }

    public void update(Customer customer,LocalDate odate, String ohour,LocalDate date, String hour){
        Appointment appoint = new Appointment(odate,ohour,customer);
        appoint=model.get(appoint);
        if (appoint!=null){
            appoint.setDate(date);
            appoint.setHour(hour);
            if (model.set(appoint))
                view.showMessage("Cita actualizada.");
            else
               view.showErrorMessage("Error al actualizar la cita.");
        }else{
            view.showErrorMessage("Error cita no encontrada");
        }
    }
    
    public void delete(Customer customer,LocalDate date, String hour){        
        Appointment appoint = new Appointment(date,hour,customer);
        appoint=model.get(appoint);
        if (appoint!=null){
            model.remove(appoint);
            view.showMessage("Cita eliminada.");
        }else{
            view.showErrorMessage("Error cita no encontrada");
        }
    }
    
    
    public void read(Customer customer,LocalDate date, String hour){
        Appointment appoint = new Appointment(date,hour,customer);
        appoint=model.get(appoint);
        if (appoint!=null){
            view.display(appoint);
        }else{
            view.showErrorMessage("Error cita no encontrada");
        }
    }
    
    public void readAll(){
        List<Appointment> appoints=model.getAll();
        if(appoints!=null){
            view.displayAll(appoints);
        }else{
            view.showErrorMessage("No hay citas");
        }
    }
    
}
