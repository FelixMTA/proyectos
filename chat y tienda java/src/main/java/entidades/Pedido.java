package entidades;

public class Pedido {

    private int IdPedidosEmpleado;
    private int numeroEmpleado;
    private String arreglo;
    private String estatus;
    private String tiempoEstimado;
    private String horaInicio;
    private String HoraFinal;

    public Pedido() {
        this.numeroEmpleado = 0;
        this.arreglo = "";
        this.estatus = "";
        this.tiempoEstimado = "";
        this.horaInicio = "";
        this.HoraFinal = "";
    }

    public Pedido(int IdPedidosEmpleado, int numeroEmpleado, String arreglo, String estatus, String tiempoEstimado, String horaInicio, String HoraFinal) {
        this.IdPedidosEmpleado = IdPedidosEmpleado;
        this.numeroEmpleado = numeroEmpleado;
        this.arreglo = arreglo;
        this.estatus = estatus;
        this.tiempoEstimado = tiempoEstimado;
        this.horaInicio = horaInicio;
        this.HoraFinal = HoraFinal;
    }

    public int getIdPedidosEmpleado() {
        return IdPedidosEmpleado;
    }

    public void setIdPedidosEmpleado(int IdPedidosEmpleado) {
        this.IdPedidosEmpleado = IdPedidosEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getArreglo() {
        return arreglo;
    }

    public void setArreglo(String arreglo) {
        this.arreglo = arreglo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(String HoraFinal) {
        this.HoraFinal = HoraFinal;
    }

}
