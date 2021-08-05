using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DisneyApi.Entities
{
    public class Genre
    {
        [Key]
        public int id { get; set; }


        public string nombre { get; set; }


        public string imagen { get; set; }

        public int movieID { get; set; }
    }
}
