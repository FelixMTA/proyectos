using System;
namespace EvidenciaU2
{
    public class Pfizer : Vacuna
    {
        private string efecto1 = " Dolor de cabeza ";
        private string efecto2 = " Dolor articular ";
        private string efecto3 = " Dolor muscular ";
        private string efecto4 = " Dolor en la zona de inyección ";
        private string efecto5 = " Cansancio ";
        private string efecto6 = " Escalofrio ";
        private string efecto7 = " Fiebre e Inflamación en la zona de la inyección ";

        public string Efecto1 { get => efecto1; set => efecto1 = value; }
        public string Efecto2 { get => efecto2; set => efecto2 = value; }
        public string Efecto3 { get => efecto3; set => efecto3 = value; }
        public string Efecto4 { get => efecto4; set => efecto4 = value; }
        public string Efecto5 { get => efecto5; set => efecto5 = value; }
        public string Efecto6 { get => efecto6; set => efecto6 = value; }
        public string Efecto7 { get => efecto7; set => efecto7 = value; }


        public override void efectosSecundarios()
        {
            Console.WriteLine(Efecto1 + Efecto2 + Efecto3 + Efecto4);

            Console.WriteLine(Efecto5 + Efecto6 + Efecto7);
        }
        //sobreesritura de metodo
        public override void MensajeCuerpo()
        {
            Console.WriteLine("El mensaje de la vacuna se codifica en una molecula de ARN ue se encapsula en una membrana ");
            Console.WriteLine("lipida para que pueda entrar en la celula.");
        }

        public override void fechaDosis()
        {
            //fecha actual donde se agrega los dias de la proxima vacuna
            string fecha;
            fecha = DateTime.Now.Date.ToString();
            DateTime nuevaFecha = Convert.ToDateTime(fecha);
            nuevaFecha = nuevaFecha.AddDays(21);
            Console.WriteLine("Su segunda dosis sera en la siguiente fecha: " + nuevaFecha);

        }
        public void EfectosRandom()
        {
            //muestra el mensaje aleatorio de acuerdo a la vacuna
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
