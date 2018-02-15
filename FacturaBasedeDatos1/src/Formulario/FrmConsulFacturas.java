/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Conexion.ClsConectar;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class FrmConsulFacturas extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsulFacturas
     */
    public FrmConsulFacturas() {
        initComponents();
        cargartodasfacturas();
        this.setLocation(25,15 );
        jdmostrarFe.setEnabled(false);
    }

    void cargartodasfacturas()
    {
        DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"NUMERO","COD. CLIENTE","RUC CLIENTE","SUBTOTAL","IGV","TOTAL","FECHA"};
        tabla.setColumnIdentifiers(titulos);
        this.jtbfacturas.setModel(tabla);
        String consulta= "SELECT * FROM factura1";
        String []Datos= new String [7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("num_fac");
                Datos[1]=rs.getString("cod_cli");
                Datos[2]=rs.getString("ruc_cli");
                Datos[3]=rs.getString("subtotal");
                Datos[4]=rs.getString("igv");
                Datos[5]=rs.getString("total");
                Datos[6]=rs.getString("fec_fac");
                
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsulProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnver = new javax.swing.JMenuItem();
        mneliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        radiobuttonnumero = new javax.swing.JRadioButton();
        radiobuttonfecha = new javax.swing.JRadioButton();
        radiobuttontodos = new javax.swing.JRadioButton();
        jdmostrarFe = new com.toedter.calendar.JDateChooser();
        txtmostrarN = new javax.swing.JTextField();
        btnbuscarfac = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbfacturas = new javax.swing.JTable();
        btnregresar = new javax.swing.JButton();

        mnver.setText("jMenuItem1");
        mnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnverActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnver);

        mneliminar.setText("jMenuItem2");
        mneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Facturas"));

        buttonGroup1.add(radiobuttonnumero);
        radiobuttonnumero.setText("Mostrar por Nº");
        radiobuttonnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobuttonnumeroActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobuttonfecha);
        radiobuttonfecha.setText("Mostrar por Fecha");
        radiobuttonfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobuttonfechaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobuttontodos);
        radiobuttontodos.setText("Mostrar Todos");
        radiobuttontodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobuttontodosActionPerformed(evt);
            }
        });

        btnbuscarfac.setText("Buscar");

        jtbfacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbfacturas);

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiobuttonfecha)
                    .addComponent(radiobuttonnumero)
                    .addComponent(radiobuttontodos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmostrarN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdmostrarFe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnbuscarfac, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radiobuttonfecha)
                            .addComponent(jdmostrarFe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiobuttonnumero)
                            .addComponent(txtmostrarN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnbuscarfac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(radiobuttontodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiobuttontodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobuttontodosActionPerformed
        // TODO add your handling code here:
        if(radiobuttontodos.isSelected()==true)
    {
        jdmostrarFe.setEnabled(false);
        jdmostrarFe.setDate(null);
        txtmostrarN.setText("");
        txtmostrarN.setEnabled(false);
        cargartodasfacturas();
    }
    }//GEN-LAST:event_radiobuttontodosActionPerformed

    private void radiobuttonfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobuttonfechaActionPerformed
        // TODO add your handling code here:
        if(radiobuttonfecha.isSelected()==true)
    {
        jdmostrarFe.setEnabled(true);
        txtmostrarN.setEnabled(false);
        txtmostrarN.setText("");
        
    }
    }//GEN-LAST:event_radiobuttonfechaActionPerformed

    private void radiobuttonnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobuttonnumeroActionPerformed
        // TODO add your handling code here:
        if(radiobuttonnumero.isSelected()==true)
    {
        txtmostrarN.setEnabled(true);
        txtmostrarN.requestFocus();
        jdmostrarFe.setDate(null);
        jdmostrarFe.setEnabled(false);
        
        
    }
    }//GEN-LAST:event_radiobuttonnumeroActionPerformed

    private void mnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnverActionPerformed
        // TODO add your handling code here:
        int filasele= jtbfacturas.getSelectedRow();
    if(filasele==-1)
    {
        JOptionPane.showMessageDialog(null, "No Seleciono ninguna fila");
    }
    else
    {
           FrmDetalleFactura detalle = new FrmDetalleFactura();
    FrmPrincipal.jpescritorio.add(detalle);
    detalle.toFront();
    detalle.setVisible(true);
        String numfac=jtbfacturas.getValueAt(filasele, 0).toString();
        String cod=jtbfacturas.getValueAt(filasele, 1).toString();
        String ruc=jtbfacturas.getValueAt(filasele, 2).toString();
        String subtotal=jtbfacturas.getValueAt(filasele, 3).toString();
        String igv=jtbfacturas.getValueAt(filasele, 4).toString();
        String total=jtbfacturas.getValueAt(filasele, 5).toString();
        String fecha=jtbfacturas.getValueAt(filasele, 6).toString();
        FrmDetalleFactura.txtfactura.setText(numfac);
        FrmDetalleFactura.txtcodcli.setText(cod);
        FrmDetalleFactura.txtruc.setText(ruc);
        FrmDetalleFactura.txtsubtotal.setText(subtotal);
        FrmDetalleFactura.txtigv.setText(igv);
        FrmDetalleFactura.txttotal.setText(total);
        FrmDetalleFactura.txtfecha.setText(fecha);
        DefaultTableModel model = (DefaultTableModel) FrmDetalleFactura.jtbdetfact.getModel();
        String ver="SELECT * FROM detallefactura1 WHERE num_fac='"+numfac+"'";
        String []datos= new String[5]   ;
        try {
                Statement st = cn.createStatement();
                ResultSet rs= st.executeQuery(ver);
                while(rs.next())
                {
                    datos[0]=rs.getString("cod_pro");
                    datos[1]=rs.getString("des_pro");
                    datos[2]=rs.getString("cant_pro");
                    datos[3]=rs.getString("pre_unit");
                    datos[4]=rs.getString("pre_tot");
                    model.addRow(datos);
                    
                }
                FrmDetalleFactura.jtbdetfact.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(FrmConsulFacturas.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
  
    }
    }//GEN-LAST:event_mnverActionPerformed

    private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
        // TODO add your handling code here:
        int fila=jtbfacturas.getSelectedRow();
    if(fila>=0)
    {
        String cod=jtbfacturas.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM factura1 WHERE num_fac='"+cod+"'");
                pst.executeUpdate();
            } catch (SQLException ex) {
                
            }
            cargartodasfacturas();
        
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
    }
    }//GEN-LAST:event_mneliminarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        FrmPrincipal principal = new FrmPrincipal();
        principal.setVisible(true);
        principal.pack();
        this.setVisible(false);
                
    }//GEN-LAST:event_btnregresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConsulFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsulFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsulFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsulFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsulFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarfac;
    private javax.swing.JButton btnregresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdmostrarFe;
    private javax.swing.JTable jtbfacturas;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnver;
    private javax.swing.JRadioButton radiobuttonfecha;
    private javax.swing.JRadioButton radiobuttonnumero;
    private javax.swing.JRadioButton radiobuttontodos;
    private javax.swing.JTextField txtmostrarN;
    // End of variables declaration//GEN-END:variables
ClsConectar cc= new ClsConectar();
Connection cn= cc.conexion();
}
