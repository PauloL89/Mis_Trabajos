using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace FinalProgramacionIII.Models
{
    public class Examen
    {
        public int idExamen { get; set; }
        [Required]
        public int IdMateria { get; set; }
        [Required]
        public string fecha { get; set; }
        [Required]
        public int nota { get; set; }
    }
}
