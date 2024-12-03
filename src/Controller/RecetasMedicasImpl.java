/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import entities.RecetasMedicas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiwic
 */
public class RecetasMedicasImpl {
    private List<RecetasMedicas> recetas = new ArrayList();

    public void agregarReceta(RecetasMedicas rec){
                if (rec != null) {
            this.recetas.add(rec);
        }
    }

        public void editarReceta(RecetasMedicas _rec, int index) {
        if (_rec != null) {
            this.recetas.get(index).setFolio(_rec.getFolio());
            this.recetas.get(index).setCantidad(_rec.getCantidad());
            this.recetas.get(index).setCobro(_rec.getCobro());
            this.recetas.get(index).setFecha(_rec.getFecha());
            this.recetas.get(index).setMedico(_rec.getMedico());
            this.recetas.get(index).setPaciente(_rec.getPaciente());
            this.recetas.get(index).setConsultorio(_rec.getConsultorio());
            this.recetas.get(index).setListaMedicamentos(_rec.getListaMedicamentos());
        }

    }

    public void eliminarReceta(int index) {
        if (index > -1) {
            this.recetas.remove(index);
        }
    }

    public List<RecetasMedicas> consultarRecetaTodos() {

        return this.recetas;

    }

    public RecetasMedicas consultarRecetaId(int index) {
        return this.recetas.get(index);
    }
}
