/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Hotel.Hotel;
import Hotel.Reserva;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo-PC
 */
public class Hotel_ventana extends javax.swing.JFrame 
{

    DefaultListModel listaReservas; // para agregar objeto a la lista
    double acumTarifaVaca, facturacionTotal, tarifaVaca,tarifaNeg,acumTarifaNeg;
    int cantChicos;
    boolean conferencia;
    
    int cantReservVaca, cantReservNeg;
    
    public Hotel_ventana() 
    {
        initComponents();
       listaReservas = new DefaultListModel(); // Incializacion
      lst_listaReserva.setModel(listaReservas); // set de la lista
        acumTarifaVaca = 0;
        cantChicos = 0;
        conferencia = false;
        facturacionTotal = 0;
        tarifaVaca = 0;
        tarifaNeg = 0;
        cantReservVaca = 0;
        cantReservNeg = 0;
        acumTarifaNeg = 0;
        
        // cuando inicia el programa se oculta el label y checkBox de conferencia
        if(cmb_TipoReserva.getSelectedIndex() == 0)
        {
            lbl_confe.setVisible(false);
            chk_conferencia.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmb_TipoReserva = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_numHabit = new javax.swing.JTextField();
        txt_cantDiasReserv = new javax.swing.JTextField();
        chk_vigente = new javax.swing.JCheckBox();
        lbl_cantChicos = new javax.swing.JLabel();
        lbl_confe = new javax.swing.JLabel();
        txt_cantChicos = new javax.swing.JTextField();
        chk_conferencia = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_listaReserva = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_facTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo de Reserva:");

        cmb_TipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacaciones", "Negocios" }));
        cmb_TipoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TipoReservaActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de Habitacion:");

        jLabel3.setText("Cantidad de dias reservados:");

        jLabel4.setText("Vigente");

        lbl_cantChicos.setText("Cantidad de chicos a alojar: ");

        lbl_confe.setText("Viaje de conferencia: ");

        jScrollPane1.setViewportView(lst_listaReserva);

        jLabel7.setText("Lista de Reservas");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel5.setText("Facturacion Total:");

        lbl_facTotal.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(174, 174, 174)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_cantChicos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_confe, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chk_conferencia)
                                                    .addComponent(txt_cantChicos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(cmb_TipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(chk_vigente)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_numHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_cantDiasReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lbl_facTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_TipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_numHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantChicos)
                    .addComponent(txt_cantChicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cantDiasReserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_confe)
                    .addComponent(chk_conferencia))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(chk_vigente))
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_facTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
        int num_hab = Integer.parseInt(txt_numHabit.getText());
        int dias_reser = Integer.parseInt(txt_cantDiasReserv.getText());
        int tipo_reser;
        if(cmb_TipoReserva.getSelectedIndex() == 0)
        {
            tipo_reser = 1; // vacaciones
        }else
        {
            tipo_reser = 2; // negocios
        }
        
        boolean vigente = chk_vigente.isSelected();
        
        Reserva reserva = new Reserva(num_hab, dias_reser, tipo_reser, vigente);
        
        Hotel h = new Hotel();
        
        h.agregarReserva(reserva);
        
        listaReservas.addElement(h.listarReservas()); // agregamos a al jList
       
       
        
        //cantidad de chicos
        if(cmb_TipoReserva.getSelectedIndex() == 0)
        {
            cantChicos = Integer.parseInt(txt_cantChicos.getText());
        }
        
        //calcular tarifas
        if(cmb_TipoReserva.getSelectedIndex() == 0)
        {
            tarifaVaca = 600 + (cantChicos * 100);
            acumTarifaVaca += tarifaVaca;
            cantReservVaca++;
        }
        else
        {
            tarifaNeg = 700 +(dias_reser * 500);
            acumTarifaNeg += tarifaNeg;
            cantReservNeg++;
        }
        

        // Facturacion Total prevista
        if(chk_vigente.isSelected())
        {
            facturacionTotal = acumTarifaVaca + acumTarifaNeg;
        }
        
        //Mostrar facturacion total en label
        lbl_facTotal.setText(String.valueOf("$"+facturacionTotal));
        
        // cantidad de reservas por tipo
        
        JOptionPane.showMessageDialog(this,"Cantidad de Reservas para Vacaciones: " + cantReservVaca);
        
        JOptionPane.showMessageDialog(this,"Cantidad de Reservas para Negocio: " + cantReservNeg);
        
        
        
        
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void cmb_TipoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TipoReservaActionPerformed
        if(cmb_TipoReserva.getSelectedIndex() == 0)
        {
            lbl_confe.setVisible(false);
            chk_conferencia.setVisible(false);
            lbl_cantChicos.setVisible(true);
            txt_cantChicos.setVisible(true);
        }else
        {
            lbl_cantChicos.setVisible(false);
            txt_cantChicos.setVisible(false);
            lbl_confe.setVisible(true);
            chk_conferencia.setVisible(true);
        }
    }//GEN-LAST:event_cmb_TipoReservaActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel_ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JCheckBox chk_conferencia;
    private javax.swing.JCheckBox chk_vigente;
    public javax.swing.JComboBox<String> cmb_TipoReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantChicos;
    private javax.swing.JLabel lbl_confe;
    private javax.swing.JLabel lbl_facTotal;
    private javax.swing.JList<String> lst_listaReserva;
    private javax.swing.JTextField txt_cantChicos;
    private javax.swing.JTextField txt_cantDiasReserv;
    private javax.swing.JTextField txt_numHabit;
    // End of variables declaration//GEN-END:variables
}
