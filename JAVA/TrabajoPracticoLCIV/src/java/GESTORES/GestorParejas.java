package GESTORES;

import MODELO.Deposito;
import MODELO.Pareja;
import MODELO.Provincia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorParejas {

    GestorConexion conexion;

    public GestorParejas() {
        conexion = new GestorConexion();
    }

    // ALTA DE UNA PAREJA
    public void altaPareja(Pareja p) {

        try {
            conexion.abrirConexion();

            PreparedStatement st = conexion.getCon().prepareStatement("INSERT INTO Parejas(PrimerConyuge,SegundoConyuge,Telefono,Domicilio,Ciudad,IdProvincia, Estado)VALUES(?,?,?,?,?,?,1)");

            st.setString(1, p.getPrimerConyuge());
            st.setString(2, p.getSegundoConyuge());
            st.setString(3, p.getTelefono());
            st.setString(4, p.getDomicilio());
            st.setString(5, p.getCiudad());
            st.setInt(6, p.getProvincia().getIdProvincia());

            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }

    }

    // BAJA DE UNA PAREJA
    public int eliminarPareja(int id) {

        try {
            conexion.abrirConexion();

            PreparedStatement st = conexion.getCon().prepareStatement("UPDATE Parejas SET Estado = 0 WHERE IdPareja = ?");

            st.setInt(1, id);

            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }

        return id;
    }

    // MODIFICACION DE UNA PAREJA
    public Pareja modificarPareja(Pareja p) {

        try {
            conexion.abrirConexion();

            PreparedStatement st = conexion.getCon().prepareStatement("UPDATE Parejas SET PrimerConyuge = ?,SegundoConyuge = ?,Telefono = ? ,Domicilio = ? ,Ciudad = ? ,IdProvincia = ? WHERE IdPareja = ?");

            st.setString(1, p.getPrimerConyuge());
            st.setString(2, p.getSegundoConyuge());
            st.setString(3, p.getTelefono());
            st.setString(4, p.getDomicilio());
            st.setString(5, p.getCiudad());
            st.setInt(6, p.getProvincia().getIdProvincia());
            st.setInt(7, p.getIdPareja());

            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }

        return p;
    }

    // CONSULTA DE PAREJAS
    public ArrayList<Pareja> consultarParejas() {
        ArrayList<Pareja> lista = new ArrayList<>();

        try {
            conexion.abrirConexion();

            Statement st = conexion.getCon().createStatement();
            ResultSet rs = st.executeQuery("SELECT p.IdPareja,p.PrimerConyuge, p.SegundoConyuge,p.Telefono, "
                    + "p.Domicilio, p.Ciudad, pv.Provincia "
                    + "FROM Parejas p JOIN Provincias pv "
                    + "ON p.IdProvincia = pv.IdProvincia WHERE Estado = 1");

            while (rs.next()) {

                int idpareja = rs.getInt("IdPareja");
                String primerConyuge = rs.getString("PrimerConyuge");
                String segundoConyuge = rs.getString("SegundoConyuge");
                String telefono = rs.getString("Telefono");
                String domicilio = rs.getString("Domicilio");
                String ciudad = rs.getString("Ciudad");
                String provincia = rs.getString("Provincia");

                Provincia prov = new Provincia();
                prov.setProvincia(provincia);
                Pareja listado = new Pareja(idpareja, primerConyuge, segundoConyuge, telefono, domicilio, ciudad, prov);

                lista.add(listado);
            }
            st.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }

        return lista;
    }

    public Pareja obtenerParejaPorId(int idPareja) 
    {
        Pareja p = null;
        try {
            conexion.abrirConexion();
            PreparedStatement st = conexion.getCon().prepareStatement("SELECT p.IdPareja, p.PrimerConyuge, p.SegundoConyuge,p.Telefono, "
                    + "p.Domicilio, p.Ciudad, pv.Provincia "
                    + "FROM Parejas p JOIN Provincias pv "
                    + "ON p.IdProvincia = pv.IdProvincia  WHERE idPareja = ?");
            st.setInt(1, idPareja);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("IdPareja");
                String primerConyuge = rs.getString("PrimerConyuge");
                String segundoConyuge = rs.getString("SegundoConyuge");
                String telefono = rs.getString("Telefono");
                String domicilio = rs.getString("Domicilio");
                String ciudad = rs.getString("Ciudad");
                String Nomprov = rs.getString("Provincia");

                Provincia prov = new Provincia();
                prov.setProvincia(Nomprov);
                p = new Pareja(id, primerConyuge, segundoConyuge, telefono, domicilio, ciudad, prov);
                p.setIdPareja(id);
            }
            rs.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            conexion.cerrarConexion();
        }

        return p;
    }

    
}
