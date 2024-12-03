/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

//comentario
public class Medicamentos {
    
    private int id = 0; //Idenfificador unico de medicamento
    private String nombre = new String();  // Nombre del medicamento puede haber multiples
    private String descripcion = new String(); // Ni se porque esta aqui pero bueno
    private int gravedad = 0; // Nivel de gravedad en un rango del 0-2
    private int cantidad = 0;//  Cantidad de existencias del medicamento
    private double precio = 0;// Precio del medicamento en pesos
    
    public Medicamentos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
}
