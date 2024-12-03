/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

//jeloudah

import entities.Pacientes;
import java.util.ArrayList;
import java.util.List;

public class PacientesImpl {
  private List<Pacientes> registrosPacientes = new ArrayList();
        
        public PacientesImpl(){
            Pacientes _pac1 = new Pacientes();
            
            _pac1.setId(0);
            _pac1.setNombrepaciente("Roberto Portillo");
            _pac1.setDireccion("Avenida siempreviva");
            _pac1.setFechanaciemiento("01/01/2007");
            _pac1.setEdad(19);
            _pac1.setEstatura(1.70);
            _pac1.setAlergias(null);
            _pac1.setTelefono("6221008888");
            this.registrosPacientes.add(_pac1);
            
            
            Pacientes _pac2 = new Pacientes();
            
            _pac2.setId(1);
            _pac2.setNombrepaciente("Jose Cecena");
            _pac2.setDireccion("Colonia miramar");;
            _pac2.setFechanaciemiento("01/01/2004");
            _pac2.setEdad(21);
            _pac2.setEstatura(1.80);
            _pac2.setAlergias(null);
            _pac2.setTelefono("6331459064");
            this.registrosPacientes.add(_pac2);
               
        }
        
    public void agregarPacientes(Pacientes pac) {

        if (pac != null) {
            this.registrosPacientes.add(pac);
        }

    }
    
    public void editarPacientes(Pacientes pac, int index) {

        if (pac != null) {

            this.registrosPacientes.get(index).setId(pac.getId());
            this.registrosPacientes.get(index).setNombrepaciente(pac.getNombrepaciente());
            this.registrosPacientes.get(index).setDireccion(pac.getDireccion());
            this.registrosPacientes.get(index).setFechanaciemiento(pac.getFechanaciemiento());
            this.registrosPacientes.get(index).setEdad(pac.getEdad());
            this.registrosPacientes.get(index).setEstatura(pac.getEstatura());
            this.registrosPacientes.get(index).setAlergias(pac.getAlergias());
            this.registrosPacientes.get(index).setTelefono(pac.getTelefono());
        }

    }

    public void eliminarPaciente(int index) {

        if (index > -1) {
            this.registrosPacientes.remove(index);
        }

    }

    public List<Pacientes> consultarPacienteTodos() {
        
        return this.registrosPacientes;
        
    }

    public Pacientes consultarPacienteId(int index) {
        
        return this.registrosPacientes.get(index);
        
    }
    
}

