
package Modelo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class VentanaClientes extends javax.swing.JFrame 
{

    private ParqueDiversiones parque;
    public VentanaClientes()
    {
        initComponents();
        parque = new ParqueDiversiones();
        
        chk_acompanante.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        GroupBTN = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        txt_saldo = new javax.swing.JTextField();
        rbt_socio = new javax.swing.JRadioButton();
        rbt_nuevo = new javax.swing.JRadioButton();
        chk_acompanante = new javax.swing.JCheckBox();
        btn_Cargar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lts_listadoClientes = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_cantClienteMayor = new javax.swing.JLabel();
        lbl_recaudacionTotal = new javax.swing.JLabel();
        lbl_socioMasGasto = new javax.swing.JLabel();
        lbl_promedio = new javax.swing.JLabel();
        lbl_SocioMenosGasto = new javax.swing.JLabel();
        lbl_montoTotalClienteMayorEdad = new javax.swing.JLabel();
        btn_Reportes = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_EdadMayorEdad = new javax.swing.JTextField();
        btn_MontoTotalMayorEdad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Edad:");

        jLabel4.setText("Saldo:");

        GroupBTN.add(rbt_socio);
        rbt_socio.setText("Socio");
        rbt_socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_socioActionPerformed(evt);
            }
        });

        GroupBTN.add(rbt_nuevo);
        rbt_nuevo.setText("Nuevo");
        rbt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_nuevoActionPerformed(evt);
            }
        });

        chk_acompanante.setText("Acompañante");

        btn_Cargar.setText("Cargar");
        btn_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarActionPerformed(evt);
            }
        });

        jLabel5.setText("LISTADO CLIENTES:");

        jScrollPane1.setViewportView(lts_listadoClientes);

        jLabel6.setText("REPORTES");

        jLabel7.setText("Cantidad de Clientes mayor a 18 años: ");

        jLabel8.setText("Recaudacion Total del Parque:");

        jLabel9.setText("Socio que mas gasto en el parque:");

        jLabel10.setText("Saldo Promedio Clientes:");

        jLabel11.setText("Cliente que menos gasto con acompañante:");

        jLabel12.setText("Monto Total clientes mayores de edad:");

        lbl_cantClienteMayor.setText("-");

        lbl_recaudacionTotal.setText("-");

        lbl_socioMasGasto.setText("-");

        lbl_promedio.setText("-");

        lbl_SocioMenosGasto.setText("-");

        lbl_montoTotalClienteMayorEdad.setText("-");

        btn_Reportes.setText("Mostrar Reportes");
        btn_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportesActionPerformed(evt);
            }
        });

        jLabel13.setText("Ingresar Edad Mayor Edad: ");

        btn_MontoTotalMayorEdad.setText("Mostrar Monto Total Mayor Edad");
        btn_MontoTotalMayorEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MontoTotalMayorEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_saldo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbt_socio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(230, 230, 230))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(130, 130, 130)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbt_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk_acompanante))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_recaudacionTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(lbl_cantClienteMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_socioMasGasto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_promedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_SocioMenosGasto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(txt_EdadMayorEdad))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_MontoTotalMayorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_montoTotalClienteMayorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbt_socio)
                    .addComponent(rbt_nuevo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_acompanante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_Cargar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(lbl_cantClienteMayor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_recaudacionTotal)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_socioMasGasto)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_promedio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_SocioMenosGasto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Reportes)))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_EdadMayorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_montoTotalClienteMayorEdad))
                .addGap(18, 18, 18)
                .addComponent(btn_MontoTotalMayorEdad)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarActionPerformed
       
        String nombre = txt_nombre.getText();
        String apellido = txt_Apellido.getText();
        int edad = Integer.parseInt(txt_Edad.getText());
        double saldo = Double.parseDouble(txt_saldo.getText());
        
        if(rbt_socio.isSelected())
        {
            if(!txt_nombre.getText().equals("") && !txt_Apellido.getText().equals("") && !txt_Edad.getText().equals("") && !txt_saldo.getText().equals(""))
            {
                Socio socio = new Socio(nombre, apellido, edad, saldo);
                
                parque.AgregarCliente(socio);
                
             
                JOptionPane.showMessageDialog(this, socio.toString());
                
                
                
                ArrayList<Cliente> lista = parque.listaCliente;
                DefaultListModel modelo = new DefaultListModel();
                for (Cliente c : lista) 
                {
                    modelo.addElement(c);
                }
                    lts_listadoClientes.setModel(modelo);
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Complete los campos");
            }
        }
        
        
        if(rbt_nuevo.isSelected())
        {
            boolean acompanante = chk_acompanante.isSelected();
            if(!txt_nombre.getText().equals("") && !txt_Apellido.getText().equals("") && !txt_Edad.getText().equals("") && !txt_saldo.getText().equals(""))
            {
                Nuevo nuevo = new Nuevo(acompanante, nombre, apellido, edad, saldo);
                
                parque.AgregarCliente(nuevo);
                
                JOptionPane.showMessageDialog(this, nuevo.toString());
                
                
                ArrayList<Cliente> lista = parque.listaCliente;
                DefaultListModel modelo = new DefaultListModel();
                for (Cliente c : lista) 
                {
                    modelo.addElement(c);
                }
                    lts_listadoClientes.setModel(modelo);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Complete los campos");
            }
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_CargarActionPerformed

    private void btn_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportesActionPerformed
        
        lbl_cantClienteMayor.setText(String.valueOf(parque.cantidadClientemayorEdad()));
        
        lbl_recaudacionTotal.setText(String.valueOf(parque.recaudacionTotal()));
        
        lbl_promedio.setText(String.valueOf(parque.SaldoPromedioClientes()));
        
        lbl_socioMasGasto.setText(String.valueOf(parque.socioQueMasGasto()));
        
        lbl_SocioMenosGasto.setText(String.valueOf(parque.socioQueMenosGasto()));
        
    }//GEN-LAST:event_btn_ReportesActionPerformed

    private void rbt_socioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_socioActionPerformed
        
       chk_acompanante.setEnabled(false);
    }//GEN-LAST:event_rbt_socioActionPerformed

    private void rbt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_nuevoActionPerformed
        
        chk_acompanante.setEnabled(true);
    }//GEN-LAST:event_rbt_nuevoActionPerformed

    private void btn_MontoTotalMayorEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MontoTotalMayorEdadActionPerformed
        
        int edadMayorEdad = Integer.parseInt(txt_EdadMayorEdad.getText());
        
        lbl_montoTotalClienteMayorEdad.setText(String.valueOf(parque.mostrarSaldoClientes(edadMayorEdad)));
        
        
        
        
    }//GEN-LAST:event_btn_MontoTotalMayorEdadActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupBTN;
    private javax.swing.JButton btn_Cargar;
    private javax.swing.JButton btn_MontoTotalMayorEdad;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JCheckBox chk_acompanante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_SocioMenosGasto;
    private javax.swing.JLabel lbl_cantClienteMayor;
    private javax.swing.JLabel lbl_montoTotalClienteMayorEdad;
    private javax.swing.JLabel lbl_promedio;
    private javax.swing.JLabel lbl_recaudacionTotal;
    private javax.swing.JLabel lbl_socioMasGasto;
    private javax.swing.JList lts_listadoClientes;
    private javax.swing.JRadioButton rbt_nuevo;
    private javax.swing.JRadioButton rbt_socio;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_EdadMayorEdad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_saldo;
    // End of variables declaration//GEN-END:variables
}
