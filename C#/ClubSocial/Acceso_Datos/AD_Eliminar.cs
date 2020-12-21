using ClubSocial.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace ClubSocial.Acceso_Datos
{
    public class AD_Eliminar
    {

        public static bool EliminarSocio(Socio socio)
        {
            bool resultado = false;

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); 

            SqlConnection conexion = new SqlConnection(cadenaBD); 

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = "DELETE FROM Socios WHERE Id = @id "; 
                cmd.Parameters.Clear(); 

                // agregamos parametros

                cmd.Parameters.AddWithValue("@id", socio.id_socio);

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