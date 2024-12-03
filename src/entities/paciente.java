/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author kiwic
 */
public class paciente {
    
   
    private int id= 0;
    private String nombrepaciente = new String();  
    private String direccion = new String(); 
    private int edad = 0; 
    private double estatura = 0;
    private double peso = 0;
    private Medicamentos alergias = new Medicamentos();
    private String telefono = new String();
    
    public paciente(){
        
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Medicamentos getAlergias() {
        return alergias;
    }

    public void setAlergias(Medicamentos alergias) {
        this.alergias = alergias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
