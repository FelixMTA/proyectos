package Chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends Conexion {

    public Cliente() throws IOException {
        super("cliente");
    } //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviarán dos mensajes
           
                //Se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Cliente NUEVO");
            

            cs.close();//Fin de la conexión

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mensaje(String mensaje) {
        try {
            System.out.println("ESTE  ES EL MSG: "+mensaje);
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            salidaServidor.writeUTF(mensaje);
            cs.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
