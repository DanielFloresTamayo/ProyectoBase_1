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
public class FrmConsultaClientes extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsultaClientes
     */
    public FrmConsultaClientes() {
        initComponents();
        txtid.setEnabled(false);
        Cargarlistaclientes();
    }

    void Cargarlistaclientes()          
    {
        DefaultTableModel modelo= new DefaultTableModel();
        String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","TELEFONO","RUC","EMAIL","DIRECCION"};
        modelo.setColumnIdentifiers(Titulos);
         this.jtbclientes.setModel(modelo);
        try {
            
            String ConsultaSQL="SELECT * FROM clientes1";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("apel_cli");  
                registros[3]=rs.getString("sexo_cli");
                //registros[4]=rs.getString("id_cli");
                registros[4]=rs.getString("tel_cli");
                registros[5]=rs.getString("ruc_cli");
                registros[6]=rs.getString("email_cli");
                registros[7]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            jtbclientes.setModel(modelo);
            txtregistroscli.setText(""+jtbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jrbmostrarclitod = new javax.swing.JRadioButton();
        jrbmostrarcli = new javax.swing.JRadioButton();
        jrbmostrarcliid = new javax.swing.JRadioButton();
        cmbseleccionar = new javax.swing.JComboBox<>();
        txtid = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbclientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtregistroscli = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Clientes"));

        jrbmostrarclitod.setText("Mostrar Todos los clientes");
        jrbmostrarclitod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbmostrarclitodActionPerformed(evt);
            }
        });

        jrbmostrarcli.setText("Mostrar Clientes por genero");
        jrbmostrarcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbmostrarcliActionPerformed(evt);
            }
        });

        jrbmostrarcliid.setText("Mostrar Clientes por Id");
        jrbmostrarcliid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbmostrarcliidActionPerformed(evt);
            }
        });

        cmbseleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Masculino", "Femenino" }));

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jtbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbclientes);

        jLabel1.setText("Cantidad de Registros");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbmostrarcliid)
                            .addComponent(jrbmostrarclitod))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtregistroscli, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnregresar)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jrbmostrarcli)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbmostrarcliid)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbmostrarclitod)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtregistroscli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jrbmostrarcli)
                    .addContainerGap(242, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbmostrarcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbmostrarcliActionPerformed
        // TODO add your handling code here:
        if(jrbmostrarcli.isSelected()==true)
    {
        
        cmbseleccionar.setSelectedItem(0);
        cmbseleccionar.setEnabled(true);
        txtid.setEnabled(false);
        txtid.setText("");
    }
    }//GEN-LAST:event_jrbmostrarcliActionPerformed

    private void jrbmostrarcliidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbmostrarcliidActionPerformed
        // TODO add your handling code here:
        if(jrbmostrarcliid.isSelected()==true)
    {
        cmbseleccionar.setSelectedIndex(0);
        cmbseleccionar.setEnabled(false);
        txtid.setEnabled(true);
        txtid.requestFocus();
    }
    }//GEN-LAST:event_jrbmostrarcliidActionPerformed

    private void jrbmostrarclitodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbmostrarclitodActionPerformed
        // TODO add your handling code here:
     Cargarlistaclientes();
    txtid.setText("");
    txtid.setEnabled(false);
    }//GEN-LAST:event_jrbmostrarclitodActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
   String sexo= cmbseleccionar.getSelectedItem().toString();
   String cod_cli=txtid.getText();
   
   if(jrbmostrarcli.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","TELEFONO","RUC","EMAIL","DIRECCION"};
       modelo.setColumnIdentifiers(Titulos);
       this.jtbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM clientes1 WHERE sexo_cli='"+sexo+"'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("apel_cli");  
                registros[3]=rs.getString("sexo_cli");
               // registros[4]=rs.getString("id_cli");
                registros[4]=rs.getString("tel_cli");
                registros[5]=rs.getString("ruc_cli");
                registros[6]=rs.getString("email_cli");
                registros[7]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            jtbclientes.setModel(modelo);
            txtregistroscli.setText(""+jtbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   if(jrbmostrarcliid.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","TELEFONO","RUC","EMAIL","DIRECCION"};
       modelo.setColumnIdentifiers(Titulos);
       this.jtbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM clientes1 WHERE cod_cli="+cod_cli+"";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("apel_cli");  
                registros[3]=rs.getString("sexo_cli");
                //registros[4]=rs.getString("id_cli");
                registros[4]=rs.getString("tel_cli");
                registros[5]=rs.getString("ruc_cli");
                registros[6]=rs.getString("email_cli");
                registros[7]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            jtbclientes.setModel(modelo);
            txtregistroscli.setText(""+jtbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
   if(jrbmostrarclitod.isSelected()==true)
   {
       Cargarlistaclientes();
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
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> cmbseleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbmostrarcli;
    private javax.swing.JRadioButton jrbmostrarcliid;
    private javax.swing.JRadioButton jrbmostrarclitod;
    private javax.swing.JTable jtbclientes;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtregistroscli;
    // End of variables declaration//GEN-END:variables
ClsConectar cc= new ClsConectar();
Connection cn = cc.conexion();
}
