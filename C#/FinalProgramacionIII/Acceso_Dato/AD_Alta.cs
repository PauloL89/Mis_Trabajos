using FinalProgramacionIII.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace FinalProgramacionIII.Acceso_Dato
{
    public class AD_Alta
    {
        public static bool InsertarNuevoExamen(Examen examen)
        {
            bool resultado = false;

            string CadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(CadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = "INSERT INTO Examenes VALUES(@fecha,@idMateria, @nota)";
                cmd.Parameters.Clear(); 

                cmd.Parameters.AddWithValue("@fecha", examen.fecha);
                cmd.Parameters.AddWithValue("@idMateria", examen.IdMateria);
                cmd.Parameters.AddWithValue("@nota", examen.nota);
              
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
