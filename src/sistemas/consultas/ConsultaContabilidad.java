
package sistemas.consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemas.modelos.ModContabilidad;
import sistemas.modelos.ModOpDiarias;


public class ConsultaContabilidad {

    private String Informes;

    public boolean Registrar(ModContabilidad modconta){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbnegocio.ModContabilidad (proveedor, producto, descripcion) VALUES(?,?,?)";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modconta.getInformes());
            ps.setString(2, modconta.getPresupuestos());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    } 
    
    public boolean modificar(ModContabilidad modconta){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Update dbnegocio.ModContabilidad set Informes='"+Informes+"' where ModContabilidad = '"+modconta.getInformes()+"';";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modconta.getInformes());
            ps.setString(2, modconta.getPresupuestos());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean eliminar(ModContabilidad modconta) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM dbnegocio.ModContabilidad WHERE id=? ";
        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modconta.getInformes());
            ps.setString(2, modconta.getPresupuestos());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
    public boolean buscar(ModContabilidad modconta) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM dbnegocio.ModContabilidad WHERE Contabilidad=? ";

        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modconta.getInformes());
            ps.setString(2, modconta.getPresupuestos());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                modconta.setInformes(rs.getString("Informes"));
                modconta.setPresupuestos(rs.getString("Presupuestos"));
                
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

    public boolean modificar(ModContabilidad modconta, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean registrar(ModContabilidad modconta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
