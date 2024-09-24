/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Appointment;
import Models.HojaMedica;
import Models.IPerson;
import Views.IView;
import java.util.List;

/**
 *
 * @author misma
 */
public class HojaController {
    private IPerson<HojaMedica> model;
    private IView<HojaMedica> view;

    public HojaController(IPerson<HojaMedica> model, IView<HojaMedica> view) {
        this.model = model;
        this.view = view;
    }
    
    public void insert(Appointment appointment, String vitalSigns, String diagnosis, String medicalObservations, String prescribedMedications, String recommendedExams){
        HojaMedica hojaMedica = new HojaMedica(appointment, vitalSigns, diagnosis, medicalObservations, prescribedMedications, recommendedExams);
        if (model.add(hojaMedica)) {
            view.showMessage("Hoja Medica Agregada");
        }else{
            view.showErrorMessage("Error al agregar la hoja medica");
        }
    }
    public void update(Appointment appointment, String vitalSigns, String diagnosis, String medicalObservations, String prescribedMedications, String recommendedExams) {
        HojaMedica hojaMedica = new HojaMedica(appointment, vitalSigns, diagnosis, medicalObservations, prescribedMedications, recommendedExams);
        if (model.set(hojaMedica)) {
            view.showMessage("Hoja medica actualizada");
        }else{
            view.showMessage("Error no se pudo actualizar la hoja medica");
        }
    }
    public void delete(Appointment appoinment){
        HojaMedica hojaMedica = new HojaMedica(appoinment, null, null, null, null, null);
        if (model.remove(hojaMedica)) {
            view.showMessage("Hoja medica eliminada");
        }else{
            view.showErrorMessage("Error al eliminar la hoja");
        }
    }
        public void read(Appointment appointment) {
        HojaMedica hojaMedica = new HojaMedica(appointment, null, null, null, null, null);
        hojaMedica = model.get(hojaMedica);
        if (hojaMedica != null) {
            view.display(hojaMedica);
        } else {
            view.showErrorMessage("Hoja médica no encontrada.");
        }
    }
         public void readAll() {
        List<HojaMedica> hojasMedicas = model.getAll();
        if (hojasMedicas != null) {
            view.displayAll(hojasMedicas);
        } else {
            view.showErrorMessage("No hay hojas médicas.");
        }
    }
}
