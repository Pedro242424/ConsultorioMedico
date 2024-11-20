/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author kiwic
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaCatalogo = new javax.swing.JButton();
        btnAltaExistenciaYprecioGravedad = new javax.swing.JButton();
        btnAcualizacionExitenciaYprecio = new javax.swing.JButton();
        btnBajaMedicamento = new javax.swing.JButton();
        btnConsultaGravedad = new javax.swing.JButton();
        btnConsultaCostoTotal = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("--------MENU PRINCIPAL--------");

        btnAltaCatalogo.setText("1. Alta en catalogo de medicamentos ");
        btnAltaCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaCatalogoActionPerformed(evt);
            }
        });

        btnAltaExistenciaYprecioGravedad.setText("2. Alta de existencia/ precio por gravedad");
        btnAltaExistenciaYprecioGravedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaExistenciaYprecioGravedadActionPerformed(evt);
            }
        });

        btnAcualizacionExitenciaYprecio.setText("3. Actualizacion de existencia/ precio");
        btnAcualizacionExitenciaYprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcualizacionExitenciaYprecioActionPerformed(evt);
            }
        });

        btnBajaMedicamento.setText("4. Baja a medicamento");
        btnBajaMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaMedicamentoActionPerformed(evt);
            }
        });

        btnConsultaGravedad.setText("5. Consulta total de medicamentos por gravedad");
        btnConsultaGravedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaGravedadActionPerformed(evt);
            }
        });

        btnConsultaCostoTotal.setText("6. Consulta total costos de inventario por medicamento");
        btnConsultaCostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCostoTotalActionPerformed(evt);
            }
        });

        btnTerminar.setText("7. Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAltaCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAltaExistenciaYprecioGravedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAcualizacionExitenciaYprecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBajaMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultaGravedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultaCostoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(116, 116, 116)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(btnAltaCatalogo)
                .addGap(29, 29, 29)
                .addComponent(btnAltaExistenciaYprecioGravedad)
                .addGap(24, 24, 24)
                .addComponent(btnAcualizacionExitenciaYprecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBajaMedicamento)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaGravedad)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaCostoTotal)
                .addGap(18, 18, 18)
                .addComponent(btnTerminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaCatalogoActionPerformed
        //en esta parte del codigo hacemos una conexion a los demas jFrame
        AltaCatalogoMedicamentos Catalogo = new AltaCatalogoMedicamentos();
        
        Catalogo.setVisible(true);
        
        this.dispose();
        //--------------------------------------------------------------------------
        
        
        
    }//GEN-LAST:event_btnAltaCatalogoActionPerformed

    private void btnAltaExistenciaYprecioGravedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaExistenciaYprecioGravedadActionPerformed
        //en esta parte del codigo hacemos una conexion a los demas jFrame 
        AltaExistenciaYprecioGravedad Existencia = new AltaExistenciaYprecioGravedad();
        
        Existencia.setVisible(true);
        
        this.dispose();
        //-----------------------------------------------------------------------------
        
        
        
        
    }//GEN-LAST:event_btnAltaExistenciaYprecioGravedadActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
       
        System.exit(0); 
        
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnAcualizacionExitenciaYprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcualizacionExitenciaYprecioActionPerformed
        //en esta parte del codigo hacemos una conexion a los demas jFrame         
        ActualizacionExistenciaYprecio ActualizacionExistencia = new ActualizacionExistenciaYprecio();
        
        ActualizacionExistencia.setVisible(true);
        
        this.dispose();
        //--------------------------------------------------------------------------------
        
        
    }//GEN-LAST:event_btnAcualizacionExitenciaYprecioActionPerformed

    private void btnBajaMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaMedicamentoActionPerformed
        //en esta parte del codigo hacemos una conexion a los demas jFrame         
        BajaMedicamento Baja = new BajaMedicamento();
        
        Baja.setVisible(true);
        
        this.dispose();
        //--------------------------------------------------------------------------------
        
    }//GEN-LAST:event_btnBajaMedicamentoActionPerformed

    private void btnConsultaGravedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaGravedadActionPerformed
        //en esta parte del codigo hacemos una conexion a los demas jFrame        
        ConsultaTotalGravedad Gravedad = new ConsultaTotalGravedad();
        
        Gravedad.setVisible(true);
        
        this.dispose();
        //---------------------------------------------------------------------------------
    }//GEN-LAST:event_btnConsultaGravedadActionPerformed

    private void btnConsultaCostoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCostoTotalActionPerformed
        //en esta parte del codigo hacemos una conexion a los demas jFrame      
         ConsultaTotalDeInventario Inventario = new ConsultaTotalDeInventario();
        
        Inventario.setVisible(true);
        
        this.dispose();
        //----------------------------------------------------------------------------------
        
    }//GEN-LAST:event_btnConsultaCostoTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcualizacionExitenciaYprecio;
    private javax.swing.JButton btnAltaCatalogo;
    private javax.swing.JButton btnAltaExistenciaYprecioGravedad;
    private javax.swing.JButton btnBajaMedicamento;
    private javax.swing.JButton btnConsultaCostoTotal;
    private javax.swing.JButton btnConsultaGravedad;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
