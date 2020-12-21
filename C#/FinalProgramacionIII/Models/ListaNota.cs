using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace FinalProgramacionIII.Models
{
    public class ListaNota
    {
        public string nombreMateria { get; set; }
        public int nivel { get; set; }
        public string fecha { get; set; }
        public int nota { get; set; }
    }
}