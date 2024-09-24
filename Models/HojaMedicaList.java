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
public class HojaMedicaList implements IPerson<HojaMedica>{
        private final List<HojaMedica> hojaList;

    public HojaMedicaList() {
        hojaList = new ArrayList<>();
    }
        
        

    @Override
    public boolean add(HojaMedica hojaMedica) {
        HojaMedica current = get(hojaMedica);
        if (current!=null) {
            return false;
        }
        hojaList.add(hojaMedica);
        return true;
    }

    @Override
    public HojaMedica get(HojaMedica hojaMedica) {
         for(HojaMedica current : hojaList){
             if (current.getAppointment().equals(hojaMedica.getAppointment())) {
                 return current;
             }
         }
         return null;
    }

    @Override
    public boolean set(HojaMedica hojaMedica) {
        HojaMedica current = get(hojaMedica);
        if (current!=null) {
            hojaList.remove(current);
            hojaList.add(hojaMedica);
            return true;
                    
        }
        return false;
    }

    @Override
    public boolean remove(HojaMedica hojaMedica) {
        HojaMedica current = get(hojaMedica);
        if (current!=null) {
            hojaList.remove(current);
            return true;
        }
        return false;
    }

    @Override
    public List getAll() {
        if (hojaList.isEmpty()) {
            return null;
        }
        return hojaList;
    }

    @Override
    public void makeReports(HojaMedica element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
