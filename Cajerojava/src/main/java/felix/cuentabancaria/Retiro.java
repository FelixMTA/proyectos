
package felix.cuentabancaria;


public class Retiro extends CuentaBancaria{

    @Override
    public void Transaccion() {
        System.out.print("cuanto deseas retirar: ");
        Retiro();
        if(retiro<=getSaldo()){
            transaccion=getSaldo();
            setSaldo(transaccion-retiro);
            System.out.println("el retiro fue de: "+retiro);
            System.out.println("Tu saldo es de: "+getSaldo());
        }else{
            System.out.println("No cuentas con el saldo indicado");
        }

    }
    
    
    
}
