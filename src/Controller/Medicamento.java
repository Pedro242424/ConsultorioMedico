/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entities.Medicamentos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiwic
 */
public class Medicamento {
    
  private List<Medicamentos> registrosMedicamentos = new ArrayList();
    
    public Medicamento(){
        Medicamentos _m = new Medicamentos();
        
        _m.setId(0);
        _m.setNombre("paracetamol");
        _m.setDescripcion("El paracetamol es un analgesico y antipiretico usado para aliviar dolores leves a moderarlos "
                    + "y reducir la fiebre");
        _m.setCantidad(20);
        _m.setGravedad(0);
        _m.setPrecio(50.50);
        
        this.registrosMedicamentos.add(_m);
    }
    
    public void agregarMedicamento(Medicamentos m){
        if(m != null){
            this.registrosMedicamentos.add(m);
        }
    }
    public void editarMedicamento(Medicamentos m, int index){
        if(m != null){
        this.registrosMedicamentos.set(index, m);
        }
    }
    public void eliminarMedicamento(int index){
        if(index > -1){
        this.registrosMedicamentos.remove(index);
        }
    }
    
    public List<Medicamentos>consultarMedicamentosTodos(){
        return this.registrosMedicamentos;
    }
    
    public Medicamentos consultarMedicamentosId (int index){
        return this.registrosMedicamentos.get(index);
    }
}


