package mysql;
import entidades.Empleado;
import entidades.Pedido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import recursos.Herramientas;

public class Conexion extends Herramientas {

    public Connection conexion() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/floreria?serverTimezone=UTC", "root", "polisemico");
            if (conn != null) {
                System.out.println("Conectado");
            } else {
                System.out.println("fallo conexion");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void error(Connection con) {
        if (con != null) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void cerrar(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public List<Empleado> obtenerEmpleados() {
        Connection con = conexion();
        List<Empleado> listaEmpleados = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("select * from Empleados");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                listaEmpleados.add(rellenarEmpleados(rs));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            error(con);
        } finally {
            cerrar(con);
        }
        return listaEmpleados;
    }

    public List<Pedido> obtenerPedido() {
        Connection con = conexion();
        List<Pedido> listaPedidos = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("select * from PedidosEmpleado");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                listaPedidos.add(rellenarPedidos(res));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            error(con);
        } finally {
            cerrar(con);
        }
        return listaPedidos;
    }

    public void cambiar(Pedido p) {
        Connection con = conexion();

        try {

            String consulta = "UPDATE PedidosEmpleado set  arreglo = ?, estatus = ?, tiempoEstimado = ?, horaInicio = ?, HoraFinal =? where numeroEmpleado = ?";

            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1, p.getArreglo().toUpperCase());
            stmt.setString(2, p.getEstatus().toUpperCase());
            stmt.setString(3, p.getTiempoEstimado().toUpperCase());
            stmt.setString(4, p.getHoraInicio());
            stmt.setString(5, p.getHoraFinal());
            stmt.setInt(6, p.getNumeroEmpleado());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos actualizados");
            System.out.println(p.getHoraInicio());

        } catch (SQLException ex) {
            error(con);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            cerrar(con);
        }
    }

    public void cambiarE(Empleado e) {
        Connection con = conexion();

        try {

            String consulta = "UPDATE Empleados set  nombre = ?, usuario = ?, numeroEmpleado = ?, contrasena = ?, punto_de_venta =? ,puesto=?, comision=?, tiempoTrabajo=? where idEmpleados = ?";
            PreparedStatement stmt = con.prepareStatement(consulta);
            stmt.setString(1, e.getNombre().toUpperCase());
            stmt.setString(2, e.getUsuario());
            stmt.setString(3, e.getNumeroEmpleado().toUpperCase());
            stmt.setString(4, e.getContrasena().toUpperCase());
            stmt.setString(5, e.getPunto_de_venta().toUpperCase());
            stmt.setString(6, e.getPuesto().toUpperCase());
            stmt.setString(7, e.getComision().toUpperCase());
            stmt.setString(8, e.getTiempoTrabajo().toUpperCase());
            stmt.setInt(9, e.getIdEmpleados());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");

        } catch (SQLException ex) {
            error(con);
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            cerrar(con);
        }
    }
    
    
     public List<Empleado> obtenerReporte() {
        Connection con = conexion();
        List<Empleado> listaEmpleados = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("select PedidosEmpleado.NumeroEmpleado,PedidosEmpleado.horaInicio,PedidosEmpleado.HoraFinal,Empleados.nombre, Empleados.comision \n" +
"from PedidosEmpleado \n" +
"inner join Empleados on PedidosEmpleado.NumeroEmpleado=Empleados.IdEmpleados;");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                listaEmpleados.add(rellenarEmpleados(rs));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            error(con);
        } finally {
            cerrar(con);
        }
        return listaEmpleados;
    }

}
