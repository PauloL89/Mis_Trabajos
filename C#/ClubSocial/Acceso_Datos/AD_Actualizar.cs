using ClubSocial.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace ClubSocial.Acceso_Datos
{
    public class AD_Actualizar
    {
        #region Actualizar
        public static bool ActualizarDatosSocios(Socio socio)
        {
            bool resultado = false;

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); 

            SqlConnection conexion = new SqlConnection(cadenaBD); 

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = @"UPDATE Socios 
                                    SET nombre = @nombre, 
	                                    Apellido = @apellido,
	                                    IdTipoDocumento = @idTipoDoc,
	                                    NroDocumento = @nroDoc,
	                                    IdDeporte = @idDeporte
                                    WHERE Id = @id"; 
                cmd.Parameters.Clear(); 

                
                cmd.Parameters.AddWithValue("@nombre", socio.nombre);
                cmd.Parameters.AddWithValue("@apellido", socio.apellido);
                cmd.Parameters.AddWithValue("@idTipoDoc", socio.id_tipoDoc);
                cmd.Parameters.AddWithValue("@nroDoc", socio.nro_Doc);
                cmd.Parameters.AddWithValue("@idDeporte", socio.id_deporte);
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
        #endregion


        #region Obtener Socio
        public static Socio ObtenerSocio(int idSocio)
        {
            Socio resultado = new Socio();

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD); 

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = "SELECT * FROM Socios WHERE Id = @id"; 
                cmd.Parameters.Clear(); 
                cmd.Parameters.AddWithValue("@id", idSocio);

                cmd.CommandType = System.Data.CommandType.Text; 
                cmd.CommandText = consulta; 

                conexion.Open(); 
                cmd.Connection = conexion; 

                SqlDataReader dr = cmd.ExecuteReader();
                if (dr != null) 
                {
                    while (dr.Read()) 
                    {
                        

                        resultado.id_socio = int.Parse(dr["Id"].ToString());
                        resultado.nombre = dr["Nombre"].ToString();
                        resultado.apellido = dr["Apellido"].ToString();
                        resultado.id_tipoDoc = int.Parse(dr["IdTipoDocumento"].ToString());
                        resultado.nro_Doc = dr["NroDocumento"].ToString();
                        resultado.id_deporte = int.Parse(dr["IdDeporte"].ToString());

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