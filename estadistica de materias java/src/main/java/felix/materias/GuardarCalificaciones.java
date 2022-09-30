package felix.materias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuardarCalificaciones {
//guardamos en el arreglo las calificaciones de cada alumno que se agreguen 
    public List<NombreAsig> Calificaciones( List<NombreAsig> Lista) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero total de alumnos");
        int alum = teclado.nextInt();
        for (int i = 0; i < alum; i++) {
            for (NombreAsig as : Lista) {
                List<Double> calificaciones = as.getCalificaciones();
                System.out.println("Calificacion del alumno "+(i+1) + " " + as.getNombre());
                calificaciones.add(teclado.nextDouble());
                as.setCalificaciones(calificaciones);
            }
        }
        System.out.println("+++++++++++++++++++++++++");
        for (NombreAsig as : Lista) {
            System.out.println(""+as.getNombre());
            for (Double c :as.getCalificaciones()) {
                System.out.println(c);
            }
        }
        System.out.println("+++++++++++++++++++++++++");
        return Lista;
    }
}

