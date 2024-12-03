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
    }
    
    public void agregarMedicamento(Medicos med){
        if(med != null){
            this.Medico.add(med);
        }
    }
    public void editarMedicamento(Medicos med, int index){
        if(med != null){
        this.Medico.set(index, med);
        }
    }
    public void eliminarMedicamento(int index){
        if(index > -1){
        this.Medico.remove(index);
        }
    }
    
    public List<Medicos>consultarMedicamentosTodos(){
        return this.Medico;
    }
    
    public Medicos consultarMedicamentosId (int index){
        return this.Medico.get(index);
    }
}
    

