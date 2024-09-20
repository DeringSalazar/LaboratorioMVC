/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriomvc;

import Controllers.CustomerController;
import Models.CustomerList;
import Views.CustomerFrame;

public class LaboratorioMVC {

    public static void main(String[] args) {
        CustomerList model = new CustomerList();
        CustomerFrame view = new CustomerFrame();
        
        CustomerController controller = new CustomerController(model, view);
        view.setController(controller);
        view.show();

    
    }    
}
