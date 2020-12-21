using FinalProgramacionIII.Models;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;

namespace FinalProgramacionIII.Acceso_Dato
{
    public class AD_Listar
    {
        #region Listado de Examenes
        public static List<Examen> ListadoExamen()
        {
            List<Examen> resultado = new List<Examen>();

            string CadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(CadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = "SELECT * FROM Examenes";
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

                      
                        Examen e = new Examen();
                        e.idExamen = int.Parse(dr["IdExamen"].ToString()); 
                        e.IdMateria = int.Parse(dr["IdMateria"].ToString());
                        e.fecha = dr["Fecha"].ToString();
                        e.nota = int.Parse(dr["Nota"].ToString());


                        resultado.Add(e); 

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

        #region Lista de Materia

        public static List<VM_materia> ListadoMateria()
        {
            List<VM_materia> resultado = new List<VM_materia>();

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = "SELECT * FROM Materias";
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

                        VM_materia m = new VM_materia();
                        m.idMateria = int.Parse(dr["IdMateria"].ToString());
                        m.nombreMateria = dr["Nombre"].ToString();
                        m.nivel = int.Parse(dr["Nivel"].ToString());

                        resultado.Add(m);

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


        #region Lista de Notas

        public static List<ListaNota> ListadoNota()
        {
            List<ListaNota> resultado = new List<ListaNota>();

            string cadenaBD = System.Configuration.ConfigurationManager.AppSettings["CadenaBD"].ToString();

            SqlConnection conexion = new SqlConnection(cadenaBD);

            try
            {
                SqlCommand cmd = new SqlCommand();
                string consulta = @"SELECT Nombre, Nivel,Fecha,Nota
                                    FROM Examenes e JOIN Materias m
                                    ON e.IdMateria = m.IdMateria
                                    ORDER BY Nivel ASC, Nota DESC";
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

                        ListaNota n = new ListaNota();
                        n.nombreMateria = dr["Nombre"].ToString();
                        n.nivel = int.Parse(dr["Nivel"].ToString());
                        n.fecha = dr["Fecha"].ToString();
                        n.nota = int.Parse(dr["Nota"].ToString());

                        resultado.Add(n);

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