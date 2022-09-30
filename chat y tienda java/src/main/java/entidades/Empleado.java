
package entidades;

public class Empleado {
    
    private int idEmpleados;
    private String nombre;
    private String usuario;
    private String numeroEmpleado;
    private String contrasena;
    private String punto_de_venta;
    private String puesto;
    private String comision;
    private String tiempoTrabajo;

    public Empleado() {
    }

    public Empleado(int idEmpleados, String nombre, String usuario, String numeroEmpleado, String contrasena, String punto_de_venta, String puesto, String comision, String tiempoTrabajo) {
        this.idEmpleados = idEmpleados;
        this.nombre = nombre;
        this.usuario = usuario;
        this.numeroEmpleado = numeroEmpleado;
        this.contrasena = contrasena;
        this.punto_de_venta = punto_de_venta;
        this.puesto = puesto;
        this.comision = comision;
        this.tiempoTrabajo = tiempoTrabajo;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPunto_de_venta() {
        return punto_de_venta;
    }

    public void setPunto_de_venta(String punto_de_venta) {
        this.punto_de_venta = punto_de_venta;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getTiempoTrabajo() {
        return tiempoTrabajo;
    }

    public void setTiempoTrabajo(String tiempoTrabajo) {
        this.tiempoTrabajo = tiempoTrabajo;
    }
    
    
    
}
