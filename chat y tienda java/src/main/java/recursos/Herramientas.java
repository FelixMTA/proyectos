package recursos;

import entidades.Empleado;
import entidades.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Herramientas {

    public Empleado rellenarEmpleados(ResultSet rs) {
        Empleado e = new Empleado();
        try {
            e.setUsuario(rs.getString("usuario"));
            e.setIdEmpleados(rs.getInt("idEmpleados"));
            e.setNombre(rs.getString("nombre"));
            e.setNumeroEmpleado(rs.getString("numeroEmpleado"));
            e.setContrasena(rs.getString("contrasena"));
            e.setPunto_de_venta(rs.getString("punto_de_venta"));
            e.setPuesto(rs.getString("puesto"));
            e.setComision(rs.getString("comision"));
            e.setTiempoTrabajo(rs.getString("tiempoTrabajo"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }

    public Pedido rellenarPedidos(ResultSet res) {
        Pedido p = new Pedido();
        try {
            p.setIdPedidosEmpleado(res.getInt("IdPedidosEmpleado"));
            p.setNumeroEmpleado(res.getInt("numeroEmpleado"));
            p.setArreglo(res.getString("arreglo"));
            p.setEstatus(res.getString("estatus"));
            p.setTiempoEstimado(res.getString("tiempoEstimado"));
            p.setHoraInicio(res.getString("horaInicio"));
            p.setHoraFinal(res.getString("HoraFinal"));
        } catch (SQLException e) {
            System.out.println("fecha texto "+ e.getMessage());
        }
        return p;
    }

    public String fechaActualTexto() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat(" hh:mm:ss");
        System.out.println(dateFormat.format(date));
        return dateFormat.format(date);
    }

}
