using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Pacientes_Parcial
{
    public partial class Form_Pacientes : Form
    {
        int cantDaspu, cantSwissMedical, cantFederada, mayorEdad, contPrepago, contPac;
        double porcPac;
        bool banderaEdad;
        public Form_Pacientes()
        {
            InitializeComponent();
            cantDaspu = 0;
            cantSwissMedical = 0;
            cantFederada = 0;
            mayorEdad = 0;
            contPrepago = 0;
            contPac = 0;
            porcPac = 0.00;
            banderaEdad = true;
        }

        private void btn_Registrar_Click(object sender, EventArgs e)
        {
            // crear objeto
            Paciente paciente = new Paciente();
            ObraSocial obraSoc = new ObraSocial();

            // cargar objeto
            paciente.p_NumPaciente = Convert.ToInt32(txt_numPac.Text);
            paciente.p_nombre = txt_nombre.Text;
            paciente.p_apellido = txt_apellido.Text;
            paciente.p_Edad = Convert.ToInt32(txt_Edad.Text);
            if (rb_Masculino.Checked)
                paciente.p_sexo = 1;
            else
                if (rb_Femenino.Checked)
                paciente.p_sexo = 2;
            obraSoc.p_Denominacion = cmb_denominacion.SelectedIndex +1;
            obraSoc.p_Plan = cmb_plan.SelectedIndex + 1;

            //Cantidad de paciente por obra social

            if (obraSoc.p_Denominacion == 1)
                cantDaspu++;
            else
                if (obraSoc.p_Denominacion == 2)
                cantSwissMedical++;
            else
                if (obraSoc.p_Denominacion == 3)
                cantFederada++;

            // contador total de pacientes registrados
            contPac++;

            // Paciente Masculino que tiene mas edad

            if (banderaEdad && paciente.p_sexo == 1)
            {
                mayorEdad = paciente.p_Edad;
                banderaEdad = false;
            }
            else if (mayorEdad < paciente.p_Edad && paciente.p_sexo == 1)
            {
                mayorEdad = paciente.p_Edad;
            }


            
            // contador de plan prepagos
            if (obraSoc.p_Plan == 2)
                contPrepago++;

            // Porcentaje de pacientes que tiene obra social cuyo plan sea prepago
            porcPac = (contPrepago * 100) / contPac;

            // Mostrar Objeto
            MessageBox.Show("Paciente " + "\n"
                               + paciente.ToStringPaciente() + "\n"
                               + " =============== " + "\n"
                               + "Obra Social " + "\n"
                               + obraSoc.ToStringObraSocial() + "\n"
                               + " =============== " + "\n"
                               + "Cantidad de Pacientes por Obra Social: " + "\n"
                               + "Daspu: " + cantDaspu + "\n"
                               + "Swiss Medical: " + cantSwissMedical + "\n"
                               + "Federada: " + cantFederada + "\n"
                               + " =============== " + "\n"
                               + "Paciente Masculino con mas Edad: " + mayorEdad
                               + "\n" + " =============== " +"\n"
                               + "Porcentaje de Pacientes con plan Prepago: " + porcPac +"%"
                               );




        }
        private void btn_Salir_Click(object sender, EventArgs e)
        {
            Close();
        }
        private void cmb_plan_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

       

       
    }
}
