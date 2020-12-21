using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pacientes_Parcial
{
    class ObraSocial
    {
        int denominacion;
        int plan;

        public ObraSocial()
        {
            denominacion = 0;
            plan = 0;
        }

        public ObraSocial(int denom, int pl)
        {
            denominacion = denom;
            plan = pl;
        }

        public int p_Denominacion
        {
            set { denominacion = value; }
            get { return denominacion; }
        }

        public int p_Plan
        {
            set { plan = value; }
            get { return plan; }
        }

        private string mostrarDenominacion()
        {
            string textoDen = "";
            if (denominacion == 1)
                textoDen = "Daspu";
            else
                if (denominacion == 2)
                textoDen = "Swiss Medical";
            else
                if (denominacion == 3)
                textoDen = "Federada";

            return textoDen;
        }

        private string mostrarPlan()
        {
            string textoPlan = "";
            if (plan == 1)
                textoPlan = "Recibo de Sueldo";
            else
                if (plan == 2)
                textoPlan = "Prepago";
            else
                if (plan == 3)
                textoPlan = "Monotributo";
            return textoPlan;
        }

        public string ToStringObraSocial()
        {
            return "Denominacion: " + mostrarDenominacion() + "\n"
                + "Plan: " + mostrarPlan();
        }
    }
}
