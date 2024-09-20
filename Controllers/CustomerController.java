/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Customer;
import Models.IPerson;
import Views.IView;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author misma
 */
public class CustomerController {

    public CustomerController(IPerson<Customer> model, IView<Customer> view) {
        this.model = model;
        this.view = view;
    }
    private IPerson<Customer> model;
    private IView<Customer> view;
    

    public void insert(int id, String name,LocalDate birthday, String phone, String email ){
        Customer customer;
        if (email!=null) {
            customer = new Customer(id, name, birthday, phone, email);
        }else{
            customer = new Customer(id, name, birthday, phone);
        }
        if(model.add(customer)){
            view.showMessage("Cliente Agregado");
        }else{
            view.showErrorMessage("Este id ya encuentra registrado");
        }
    }
    public void update(int id, String email){
        Customer customer = new Customer(id);
        customer= model.get(customer);
        if (customer!=null) {
            customer.setEmail(email);
            if (model.set(customer)) 
                view.showMessage("Cliente actualizado Correctamente");
            else
                view.showErrorMessage("Erro al actualizar datos");
        }else{
            view.showErrorMessage("Error el cliente no se encuentra registradp");
        }
    }
    public void delete(int id){
        Customer customer = new Customer(id);
        customer=model.get(customer);
        if (customer!=null) {
            model.remove(customer);
            view.showMessage("Cliente Eliminado Correctamente");
        }else{
            view.showErrorMessage("Error cliente no encontado");
        }
    }
    public void read(int id){
        Customer customer = new Customer(id);
        customer=model.get(customer);
        if (customer!=null) {
           view.display(customer);
        }else{
            view.showErrorMessage("Cliente no Encontrado");
        }
    }
    public void readAll(){
        List<Customer> customers=model.getAll();
        if (customers!=null) {
            view.displayAll(customers);
        }else{
            view.showErrorMessage("No hay datos");
        }
    }
}
