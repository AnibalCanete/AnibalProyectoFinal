
package sistemas.consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemas.modelos.ModRecursosHumanos;

public class ConsultaRecursosHumanos {

    private String Procedimientos;
    public boolean Registrar(ModRecursosHumanos modrh) throws SQLException{
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbnegocio.ModRecursosHumanos (proveedor, producto, descripcion) VALUES(?,?,?)";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modrh.getProcedimientos());
            ps.setString(2, modrh.getCapacitaciones());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    } 
    
    public boolean modificar(ModRecursosHumanos modrh){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Update dbnegocio.ModRecursosHumanos set revisiones='"+Procedimientos+"' where ModRecursosHumanos = '"+modrh.getProcedimientos()+"';";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modrh.getProcedimientos());
            ps.setString(2, modrh.getCapacitaciones());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean eliminar(ModRecursosHumanos modrh) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM dbnegocio.ModRecursosHumanos WHERE id=? ";
        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modrh.getProcedimientos());
            ps.setString(2, modrh.getCapacitaciones());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
    public boolean buscar(ModRecursosHumanos modrh) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM dbnegocio.ModRecursosHumanos WHERE Recursos Humanos=? ";

        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modrh.getProcedimientos());
            ps.setString(2, modrh.getCapacitaciones());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                modrh.setProcedimientos(rs.getString("Procedimientos"));
                modrh.setCapacitaciones(rs.getString("Capacitaciones"));
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

    public boolean registrar(ModRecursosHumanos modrh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modificar(ModRecursosHumanos modrh, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
