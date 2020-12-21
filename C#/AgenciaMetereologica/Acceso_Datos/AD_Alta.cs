using AgenciaMetereologica.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace AgenciaMetereologica.Acceso_Datos
{
    public class AD_Alta
    {
        public static bool InsertarNuevaMedicion(Mediciones medicion)
        {
            bool resultado = false;

            string CadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(CadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = "INSERT INTO Mediciones VALUES(@dia, @idEstacion, @temperatura, @humedad)";
                cmd.Parameters.Clear(); 

                // agregamos parametros
                cmd.Parameters.AddWithValue("@dia", medicion.dia);
                cmd.Parameters.AddWithValue("@idEstacion", medicion.idEstacion);
                cmd.Parameters.AddWithValue("@temperatura", medicion.temperatura);
                cmd.Parameters.AddWithValue("@humedad", medicion.humedad);


                cmd.CommandType = System.Data.CommandType.Text; 
                cmd.CommandText = consulta; 

                conexion.Open(); 
                cmd.Connection = conexion; 
                cmd.ExecuteNonQuery(); 
                resultado = true; 
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
    }
}