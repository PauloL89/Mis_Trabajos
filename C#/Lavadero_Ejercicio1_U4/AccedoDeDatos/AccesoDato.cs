using Lavadero_Ejercicio1_U4.Models;
using Lavadero_Ejercicio1_U4.ViewModel;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace Lavadero_Ejercicio1_U4.AccedoDeDatos
{
    public class AccesoDato
    {
        #region Insertar Nuevo Lavado
        public static bool InsertarNuevoLavado(Lavado lavado)
        {
            bool resultado = false;

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea objeto conexion

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "INSERT INTO Lavados VALUES(@patente, @idTipo, @taxi, @habitual)"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

                // agregamos parametros
                cmd.Parameters.AddWithValue("@patente", lavado.patente);
                cmd.Parameters.AddWithValue("@idTipo", lavado.idTipo);
                cmd.Parameters.AddWithValue("@taxi", lavado.taxi);
                cmd.Parameters.AddWithValue("@habitual", lavado.habitual);

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

        #region ObtenerLista de Lavados
        public static List<Lavado> ObtenerListaLavado()
        {
            List<Lavado> resultado = new List<Lavado>();

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "SELECT * FROM Lavados"; // consulta
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
                        Lavado l = new Lavado();
                        l.idLavado = int.Parse(dr["IdLavado"].ToString());
                        l.patente = dr["patente"].ToString();
                        l.idTipo = int.Parse(dr["IdTipo"].ToString());
                        l.taxi =bool.Parse(dr["taxi"].ToString());
                        l.habitual = bool.Parse(dr["habitual"].ToString());
                       

                        resultado.Add(l); // agregamos los objetos a la lista

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


        #region ObtenerLista de Tipos de vehiculos
         
        public static List<TipoItemVM> ObtenerListaTipo()
        {
            List<TipoItemVM> resultado = new List<TipoItemVM>();

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "SELECT * FROM Tipos"; // consulta
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
                        TipoItemVM t = new TipoItemVM();
                        t.idTipo = int.Parse(dr["IdTipo"].ToString());
                        t.nombre = dr["nombre"].ToString();
                        t.precio = float.Parse(dr["precio"].ToString());

                        resultado.Add(t); // agregamos los objetos a la lista

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

        #region Obtener precio
        public static float ObtenerPrecio(int id)
        {
            float tipo = 0;
            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "SELECT precio FROM Tipos WHERE IdTipo = @id"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros
                cmd.Parameters.AddWithValue("@id",id);

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
                        TipoItemVM t = new TipoItemVM();
                        t.precio = float.Parse(dr["precio"].ToString());
                        tipo = t.precio;
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
            return tipo;
        }
        #endregion

        #region ObtenerTaxiHabitial
        public static Lavado ObtenerTaxiHabitual()
        {
            Lavado resultado = new Lavado();

            string candedaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(candedaBD); // crea objeto conexion

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = @"SELECT TOP 1 * FROM Lavados 
                                    WHERE taxi = 1
                                    AND habitual = 1
                                    ORDER BY IdLavado DESC"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

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

                        resultado.idLavado = int.Parse(dr["IdLavado"].ToString());
                        resultado.patente = dr["patente"].ToString();
                        resultado.idTipo = int.Parse(dr["IdTipo"].ToString());
                        resultado.taxi = bool.Parse(dr["taxi"].ToString());
                        resultado.habitual = bool.Parse(dr["habitual"].ToString());

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


        #region EliminarArticulo
        public static bool EliminarLavado(Lavado l)
        {
            bool resultado = false;

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(cadenaBD); // crea conexion a sql

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "DELETE FROM Lavados WHERE IdLavado = @id "; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros

                // agregamos parametros

                cmd.Parameters.AddWithValue("@id", l.idLavado);

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


        #region ObtenerLavado
        public static Lavado ObtenerLavado(int id)
        {
            Lavado resultado = new Lavado();

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString(); // cadena de conexion

            SqlConnection conexion = new SqlConnection(cadenaBD); // crea objeto conexion

            try
            {
                SqlCommand cmd = new SqlCommand(); // crear comando
                string consulta = "SELECT * FROM Lavados WHERE IdLavado = @id"; // consulta
                cmd.Parameters.Clear(); // limpiamos los parametros
                cmd.Parameters.AddWithValue("@id", id);

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

                        resultado.idLavado = int.Parse(dr["IdLavado"].ToString());
                        resultado.patente = dr["patente"].ToString();
                        resultado.idTipo = int.Parse(dr["IdTipo"].ToString());
                        resultado.taxi = bool.Parse(dr["taxi"].ToString());
                        resultado.habitual = bool.Parse(dr["habitual"].ToString());

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
    }
}