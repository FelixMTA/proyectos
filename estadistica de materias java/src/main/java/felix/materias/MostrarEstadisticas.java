package felix.materias;

import java.util.List;

public class MostrarEstadisticas {

    public void Total(List<NombreAsig> Lista) {
// rrecorremos el arreglo para identificar y sacar las calificaciones de las materias y hacemos las comparaciones que nos pide el problema
        double total = 0, mayor = 0, menor = 100000000000.0, prom = 0;

        for (NombreAsig nombreAsig : Lista) {
            for (Double ca : nombreAsig.getCalificaciones()) {
                total += ca;
                if (mayor < ca) {
                    mayor = ca;
                }
                if (menor > ca) {
                    menor = ca;
                }
            }
            prom = total / nombreAsig.getCalificaciones().size();
            System.out.println("Total: " + total+"de la materia: "+nombreAsig.getNombre());
            System.out.println("Calificacion mayor: " + mayor);
            System.out.println("Calificacion menor: " + menor);
            System.out.println("Promedio de calificacion: " + prom);
            total = 0; mayor = 0; menor = 100000000000.0; prom = 0;

        }

    }

}
