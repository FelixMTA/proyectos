using System;
namespace EvidenciaU2
{
    public class AstraZeneca : Vacuna
    {
        private string efecto1 = " Dolor o molestia a la palpación en la zona de la inyección ";
        private string efecto2 = " Dolor de cabeza ";
        private string efecto3 = " Cansancio ";
        private string efecto4 = " Dolor muscular o articular ";
        private string efecto5 = " Fiebre ";
        private string efecto6 = " Escalofríos ";
        private string efecto7 = " Náuseas ";

        public string Efecto1 { get => efecto1; set => efecto1 = value; }
        public string Efecto2 { get => efecto2; set => efecto2 = value; }
        public string Efecto3 { get => efecto3; set => efecto3 = value; }
        public string Efecto4 { get => efecto4; set => efecto4 = value; }
        public string Efecto5 { get => efecto5; set => efecto5 = value; }
        public string Efecto6 { get => efecto6; set => efecto6 = value; }
        public string Efecto7 { get => efecto7; set => efecto7 = value; }
        //sobreesritura de metodo
        public override void efectosSecundarios()
        {
            Console.WriteLine(Efecto1 + Efecto2 + Efecto3 + Efecto4);

            Console.WriteLine(Efecto5 + efecto6 + efecto7);
        }
        public override void MensajeCuerpo()
        {
            Console.WriteLine("El mensaje  codifica en el ADN y otro lenguaje se introduce en ");
            Console.WriteLine("adenovirus del resfriado de los chimpacés");
        }
        public override void fechaDosis()
        {
            //fecha actual donde se agrega los dias de la proxima vacuna
            string fecha;
            fecha = DateTime.Now.Date.ToString();
            DateTime nuevaFecha = Convert.ToDateTime(fecha);
            nuevaFecha = nuevaFecha.AddDays(90);
            Console.WriteLine("Su segunda dosis sera en la siguiente fecha: " + nuevaFecha);

        }
        public void EfectosRandom()
        {
            int numeroAleatorio;
            Random a = new Random();
            numeroAleatorio = a.Next(1, 6);

            switch (numeroAleatorio)
            {
                case 1:
                    Console.WriteLine( Efecto1);
                    break;
                case 2:
                    Console.WriteLine(Efecto2);
                    break;
                case 3:
                    Console.WriteLine(Efecto3);
                    break;
                case 4:
                    Console.WriteLine(Efecto4);
                    break;
                case 5:
                    Console.WriteLine(Efecto5);
                    break;

            }

        }
    }

}