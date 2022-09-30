package felix.cuentabancaria;

import java.util.List;

public class Datos {

    private String nombre;
    private String numero_cuenta;
   

    public Datos(String nombre) {
        this.nombre = nombre;
    }

    public Datos() {
    }
    

    public Datos(String nombre, String numero_cuenta, List<Double> Saldo) {
        this.nombre = nombre;
        this.numero_cuenta = numero_cuenta;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }


    


}
