
package sistemas.consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemas.modelos.ModGerencial;

public class ConsultaGerencial {

    private String Informes;

    public boolean Registrar(ModGerencial modger){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbnegocio.ModGerencial (proveedor, producto, descripcion) VALUES(?,?,?)";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modger.getInformes());
            ps.setString(2, modger.getReportes());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    } 
    
    public boolean modificar(ModGerencial modger){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Update dbnegocio.ModGerencial set revisiones='"+Informes+"' where ModGerencial = '"+modger.getInformes()+"';";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modger.getInformes());
            ps.setString(2, modger.getReportes());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean eliminar(ModGerencial modger) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM dbnegocio.ModGerencial WHERE id=? ";
        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modger.getInformes());
            ps.setString(2, modger.getReportes());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
    public boolean buscar(ModGerencial modger) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM dbnegocio.ModGerencial WHERE Gerencial=? ";

        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modger.getInformes());
            ps.setString(2, modger.getReportes());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                modger.setInformes(rs.getString("Informes"));
                modger.setReportes(rs.getString("Reportes"));
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

    public boolean registrar(ModGerencial modger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modificar(ModGerencial modger, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
