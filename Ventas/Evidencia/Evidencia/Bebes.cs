using System;
namespace Evidencia
{ // herencia de la clase calzado :
    public class Bebes : Calzado
    {

        public override void porcentajeVenta()
        {
            // se comisiona el precio de la clase padre y se asigna el porcentaje
            Precio = Precio * .5;
            Console.WriteLine("La comision del producto es de " + Precio);
        }

        public override void comparacionTalla()

        {
            //se comparan las tallas de la clase dependiendo de lo asignado el problema y se genera apartir de
            // atributos de clase padre en este caso TALLA
            Console.WriteLine("\n");
            if (Talla < 10 || Talla > 14)
            {
                Console.WriteLine("++++Error de talla la siguiente linea solo es informativa++++++++");
            }
            else
            {
                Console.WriteLine("********pedido**********");
            }
        }
    }
    }

