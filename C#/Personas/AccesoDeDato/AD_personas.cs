using Personas.Models;
using Personas.ViewModels;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace Personas.AccesoDeDato
{
    public class AD_personas // Acceso Dato personas
    {
        #region InsertarNuevaPersona
        public static bool InsertarNuevaPersona(Persona persona)
        {
            bool resultado = false;

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea objeto conexion

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "INSERT INTO personas VALUES(@nombre, @apellido, @edad, @telefono, @idSexo)"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

                // agregamos parametros
                cmd.Parameters.AddWithValue("@nombre", persona.Nombre);
                cmd.Parameters.AddWithValue("@apellido", persona.Apellido);
                cmd.Parameters.AddWithValue("@edad", persona.Edad);
                cmd.Parameters.AddWithValue("@telefono", persona.Telefono);
                cmd.Parameters.AddWithValue("@idSexo", persona.IdSexo);

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

        #region ActualizarDatosPersona
        public static bool ActualizarDatosPersona(Persona persona)
        {
            bool resultado = false;

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "UPDATE personas SET Nombre = @nombre, Apellido = @apellido, Edad = @edad, Telefono = @telefono, IdSexo = @idSexo WHERE Id = @id "; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

                // agregamos parametros
                cmd.Parameters.AddWithValue("@nombre", persona.Nombre);
                cmd.Parameters.AddWithValue("@apellido", persona.Apellido);
                cmd.Parameters.AddWithValue("@edad", persona.Edad);
                cmd.Parameters.AddWithValue("@telefono", persona.Telefono);
                cmd.Parameters.AddWithValue("@id", persona.Id);
                cmd.Parameters.AddWithValue("@idSexo", persona.IdSexo);

                cmd.CommandType = System.Data.CommandType.Text; // decimos cual va a ser la sentencia sql y del tipo texto
                cmd.CommandText = consulta; // tiene el valor de la consulta

                conexion.Open(); // abrir conexion
                cmd.Connection = conexion; // establecer conexion
                cmd.ExecuteNonQuery(); // para insert, delete,update, alter, drop
                resultado = true; // si no hay error esta variable es verdadero
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

        #region EliminarPersona
        public static bool EliminarPersona(Persona persona)
        {
            bool resultado = false;

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "DELETE FROM personas WHERE Id = @id "; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

                // agregamos parametros
                
                cmd.Parameters.AddWithValue("@id", persona.Id);

                cmd.CommandType = System.Data.CommandType.Text; // decimos cual va a ser la sentencia sql y del tipo texto
                cmd.CommandText = consulta; // tiene el valor de la consulta

                conexion.Open(); // abrir conexion
                cmd.Connection = conexion; // establecer conexion
                cmd.ExecuteNonQuery(); // para insert, delete,update, alter, drop
                resultado = true; // si no hay error esta variable es verdadero
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

        #region ObtenerListaPersona
        public static List<Persona> ObtenerListaPersona()
        {
            List<Persona> resultado = new List<Persona>();

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "SELECT * FROM personas"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

                cmd.CommandType = System.Data.CommandType.Text; // decimos cual va a ser el tipo de sentencia de la consulta: texto
                cmd.CommandText = consulta; // tiene el valor de la consulta de tipo texto(pasamos la consulta)

                conexion.Open(); // abrir conexion
                cmd.Connection = conexion; // establecer conexion

                SqlDataReader dr = cmd.ExecuteReader(); // crear un data reader para ejecutar la sentencia. se usa en SELECT
                if (dr != null) // si es distinto de null, osea que la lista tiene algo
                {
                    while (dr.Read()) // mientras haya algo para leer
                    {
                        // obtengo valores
                        Persona p = new Persona();
                        p.Id = int.Parse(dr["Id"].ToString());
                        p.Nombre = dr["Nombre"].ToString();
                        p.Apellido = dr["Apellido"].ToString();
                        p.Edad = int.Parse(dr["Edad"].ToString());
                        p.Telefono = dr["Telefono"].ToString();

                        resultado.Add(p); // agregamos los objetos a la lista

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


        #region ObtenerListaSexo
        public static List<SexoItemVM> ObtenerListaSexo()
        {
            List<SexoItemVM> resultado = new List<SexoItemVM>();

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "SELECT * FROM sexos"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

                cmd.CommandType = System.Data.CommandType.Text; // decimos cual va a ser el tipo de sentencia de la consulta: texto
                cmd.CommandText = consulta; // tiene el valor de la consulta de tipo texto(pasamos la consulta)

                conexion.Open(); // abrir conexion
                cmd.Connection = conexion; // establecer conexion

                SqlDataReader dr = cmd.ExecuteReader(); // crear un data reader para ejecutar la sentencia. se usa en SELECT
                if (dr != null) // si es distinto de null, osea que la lista tiene algo
                {
                    while (dr.Read()) // mientras haya algo para leer
                    {
                        // obtengo valores
                        SexoItemVM s = new SexoItemVM();
                        s.IdSexo = int.Parse(dr["Id"].ToString());
                        s.Nombre = dr["Nombre"].ToString();
                        

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


        #region ObtenerPersona
        public static Persona ObtenerPersona(int idPersona)
        {
            Persona resultado = new Persona();

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea objeto conexion

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "SELECT * FROM personas WHERE Id = @id"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros
                cmd.Parameters.AddWithValue("@id", idPersona);

                cmd.CommandType = System.Data.CommandType.Text; // decimos cual va a ser la sentencia sql y del tipo texto
                cmd.CommandText = consulta; // tiene el valor de la consulta

                conexion.Open(); // abrir conexion
                cmd.Connection = conexion; // establecer conexion

                SqlDataReader dr = cmd.ExecuteReader();
                if (dr != null) // si es distinto de null, osea que la lista tiene algo
                {
                    while (dr.Read()) // mientras haya algo para leer
                    {
                        // obtengo valores
                        
                        resultado.Id = int.Parse(dr["Id"].ToString());
                        resultado.Nombre = dr["Nombre"].ToString();
                        resultado.Apellido = dr["Apellido"].ToString();
                        resultado.Edad = int.Parse(dr["Edad"].ToString());
                        resultado.Telefono = dr["Telefono"].ToString();
                        resultado.IdSexo = int.Parse(dr["IdSexo"].ToString());
                        
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
        }//metodo

        #endregion



    }//clase

}//namespace