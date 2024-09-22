/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;


public class MedicalLists implements IPerson<Medical> {
    private final List<Medical> medicalList;

    public MedicalLists() {
        medicalList = new ArrayList<>();
    }

    @Override
    public boolean add(Medical element) {
        Medical current = get(element);
        if (current != null) {
            return false;
        } else {
            medicalList.add(element);
            return true;
        }
    }

    @Override
    public Medical get(Medical element) {
        for(Medical current : medicalList){
            if (current.getId() == element.getId()) {
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean set(Medical element) {
        if (element!=null) {
            Medical current = get(element);
            if (current!=null) {
                medicalList.remove(current);
                medicalList.add(element);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Medical element) {
        if (element != null && get(element)!=null) {
            medicalList.remove(element);
            return true;
        }
        return false;
    }

    @Override
    public List getAll() {
        if(medicalList.isEmpty()){
            return null;
        }
        return medicalList;
    }

    @Override
    public void makeReports(Medical element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
