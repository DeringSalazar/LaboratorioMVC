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
            view.showErrorMessage("Error no se pudo agregar al cliente");
        }
    }
        public void update(int id, String email) {

            Customer customer = new Customer(id);
            customer = model.get(customer);

            if (customer != null) {

                if (email != null && !customer.getEmail().equals(email)) {

                    customer.setEmail(email);
                    if (model.set(customer)) {
                        view.showMessage("Email Actualizado Correctamente");
                    } else {
                        view.showErrorMessage("Error al actualizar los datos");
                    }
                } else {
                    view.showErrorMessage("Solo se puede actualizar el email.");
                }
            } else {
                view.showErrorMessage("Error, el cliente no se encuentra registrado");
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
 public Customer read(int id) {
    Customer customer = new Customer(id);
    return model.get(customer); // Devuelve el cliente encontrado
}
    public List<Customer> readAll() {
        List<Customer> customers = model.getAll(); 
        if (customers != null) {
            view.displayAll(customers); 
        } else {
            view.showErrorMessage("No hay datos");
        }
        return customers; 
    }
}
