using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace AgenciaMetereologica.Models
{
    public class Temp_HumedadPromedio
    {
        public string nombre_estacion { get; set; }
        public float promTemperatura { get; set; }
        public float promHumedad { get; set; }
    }
}