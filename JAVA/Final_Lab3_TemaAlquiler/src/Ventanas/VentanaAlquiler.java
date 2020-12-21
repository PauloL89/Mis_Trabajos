
package Ventanas;

import Modelos.Alquiler;
import Modelos.Construccion;
import Modelos.Contenedora;
import Modelos.MaquinaElectrica;
import javax.swing.JOptionPane;


public class VentanaAlquiler extends javax.swing.JFrame 
{
    Alquiler contruccion, maquina;
    Contenedora contenedora;
    public VentanaAlquiler() 
    {
        initComponents();
        contenedora = new Contenedora();
        
        txt_cantDiasAlquiler.setVisible(false);
        cmb_Construccion.setVisible(false);
        
        txt_cantSemanasAlquiler.setVisible(false);
        cmb_MaquinaElectrica.setVisible(false);
        
        lbl_TextCantidadDias.setVisible(false);
        lbl_TextCantidadSemanas.setVisible(false);
        lbl_TextNombreHerramienta.setVisible(false);
        lbl_TextNombreHerramientaElect.setVisible(false);
        
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioBTN_grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        rdb_Contruccion = new javax.swing.JRadioButton();
        rdb_MaquinaElectrica = new javax.swing.JRadioButton();
        lbl_TextNombreHerramienta = new javax.swing.JLabel();
        lbl_TextNombreHerramientaElect = new javax.swing.JLabel();
        cmb_Construccion = new javax.swing.JComboBox<>();
        cmb_MaquinaElectrica = new javax.swing.JComboBox<>();
        lbl_TextCantidadSemanas = new javax.swing.JLabel();
        txt_cantSemanasAlquiler = new javax.swing.JTextField();
        lbl_TextCantidadDias = new javax.swing.JLabel();
        txt_cantDiasAlquiler = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_TotalSinGarantia = new javax.swing.JLabel();
        lbl_TotalMaquinaElectrica = new javax.swing.JLabel();
        lbl_NombreClienteMayor = new javax.swing.JLabel();
        btn_MostrarReportes = new javax.swing.JButton();
        btn_Cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del Cliente");

        RadioBTN_grupo.add(rdb_Contruccion);
        rdb_Contruccion.setText("Herramientas de Contruccion");
        rdb_Contruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_ContruccionActionPerformed(evt);
            }
        });

        RadioBTN_grupo.add(rdb_MaquinaElectrica);
        rdb_MaquinaElectrica.setText("Maquinas Electricas");
        rdb_MaquinaElectrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_MaquinaElectricaActionPerformed(evt);
            }
        });

        lbl_TextNombreHerramienta.setText("Nombre de la Herramienta:");

        lbl_TextNombreHerramientaElect.setText("Nombre de la Herramienta: ");

        cmb_Construccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andamio", "Escalera", "Balde", "Pala", "Maza", " " }));

        cmb_MaquinaElectrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amoladora", "Taladro", "Martillo Electrico", "Mescladora", "Sierra Electrica" }));

        lbl_TextCantidadSemanas.setText("Cantidad de Semanas de Alquiler: ");

        lbl_TextCantidadDias.setText("Cantidad de Dias de Alquiler:");

        jLabel7.setText("REPORTES");

        jLabel8.setText("Total Ganado en Alquiler Sin Garantias:");

        jLabel9.setText("Total Recaudacion de Alquiler de Maquinas Electricas: ");

        jLabel10.setText("Nombre del Cliente que contrato el alquiler de mayor duracion de elementos de contruccion:");

        lbl_TotalSinGarantia.setText("-");

        lbl_TotalMaquinaElectrica.setText("-");

        lbl_NombreClienteMayor.setText("-");

        btn_MostrarReportes.setText("Mostrar Reportes");
        btn_MostrarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarReportesActionPerformed(evt);
            }
        });

        btn_Cargar.setText("CARGAR");
        btn_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdb_Contruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbl_TextCantidadSemanas)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cantSemanasAlquiler))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_TextNombreHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(cmb_Construccion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(100, 100, 100)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rdb_MaquinaElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_TextCantidadDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_TextNombreHerramientaElect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_MaquinaElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cantDiasAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_MostrarReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_NombreClienteMayor, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(lbl_TotalMaquinaElectrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_TotalSinGarantia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btn_Cargar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_Contruccion)
                    .addComponent(rdb_MaquinaElectrica))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TextNombreHerramienta)
                    .addComponent(lbl_TextNombreHerramientaElect, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Construccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_MaquinaElectrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TextCantidadSemanas)
                    .addComponent(txt_cantSemanasAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TextCantidadDias)
                    .addComponent(txt_cantDiasAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Cargar)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalSinGarantia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_TotalMaquinaElectrica))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_NombreClienteMayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_MostrarReportes)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarActionPerformed
       
        String nombreCliente = txt_nombreCliente.getText();
        
        if(rdb_Contruccion.isSelected())
        {
            String nombreHerramienta = cmb_Construccion.getSelectedItem().toString();
            int cantidad = Integer.parseInt(txt_cantSemanasAlquiler.getText());
            

            contruccion = new Construccion(cantidad, nombreCliente, nombreHerramienta);
            
            contenedora.AgregarAlquiler(contruccion);
            

            
            JOptionPane.showMessageDialog(this, contruccion.toString());
        }
        
        
        if(rdb_MaquinaElectrica.isSelected())
        {
            String nombreHerramienta = cmb_MaquinaElectrica.getSelectedItem().toString();
            int cantidad = Integer.parseInt(txt_cantDiasAlquiler.getText());
            

          maquina = new MaquinaElectrica(cantidad, nombreCliente, nombreHerramienta);
            
            contenedora.AgregarAlquiler(maquina);
            
            
            
            
            JOptionPane.showMessageDialog(this, maquina.toString());
        }
        
        
        
        
    }//GEN-LAST:event_btn_CargarActionPerformed

    private void rdb_ContruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_ContruccionActionPerformed
        
        txt_cantSemanasAlquiler.setVisible(true);
        cmb_Construccion.setVisible(true);
        
        txt_cantDiasAlquiler.setVisible(false);
        cmb_MaquinaElectrica.setVisible(false);
        
        
        lbl_TextCantidadSemanas.setVisible(true);
        lbl_TextNombreHerramienta.setVisible(true);
        
        lbl_TextNombreHerramientaElect.setVisible(false);
        lbl_TextCantidadDias.setVisible(false);
        
        
    }//GEN-LAST:event_rdb_ContruccionActionPerformed

    private void rdb_MaquinaElectricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_MaquinaElectricaActionPerformed
        
        txt_cantDiasAlquiler.setVisible(true);
        cmb_MaquinaElectrica.setVisible(true);
        
        txt_cantSemanasAlquiler.setVisible(false);
        cmb_Construccion.setVisible(false);
        
        
         lbl_TextCantidadSemanas.setVisible(false);
        lbl_TextNombreHerramienta.setVisible(false);
        
        lbl_TextNombreHerramientaElect.setVisible(true);
        lbl_TextCantidadDias.setVisible(true);
        
    }//GEN-LAST:event_rdb_MaquinaElectricaActionPerformed

    private void btn_MostrarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarReportesActionPerformed
        
        lbl_TotalSinGarantia.setText(String.valueOf(contenedora.totalGanadoAlquiler()));
        
        lbl_TotalMaquinaElectrica.setText(String.valueOf(contenedora.totalAlquilerMaquinas()));
        
        lbl_NombreClienteMayor.setText(contenedora.NombreClienteAlquilerMayorDuracion());
        
        
        
    }//GEN-LAST:event_btn_MostrarReportesActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlquiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RadioBTN_grupo;
    private javax.swing.JButton btn_Cargar;
    private javax.swing.JButton btn_MostrarReportes;
    private javax.swing.JComboBox<String> cmb_Construccion;
    private javax.swing.JComboBox<String> cmb_MaquinaElectrica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_NombreClienteMayor;
    private javax.swing.JLabel lbl_TextCantidadDias;
    private javax.swing.JLabel lbl_TextCantidadSemanas;
    private javax.swing.JLabel lbl_TextNombreHerramienta;
    private javax.swing.JLabel lbl_TextNombreHerramientaElect;
    private javax.swing.JLabel lbl_TotalMaquinaElectrica;
    private javax.swing.JLabel lbl_TotalSinGarantia;
    private javax.swing.JRadioButton rdb_Contruccion;
    private javax.swing.JRadioButton rdb_MaquinaElectrica;
    private javax.swing.JTextField txt_cantDiasAlquiler;
    private javax.swing.JTextField txt_cantSemanasAlquiler;
    private javax.swing.JTextField txt_nombreCliente;
    // End of variables declaration//GEN-END:variables
}
