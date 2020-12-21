using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.EnterpriseServices.Internal;
using System.Linq;
using System.Web;

namespace Personas.Models
{
    public class Usuario
    {
        [Required]
        public string nombre { get; set;}
        [Required]
        public int password { get; set;}

    }
}