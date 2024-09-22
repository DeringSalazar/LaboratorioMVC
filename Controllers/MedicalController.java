/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.IPerson;
import Models.Medical;
import Views.IView;
import java.time.LocalDate;
import java.util.List;

public class MedicalController {
    private IPerson<Medical> model;
    private IView<Medical> view;

    public MedicalController(IPerson<Medical> model, IView<Medical> view) {
        this.model = model;
        this.view = view;
    }
    
    public void insert(int id, int numMedical, String name, LocalDate birthday, String phone, String email, String specialty, double salary){
        Medical medical;
        if (phone!=null && email!=null) {
            medical = new Medical(id, numMedical, name, birthday, phone, email, specialty, salary);
        }else{
            medical = new Medical(id, numMedical, name, birthday, specialty, salary);
        }
        if(model.add(medical)){
            view.showMessage("Medico Agregado exitosamente");
        }else{
            view.showErrorMessage("Este id ya se encuentra registrado");
        }
    }
    
    public void update(int id, String phone, String email){
        Medical medical = new Medical(id);
        medical = model.get(medical);
        if (medical!=null) {
            medical.setPhone(phone);
            medical.setEmail(email);
            if (model.set(medical)) 
                view.showMessage("Cliente actualizado Correctamente");
            else
                view.showErrorMessage("Erro al actualizar datos");
        }else{
            view.showErrorMessage("Error el cliente no se encuentra registradp");
        }
    }
    
    public void delete(int id){
        Medical medical = new Medical(id);
        medical=model.get(medical);
        if (medical!=null) {
            model.remove(medical);
            view.showMessage("Cliente Eliminado Correctamente");
        }else{
            view.showErrorMessage("Error cliente no encontado");
        }
    }
    
    public void read(int id){
        Medical medical = new Medical(id);
        medical=model.get(medical);
        if (medical!=null) {
           view.display(medical);
        }else{
            view.showErrorMessage("Cliente no Encontrado");
        }
    }
    
    public void readAll(){
        List<Medical> medical = model.getAll();
        if (medical!=null) {
            view.displayAll(medical);
        }else{
            view.showErrorMessage("No hay datos");
        }
    }
}
