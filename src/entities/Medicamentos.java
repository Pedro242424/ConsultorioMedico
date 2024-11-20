/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author kiwic
 */
public class Medicamentos {
    private int id = 0;
    private String nombre = new String();
    private String descripcion = new String();
    private String Cantidad_Stock = new String();

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

    public String getCantidad_Stock() {
        return Cantidad_Stock;
    }

    public void setCantidad_Stock(String Cantidad_Stock) {
        this.Cantidad_Stock = Cantidad_Stock;
    }
    
    
}
