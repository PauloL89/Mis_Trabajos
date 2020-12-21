
package Comercio_Ventana;

import Comercio.Operacion;
import Comercio.Presentacion;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ComercioVentana extends javax.swing.JFrame 
{

    DefaultListModel listaPresentacion;
    int cantConsultaSugerencia, cantSucursal0;
    int contadorLlamadosTel, contadorPresentaciones;
    double promedio;
    
    
    public ComercioVentana() 
    {
        initComponents();
        listaPresentacion = new DefaultListModel();
        lts_datosCargados.setModel(listaPresentacion);
        cantConsultaSugerencia = 0;
        cantSucursal0 = 0;
        contadorLlamadosTel = 0;
        contadorPresentaciones = 0;
        promedio = 0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_NumClie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_presentacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lts_datosCargados = new javax.swing.JList<>();
        cmb_presentacion = new javax.swing.JComboBox<>();
        cmb_sucursalAfectada = new javax.swing.JComboBox<>();
        lbl_CantSugerenciasConsultas = new javax.swing.JLabel();
        lbl_CantReclamosSuc_0 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_cargar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        chk_SolicTel = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        lbl_porcTel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de Cliente:");

        jLabel2.setText("Cantidad de Reclamos a sucursal 0:");

        jLabel3.setText("Tipo de Presentacion:");

        jLabel4.setText("Sucursal Afectada:");

        jLabel5.setText("Texto de la Presentacion:");

        jLabel6.setText("Lista de Datos Cargados");

        jLabel7.setText("Cantidad de Consultas o Sugerencias:");

        txt_presentacion.setColumns(20);
        txt_presentacion.setRows(5);
        jScrollPane1.setViewportView(txt_presentacion);

        jScrollPane2.setViewportView(lts_datosCargados);

        cmb_presentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reclamo", "Consulta", "Sugerencia" }));

        cmb_sucursalAfectada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lbl_CantSugerenciasConsultas.setText("-");

        lbl_CantReclamosSuc_0.setText("-");

        btn_salir.setBackground(new java.awt.Color(194, 13, 26));
        btn_salir.setForeground(new java.awt.Color(252, 252, 252));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_cargar.setBackground(new java.awt.Color(24, 85, 8));
        btn_cargar.setForeground(new java.awt.Color(246, 246, 246));
        btn_cargar.setText("Cargar Presentacion");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        jLabel8.setText("Solicita Llamado Telefonico: ");

        jLabel9.setText("Porcentaje de Presentaciones que requieren llamados telefonicos: ");

        lbl_porcTel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_NumClie, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_sucursalAfectada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_presentacion, 0, 193, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_CantSugerenciasConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_CantReclamosSuc_0, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_SolicTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(301, 301, 301))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_porcTel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(861, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(756, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NumClie, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cmb_sucursalAfectada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(chk_SolicTel))
                        .addGap(116, 116, 116)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_CantSugerenciasConsultas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_CantReclamosSuc_0))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_porcTel))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(538, Short.MAX_VALUE)
                    .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    
    
    
    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
       
        try 
        {
            int numCli = Integer.parseInt(txt_NumClie.getText());
        
                 String texto = txt_presentacion.getText();
                 
                  int tipoPresentacion;
                switch(cmb_presentacion.getSelectedIndex())
                {
                    case 0:
                    tipoPresentacion = 0;
                        break;
                    case 1:
                        tipoPresentacion = 1;
                        break;
                    case 2:
                        tipoPresentacion = 2;
                        break;
                    default:
                    tipoPresentacion = -1;
                }
                int sucursal;
                switch(cmb_sucursalAfectada.getSelectedIndex())
                {
                    case 0:
                        sucursal = 0;
                        break;
                    case 1:
                        sucursal = 1;
                        break;
                    case 2:
                        sucursal = 2;
                        break;
                    case 3:
                        sucursal = 3;
                        break;
                    case 4:
                        sucursal = 4;
                        break;
                    case 5:
                        sucursal = 5;
                        break;
                    case 6:
                        sucursal = 6;
                        break;
                    case 7:
                        sucursal = 7;
                        break;
                    case 8:
                        sucursal = 8;
                        break;
                    case 9:
                        sucursal = 9;
                        break;
                    case 10:
                        sucursal = 10;
                        break;        
                    default:
                        sucursal = -1;
                }
            
                boolean solicitaLlamado = chk_SolicTel.isSelected();
            
                if(txt_NumClie.equals("")&& txt_presentacion.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Se debe completar todos los campos");
            }
                else
            {
                
                
                Presentacion presentacion = new Presentacion(numCli, tipoPresentacion, sucursal, texto, solicitaLlamado);
        
                Operacion operacion = new Operacion();
        
                operacion.AgregarPresentacion(presentacion);
        
                listaPresentacion.addElement(operacion.listarPresentacion());
        
        
        
        
                //cantidad de consultas o sugerencias
        
                if(cmb_presentacion.getSelectedIndex() == 1 ||cmb_presentacion.getSelectedIndex() == 2)
                {
                    cantConsultaSugerencia++;
                }
        
                // mostrar en label
                lbl_CantSugerenciasConsultas.setText(String.valueOf(cantConsultaSugerencia));
        
        
                // cantidad de reclamos a sucursal 0
        
                if(cmb_sucursalAfectada.getSelectedIndex() == 0 && cmb_presentacion.getSelectedIndex() == 0)
                {
                    cantSucursal0++;
                }
        
                // Mostrar en label
        
                lbl_CantReclamosSuc_0.setText(String.valueOf(cantSucursal0));
            
                //Porcentaje de presentaciones que requieren llamada telefónica.
                contadorPresentaciones++;
        
                if(chk_SolicTel.isSelected())
                {
                    contadorLlamadosTel++;
                }
        
                promedio = (contadorLlamadosTel * 100) / contadorPresentaciones;
        
                lbl_porcTel.setText(String.valueOf(promedio + "%"));
            
            }
           
          
        } 
        catch (Exception e) 
        {

            
           JOptionPane.showMessageDialog(this, "Error catch");
            
        }
        
        
        
        
    }//GEN-LAST:event_btn_cargarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JCheckBox chk_SolicTel;
    private javax.swing.JComboBox<String> cmb_presentacion;
    private javax.swing.JComboBox<String> cmb_sucursalAfectada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_CantReclamosSuc_0;
    private javax.swing.JLabel lbl_CantSugerenciasConsultas;
    private javax.swing.JLabel lbl_porcTel;
    private javax.swing.JList<String> lts_datosCargados;
    private javax.swing.JTextField txt_NumClie;
    private javax.swing.JTextArea txt_presentacion;
    // End of variables declaration//GEN-END:variables
}
