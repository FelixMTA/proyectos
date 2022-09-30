using System;

namespace EvidenciaU2
{
    class Program
    {
        static void Main(string[] args)
        {
            int opcion = 0;
            int numero = 0;
            int efecto = 0;
            int numeroA;
            Pfizer pfizer = new Pfizer();
            AstraZeneca astraZeneca = new AstraZeneca();
            Sputnik sputnik = new Sputnik();
            //menú que se repetira de acuerdo a las acciones del usuario
            do
            {
                Console.WriteLine("--------MENU-----");
                Console.WriteLine("1- Mi vacuna");
                Console.WriteLine("2- efectos secundarios ");
                Console.WriteLine("3- salir");
                opcion = Int32.Parse(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        //codigo random de las 3 vacunas esta no cuenta hasta el numero 4 
                        Random r = new Random();
                        numero = r.Next(1, 4);
                        Console.WriteLine(numero);
                        switch (numero)
                        {
                            case 1:
                                Console.WriteLine(" La vacuna a aplicar es pfizer ");
                                Console.WriteLine("------------Los efectos secundarios de la vacuna son: ------------------");
                                //se llama el metodo de la clase
                                pfizer.efectosSecundarios();
                                Console.WriteLine("Acepta efectos secundarios si =1 no =2");
                                efecto = Int32.Parse(Console.ReadLine());
                                if (efecto==1)
                                {
                                    Console.WriteLine("***********usted sera inyectado******* ");
                                    //llama del metodo para mostrar mensaje
                                    pfizer.MensajeCuerpo();
                                    Console.WriteLine("Fin de vacuna");
                                    pfizer.fechaDosis();
                                    Console.WriteLine("\n");
                                }
                                else
                                {
                                    break;
                                }
                                break;
                            case 2:
                                Console.WriteLine(" La vacuna a aplicar es Astrazeneca ");
                                Console.WriteLine("------------Los efectos secundarios de la vacuna son: ------------------");
                                //se llama el metodo de la clase
                                astraZeneca.efectosSecundarios();
                                Console.WriteLine("Acepta efectos secundarios si =1 no =2");
                                efecto = Int32.Parse(Console.ReadLine());
                                if (efecto == 1)
                                {
                                    Console.WriteLine("***********usted sera inyectado******* ");
                                    //llama del metodo para mostrar mensaje
                                    astraZeneca.MensajeCuerpo();
                                    Console.WriteLine("Fin de vacuna");
                                    astraZeneca.fechaDosis();
                                    Console.WriteLine("\n");
                                }
                                else
                                {
                                    break;
                                }
                                break;
                            case 3:
                                Console.WriteLine(" La vacuna a aplicar es Sputnik ");
                                Console.WriteLine("------------Los efectos secundarios de la vacuna son: ------------------");
                                //se llama el metodo de la clase
                                sputnik.efectosSecundarios();
                                Console.WriteLine("Acepta efectos secundarios si =1 no =2");
                                efecto = Int32.Parse(Console.ReadLine());
                                if (efecto == 1)
                                {
                                    Console.WriteLine("***********usted sera inyectado******* ");
                                    //llama del metodo para mostrar mensaje
                                    sputnik.MensajeCuerpo();
                                    Console.WriteLine("Fin de vacuna");
                                    sputnik.fechaDosis();
                                    Console.WriteLine("\n");
                                }
                                else
                                {
                                    break;
                                }

                                break;

                        }


                        break;

                    case 2:
                  
                        int vacuna = 0;
                        Console.WriteLine("Elija vacuna 1-Pfizer 2-Astrazeneca 3-Sputnik");
                        vacuna = Int32.Parse(Console.ReadLine());
                        Random a = new Random();
                        //codigo random del porcentaje de efectividad de la vacuna.
                        numeroA = a.Next(1, 101);

                        switch (vacuna)
                        {
                            case 1:
                                //comparacion del porcentaje de vacuna
                                if (numeroA<=95)
                                {
                                    Console.WriteLine("Los efectos que presentaran son: ");
                                    pfizer.EfectosRandom();
                                    pfizer.EfectosRandom();
                                }
                                else
                                {
                                    Console.WriteLine("Usted aun se contagiara de covid el porcentaje es alto");
                                }
                                 break;
                            case 2:

                                if (numeroA <= 70)
                                {
                                    Console.WriteLine("Los efectos que presentaran son: ");
                                    astraZeneca.EfectosRandom();
                                    astraZeneca.EfectosRandom();
                                }
                                else
                                {
                                    Console.WriteLine("Usted aun se contagiara de covid el porcentaje es alto");
                                }
                               
                                break;
                            case 3:
                                if (numeroA <= 92)
                                {
                                    Console.WriteLine("Los efectos que presentaran son: ");
                                    sputnik.EfectosRandom();
                                    sputnik.EfectosRandom();
                                }
                                else
                                {
                                    Console.WriteLine("Usted aun se contagiara de covid el porcentaje es alto");
                                }
                           
                                break;
                        }



                        break;


                }



            } while (opcion!=3);

        }
    }
}
