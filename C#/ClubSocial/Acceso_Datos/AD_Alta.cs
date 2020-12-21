using ClubSocial.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace ClubSocial.Acceso_Datos
{
    public class AD_Alta
    {
        #region ALTA SOCIO
        public static bool InsertarNuevoSocio(Socio socio)
        {
            bool resultado = false;

            string CadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(CadenaBD); 

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "INSERT INTO Socios VALUES(@nombre, @apellido, @IdTipoDoc, @nroDoc,@idDeport)";
                cmd.Parameters.Clear(); // limpiamos los parametros

                // agregamos parametros
                cmd.Parameters.AddWithValue("@nombre", socio.nombre);
                cmd.Parameters.AddWithValue("@apellido", socio.apellido);
                cmd.Parameters.AddWithValue("@IdTipoDoc", socio.id_tipoDoc);
                cmd.Parameters.AddWithValue("@nroDoc", socio.nro_Doc);
                cmd.Parameters.AddWithValue("@idDeport", socio.id_deporte);
                cmd.CommandType = System.Data.CommandType.Text; // decimos cual va a ser la sentencia sql y del tipo texto
                cmd.CommandText = consulta; // tiene el valor de la consulta

                conexion.Open(); // abrir conexion
                cmd.Connection = conexion; // establecer conexion
                cmd.ExecuteNonQuery(); // ejecutar sentencia sirve para insert, delete,update, alter, drop
                resultado = true; // si no hay error esta variable es verdadero
            }
            catch (Exception)
            {

                throw;
            }
            finally
            {
                conexion.Close(); // cerrar conexion
            }
            return resultado;
        }
        #endregion
    }
}