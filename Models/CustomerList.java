/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author misma
 */
public class CustomerList implements IPerson<Customer> {
    
    private final List<Customer> customerList;

   public CustomerList() {
        customerList = new ArrayList<>();
    }
    
    @Override
    public boolean add(Customer customer) {
    Customer current = get(customer);
 
    if (current != null) {  
        return false;
    }
    customerList.add(customer);  
    return true;
   }

    //mostrar
    @Override
    public Customer get(Customer customer) {
        for (Customer current : customerList) {
            if (current.getId() == customer.getId()) {
                return current;
            }
        }
        return null;
    }

    
    @Override
    public boolean set(Customer customer) {
        if (customer!=null) {
            Customer current = get(customer);
            if (current!=null) {
                customerList.remove(current);
                customerList.add(customer);
                return true;
            }
        }
        return false;
    }

    //eliminar
    @Override
    public boolean remove(Customer customer) {
        if (customer != null && get(customer)!=null) {
            customerList.remove(customer);
            return true;
        }
        return false;
    }

    //Mostrar todo
    @Override
    public List getAll() {
        if(customerList.isEmpty()){
            return null;
        }
        return customerList;
    }

    @Override
    public void makeReports(Customer element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
