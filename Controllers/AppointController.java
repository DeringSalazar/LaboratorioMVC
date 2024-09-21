/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Appointment;
import Models.IPerson;
import Views.IView;

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
    
    
    
}
