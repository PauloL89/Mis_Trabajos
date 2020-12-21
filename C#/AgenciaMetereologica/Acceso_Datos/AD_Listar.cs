using AgenciaMetereologica.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace AgenciaMetereologica.Acceso_Datos
{
    public class AD_Listar
    {
        #region Listado de Mediciones
        public static List<Mediciones> ListadoMediciones()
        {
            List<Mediciones> resultado = new List<Mediciones>();

            string CadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(CadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = "SELECT * FROM Mediciones";
                cmd.Parameters.Clear();

                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = consulta;

                conexion.Open();
                cmd.Connection = conexion;

                SqlDataReader dr = cmd.ExecuteReader(); 
                if (dr != null) 
                {
                    while (dr.Read()) 
                    {

                        // obtengo valores
                        Mediciones m = new Mediciones();
                        m.Id = int.Parse(dr["Id"].ToString()); // nombre de columnas en "" de la BD talcual
                        m.dia = int.Parse(dr["Dia"].ToString());
                        m.idEstacion = int.Parse(dr["IdEstacion"].ToString());
                        m.temperatura = float.Parse(dr["Temperatura"].ToString());
                        m.humedad = float.Parse(dr["Humedad"].ToString());


                        resultado.Add(m); // agregamos los objetos a la lista

                    }
                }



            }
            catch (Exception)
            {

                throw;
            }
            finally
            {
                conexion.Close();
            }
            return resultado;
        }
        #endregion

        #region Lista de Estaciones

        public static List<VM_Estaciones> ListadoEstaciones()
        {
            List<VM_Estaciones> resultado = new List<VM_Estaciones>();

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = "SELECT * FROM Estaciones";
                cmd.Parameters.Clear();

                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = consulta;

                conexion.Open();
                cmd.Connection = conexion;

                SqlDataReader dr = cmd.ExecuteReader();
                if (dr != null)
                {
                    while (dr.Read())
                    {

                        VM_Estaciones e = new VM_Estaciones();
                        e.idEstacion = int.Parse(dr["IdEstacion"].ToString());
                        e.nombreEstacion = dr["Nombre"].ToString();

                        resultado.Add(e);

                    }
                }
            }
            catch (Exception)
            {

                throw;
            }
            finally
            {
                conexion.Close();
            }
            return resultado;
        }
        #endregion

    }
}