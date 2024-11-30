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
    
    // Lista que almacena los medicamentos registrados
    private List<Medicamentos> registrosMedicamentos = new ArrayList();

    // Constructor de la clase
    public Controlador() {
        // Creación de un medicamento de ejemplo al inicializar el controlador
        Medicamentos _m = new Medicamentos();

        // Configuración de los atributos del medicamento
        _m.setId(0); // ID del medicamento
        _m.setNombre("paracetamol"); // Nombre del medicamento
        _m.setDescripcion("El paracetamol es un analgésico y antipirético usado para aliviar dolores leves a moderados y reducir la fiebre");
        _m.setCantidad(20); // Cantidad disponible en el inventario
        _m.setGravedad(0); // Nivel de gravedad asociado (0 = leve)
        _m.setPrecio(50.50); // Precio del medicamento

        // Agregando el medicamento a la lista de registros
        this.registrosMedicamentos.add(_m);
    }

    // Método para agregar un nuevo medicamento al registro
    public void agregarMedicamento(Medicamentos m) {
        if (m != null) { // Verifica que el medicamento no sea nulo
            this.registrosMedicamentos.add(m); // Lo agrega a la lista
        }
    }

    // Método para editar un medicamento existente en el registro
    public void editarMedicamento(Medicamentos m, int index) {
        if (m != null) { // Verifica que el medicamento no sea nulo
            this.registrosMedicamentos.set(index, m); // Reemplaza el medicamento en la posición indicada
        }
    }

    // Método para eliminar un medicamento del registro por su índice
    public void eliminarMedicamento(int index) {
        if (index > -1) { // Verifica que el índice sea válido
            this.registrosMedicamentos.remove(index); // Elimina el medicamento de la lista
        }
    }

    // Método para consultar todos los medicamentos en el registro
    public List<Medicamentos> consultarMedicamentosTodos() {
        return this.registrosMedicamentos; // Devuelve la lista completa de medicamentos
    }

    // Método para consultar un medicamento específico por su índice
    public Medicamentos consultarMedicamentosId(int index) {
        return this.registrosMedicamentos.get(index); // Devuelve el medicamento en la posición indicada
    }
}

