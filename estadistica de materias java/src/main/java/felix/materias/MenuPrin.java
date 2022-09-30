package felix.materias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrin {

    public void Menu() {
        // Lista de arreglos que se muestran en pantalla
        AsignaturasTotal asignaturasTotal = new AsignaturasTotal();
        GuardarCalificaciones guardarCalificaciones = new GuardarCalificaciones();
         List<NombreAsig> Lista = new ArrayList<>();
         MostrarEstadisticas mostrarEstadisticas=new MostrarEstadisticas();
       

        int num = 0;
        //valores ingresados en el menu principal se despliega segun sea la opcion
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("MENU");
            System.out.println("Favor de ingresar un valor entre 1 y 4");
            System.out.println("1-Registrar asignaturas.");
            System.out.println("2-Guardar calificaciones");
            System.out.println("3- Mostrar estadísticas (máx, mín, prom).");
            System.out.println("4-salir");
            num = teclado.nextInt();
            switch (num) {
                case 1:
                    Lista = asignaturasTotal.Asigantura();
                    break;
                case 2:
                    Lista = guardarCalificaciones.Calificaciones(Lista);
                    break;
                case 3:
                    mostrarEstadisticas.Total(Lista);
                    break;
                default:
                    break;
            }
        } while (num >= 1 && num < 4);

    }

}
