
package Ventanas_GananciaClases;

import GananciaClases.Contenedora;
import GananciaClases.ProfesorClase;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CargarClases extends javax.swing.JFrame 
{
    DefaultListModel listaModel;
    ListaClase Ventanalista;
    Reportes ventantaReportes;
    ArrayList<ProfesorClase> pfClase;
    Contenedora cont;
    int TotalGanancia, contadorClase;
    double precio;
    
    
    public CargarClases() 
    {
        initComponents();
        pfClase = new ArrayList<>();
        Ventanalista = new ListaClase();
        ventantaReportes = new Reportes();
        listaModel = new DefaultListModel();
        Ventanalista.lst_clase.setModel(listaModel);
        cont = new Contenedora();
        TotalGanancia = 0;
        contadorClase = 0;
        precio = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        txt_diaHora = new javax.swing.JTextField();
        txt_materia = new javax.swing.JTextField();
        cmb_tipoClase = new javax.swing.JComboBox<>();
        btn_cargarClase = new javax.swing.JButton();
        btn_Reportes = new javax.swing.JButton();
        btn_ListaClases = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dia y Hora de clases:");

        jLabel2.setText("Materia:");

        jLabel3.setText("Tipo de Clase");

        jLabel4.setText("Costo base:");

        txt_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costoActionPerformed(evt);
            }
        });
        txt_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costoKeyTyped(evt);
            }
        });

        cmb_tipoClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Grupo" }));

        btn_cargarClase.setText("Cargar Clase");
        btn_cargarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarClaseActionPerformed(evt);
            }
        });

        btn_Reportes.setText("Reportes");
        btn_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportesActionPerformed(evt);
            }
        });

        btn_ListaClases.setText("Lista de Clases");
        btn_ListaClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaClasesActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingresar un valor: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_materia)
                            .addComponent(txt_diaHora)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_costo)
                            .addComponent(cmb_tipoClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cargarClase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                .addComponent(btn_ListaClases, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(txt_valor)))
                        .addGap(95, 95, 95)
                        .addComponent(btn_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_tipoClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cargarClase)
                    .addComponent(btn_Reportes)
                    .addComponent(btn_ListaClases))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarClaseActionPerformed
        String diaHora = txt_diaHora.getText();
        String materia = txt_materia.getText();
        
        int tipoclase;
        if(cmb_tipoClase.getSelectedIndex() == 0)
        {
            tipoclase = 0;
        }else if(cmb_tipoClase.getSelectedIndex() == 1)
        { 
            tipoclase = 1;
        } else
        {
            tipoclase = -1;
        }
       
        try 
        {
            double precioBase = Double.parseDouble(txt_costo.getText());
            if(txt_diaHora.getText().isEmpty() || txt_materia.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            }
            else
            {
                ProfesorClase pc = new ProfesorClase(diaHora, materia, precioBase, tipoclase);
                JOptionPane.showMessageDialog(this, "Se cargo los datos");
           
                cont.AgregarClase(pc);
                
                TotalGanancia += precioBase;
                precio = precioBase;
            }
                
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
        }
        
        
        
    }//GEN-LAST:event_btn_cargarClaseActionPerformed

    private void btn_ListaClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaClasesActionPerformed
        
        Ventanalista.setVisible(true);
        
        listaModel.addElement(cont.listaClase());
        
    }//GEN-LAST:event_btn_ListaClasesActionPerformed

    private void btn_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportesActionPerformed
        
        try 
        {
             int valor = Integer.parseInt(txt_valor.getText());  
             
             if(valor > precio)
            {
                contadorClase++;
            }
        
            ventantaReportes.lbl_cantidadClase.setText(String.valueOf(contadorClase));
        
            ventantaReportes.lbl_valor.setText(String.valueOf(valor));
            
            ventantaReportes.lbl_totalGanancia.setText(String.valueOf(TotalGanancia));
            ventantaReportes.setVisible(true);
        } 
        catch (Exception e) 
        {
             JOptionPane.showMessageDialog(this, "Debes completar el campo valor");
        }
        
        
    }//GEN-LAST:event_btn_ReportesActionPerformed

    private void txt_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costoActionPerformed
        
    }//GEN-LAST:event_txt_costoActionPerformed

    private void txt_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costoKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "Debe completar el campo costo, solo admite numeros");
        }
    }//GEN-LAST:event_txt_costoKeyTyped

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
            java.util.logging.Logger.getLogger(CargarClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarClases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ListaClases;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JButton btn_cargarClase;
    private javax.swing.JComboBox<String> cmb_tipoClase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_diaHora;
    private javax.swing.JTextField txt_materia;
    public javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
