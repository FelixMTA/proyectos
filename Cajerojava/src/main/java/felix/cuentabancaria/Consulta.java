
package felix.cuentabancaria;

public class Consulta extends CuentaBancaria{
    
    
    

    @Override
    public void Transaccion(){
        System.out.println("Saldo: "+getSaldo());
        
    }
    
     
    
}
