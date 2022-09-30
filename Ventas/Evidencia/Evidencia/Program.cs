using System;
using System.Collections.Generic;

namespace Evidencia
{
    class Program
    {
        static void Main(string[] args)
        {
            int menu;
            int opcion;
            int tipo;
            int talla;
            string color;
            double precio;
            string tipoC;
            // se inicializan las listas a utilizar de vendedores y tipos de calzados.
            List<Dama> dama = new List<Dama>();
            List<NInio> ninio = new List<NInio>();
            List<Bebes> bebes = new List<Bebes>();
            List<Caballero> caballero = new List<Caballero>();


            do
            {
                Console.WriteLine("----------menu----------");
                
               Console.WriteLine("1-ingresar un nuevo pedido");
               Console.WriteLine("2- Ver pedidos");
               Console.WriteLine("3- Salir");
                menu = Int32.Parse(Console.ReadLine());
                if (menu == 1)
                {
                    Console.WriteLine("Elija el vendedor: 01=Juan- 02=pedro- 3=karina- 4=vanessa 5=olga");
                    opcion = Int32.Parse(Console.ReadLine());
                    Console.WriteLine("Tipo de calzado 1= Dama 2=caballero 3=niño 4= bebes");
                    tipo = Int32.Parse(Console.ReadLine());

                    switch (tipo)
                    {
                        case 1:
                            Console.WriteLine("Elija su talla");
                            talla = Int32.Parse(Console.ReadLine());
                            Console.WriteLine("Elija su color");
                            color = Console.ReadLine();
                            Console.WriteLine("Elija precio");
                            precio = double.Parse(Console.ReadLine());
                            //ingreso de la lista de objetos
                            dama.Add(new Dama() { Vendedor = opcion, Talla = talla, Color = color, Precio = precio });
                            //consideramos la lista de compras del usuario y se compara las veces asignadas de producto
                            foreach (Dama d in dama)
                            { 
                                d.Compras();
                                d.comparacionTalla();
                            }
                                break;
                        case 2:
                            Console.WriteLine("Elija su talla");
                            talla = Int32.Parse(Console.ReadLine());
                            Console.WriteLine("Elija su color");
                            color = Console.ReadLine();
                            Console.WriteLine("Elija precio");
                            precio = double.Parse(Console.ReadLine());
                            //ingreso de la lista de objetos
                            caballero.Add(new Caballero() { Vendedor = opcion, Talla = talla, Color = color, Precio = precio });
                            //consideramos la lista de compras del usuario y se compara las veces asignadas de producto
                            foreach (Dama d in dama)
                            {
                                d.Compras();
                                d.comparacionTalla();

                            }
                            break;
                        case 3:
                            Console.WriteLine("Elija su talla");
                            talla = Int32.Parse(Console.ReadLine());
                            Console.WriteLine("Elija su color");
                            color = Console.ReadLine();
                            Console.WriteLine("Elija precio");
                            precio = double.Parse(Console.ReadLine());
                            //ingreso de la lista de objetos
                            ninio.Add(new NInio() { Vendedor = opcion, Talla = talla, Color = color, Precio = precio });
                            //consideramos la lista de compras del usuario y se compara las veces asignadas de producto
                            foreach (Dama d in dama)
                            {
                                d.Compras();
                                d.comparacionTalla();
                            }
                            break;
                        case 4:
                            Console.WriteLine("Elija su talla");
                            talla = Int32.Parse(Console.ReadLine());
                            Console.WriteLine("Elija su color");
                            color = Console.ReadLine();
                            Console.WriteLine("Elija precio");
                            precio = double.Parse(Console.ReadLine());
                            //ingreso de la lista de objetos
                            bebes.Add(new Bebes() { Vendedor = opcion, Talla = talla, Color = color, Precio = precio });
                            //consideramos la lista de compras del usuario y se compara las veces asignadas de producto
                            foreach (Dama d in dama)
                            {
                                d.Compras();
                                d.comparacionTalla();
                            }
                            break;

                    }

                
                }else if (menu == 2)
                {
                    //se imprimen las datos asignados de cada uno de los tipos de calzados vendidos asi mismo
                    //se reafirman los metos utilizados y se pueden observar si se el vendedor repitio mas de una ves el tipo
                    //tambien se registra las tallas y se comparan de acuerdo a sus valores de tallas asignados.
                Console.WriteLine("Datos de pedidos de dama==================================================");
                foreach (Dama d in dama)
                {
                        Console.WriteLine("\n");
                        d.Compras();
                        d.comparacionTalla();
                        Console.WriteLine("Vendedor: "+d.Vendedor);
                        Console.WriteLine(" Talla " + d.Talla );
                        Console.WriteLine(" Color: " + d.Color);
                        Console.WriteLine(" Precio " + d.Precio);
                        d.porcentajeVenta();
                        


                    }
                    Console.WriteLine("Datos de pedidos de Caballero===========================================");
                    foreach (Caballero d in caballero)
                    {
                        Console.WriteLine("\n");
                        d.Compras();
                        d.comparacionTalla();
                        Console.WriteLine("Vendedor: " + d.Vendedor);
                        Console.WriteLine(" Talla " + d.Talla);
                        Console.WriteLine(" Color: " + d.Color);
                        Console.WriteLine(" Precio " + d.Precio);
                        d.porcentajeVenta();

                    }
                    Console.WriteLine("Datos de pedidos de Niños===========================================");
                    foreach (NInio d in ninio)
                    {
                        Console.WriteLine("\n");
                        d.Compras();
                        d.comparacionTalla();
                        Console.WriteLine("Vendedor: " + d.Vendedor);
                        Console.WriteLine(" Talla " + d.Talla);
                        Console.WriteLine(" Color: " + d.Color);
                        Console.WriteLine(" Precio " + d.Precio);
                        d.porcentajeVenta();

                    }
                    Console.WriteLine("Datos de pedidos de Bebes===========================================");
                    foreach (Bebes d in bebes)
                    {
                        Console.WriteLine("\n");
                        d.Compras();
                        d.comparacionTalla();
                        Console.WriteLine("Vendedor: " + d.Vendedor);
                        Console.WriteLine(" Talla " + d.Talla);
                        Console.WriteLine(" Color: " + d.Color);
                        Console.WriteLine(" Precio " + d.Precio);
                        d.porcentajeVenta();
                    }

                }



            } while (menu!=3);

        }
    }
}
