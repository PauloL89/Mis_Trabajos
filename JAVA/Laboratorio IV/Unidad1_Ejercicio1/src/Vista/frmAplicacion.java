
package Vista;

import Gestor.GestorProductos;
import Modelo.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class frmAplicacion extends javax.swing.JFrame 
{

   
    public frmAplicacion() 
    {
        initComponents();
        
        // Mostrar el contenido de la lista al iniciar la aplicacion
        GestorProductos gestor = new GestorProductos();
        ArrayList<Producto> lista = gestor.obtenerProductos();
        List_Producto.setListData(lista.toArray());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_Producto = new javax.swing.JList();
        btn_Borrar = new javax.swing.JButton();
        btn_Cargar = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Precio:");

        jScrollPane1.setViewportView(List_Producto);

        btn_Borrar.setText("Borrar");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        btn_Cargar.setText("Cargar");
        btn_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarActionPerformed(evt);
            }
        });

        btn_Consultar.setText("Consultar");

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btn_Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Borrar)
                    .addComponent(btn_Cargar)
                    .addComponent(btn_Consultar)
                    .addComponent(btn_Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarActionPerformed
        // Variables donde guarda los valores ingresado por el usuario
        String nombre = txt_nombre.getText();
        double precio = Double.parseDouble(txt_precio.getText());
        
        // Asignacion a los setter de la clase producto
        Producto p = new Producto();
        p.setNombre(nombre);
        p.setPrecio(precio);
        
        // Agregar producto
        GestorProductos gp = new GestorProductos();
        gp.agregarProducto(p);
        
        // Agregar producto al list y mostrar
        ArrayList<Producto> lista = gp.obtenerProductos();
        List_Producto.setListData(lista.toArray());
        
    }//GEN-LAST:event_btn_CargarActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        
        GestorProductos gestor = new GestorProductos();
        
        int sino = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este registro?","Eliminar", JOptionPane.YES_OPTION);
        
        if(sino == JOptionPane.YES_OPTION)
        {
            //borrar
            gestor.eliminarProducto((Producto) List_Producto.getSelectedValue());
             JOptionPane.showMessageDialog(null,"se elimino el registro seleccionado");
             ArrayList<Producto> lista = gestor.obtenerProductos();
             List_Producto.setListData(lista.toArray());
        }
        else
        {
            // no borrar
            JOptionPane.showMessageDialog(null,"No se elimino ningun registro");
        }
        

        
        
        
        
        
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        
        frm_Actulizar actualizar = new frm_Actulizar();
        actualizar.setVisible(true);
        
        Producto p = (Producto)List_Producto.getSelectedValue();
        
       actualizar.txtNombreUpdate.setText(p.getNombre());
       
       actualizar.txtPrecioUpdate.setText(String.valueOf(p.getPrecio()));
       
       actualizar.lbl_id.setText(String.valueOf(p.getCodigo()));
        
        
    }//GEN-LAST:event_btn_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList List_Producto;
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Cargar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
