/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controller.Medicamento;
import entities.Medicamentos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GestionDeMedicamentos extends javax.swing.JFrame {
    
    // Instancia estática del controlador, utilizada para manejar el inventario de medicamentos.
public static Medicamento _Controlador = new Medicamento();

// Constructor de la clase GestionDeMedicamentos.
public GestionDeMedicamentos() {
    initComponents(); // Inicializa los componentes gráficos de la interfaz.
    this.setLocationRelativeTo(null); // Centra la ventana en la pantalla.
    this.llenarTabla(); // Llena la tabla con los datos actuales de medicamentos.
}

// Método para llenar la tabla con todos los medicamentos registrados.
public void llenarTabla() {
    // Obtiene el modelo de datos de la tabla gráfica.
    DefaultTableModel _modelo = (DefaultTableModel) this.tblTablaMedicamento.getModel();
    
    _modelo.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos.
    
    // Itera sobre todos los medicamentos obtenidos del controlador.
    for (Medicamentos _m : Principal._Controlador.consultarMedicamentosTodos()) {
        // Agrega una nueva fila a la tabla con los atributos del medicamento.
        _modelo.addRow(new Object[]{
            _m.getId(), // ID del medicamento.
            _m.getNombre(), // Nombre del medicamento.
            _m.getDescripcion(), // Descripción del medicamento.
            _m.getCantidad(), // Cantidad disponible.
            _m.getGravedad(), // Nivel de gravedad.
            _m.getPrecio() // Precio del medicamento.
        });
    }
    // Actualiza el modelo de la tabla con los datos llenados.
    this.tblTablaMedicamento.setModel(_modelo);
}

// Método para llenar la tabla con una lista específica de medicamentos.
public void llenarTablaBuscar(List<Medicamentos> medicamentos) {
    // Obtiene el modelo de datos de la tabla gráfica.
    DefaultTableModel _modelo = (DefaultTableModel) tblTablaMedicamento.getModel();
    _modelo.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos.

    // Itera sobre los medicamentos proporcionados en la lista.
    for (Medicamentos _med : medicamentos) {
        // Agrega una nueva fila a la tabla con los atributos del medicamento.
        _modelo.addRow(new Object[]{
            _med.getId(), // ID del medicamento.
            _med.getNombre(), // Nombre del medicamento.
            _med.getDescripcion(), // Descripción del medicamento.
            _med.getCantidad(), // Cantidad disponible.
            _med.getGravedad(), // Nivel de gravedad.
            _med.getPrecio() // Precio del medicamento.
        });
    }
    // Actualiza el modelo de la tabla con los datos llenados.
    tblTablaMedicamento.setModel(_modelo);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaMedicamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        btnAgregar.setBackground(new java.awt.Color(255, 204, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(51, 255, 51));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(204, 204, 255));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tblTablaMedicamento.setBackground(new java.awt.Color(0, 153, 204));
        tblTablaMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "cantidad", "Gravedad", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaMedicamento.getTableHeader().setResizingAllowed(false);
        tblTablaMedicamento.getTableHeader().setReorderingAllowed(false);
        tblTablaMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMedicamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTablaMedicamento);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de medicamentos");

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      
        // Crea una instancia de la clase AltaCatalogoMedicamentos.
// Parámetros:
// - `this`: Hace referencia a la instancia actual de la clase que llama al constructor. Esto permite que la nueva ventana (AltaCatalogoMedicamentos) pueda interactuar con esta.
// - `-1`: Generalmente se utiliza como un indicador especial (por ejemplo, para crear un nuevo medicamento en lugar de editar uno existente).
AltaCatalogoMedicamentos Catalogo = new AltaCatalogoMedicamentos(this, -1);

// Muestra la ventana AltaCatalogoMedicamentos en la interfaz gráfica.
// Al establecer `setVisible(true)`, la ventana se hace visible para el usuario.
Catalogo.setVisible(true);
   
      
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal newframe = new Principal();
        
        newframe.setVisible(true);
        
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tblTablaMedicamento.getSelectedRow() > -1){
         Principal._Controlador.eliminarMedicamento(tblTablaMedicamento.getSelectedRow());
            this.llenarTabla();
            JOptionPane.showMessageDialog(null, "El registro fue eliminado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            JOptionPane.showMessageDialog(null, "por favor seleccion un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    //tabla
    private void tblTablaMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMedicamentoMouseClicked
        if(evt.getClickCount() == 2){
            AltaCatalogoMedicamentos _frmMed = new AltaCatalogoMedicamentos(this,tblTablaMedicamento.getSelectedRow()); //al momento de picarle, darle doble click, no guiara al formulario termporada, 
            _frmMed.setVisible(true);
        }
    }//GEN-LAST:event_tblTablaMedicamentoMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
            AltaCatalogoMedicamentos _frmMed = new AltaCatalogoMedicamentos(this,tblTablaMedicamento.getSelectedRow()); //al momento de picarle, darle doble click, no guiara al formulario termporada, 
            _frmMed.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtBuscar.getText().isEmpty()){
            this.llenarTabla();
        } else {
            List<Medicamentos> resultadosBusqueda = new ArrayList<>();

            for(Medicamentos medicamento : Principal._Controlador.consultarMedicamentosTodos()){
                if(medicamento.getNombre().toLowerCase().contains(txtBuscar.getText().toLowerCase())){
                    resultadosBusqueda.add(medicamento);
                }
            }

            this.llenarTablaBuscar(resultadosBusqueda);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionDeMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaMedicamento;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
