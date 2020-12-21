

package CONTROLADOR;

import DTO.dtoListado;
import DTO.dtoListadoVisitante;
import MODELO.Empleado;
import MODELO.Paciente;
import MODELO.Visita;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Gestor 
{
    private String CONN = "jdbc:sqlserver://DESKTOP-B80K3K5:1433;databaseName=Visitas";
    private String USER = "sa";
    private String PASS = "sa";
    Connection con = null;
    
    
    
     public void abrirConexion()
    {
        
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            
            con = DriverManager.getConnection(CONN,USER,PASS);
            
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     
    
     public void cerrarConexion()
    {
        try 
        {
            if(con != null && !con.isClosed())
            con.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    } 
    
     //Registro de visitas: debe permitir ingresar los datos de una o más visitas.
     
      public void registrarVisita(Visita v)
    {
        
        try 
        {
            abrirConexion();
            
            PreparedStatement st = con.prepareStatement("INSERT INTO Visitas(IdPaciente,LegajoRecepcionista,Nombre,Duracion)VALUES(?,?,?,?)");
            
              st.setInt(1,v.getIdPaciente());
              st.setInt(2,v.getLegajoRecepcionista());
              st.setString(3,v.getNombre());
              st.setInt(4,v.getDuracion());
              
              st.executeUpdate();
              st.close();
                    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
    }
     
     
     
     /*Listado completo de visitas: debe mostrar con forma de tabla que incluya al menos los siguientes datos: 
      Nombre del paciente,nombre del visitante, nombre del recepcionista, duración. 
      El listado debe presentarse ordenado por nombre del paciente.*/ 
      
      public ArrayList<dtoListado> obtenerListado()
    {
        ArrayList<dtoListado> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT p.Nombre,v.Nombre,e.Nombre,Duracion "
                                            + "FROM Visitas v "
                                                + "JOIN Pacientes p ON v.IdPaciente = p.IdPaciente "
                                                + "JOIN Empleados e ON v.LegajoRecepcionista = e.Legajo "
                                            + "ORDER BY 1");
            
              while (rs.next()) 
              {

                  String paciente = rs.getString(1);
                  String visita = rs.getString(2);
                   String empleado = rs.getString(3);
                  int duracion = rs.getInt("Duracion");
         

                  dtoListado listado = new dtoListado(paciente, visita, empleado, duracion);
                  
                  lista.add(listado);
              }
              st.close();
              rs.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        
        return lista;
    }
     
     
   /*Cantidad de visitantes por cada paciente. 
      Debe mostrarse un listado con nombre del paciente y cantidad de visitas que recibió*/
      
       public ArrayList<dtoListadoVisitante> ListadoVisitantes()
    {
        ArrayList<dtoListadoVisitante> lista = new ArrayList<>();
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT p.Nombre, COUNT(IdVisita) cantidad "
                                            + "FROM Pacientes p JOIN Visitas v ON p.IdPaciente = v.IdPaciente "
                                             + "GROUP BY p.Nombre");
            
              while (rs.next()) 
              {

                  String paciente = rs.getString(1);
                  int cantidad = rs.getInt("cantidad");
         

                  dtoListadoVisitante listado = new dtoListadoVisitante(paciente, cantidad);
                  
                  lista.add(listado);
              }
              st.close();
              rs.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        
        return lista;
    }
      
     
     
     /*
       Promedio de duración de las visitas. 
       Debe mostrarse un promedio simple de la duración de las visitas registradas, 
       pero solo incluyendo aquellas visitas que hayan durado más de 10 minutos.*/
      
        public double PromedioDuracionVisita()
    {
        double promedio = 0;
        String sql = "SELECT SUM(Duracion)/ COUNT(IdVisita) FROM Visitas WHERE Duracion > 10";
        
       
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rsOperacion = st.executeQuery(sql);
            
              if (rsOperacion.next()) 
              {
                  int operacion = rsOperacion.getInt(1);
                 promedio = operacion;
              }

              rsOperacion.close();

              st.close();
              
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
        
        return promedio;
    }
      
       
  // OBTENER PACIENTE PARA LLENAR COMBO
       public ArrayList<Paciente> obtenerPaciente()
       {
           ArrayList<Paciente> lista = new ArrayList<>();
           
           try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Pacientes");
            
              while (rs.next()) 
              {
                  int IdProducto = rs.getInt("IdPaciente");
                  String nombre = rs.getString("Nombre");


                  
                  Paciente p = new Paciente(IdProducto, nombre);
                  
                  lista.add(p);
              }
              st.close();
              rs.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
           
           return lista;
       }
       
       
       // OBTENER EMPELADO PARA LLENAR COMBO
       public ArrayList<Empleado> obtenerEmpleado()
       {
           ArrayList<Empleado> lista = new ArrayList<>();
           
           try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Empleados");
            
              while (rs.next()) 
              {
                  int IdProducto = rs.getInt("Legajo");
                  String nombre = rs.getString("Nombre");


                  
                  Empleado e = new Empleado(IdProducto, nombre);
                  
                  lista.add(e);
              }
              st.close();
              rs.close();
                    
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            cerrarConexion();
        }
        
           
           return lista;
       }
   
     
     
     
     
     
     
     
     
     
}
