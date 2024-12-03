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
Medicamentos _m0 = new Medicamentos();
        
        _m0.setId(0);
        _m0.setNombre("paracetamol");
        _m0.setDescripcion("El paracetamol es un analgesico para aliviar dolores leves a moderarlos");
        _m0.setCantidad(20);
        _m0.setGravedad(0);
        _m0.setPrecio(50.50);
        this.registrosMedicamentos.add(_m0);
        
        Medicamentos _m1 = new Medicamentos();
        _m1.setId(1);
        _m1.setNombre("Ibuprofeno");
        _m1.setDescripcion("Antiinflamatorio no esteroide");
        _m1.setCantidad(30);
        _m1.setGravedad(0);
        _m1.setPrecio(45.5);
        this.registrosMedicamentos.add(_m1);
        
        Medicamentos _m2 = new Medicamentos();
        _m2.setId(2);
        _m2.setNombre("Warfarina");
        _m2.setDescripcion("Antidepresivo");
        _m2.setCantidad(10);
        _m2.setGravedad(1);
        _m2.setPrecio(100.00);
        this.registrosMedicamentos.add(_m2);
        
        Medicamentos _m3 = new Medicamentos();
        _m3.setId(3);
        _m3.setNombre("Metformina");
        _m3.setDescripcion("Medicamentos para la diabetes");
        _m3.setCantidad(1);
        _m3.setGravedad(30);
        _m3.setPrecio(90.00);
        this.registrosMedicamentos.add(_m3);
        
        Medicamentos _m4 = new Medicamentos();
        _m4.setId(4);
        _m4.setNombre("Fentanilo");
        _m4.setDescripcion("para el manejo del dolor severo");
        _m4.setCantidad(25);
        _m4.setGravedad(2);
        _m4.setPrecio(120.0);
        this.registrosMedicamentos.add(_m4);
        
        Medicamentos _m5 = new Medicamentos();
        _m5.setId(5);
        _m5.setNombre("Clorpromazina");
        _m5.setDescripcion("Usados en el tratamiento de trastornos ");
        _m5.setCantidad(2);
        _m5.setGravedad(10);
        _m5.setPrecio(150.0);
        this.registrosMedicamentos.add(_m5);
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


