
package sistemas.consultas;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemas.modelos.ModInventario;


public class ConsultaInventario extends Conexion{

    private String proveedor;
    public boolean Registrar(ModInventario inv){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO dbnegocio.ModInventario (proveedor, producto, descripcion) VALUES(?,?,?)";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, inv.getProveedor());
            ps.setString(2, inv.getProducto());
            ps.setInt(3, inv.getCantidad());
            ps.setInt(4, inv.getPrecio());
            ps.setString(5, inv.getAlmacenamiento());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    } 
    
    public boolean modificar(ModInventario inv){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Update dbnegocio.ModInventario set proveedor='"+proveedor+"' where ModInventario = '"+inv.getProducto+"';";
        try{
            ps = con.preparedStatement(sql);
            ps.setString(1, inv.getProveedor());
            ps.setString(2, inv.getProducto());
            ps.setInt(3, inv.getCantidad());
            ps.setInt(4, inv.getPrecio());
            ps.setString(5, inv.getAlmacenamiento());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean eliminar(ModInventario inv) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM dbnegocip.ModInventario WHERE id=? ";
        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, inv.getProveedor());
            ps.setString(2, inv.getProducto());
            ps.setInt(3, inv.getCantidad());
            ps.setInt(4, inv.getPrecio());
            ps.setString(5, inv.getAlmacenamiento());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }
    }
    
    public boolean buscar(ModInventario inv) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM dbnegocio.ModInventario WHERE Inventario=? ";

        try {
            ps = con.preparedStatement(sql);
            ps.setString(1, inv.getProveedor());
            ps.setString(2, inv.getProducto());
            ps.setInt(3, inv.getCantidad());
            ps.setInt(4, inv.getPrecio());
            ps.setString(5, inv.getAlmacenamiento());
            ps.execute();
            rs = ps.executeQuery();

            if (rs.next()) {
                inv.setProveedor(rs.getString("Proveedor"));
                inv.setProducto(rs.getString("Producto"));
                inv.setCantidad(Integer.parseInt(rs.getString("Cantidad")));
                inv.setPrecio(Integer.parseInt(rs.getString("Precio")));
                inv.setAlmacenamiento(rs.getString("Almacenamiento"));
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

    public boolean modificar(ModInventario modInventario, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean registrar(ModInventario modInventario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
