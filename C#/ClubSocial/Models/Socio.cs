using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace ClubSocial.Models
{
    public class Socio
    {
        public int id_socio { get; set; }
        [Required]
        public string nombre { get; set; }
        [Required]
        public string apellido { get; set; }
        [Required]
        public int id_tipoDoc { get; set; }
        [Required]
        public string nro_Doc { get; set; }
        [Required]
        public int id_deporte { get; set; }



    }
}