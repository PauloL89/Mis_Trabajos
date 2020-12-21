using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pacientes_Parcial
{
    class Paciente
    {
        int num_paciente, sexo,edad;
        string nombre, apellido;

        public Paciente() 
        {
            num_paciente = 0;
            sexo = 0;
            nombre = "";
            apellido = "";
            edad = 0;
        }

        public Paciente(int numPac, int sex, string nom, string ape,int ed)
        {
            num_paciente = numPac;
            sexo = sex;
            nombre = nom;
            apellido = ape;
            edad = ed;
        }

        public int p_NumPaciente
        {
            set { num_paciente = value;}
            get { return num_paciente;}
        }

        public int p_sexo
        {
            set { sexo = value; }
            get { return sexo; }
        }

        public string p_nombre
        {
            set { nombre = value; }
            get { return nombre; }
        }

        public string p_apellido
        {
            set {apellido = value; }
            get {return apellido; }
        }

        public int p_Edad
        {
            set { edad = value; }
            get { return edad; }
        }

        private string definirSexo()
        {
            string textoSexo = "";
            if (sexo == 1)
                textoSexo = "Masculino";
            else if (sexo == 2)
                textoSexo = "Femenino";

            return textoSexo;
        }
        public string ToStringPaciente()
        {
            return "Nombre: " + nombre + "\n"
                + "Apellido: "+ apellido + "\n"
                + "Edad: " + edad + "\n"
                + "Numero de Paciente: " + num_paciente + "\n"
                + "Sexo: " + definirSexo();
        }
    }
}
