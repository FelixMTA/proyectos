package felix.cuentabancaria;

import java.util.Scanner;

public abstract class CuentaBancaria {

    protected double transaccion, retiro, deposito;
    private static double saldo;
    Scanner entrada = new Scanner(System.in);

    public void Menu() {

        Datos d = new Datos();

        Scanner teclado = new Scanner(System.in);
        int num = 0;

        int tamanio = 0;
        do {
            System.out.println("Ingrese nombre del usuario: ");
            d.setNombre(teclado.next());
            System.out.println("Bienvenido" + d.getNombre());
            tamanio = d.getNombre().length();
            if (tamanio == 0) {
                System.out.println("Error cadena vacia");
            }
        } while (tamanio < 0);
        do {
            System.out.println("Ingrese el numero de cuenta: ");
            d.setNumero_cuenta(teclado.next());

            tamanio = d.getNumero_cuenta().length();
            if (tamanio == 0) {
                System.out.println("Error cadena vacia");
            }
        } while (tamanio < 0);

        do {
            do {
                System.out.println("Que deseas Realizar " + d.getNombre());
                System.out.println("**Menu de cuenta**");
                System.out.println("Elegir opcion deseada");
                System.out.println("1-asignarSaldoCuenta");
                System.out.println("2-retiros");
                System.out.println("3-Salir");
                num = entrada.nextInt();
                if (num >= 1 && num <= 3) {

                } else {
                    System.out.println("Error favor de ingresar un digito");
                }
            } while (num == 0);

            switch (num) {
                case 1:
                    CuentaBancaria mensaje = new Depositos();
                    mensaje.Transaccion();

                    break;

                case 2:
                    CuentaBancaria mensaje = new Retiro();
                    mensaje.Transaccion();
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    num = 5;
                    break;
                default:
                    break;
            }
        } while (num != 5);

    }

    public void Retiro() {
        retiro = entrada.nextDouble();

    }

    public void Asignar() {
        deposito = entrada.nextDouble();
    }

    public abstract void Transaccion();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
