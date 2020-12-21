
package VISTA;

import CONTROLADOR.Gestor;
import MODELO.Empleado;
import MODELO.Paciente;
import MODELO.Visita;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class frmALTA extends javax.swing.JFrame 
{

    Gestor gestor;
    public frmALTA() 
    {
        initComponents();
        gestor = new Gestor();
        CargarComboPaciente();
        CargarComboEmpleado();
    }

    public void CargarComboPaciente()
    {
        
        ArrayList<Paciente> lista = gestor.obtenerPaciente();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Paciente paciente : lista) 
        {
            modelo.addElement(paciente);
        }
        cmbPaciente.setModel(modelo);
    }
    
    
    public void CargarComboEmpleado()
    {
        
        ArrayList<Empleado> lista = gestor.obtenerEmpleado();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Empleado empleado : lista) 
        {
            modelo.addElement(empleado);
        }
        cmbLegajo.setModel(modelo);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbPaciente = new javax.swing.JComboBox();
        txtNombreVisita = new javax.swing.JTextField();
        cmbLegajo = new javax.swing.JComboBox();
        txtDuracion = new javax.swing.JTextField();
        btnALTA = new javax.swing.JButton();
        btnREPORTE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE DE PACIENTE");

        jLabel2.setText("LEGAJO RECEPCIONISTA");

        jLabel3.setText("NOMBRE VISITANTE");

        jLabel4.setText("DUARACION DE VISITA");

        btnALTA.setText("REGISTRAR");
        btnALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTAActionPerformed(evt);
            }
        });

        btnREPORTE.setText("REPORTES");
        btnREPORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPORTEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("ALTA DE VISITAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnALTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPaciente, 0, 265, Short.MAX_VALUE)
                                    .addComponent(cmbLegajo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreVisita)
                                    .addComponent(txtDuracion)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnREPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel5)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnALTA)
                    .addComponent(btnREPORTE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTAActionPerformed
        
        if(!txtDuracion.getText().equals("") && !txtDuracion.getText().equals(""))
        {
            Paciente paciente = (Paciente) cmbPaciente.getSelectedItem();
            Empleado empleado = (Empleado) cmbLegajo.getSelectedItem();
            String nombreVisita = txtNombreVisita.getText();
            int duracion = Integer.parseInt(txtDuracion.getText());
            
            int idPaciente = paciente.getIdPaciente();
            int idLegajo = empleado.getIdEmpleado();
            
            Visita visita = new Visita(0, idPaciente, idLegajo, duracion, nombreVisita);
            
            gestor.registrarVisita(visita);
            
            JOptionPane.showMessageDialog(this, "Se Registro la Visita!");

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Complete los Campos"); 
        }
        
        
        
        
    }//GEN-LAST:event_btnALTAActionPerformed

    private void btnREPORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPORTEActionPerformed
        
        frmREPORTE reporte = new frmREPORTE();
        reporte.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnREPORTEActionPerformed


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
            java.util.logging.Logger.getLogger(frmALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmALTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmALTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTA;
    private javax.swing.JButton btnREPORTE;
    private javax.swing.JComboBox cmbLegajo;
    private javax.swing.JComboBox cmbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombreVisita;
    // End of variables declaration//GEN-END:variables
}
