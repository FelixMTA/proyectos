
package felix.cuentabancaria;


public class Depositos extends CuentaBancaria{

    @Override
    public void Transaccion() {
        System.out.println("Ingrese el monto a depositar: ");
        Asignar();
        transaccion=getSaldo();
        setSaldo(transaccion+deposito);
        System.out.println("Depositaste: "+deposito);
        System.out.println("Saldo actual: "+getSaldo());
    
    }
    
}
