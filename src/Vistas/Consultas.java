/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import entities.*;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiwic
 */
public class Consultas extends javax.swing.JFrame {
    SimpleDateFormat _sdf = new SimpleDateFormat("d / MMMM / yyyy");
    DecimalFormat _df = new DecimalFormat("#,##0.00");
    /**
     * Creates new form Consultas2
     */
    public Consultas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarPacientes();
        this.mostrarMedico();
        this.txtConsultorio.setText("");
        this.txtFolio.setText(String.format("%06d", Principal._recetasMedicasImpl.consultarRecetaTodos().size() + 1));
        this.txtFecha.setText(String.valueOf(_sdf.format(new Date())));
    }
    //cmbMedico
     public void mostrarPacientes() {
        cmbPaciente.removeAllItems();
        for (Pacientes _pac : Principal._pacientesImpl.consultarPacienteTodos()) {
            this.cmbPaciente.addItem(_pac.getNombrepaciente());
        }
    }
    
     public void mostrarMedico() {

        cmbMedico.removeAllItems();
        for (Medicos _med : Principal._medicosImpl.consultarMedicosTodos()) {
            this.cmbMedico.addItem(_med.getNombreMedico());
        }
    } 
     

    public void agregarDatoMedicamento(Medicamentos _med) {
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        DefaultTableModel _modelo = (DefaultTableModel) tblConsulta.getModel();

        _modelo.addRow(new Object[]{1, _med.getId(), _med.getNombre(), _df.format(_med.getPrecio()), _df.format(1 * _med.getPrecio())});

        tblConsulta.setModel(_modelo);
        
        tblConsulta.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblConsulta.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

    }
    
    public void calcularTotales(){
        
        double totalImporte = 0;
        
        for(int i = 0; i < tblConsulta.getRowCount();i++){
            
            totalImporte += Double.parseDouble(tblConsulta.getValueAt(i, 4).toString().replace(",", ""));          
        }
        
        double subtotal = totalImporte;
        double total = totalImporte ;
        
        this.txtSubtotal.setText(_df.format(subtotal));
    
        this.txtTotal.setText(_df.format(total));
        
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
        btnRealizarConsulta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtFolio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        cmbPaciente = new javax.swing.JComboBox<>();
        txtDescripcionPaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtConsultorio = new javax.swing.JFormattedTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        cmbMedico = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnRealizarConsulta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRealizarConsulta.setText("Realizar consulta");
        btnRealizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarConsultaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Consulta Medica");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtFolio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFolio.setForeground(new java.awt.Color(255, 0, 0));
        txtFolio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFolio.setToolTipText("");
        txtFolio.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Folio");
        jLabel2.setToolTipText("");

        txtMedico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d / MMMM / yyyy"))));
        txtMedico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMedico.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha");
        jLabel4.setToolTipText("");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Medico:");
        jLabel5.setToolTipText("");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Consultorio:");
        jLabel8.setToolTipText("");

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 153, 0));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTotal.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("TOTAL:");

        txtSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(0, 153, 0));
        txtSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubtotal.setToolTipText("");
        txtSubtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSubtotal.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("SUBTOTAL:");

        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Medicamento", "Precio", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblConsulta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblConsultaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblConsulta);

        cmbPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPacienteItemStateChanged(evt);
            }
        });
        cmbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPacienteActionPerformed(evt);
            }
        });

        txtDescripcionPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Paciente:");
        jLabel1.setToolTipText("");

        txtConsultorio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d / MMMM / yyyy"))));
        txtConsultorio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtConsultorio.setEnabled(false);

        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d / MMMM / yyyy"))));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFecha.setEnabled(false);

        cmbMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMedicoItemStateChanged(evt);
            }
        });
        cmbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescripcionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnRealizarConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPacienteActionPerformed

    private void cmbPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPacienteItemStateChanged
//ESpera un poco
        try {
            if (cmbPaciente.getSelectedIndex() > -1) {
                Pacientes _pac = Principal._pacientesImpl.consultarPacienteId(cmbPaciente.getSelectedIndex());
                this.txtDescripcionPaciente.setText(_pac.getNombrepaciente());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cmbPacienteItemStateChanged

    private void tblConsultaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblConsultaPropertyChange

        if (tblConsulta.getSelectedRow() > -1) {

            int cantidad = Integer.parseInt(tblConsulta.getValueAt(tblConsulta.getSelectedRow(), 0).toString().replace(",", "")) ;
            double importe = Double.parseDouble(tblConsulta.getValueAt(tblConsulta.getSelectedRow(), 3).toString().replace(",", ""));

            tblConsulta.setValueAt(_df.format(cantidad*importe),tblConsulta.getSelectedRow(),4);

            this.calcularTotales();

        }
    }//GEN-LAST:event_tblConsultaPropertyChange

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal regresar = new Principal();

        regresar.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRealizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarConsultaActionPerformed

    private void cmbMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMedicoItemStateChanged
                try {
            if (cmbMedico.getSelectedIndex() > -1) {
                Medicos _med = Principal._medicosImpl.consultarMedicosId(cmbMedico.getSelectedIndex());
                this.txtMedico.setText(_med.getNombreMedico());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cmbMedicoItemStateChanged

    private void cmbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMedicoActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarConsulta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbMedico;
    private javax.swing.JComboBox<String> cmbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JFormattedTextField txtConsultorio;
    private javax.swing.JLabel txtDescripcionPaciente;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JFormattedTextField txtMedico;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
