using System;
namespace EvidenciaU2
{
    public class Vacuna
    {

  

        public virtual void inyectar()
        {
            Console.WriteLine("Has sido inyectado");
        }

        public virtual void efectosSecundarios()
        {
            Console.WriteLine("Dolor de cabeza, Dolor articular, Dolor muscularDolor en la zona de la inyección");

   
          
        }

        public virtual void MensajeCuerpo()
        {

        }

        public virtual void fechaDosis()
        {

        }
       

        }
 }

