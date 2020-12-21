
package Ventana;

import Modelo.AvionCarga;
import Modelo.AvionPasajero;
import Modelo.Contenedora;
import Modelo.OrdenPedido;
import javax.swing.JOptionPane;


public class VentanaFabricaAvion extends javax.swing.JFrame 
{

    Contenedora contenedora;
    OrdenPedido avionCarga, avionPasajero;
    
    public VentanaFabricaAvion()
    {
        initComponents();
        contenedora = new Contenedora();
        
        txt_cantTanquesCombustible.setEnabled(false);
        cmb_tipoAvionCarga.setEnabled(false);
        txt_pesoMaximo.setEnabled(false);
        
        cmb_cantTurbinasporAla.setEnabled(false);
        txt_cantButacaEconomica.setEnabled(false);
        txt_cantButacaPrimeraClase.setEnabled(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NumOrdenPedido = new javax.swing.JTextField();
        txt_FechaPedido = new javax.swing.JTextField();
        rbtn_avionCarga = new javax.swing.JRadioButton();
        rdbtn_avionPasajeros = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantTanquesCombustible = new javax.swing.JTextField();
        cmb_tipoAvionCarga = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_pesoMaximo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_cantTurbinasporAla = new javax.swing.JComboBox<>();
        txt_cantButacaEconomica = new javax.swing.JTextField();
        txt_cantButacaPrimeraClase = new javax.swing.JTextField();
        btn_CargarPedido = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_Reportes = new javax.swing.JButton();
        lbl_PromDiasAvionesPasajeros = new javax.swing.JLabel();
        lbl_TotalDiasProdAvionesCarga = new javax.swing.JLabel();
        lbl_NumOrdenMayor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de Orden de Pedido:");

        jLabel2.setText("Fecha de Alta del Pedido:");

        btnGroup.add(rbtn_avionCarga);
        rbtn_avionCarga.setText("Avion de Carga");
        rbtn_avionCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_avionCargaActionPerformed(evt);
            }
        });

        btnGroup.add(rdbtn_avionPasajeros);
        rdbtn_avionPasajeros.setText("Avion de Pasajeros");
        rdbtn_avionPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtn_avionPasajerosActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad de Tanques de Combustible: ");

        jLabel4.setText("Tipo Avion de Carga:");

        cmb_tipoAvionCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hidrante", "Fumigacion" }));

        jLabel5.setText("Peso Maximo de Carga: ");

        jLabel6.setText("Cantidad de Tubinas por Alas: ");

        jLabel7.setText("Cantidad de Butacas clase Economica:");

        jLabel8.setText("Cantidad de Butacas Primera Clase:");

        cmb_cantTurbinasporAla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Turbina por Ala", "2 Turbina por Ala" }));

        btn_CargarPedido.setText("Cargar Pedido");
        btn_CargarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarPedidoActionPerformed(evt);
            }
        });

        jLabel9.setText("REPORTES");

        jLabel10.setText("Numero de Orden de Mayor Tiempo Estimado: ");

        jLabel11.setText("Total de dias de Produccion para Aviones de Carga: ");

        jLabel12.setText("Promedio de Dias Estimados para Aviones de Pasajeros sin Contar el Tiempo de las Turbinas: ");

        btn_Reportes.setText("Mostrar Reportes");
        btn_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportesActionPerformed(evt);
            }
        });

        lbl_PromDiasAvionesPasajeros.setText("-");

        lbl_TotalDiasProdAvionesCarga.setText("-");

        lbl_NumOrdenMayor.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtn_avionCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbtn_avionPasajeros)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_cantTanquesCombustible)
                                    .addComponent(cmb_tipoAvionCarga, 0, 108, Short.MAX_VALUE)
                                    .addComponent(txt_pesoMaximo))
                                .addGap(210, 210, 210)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_cantTurbinasporAla, 0, 136, Short.MAX_VALUE)
                                    .addComponent(txt_cantButacaEconomica)
                                    .addComponent(txt_cantButacaPrimeraClase)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_FechaPedido)
                                    .addComponent(txt_NumOrdenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(94, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_CargarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(491, 491, 491))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_NumOrdenMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_TotalDiasProdAvionesCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_PromDiasAvionesPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                    .addComponent(btn_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_NumOrdenPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_FechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_avionCarga)
                    .addComponent(rdbtn_avionPasajeros))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_cantTanquesCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_cantTurbinasporAla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_tipoAvionCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_cantButacaEconomica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_pesoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_cantButacaPrimeraClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_CargarPedido)
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_NumOrdenMayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbl_TotalDiasProdAvionesCarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_PromDiasAvionesPasajeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_Reportes)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CargarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarPedidoActionPerformed

        int numeroOrden = Integer.parseInt(txt_NumOrdenPedido.getText());
        String fechaOrden = txt_FechaPedido.getText();
        
        if(rbtn_avionCarga.isSelected())
        {
            int cantTanquesCombistible = Integer.parseInt(txt_cantTanquesCombustible.getText());
            int tipoAvionCarga = cmb_tipoAvionCarga.getSelectedIndex() + 1;
            int pesoMaximo = Integer.parseInt(txt_pesoMaximo.getText());
            
            avionCarga = new AvionCarga(cantTanquesCombistible, tipoAvionCarga, pesoMaximo, numeroOrden, fechaOrden);
            
            contenedora.AgregarOrden(avionCarga);
            
            JOptionPane.showMessageDialog(this, avionCarga.toString());
            
            
        }
        
        if(rdbtn_avionPasajeros.isSelected())
        {
            int cantTurbinaPorAla = cmb_cantTurbinasporAla.getSelectedIndex() + 1;
            int cantButacaEconomica = Integer.parseInt(txt_cantButacaEconomica.getText());
            int cantButacaPrimeraClase = Integer.parseInt(txt_cantButacaPrimeraClase.getText());
            
            avionPasajero = new AvionPasajero(cantTurbinaPorAla, cantButacaEconomica, cantButacaPrimeraClase, numeroOrden, fechaOrden);
            
            contenedora.AgregarOrden(avionCarga);
            
            JOptionPane.showMessageDialog(this, avionPasajero.toString());
        }
        
        
       
        
        
    }//GEN-LAST:event_btn_CargarPedidoActionPerformed

    private void rbtn_avionCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_avionCargaActionPerformed
        
        txt_cantTanquesCombustible.setEnabled(true);
        cmb_tipoAvionCarga.setEnabled(true);
        txt_pesoMaximo.setEnabled(true);
        
        cmb_cantTurbinasporAla.setEnabled(false);
        txt_cantButacaEconomica.setEnabled(false);
        txt_cantButacaPrimeraClase.setEnabled(false);
        
    }//GEN-LAST:event_rbtn_avionCargaActionPerformed

    private void rdbtn_avionPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtn_avionPasajerosActionPerformed
        txt_cantTanquesCombustible.setEnabled(false);
        cmb_tipoAvionCarga.setEnabled(false);
        txt_pesoMaximo.setEnabled(false);
        
        cmb_cantTurbinasporAla.setEnabled(true);
        txt_cantButacaEconomica.setEnabled(true);
        txt_cantButacaPrimeraClase.setEnabled(true);
    }//GEN-LAST:event_rdbtn_avionPasajerosActionPerformed

    private void btn_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportesActionPerformed
        
                lbl_NumOrdenMayor.setText(String.valueOf(contenedora.NumeroOrdenMayorTiempoEstimado()));
                
                lbl_TotalDiasProdAvionesCarga.setText(String.valueOf(contenedora.totalDiasProduccionAvionCarga()));
                
                
    }//GEN-LAST:event_btn_ReportesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFabricaAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFabricaAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFabricaAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFabricaAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFabricaAvion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btn_CargarPedido;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JComboBox<String> cmb_cantTurbinasporAla;
    private javax.swing.JComboBox<String> cmb_tipoAvionCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_NumOrdenMayor;
    private javax.swing.JLabel lbl_PromDiasAvionesPasajeros;
    private javax.swing.JLabel lbl_TotalDiasProdAvionesCarga;
    private javax.swing.JRadioButton rbtn_avionCarga;
    private javax.swing.JRadioButton rdbtn_avionPasajeros;
    private javax.swing.JTextField txt_FechaPedido;
    private javax.swing.JTextField txt_NumOrdenPedido;
    private javax.swing.JTextField txt_cantButacaEconomica;
    private javax.swing.JTextField txt_cantButacaPrimeraClase;
    private javax.swing.JTextField txt_cantTanquesCombustible;
    private javax.swing.JTextField txt_pesoMaximo;
    // End of variables declaration//GEN-END:variables
}
