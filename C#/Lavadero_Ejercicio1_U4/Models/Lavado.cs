using Lavadero_Ejercicio1_U4.AccedoDeDatos;
using Lavadero_Ejercicio1_U4.ViewModel;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Lavadero_Ejercicio1_U4.Models
{
    public class Lavado
    {
        public int idLavado { get; set; }
        [Required]
        public int idTipo { get; set; }
        [Required]
        public string patente { get; set; }
        [Required]
        public bool taxi { get; set; }
        [Required]
        public bool habitual { get; set; }

        public float precio { get;  set; }

        public double PrecioConDescuento
        {

            get
            {

                double descuentoTotal = 0;

                if (taxi)
                    descuentoTotal = 0.2;

                if (habitual)
                    descuentoTotal = 0.1;
                if (taxi && habitual)
                    descuentoTotal = 0.3;

                precio = AccesoDato.ObtenerPrecio(idTipo);
                return precio - (precio * descuentoTotal);

            }

        }


    }
}