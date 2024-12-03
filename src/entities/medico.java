
package entities;


public class medico {
     private int id= 0;
    private String nombreMedico = new String();  
    private String fechanaciemiento = new String(); 
    private int edad = 0; 
    private String telefono = new String();

    public medico(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrepaciente() {
        return nombreMedico;
    }

    public void setNombrepaciente(String nombrepaciente) {
        this.nombreMedico = nombrepaciente;
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

