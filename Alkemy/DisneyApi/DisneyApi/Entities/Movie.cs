using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DisneyApi.Entities
{
    public class Movie
    {
        [Key]
        public int id { get; set; }

        public string titulo { get; set; }

        public int calificacion { get; set; }

        public string imagen { get; set; }

        [DataType(DataType.Date)]
        public DateTime fechaCreacion { get; set; }
    }
}
