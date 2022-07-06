
package sistemas.consultas;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemas.modelos.ModOpMensuales;


public class ConsultaOpMensuales {
    
    public boolean Registrar(ModOpMensuales modopmen){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbnegocio.ModOpMensuales (analisis, informes, mantenimiento) VALUES(?,?,?)";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modopmen.getAnalisis());
            ps.setString(2, modopmen.getInformes());
            ps.setString(3, modopmen.getMantenimiento());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    } 
    
    public boolean modificar(ModOpMensuales modopmen){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Update dbnegocio.ModOpMensuales set analisis='"+analisis+"' where ModOpMensuales = '"+modopmen.getAnalisis()+"';";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, modopmen.getAnalisis());
            ps.setString(2, modopmen.getInformes());
            ps.setString(3, modopmen.getMantenimiento());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean eliminar(ModOpMensuales modopmen) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM dbnegocio.ModOpMensuales WHERE id=? ";
        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modopmen.getAnalisis());
            ps.setString(2, modopmen.getInformes());
            ps.setString(3, modopmen.getMantenimiento());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
    public boolean buscar(ModOpMensuales modopmen) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM dbnegocio.ModOpMensuales WHERE Inventario=? ";

        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, modopmen.getAnalisis());
            ps.setString(2, modopmen.getInformes());
            ps.setString(3, modopmen.getMantenimiento());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                modopmen.setAnalisis(rs.getString("Analisis"));
                modopmen.setInformes(rs.getString("Informes"));
                modopmen.setMantenimiento(rs.getString("Mantenimiento"));
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

    public boolean registrar(ModOpMensuales modopmen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modificar(ModOpMensuales modopmen, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

