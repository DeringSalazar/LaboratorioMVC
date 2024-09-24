/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriomvc;

import Controllers.CustomerController;
import Controllers.HojaController;
import Controllers.MedicalController;
import Models.CustomerList;
import Models.HojaMedicaList;
import Models.MedicalLists;

import Views.FrmCustomer;
import Views.FrmHojaMedica;
import Views.FrmMedical;
import Views.FrmMenu;

public class LaboratorioMVC {

    public static void main(String[] args) {

    CustomerList customerModel = new CustomerList(); 
    MedicalLists medicalModel = new MedicalLists(); 
    HojaMedicaList hojamodel = new HojaMedicaList();

    FrmCustomer customerView = new FrmCustomer();
    FrmMedical medicalView = new FrmMedical();
    FrmHojaMedica hojaView = new FrmHojaMedica();

    CustomerController customerController = new CustomerController(customerModel, customerView);
    MedicalController medicalController = new MedicalController(medicalModel, medicalView);
    HojaController  hojaController = new HojaController(hojamodel, hojaView);

    
    customerView.setController(customerController);
    medicalView.setControllers(medicalController);
    hojaView.setController(hojaController);
<<<<<<< HEAD

=======
>>>>>>> b07ee31

    FrmMenu frmMenu = new FrmMenu();
    frmMenu.setController(customerController);
    frmMenu.setControlller(medicalController);  
    frmMenu.setControl(hojaController);  
    frmMenu.setVisible(true);
    
    }    
}
