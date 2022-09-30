/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda1;

import entidades.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import mx.Admin;
import mx.Disenador;
import mysql.Conexion;

/**
 *
 * @author felix
 */
public class Tienda1 extends javax.swing.JFrame {

    /**
     * Creates new form Tienda1
     */
    public Tienda1() {
        initComponents();
        String pedido = "Nuevo pedido realizado";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        diseJuan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        maria = new javax.swing.JButton();
        angel = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        oscar = new javax.swing.JButton();
        jose = new javax.swing.JButton();
        juan = new javax.swing.JButton();
        juana = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jButton2.setText("Asignar");

        jButton8.setText("Asignar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Asigne trabajo");

        jLabel9.setText("STATUS");

        diseJuan.setText("Diseñador juan:");

        jLabel8.setText("Diseñador jose:");

        jLabel3.setText("Diseñador moises:");

        jLabel4.setText("Diseñador angel:");

        jLabel5.setText("Diseñador marìa:");

        jLabel6.setText("Diseñador juana:");

        jLabel7.setText("Diseñador oscar:");

        maria.setText("Asignar");
        maria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mariaActionPerformed(evt);
            }
        });

        angel.setText("Asignar");
        angel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angelActionPerformed(evt);
            }
        });

        jButton5.setText("Asignar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        oscar.setText("Asignar");
        oscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oscarActionPerformed(evt);
            }
        });

        jose.setText("Asignar");
        jose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joseActionPerformed(evt);
            }
        });

        juan.setText("Asignar");
        juan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juanActionPerformed(evt);
            }
        });

        juana.setText("Asignar");
        juana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juanaActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(diseJuan))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(11, 11, 11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oscar)
                                    .addComponent(maria)
                                    .addComponent(angel)
                                    .addComponent(juana))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(juan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diseJuan)
                    .addComponent(juan)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jose))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jButton5))
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(angel)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maria)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(juana)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(oscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void juanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juanActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.conexion();

        try {

            PreparedStatement psd = cn.prepareStatement("UPDATE PedidosEmpleado SET estatus='Asignado' WHERE numeroEmpleado= 2");

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        jTextField2.setText("Asignado");


    }//GEN-LAST:event_juanActionPerformed

    private void joseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joseActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.conexion();

        try {

            PreparedStatement psd = cn.prepareStatement("UPDATE PedidosEmpleado SET estatus='Asignado' WHERE numeroEmpleado= 3");

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }     
         jTextField3.setText("Asignado");// TODO add your handling code here:
    }//GEN-LAST:event_joseActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.conexion();

        try {

            PreparedStatement psd = cn.prepareStatement("UPDATE PedidosEmpleado SET estatus='Asignado' WHERE numeroEmpleado= 4");

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }       
         jTextField4.setText("Asignado");// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void angelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angelActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.conexion();

        try {

            PreparedStatement psd = cn.prepareStatement("UPDATE PedidosEmpleado SET estatus='Asignado' WHERE numeroEmpleado= 5");

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }       jTextField5.setText("Asignado");  // TODO add your handling code here:
    }//GEN-LAST:event_angelActionPerformed

    private void mariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mariaActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.conexion();

        try {

            PreparedStatement psd = cn.prepareStatement("UPDATE PedidosEmpleado SET estatus='Asignado' WHERE numeroEmpleado= 6");

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }  jTextField6.setText("Asignado");       // TODO add your handling code here:
    }//GEN-LAST:event_mariaActionPerformed

    private void juanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juanaActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.conexion();

        try {

            PreparedStatement psd = cn.prepareStatement("UPDATE PedidosEmpleado SET estatus='Asignado' WHERE numeroEmpleado= 7");

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }      jTextField7.setText("Asignado");   // TODO add your handling code here:
    }//GEN-LAST:event_juanaActionPerformed

    private void oscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oscarActionPerformed
        Conexion con = new Conexion();
        Connection cn = con.conexion();

        try {

            PreparedStatement psd = cn.prepareStatement("UPDATE PedidosEmpleado SET estatus='Asignado' WHERE numeroEmpleado= 8");

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }     jTextField8.setText("Asignado");    // TODO add your handling code here:
    }//GEN-LAST:event_oscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angel;
    private javax.swing.JLabel diseJuan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton jose;
    private javax.swing.JButton juan;
    private javax.swing.JButton juana;
    private javax.swing.JButton maria;
    private javax.swing.JButton oscar;
    // End of variables declaration//GEN-END:variables
}
