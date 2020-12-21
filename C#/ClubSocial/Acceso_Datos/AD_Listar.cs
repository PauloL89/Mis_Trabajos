using ClubSocial.Models;
using ClubSocial.ViewModels;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace ClubSocial.Acceso_Datos
{
    public class AD_Listar
    {
        #region Listado de Socios
        public static List<Socio> ListadoSocio()
        {
            List<Socio> resultado = new List<Socio>();

            string CadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); 

            SqlConnection conexion = new SqlConnection(CadenaBD); 

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = "SELECT * FROM Socios"; 
                cmd.Parameters.Clear(); 

                cmd.CommandType = System.Data.CommandType.Text; 
                cmd.CommandText = consulta; 

                conexion.Open(); 
                cmd.Connection = conexion; 

                SqlDataReader dr = cmd.ExecuteReader(); // crear un data reader para ejecutar la sentencia. se usa en SELECT
                if (dr != null) // si es distinto de null, osea que la lista tiene algo
                {
                    while (dr.Read()) // mientras haya algo para leer
                    {

                        // obtengo valores
                        Socio s = new Socio();
                        s.id_socio = int.Parse(dr["Id"].ToString()); // nombre de columnas en "" de la BD talcual
                        s.nombre = dr["Nombre"].ToString();
                        s.apellido = dr["Apellido"].ToString();
                        s.id_tipoDoc = int.Parse(dr["IdTipoDocumento"].ToString());
                        s.nro_Doc = dr["NroDocumento"].ToString();
                        s.id_deporte = int.Parse(dr["IdDeporte"].ToString());


                        resultado.Add(s); // agregamos los objetos a la lista

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



        #region Lista de Tipos de Documentos

        public static List<TipoDoc_vm> ListadoTipoDoc()
        {
            List<TipoDoc_vm> resultado = new List<TipoDoc_vm>();

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); 

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = "SELECT * FROM TiposDocumentos"; 
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
                        
                        TipoDoc_vm t = new TipoDoc_vm();
                        t.id_tipoDoc = int.Parse(dr["Id"].ToString());
                        t.nombre_tipoDoc = dr["Nombre"].ToString();

                        resultado.Add(t); 

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


        #region Listado de Deportes

        public static List<Deportes_vm> ListaDeportes()
        {
            List<Deportes_vm> resultado = new List<Deportes_vm>();

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); 

            SqlConnection conexion = new SqlConnection(cadenaBD); 

            try
            {
                SqlCommand cmd = new SqlCommand(); 
                string consulta = "SELECT * FROM Deportes"; 
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
                        
                        Deportes_vm d = new Deportes_vm();
                        d.Id_deporte = int.Parse(dr["Id"].ToString());
                        d.nombre_deporte = dr["Nombre"].ToString();

                        resultado.Add(d); 

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