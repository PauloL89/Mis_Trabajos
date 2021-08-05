using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DisneyApi.DTOs
{
    public class MovieListDTO
    {
        public string titulo { get; set; }
        public string imagen { get; set; }
        
        [DataType(DataType.Date)]
        public DateTime fechaCreacion { get; set; }

    }
}
