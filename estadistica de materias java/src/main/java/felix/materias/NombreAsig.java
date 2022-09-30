
package felix.materias;

import java.util.ArrayList;
import java.util.List;


class NombreAsig {
   private String nombre;
   private List<Double> calificaciones;

    public NombreAsig() {
        this.calificaciones = new ArrayList<>();
    }

    public NombreAsig(String nombre, List<Double> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }
}