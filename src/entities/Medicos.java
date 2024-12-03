/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author kiwic
 */
public class Medicos {
    private int id= 0;
    private String nombrepaciente = new String();  
    private String fechanaciemiento = new String(); 
    private int edad = 0; 
    private String telefono = new String();

    public Medicos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrepaciente() {
        return nombrepaciente;
    }

    public void setNombrepaciente(String nombrepaciente) {
        this.nombrepaciente = nombrepaciente;
    }

    public String getFechanaciemiento() {
        return fechanaciemiento;
    }

    public void setFechanaciemiento(String fechanaciemiento) {
        this.fechanaciemiento = fechanaciemiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
