/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriomvc;

import Controllers.CustomerController;
import Controllers.MedicalController;
import Models.CustomerList;
import Models.MedicalLists;

import Views.FrmCustomer;
import Views.FrmMedical;
import Views.FrmMenu;

public class LaboratorioMVC {

    public static void main(String[] args) {

    CustomerList customerModel = new CustomerList(); 
    MedicalLists medicalModel = new MedicalLists(); 

    FrmCustomer customerView = new FrmCustomer();
    FrmMedical medicalView = new FrmMedical();

    CustomerController customerController = new CustomerController(customerModel, customerView);
    MedicalController medicalController = new MedicalController(medicalModel, medicalView);

    // Set controllers in views
    customerView.setController(customerController);
    medicalView.setControllers(medicalController);


    FrmMenu frmMenu = new FrmMenu();
    frmMenu.setController(customerController);
    frmMenu.setControlller(medicalController);  
    frmMenu.setVisible(true);
    
    }    
}
