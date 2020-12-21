using ClubSocial.Models;
using ClubSocial.ViewModels;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace ClubSocial.Acceso_Datos
{
    public class AD_Reporte
    {
        public static List<CantidadSocioPorTipoDeporte> ObtenerReporte()
        {
            List<CantidadSocioPorTipoDeporte> resultado = new List<CantidadSocioPorTipoDeporte>();
           

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = @"SELECT d.Nombre, COUNT(s.Id) as Cantidad
                                    FROM Socios s JOIN Deportes d 
                                    ON s.IdDeporte = d.Id
                                    GROUP BY IdDeporte,d.Nombre";
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
                        CantidadSocioPorTipoDeporte d = new CantidadSocioPorTipoDeporte(); // crea objeto, carga
                        d.nombre_deporte = dr.GetString(0); // d.Nombre en la consulta
                        d.cantidad_socio = dr.GetInt32(1); //COUNT(s.Id) en la consulta

                        resultado.Add(d); // agrega
                     
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