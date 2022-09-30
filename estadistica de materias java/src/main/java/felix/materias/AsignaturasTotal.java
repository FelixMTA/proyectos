package felix.materias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsignaturasTotal {
//guardamos asignaturas que desee el usuario con un bucle de repeticion
    public List<NombreAsig> Asigantura() {
        List<NombreAsig> Lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Menu de asignatura");
        System.out.println("Ingrese el numero de asignaturas ");
        num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            NombreAsig nombreAsig = new NombreAsig();
            teclado = new Scanner(System.in);
            System.out.println("Ingrese asignatura  " + (i + 1));
            nombreAsig.setNombre(teclado.next());
            Lista.add(nombreAsig);
        }
        System.out.println("Asignaturas guardadas");
        return Lista;
        
    }

}
