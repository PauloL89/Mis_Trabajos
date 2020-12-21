using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace AgenciaMetereologica.Models
{
    public class Mediciones
    {
        public int Id { get; set; }
        [Required]
        public int dia { get; set; }
        [Required]
        public int idEstacion { get; set; }
        [Required]
        public float temperatura { get; set; }
        [Required]
        public float humedad { get; set; }

    }
}

