package javaapplication1;

import entidades.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mysql.Conexion;

public class Actualizar implements Runnable {

    javax.swing.JTable tabla;
    List<Pedido> pedidos = new ArrayList<>();
    Conexion con = new Conexion();
    int repeticion = 0;
    String estatus;

    public Actualizar(javax.swing.JTable jTable1, String e) {
        tabla = jTable1;
        estatus = e;
    }
    @Override
    public void run() {
        while (true) {
            pedidos = con.obtenerPedido();
            tiempo();
        }
    }
    public void tiempo() {

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            editar();
        }
    }

    public void editar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id Pedido");
        modelo.addColumn("id Usuario");
        modelo.addColumn("Estatus");

        for (Pedido p : pedidos) {
            if(estatus.isEmpty()){
                modelo.addRow(new Object[]{p.getIdPedidosEmpleado(), p.getNumeroEmpleado(), p.getEstatus()});
            }else if (p.getEstatus().toUpperCase().equals(estatus.toUpperCase())) {
                modelo.addRow(new Object[]{p.getIdPedidosEmpleado(), p.getNumeroEmpleado(), p.getEstatus()});
            }
        }
        if (tabla != null) {
            tabla.setModel(modelo);
        } else {
            System.out.println("jTable1: " + tabla);
        }
    }

}
