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
public class Controlador {
    private List<Medicamentos> registrosMedicamentos = new ArrayList();
    
    public Controlador(){
        Medicamentos _m = new Medicamentos();
        
        _m.setNombre("paracetamol");
        _m.setDescripcion("El paracetamol es un analgesico y antipiretico usado para aliviar dolores leves a moderarlos y reducir la fiebre");
        _m.setCantidad_Stock("30");
        
        this.registrosMedicamentos.add(_m);
    }
    
    public void agregarMedicamento(Medicamentos m){
        
    }
    public void editaMedicamento(Medicamentos t, int index){
        
    }
    public void eliminarMedicamento(int index){
        
    }
    
    public List<Medicamentos>consultarMedicamentosTodos(){
        return this.registrosMedicamentos;
    }
    
    public Medicamentos consultarMedicamentosId (int index){
        return this.registrosMedicamentos.get(index);
    }
}
