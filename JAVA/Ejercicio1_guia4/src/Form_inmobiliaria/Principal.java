
package Form_inmobiliaria;

/**
 *
 * @author Paulo-PC
 */
public class Principal extends javax.swing.JFrame 
{
    double promedio;
    int acumulador, contador, cantCasas;
    
    public Principal()
    {
        initComponents();
        lbl_Garage.setVisible(true);
        chk_garage.setVisible(true);
        txt_precExepensa.setVisible(false);
        lbl_precExpensas.setVisible(false);
        
        promedio = 0;
        acumulador = 0;
        contador = 0;
        cantCasas = 0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Propiedades = new javax.swing.JLabel();
        cbo_tiposPropiedades = new javax.swing.JComboBox<>();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_cantHabit = new javax.swing.JLabel();
        txt_cantHab = new javax.swing.JTextField();
        lbl_precAlq = new javax.swing.JLabel();
        txt_precAlq = new javax.swing.JTextField();
        lbl_cantInquil = new javax.swing.JLabel();
        txt_cantInquil = new javax.swing.JTextField();
        chk_usoComercial = new javax.swing.JCheckBox();
        lbl_usoComercial = new javax.swing.JLabel();
        lbl_msjPromedio = new javax.swing.JLabel();
        lbl_promedio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_cantCasas = new javax.swing.JLabel();
        btn_cargar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_Garage = new javax.swing.JLabel();
        chk_garage = new javax.swing.JCheckBox();
        lbl_precExpensas = new javax.swing.JLabel();
        txt_precExepensa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Propiedades.setText("Tipos de Propiedades: ");

        cbo_tiposPropiedades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Departamento" }));
        cbo_tiposPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_tiposPropiedadesActionPerformed(evt);
            }
        });

        lbl_direccion.setText("Direccion:");

        lbl_cantHabit.setText("Cantidad de Habitaciones: ");

        lbl_precAlq.setText("Precio base del Alquiler: ");

        lbl_cantInquil.setText("Cantidad de Inquilinos: ");

        chk_usoComercial.setText("Uso Comercial");

        lbl_usoComercial.setText("Tipo de Uso: ");

        lbl_msjPromedio.setText("Monto promedio de propiedades en donde vivan  2 inqilinos: ");

        lbl_promedio.setText("-");

        jLabel1.setText("Casas con 3 o mas habitaciones con garage:");

        lbl_cantCasas.setText("-");

        btn_cargar.setText("Cargar");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lbl_Garage.setText("Tiene garage: ");

        chk_garage.setText("Garage");

        lbl_precExpensas.setText("Precio expensas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_cantHabit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_Propiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbo_tiposPropiedades, 0, 174, Short.MAX_VALUE)
                                            .addComponent(txt_direccion))
                                        .addComponent(txt_cantHab, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_msjPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(chk_garage)
                                    .addGap(126, 126, 126)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Garage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(252, 252, 252)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_cantCasas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_usoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_precAlq)
                                    .addComponent(lbl_cantInquil, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_precAlq, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                        .addComponent(txt_cantInquil))
                                    .addComponent(chk_usoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbl_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addComponent(lbl_precExpensas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_precExepensa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Propiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_tiposPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk_usoComercial)
                            .addComponent(lbl_usoComercial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_precAlq)
                            .addComponent(txt_precAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_cantHabit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantHab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cantInquil)
                            .addComponent(txt_cantInquil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbl_Garage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk_garage)
                            .addComponent(lbl_precExpensas)
                            .addComponent(txt_precExepensa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_msjPromedio)
                    .addComponent(lbl_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_cantCasas))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_tiposPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_tiposPropiedadesActionPerformed
        if(cbo_tiposPropiedades.getSelectedIndex() == 0)
        {
            lbl_Garage.setVisible(true);
            chk_garage.setVisible(true);
            txt_precExepensa.setVisible(false);
            lbl_precExpensas.setVisible(false);
        }else if(cbo_tiposPropiedades.getSelectedIndex() == 1)
        {
            txt_precExepensa.setVisible(true);
            lbl_precExpensas.setVisible(true);
            lbl_Garage.setVisible(false);
            chk_garage.setVisible(false);
        }
    }//GEN-LAST:event_cbo_tiposPropiedadesActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        
        Casa c = new Casa();
        Departamento d = new Departamento();
        
        c.direccion = txt_direccion.getText();
        c.cantHabit = Integer.parseInt(txt_cantHab.getText());
        c.cantInquillinos = Integer.parseInt(txt_cantInquil.getText());
        c.precioBaseAlq = Double.parseDouble(txt_precAlq.getText());
        c.tieneGarage = chk_garage.isSelected();
        c.usoComercial = chk_usoComercial.isSelected();
        
        d.direccion = txt_direccion.getText();
        d.cantHabit = Integer.parseInt(txt_cantHab.getText());     
        d.precioBaseAlq = Double.parseDouble(txt_precAlq.getText());
        d.usoComercial = chk_usoComercial.isSelected();
        
        
        
        if(cbo_tiposPropiedades.getSelectedIndex() == 0)
        {
            d.precioExpensas = 0;
        }else if(cbo_tiposPropiedades.getSelectedIndex() == 1)
        {
            d.precioExpensas = Double.parseDouble(txt_precExepensa.getText());
        }
        
        
        /*Calcular y mostrar el monto promedio de alquileres de las propiedades 
           en donde vivan 2 inquilinos.*/
        
        if(!chk_usoComercial.isSelected() && c.cantInquillinos == 2)
        {
            acumulador += c.precioAlquiler();
            contador++;
            
            promedio = acumulador / contador;
        }
        
        lbl_promedio.setText(promedio + " ");
        
        
        /*
            Calcular y mostrar la cantidad de casas de 3 habitaciones o más 
        que posean garaje
        */
        
        if(c.cantHabit >= 3 && chk_garage.isSelected())
        {
            cantCasas++;
        }
        
        lbl_cantCasas.setText(String.valueOf(cantCasas));
        
    }//GEN-LAST:event_btn_cargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<String> cbo_tiposPropiedades;
    private javax.swing.JCheckBox chk_garage;
    private javax.swing.JCheckBox chk_usoComercial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Garage;
    private javax.swing.JLabel lbl_Propiedades;
    private javax.swing.JLabel lbl_cantCasas;
    private javax.swing.JLabel lbl_cantHabit;
    private javax.swing.JLabel lbl_cantInquil;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_msjPromedio;
    private javax.swing.JLabel lbl_precAlq;
    private javax.swing.JLabel lbl_precExpensas;
    private javax.swing.JLabel lbl_promedio;
    private javax.swing.JLabel lbl_usoComercial;
    private javax.swing.JTextField txt_cantHab;
    private javax.swing.JTextField txt_cantInquil;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_precAlq;
    private javax.swing.JTextField txt_precExepensa;
    // End of variables declaration//GEN-END:variables
}
