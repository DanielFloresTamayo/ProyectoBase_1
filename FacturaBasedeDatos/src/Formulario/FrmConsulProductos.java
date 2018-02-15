/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Conexion.ClsConectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class FrmConsulProductos extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsulProductos
     */
    public FrmConsulProductos() {
        initComponents();
        mostrartodosproductos();
    }
    void mostrartodosproductos()
    {
        DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"CODIGO","DESCRIPCION","PRECIO"};
        tabla.setColumnIdentifiers(titulos);
        this.jtbproductos.setModel(tabla);
        String consulta= "SELECT * FROM productos";
        String []Datos= new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("cod_pro");
                Datos[1]=rs.getString("descripcion");
                Datos[2]=rs.getString("precio");
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
        jPanel1 = new javax.swing.JPanel();
        jrbtodosprod = new javax.swing.JRadioButton();
        jrbproddesc = new javax.swing.JRadioButton();
        txtbuscarpro = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbproductos = new javax.swing.JTable();
        btnregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Productos"));

        buttonGroup1.add(jrbtodosprod);
        jrbtodosprod.setText("Mostrar Todos los Productos");
        jrbtodosprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtodosprodActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbproddesc);
        jrbproddesc.setText("Mostrar Productos por Descripcion");
        jrbproddesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbproddescActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jtbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbproductos);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbtodosprod)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbproddesc)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscarpro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnbuscar))))
                    .addComponent(btnregresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(jrbproddesc))
                .addGap(7, 7, 7)
                .addComponent(jrbtodosprod)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbtodosprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtodosprodActionPerformed
        // TODO add your handling code here:
        if(jrbtodosprod.isSelected()==true)
    {
        txtbuscarpro.setText("");
        txtbuscarpro.setEnabled(false);
        mostrartodosproductos();
    }
    }//GEN-LAST:event_jrbtodosprodActionPerformed

    private void jrbproddescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbproddescActionPerformed
        // TODO add your handling code here:
         if(jrbproddesc.isSelected()==true)
    {
        txtbuscarpro.setEnabled(true);
        txtbuscarpro.requestFocus();
    }
    }//GEN-LAST:event_jrbproddescActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String buscar=txtbuscarpro.getText();
    if(jrbproddesc.isSelected()==true)
    {
         DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"CODIGO","DESCRIPCION","PRECIO"};
        tabla.setColumnIdentifiers(titulos);
        this.jtbproductos.setModel(tabla);
        String consulta= "SELECT * FROM productos WHERE descripcion  LIKE '%"+buscar+"%'";
        String []Datos= new String [3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("cod_pro");
                Datos[1]=rs.getString("descripcion");
                Datos[2]=rs.getString("precio");
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsulProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    else
    {
        mostrartodosproductos();
    }
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConsulProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsulProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsulProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsulProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsulProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnregresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbproddesc;
    private javax.swing.JRadioButton jrbtodosprod;
    private javax.swing.JTable jtbproductos;
    private javax.swing.JTextField txtbuscarpro;
    // End of variables declaration//GEN-END:variables
ClsConectar cc= new ClsConectar();
Connection cn = cc.conexion();
}
