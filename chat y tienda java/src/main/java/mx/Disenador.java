package mx;

import Chat.ChatDisenador;
import chatpr.vent1;
import entidades.Empleado;
import entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.Tiempo;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mysql.Conexion;
import recursos.Herramientas;

public class Disenador extends javax.swing.JFrame {

    Tiempo t = new Tiempo();
    Thread hilo = new Thread(t);

    Herramientas h = new Herramientas();
    Conexion con = new Conexion();
    Empleado empleado = null;

    public Disenador(Empleado e) {
        initComponents();
        estado.setText(mensaje(e));
        this.empleado = e;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aceptar = new javax.swing.JButton();
        Finalizar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Finalizar.setText("Finalizar Pedido");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Pedido entrante:");

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jButton1.setText("CHAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Aceptar)
                                .addGap(70, 70, 70)
                                .addComponent(Finalizar)
                                .addGap(17, 17, 17))
                            .addComponent(jLabel1)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Finalizar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(Salir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        estado.setText("Elaboracion");

        List<Pedido> pedidos = con.obtenerPedido();

        for (Pedido p : pedidos) {
            if (p.getNumeroEmpleado() == empleado.getIdEmpleados()) {
                System.out.println("+++++++++");
                System.out.println(empleado.getIdEmpleados());
                System.out.println(p.getNumeroEmpleado());
                p.setEstatus("Elaboracion");
                p.setHoraInicio(h.fechaActualTexto());
                con.cambiar(p);
            }
        }

        hilo.start();


    }//GEN-LAST:event_AceptarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        new Principal().setVisible(true);
        dispose();

    }//GEN-LAST:event_SalirActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        estado.setText("Finalizado");

        List<Pedido> pedidos = con.obtenerPedido();

        for (Pedido p : pedidos) {
            if (p.getNumeroEmpleado() == empleado.getIdEmpleados()) {
                p.setEstatus("FiNaLiZado");
                p.setHoraFinal(h.fechaActualTexto());
                con.cambiar(p);
            }
        }

        hilo.stop();
        int segundos = t.parar();
        int tiempo = segundos - 10;
        JOptionPane.showMessageDialog(null, "el tiempo del pedido total que usted realizo fue de: " + segundos
                + "El tiempo estimado era de 10 segundos, la diferencia de tiempo fue de: " + tiempo);

    }//GEN-LAST:event_FinalizarActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed


    }//GEN-LAST:event_estadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        new vent1().setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

public String mensaje(Empleado e) {
        String mensaje = "Sin asignar";
        Conexion conn = new Conexion();
        List<Pedido> listaPedidos = conn.obtenerPedido();
        for (Pedido p : listaPedidos) {
            if (p.getNumeroEmpleado() == e.getIdEmpleados()) {
                mensaje = p.getEstatus();

            }
        }
        return mensaje;

    

}

    class Global {

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
