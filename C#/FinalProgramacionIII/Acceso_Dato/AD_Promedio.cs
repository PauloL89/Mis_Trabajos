using FinalProgramacionIII.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace FinalProgramacionIII.Acceso_Dato
{
    public class AD_Promedio
    {
        public static List<Promedio> ObtenerPromedio()
        {
            List<Promedio> resultado = new List<Promedio>();


            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = @"SELECT Nivel, AVG(nota) as 'Promedio'
                                    FROM Examenes e JOIN Materias m
                                    ON e.IdMateria = m.IdMateria
                                    WHERE e.Nota >= 6
                                    GROUP BY Nivel";
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
                        Promedio p = new Promedio(); 
                        p.nivel = dr.GetInt32(0); 
                        p.promedio = int.Parse(dr["Promedio"].ToString());

                        resultado.Add(p);

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
    }
}