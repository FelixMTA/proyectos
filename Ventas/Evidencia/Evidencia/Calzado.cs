using System;
namespace Evidencia
{
    public class Calzado
    {
        private int talla;
        private string color;
        private double precio;
        private string tipo;
        private int tipoC=0;
        private bool sandalia;
        private bool bota;
        private bool mocasin;
        private bool tenis;
        private int vendedor;
        private int contador;

        public int Talla { get => talla; set => talla = value; }
        public string Color { get => color; set => color = value; }
        public double Precio { get => precio; set => precio = value; }
        public bool Bota { get => bota; set => bota = value; }
        public bool Mocasin { get => mocasin; set => mocasin = value; }
        public bool Tenis { get => tenis; set => tenis = value; }
        public int Vendedor { get => vendedor; set => vendedor = value; }
        public string Tipo { get => tipo; set => tipo = value; }
        public int Contador { get => contador; set => contador = value; }
        public int TipoC { get => tipoC; set => tipoC = value; }

        //metodos sin retorno de valor asignados a cada uno de las clases hijas
        // se utiliza virtual cuando se van a sobreescribir en otras clases
        public virtual void porcentajeVenta()
        {
          
        }

        public virtual void comparacionTalla()
        {
        }
        //metodo donde se compara las veces se a asignado un tipo de calzado a cada uno de los vendedores.
        public void Compras()
        {
            tipoC = tipoC + 1;
            if (tipoC>1 && Vendedor==Vendedor)
            {
                Console.WriteLine(":::::::::En esta venta un vendedor excede la cantidad de modelos por transacción ::::::::::::::");
            }
        }



}


}
