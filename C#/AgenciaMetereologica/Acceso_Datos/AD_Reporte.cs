using AgenciaMetereologica.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace AgenciaMetereologica.Acceso_Datos
{
    public class AD_Reporte
    {
        #region Temperatura y Humedad Promedio
        public static List<Temp_HumedadPromedio> ObtenerTemp_HumedadPromedio()
        {
            List<Temp_HumedadPromedio> resultado = new List<Temp_HumedadPromedio>();


            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = @"SELECT e.Nombre, 
                                    AVG(Temperatura) AS 'Promedio_Temperatura', 
                                    AVG(Humedad) AS 'Promedio_Humedad'
                                    FROM  Mediciones m JOIN Estaciones e 
                                    ON m.IdEstacion = e.IdEstacion
                                    GROUP BY e.Nombre";
                cmd.Parameters.Clear();



                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = consulta;

                conexion.Open();
                cmd.Connection = conexion;

                SqlDataReader dr = cmd.ExecuteReader();
                if (dr != null) //Si la consulta me devuelve algo (true)
                {
                    while (dr.Read())
                    {
                        Temp_HumedadPromedio t = new Temp_HumedadPromedio(); // crea objeto, carga
                        t.nombre_estacion = dr.GetString(0); // d.Nombre en la consulta
                        t.promTemperatura = float.Parse(dr["Promedio_Temperatura"].ToString()); 
                        t.promHumedad = float.Parse(dr["Promedio_Humedad"].ToString());

                        resultado.Add(t); // agrega

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

        #region MAXIMA TEMPERATURA
        public static List<MaximaTemperatura> ObtenerMaximaTemperatura()
        {
            List<MaximaTemperatura> resultado = new List<MaximaTemperatura>();


            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = @"SELECT TOP 1 e.Nombre, MAX(Temperatura) AS 'Maxima_Temperatura'
                                    FROM Mediciones m JOIN Estaciones e 
                                    ON m.IdEstacion = e.IdEstacion
                                    GROUP BY e.Nombre";
                cmd.Parameters.Clear();



                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = consulta;

                conexion.Open();
                cmd.Connection = conexion;

                SqlDataReader dr = cmd.ExecuteReader();
                if (dr != null) //Si la consulta me devuelve algo (true)
                {
                    while (dr.Read())
                    {
                        MaximaTemperatura mt = new MaximaTemperatura(); // crea objeto, carga
                        mt.nombre_estacion = dr.GetString(0); // d.Nombre en la consulta
                        mt.TemperaturaMaxima = float.Parse(dr["Maxima_Temperatura"].ToString());

                        resultado.Add(mt); // agrega

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