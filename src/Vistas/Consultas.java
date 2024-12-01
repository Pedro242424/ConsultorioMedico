package Vistas;

import entities.Medicamentos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Consultas extends javax.swing.JFrame {
  
    public Consultas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaMedicamento = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegresarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTablaMedicamento.setBackground(new java.awt.Color(0, 153, 153));
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

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Phetsarath OT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultas");

        btnRegresar.setBackground(new java.awt.Color(0, 153, 153));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRegresarMenu.setBackground(new java.awt.Color(204, 204, 0));
        btnRegresarMenu.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegresarMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresarMenu.setText("Regresar al menu");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btnRegresarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void llenarTabla(){
        DefaultTableModel _modelo =(DefaultTableModel) this.tblTablaMedicamento.getModel();
        
        _modelo.setRowCount(0);
        
        for(Medicamentos _m : Principal._Controlador.consultarMedicamentosTodos()){
             _modelo.addRow(new Object[]{_m.getId(),_m.getNombre(), _m.getDescripcion()
                            ,_m.getCantidad(),_m.getGravedad(),_m.getPrecio()});
        }
        this.tblTablaMedicamento.setModel(_modelo);
        //olololo
    }
    
  
    public void llenarTablaBuscar(List<Medicamentos> medicamentos){

            
            DefaultTableModel _modelo = (DefaultTableModel)tblTablaMedicamento.getModel();
            _modelo.setRowCount(0);

            for(Medicamentos _med : medicamentos){
                
                _modelo.addRow (new Object []{_med.getId(),_med.getNombre(), _med.getDescripcion(),_med.getCantidad(),
                                _med.getGravedad(),_med.getPrecio()});
            }
            tblTablaMedicamento.setModel(_modelo);
            
    }
    
    private void tblTablaMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMedicamentoMouseClicked

    }//GEN-LAST:event_tblTablaMedicamentoMouseClicked

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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        GestionDeMedicamentos regresar = new GestionDeMedicamentos();
        
        regresar.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        
        Principal volver = new Principal();
        
        volver.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaMedicamento;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
