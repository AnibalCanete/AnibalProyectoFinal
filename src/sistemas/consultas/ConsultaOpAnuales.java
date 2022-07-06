
package sistemas.consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemas.modelos.ModOpAnuales;


public class ConsultaOpAnuales {
    
    public boolean Registrar(ModOpAnuales modopanu){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbnegocio.ModOpAnuales (informes,reportes,resultados) VALUES(?,?,?)";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modopanu.getInformes());
            ps.setString(2, modopanu.getReportes());
            ps.setString(3, modopanu.getResultados());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    } 
    
    public boolean modificar(ModOpAnuales modopanu){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Update dbnegocio.ModOpAnuales set analisis='"+informes+"' where ModOpAnuales = '"+modopanu.getInformes()+"';";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modopanu.getInformes());
            ps.setString(2, modopanu.getReportes());
            ps.setString(3, modopanu.getResultados());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean eliminar(ModOpAnuales modopanu) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM dbnegocio.ModOpAnuales WHERE id=? ";
        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modopanu.getInformes());
            ps.setString(2, modopanu.getReportes());
            ps.setString(3, modopanu.getResultados());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
    public boolean buscar(ModOpAnuales modopanu) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM dbnegocio.ModOpAnuales WHERE Inventario=? ";

        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modopanu.getInformes());
            ps.setString(2, modopanu.getReportes());
            ps.setString(3, modopanu.getResultados());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                modopanu.setInformes(rs.getString("Informes"));
                modopanu.setReportes(rs.getString("Reportes"));
                modopanu.setResultados(rs.getString("Resultados"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
}

    public boolean registrar(ModOpAnuales modopanu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modificar(ModOpAnuales modopanu, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
