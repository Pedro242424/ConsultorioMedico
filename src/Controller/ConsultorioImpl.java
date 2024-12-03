/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entities.Consultorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ConsultorioImpl {
    
    private List<Consultorio> consultorios = new ArrayList();        

    public ConsultorioImpl() {
        
    Consultorio _cons = new Consultorio();
    _cons.setNombre("CasiCiego");
    _cons.setDireccion("Calle 16, Avenida 16 Numero 280 ");
    _cons.setCorreo("ConsultorioCasiCiego@Farmacio.gob.mz");
    _cons.setTelefono("6451107743");
    _cons.setFundador("Dr Candido Perez Lopez");
    _cons.setFechaCreacion("21/03/1969");
    consultorios.add(_cons);
    }
    
    public void agregarConsultorio(Consultorio cons) {

        if (cons != null) {
            this.consultorios.add(cons);
        }

    }
    
        public void editarConsultorio(Consultorio cons, int index) {

        if (cons != null) {

            this.consultorios.get(index).setNombre(cons.getNombre());
            this.consultorios.get(index).setDireccion(cons.getDireccion());
            this.consultorios.get(index).setTelefono(cons.getTelefono());
            this.consultorios.get(index).setCorreo(cons.getCorreo());
            this.consultorios.get(index).setFundador(cons.getFundador());
            this.consultorios.get(index).setFechaCreacion(cons.getFechaCreacion());

        }

    }

    public void eliminarConsultorio(int index) {

        if (index > -1) {
            this.consultorios.remove(index);
        }

    }

    public List<Consultorio> consultarConsultorioTodos() {
        
        return this.consultorios;
        
    }

    public Consultorio consultarConsultorioId(int index) {
        
        return this.consultorios.get(index);
        
    }
    
}
