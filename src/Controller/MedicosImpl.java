/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entities.Medicos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiwic
 */
public class MedicosImpl {
    private List<Medicos> Medico = new ArrayList();
    
    public MedicosImpl(){
        
        Medicos _med = new Medicos();
        
        _med.setId(0);
        _med.setNombreMedico("Raul Pimentel Rocha");
        _med.setFechaNaciemiento("19/02/1976");
        _med.setEdad(48);
        _med.setTelefono("622-156-8512");
        Medico.add(_med);

        this.Medico.add(_med);
        
                Medicos _med2 = new Medicos();
        
        _med2.setId(0);
        _med2.setNombreMedico("Carlos Saltamontes Vega");
        _med2.setFechaNaciemiento("19/06/1985");
        _med2.setEdad(48);
        _med2.setTelefono("622-500-8559");
        Medico.add(_med2);

        this.Medico.add(_med2);
    }
    
    public void agregarMedicos(Medicos med){
        if(med != null){
            this.Medico.add(med);
        }
    }
    public void editarMedicos(Medicos med, int index){
        if(med != null){
        this.Medico.set(index, med);
        }
    }
    public void eliminarMedicos(int index){
        if(index > -1){
        this.Medico.remove(index);
        }
    }
    
    public List<Medicos>consultarMedicosTodos(){
        return this.Medico;
    }
    
    public Medicos consultarMedicosId (int index){
        return this.Medico.get(index);
    }
}
    

