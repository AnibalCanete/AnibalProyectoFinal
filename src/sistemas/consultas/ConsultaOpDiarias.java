
package sistemas.consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemas.modelos.ModOpDiarias;


public class ConsultaOpDiarias {

    private String proveedor;
    private String revisiones;
    public boolean Registrar(ModOpDiarias modopdia){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbnegocio.ModOpDiarias (proveedor, producto, descripcion) VALUES(?,?,?)";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modopdia.getRevisiones());
            ps.setString(2, modopdia.getReportes());
            ps.setString(3, modopdia.getRecepcion());
            ps.setString(4, modopdia.getEnvios());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    } 
    
    public boolean modificar(ModOpDiarias modopdia){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Update dbnegocio.ModOpDiarias set revisiones='"+revisiones+"' where ModOpDiarias = '"+modopdia.getRevisiones()+"';";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modopdia.getRevisiones());
            ps.setString(2, modopdia.getReportes());
            ps.setString(3, modopdia.getRecepcion());
            ps.setString(4, modopdia.getEnvios());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean eliminar(ModOpDiarias modopdia) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM dbnegocio.ModOpDiarias WHERE id=? ";
        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modopdia.getRevisiones());
            ps.setString(2, modopdia.getReportes());
            ps.setString(3, modopdia.getRecepcion());
            ps.setString(4, modopdia.getEnvios());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
    public boolean buscar(ModOpDiarias modopdia) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM dbnegocio.ModOpDiarias WHERE Inventario=? ";

        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modopdia.getRevisiones());
            ps.setString(2, modopdia.getReportes());
            ps.setString(3, modopdia.getRecepcion());
            ps.setString(4, modopdia.getEnvios());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                modopdia.setRevisiones(rs.getString("Revisiones"));
                modopdia.setReportes(rs.getString("Reportes"));
                modopdia.setRecepcion(rs.getString("Recepción"));
                modopdia.setEnvios(rs.getString("Envios"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    
    public boolean registrar(ModOpDiarias modopdia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modificar(ModOpDiarias modopdia, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean eliminar(ModOpDiarias modopdia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean buscar(ModOpDiarias modopdia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
