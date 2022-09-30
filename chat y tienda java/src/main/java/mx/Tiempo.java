package javaapplication1;

import javax.swing.JOptionPane;

public class Tiempo implements Runnable {

    int segundos = 0;
    @Override
    public void run() {
        for (segundos = 0; segundos < 20; segundos++) {
            System.out.println(segundos);
            if (segundos == 5) {
                JOptionPane.showMessageDialog(null, "tiempo sugerido de elaboración supero el 90%");
            }
            tiempo();
        }

    }
    public static void tiempo() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public int parar() {
        return segundos;
    }
}
