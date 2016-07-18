
package pe.eth.Travisaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.DetalleVenta;
import pe.eth.Travisaapp.service.espec.DetalleVentaServiceEspec;

/**
 *
 * @author CARLOS
 */
public class DetalleVentaServiceImpl implements DetalleVentaServiceEspec{

    @Override
    public String insertar(DetalleVenta bean) {
        String mensaje= null;
     String sql="insert into detalleventa(idventa,idproducto,precio,cantidad,importe)values(?,?,?,?,?)";
      
       try {
           Connection cn= AccesoDB.getConnection();
           PreparedStatement ps= cn.prepareStatement(sql);
           ps.setInt(1, bean.getIDVENTA());
           ps.setString(2, bean.getIDPRODUCTO());
           ps.setDouble(3, bean.getPRECIO());
           ps.setInt(4, bean.getCANTIDAD());
           ps.setDouble(5, bean.getIMPORTE());
           ps.executeUpdate();
//           cn.close();
//           ps.close();
       } catch (SQLException ex) {
        
       }
   return mensaje;
    }

    @Override
    public String update(DetalleVenta bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleVenta buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DetalleVenta> listabuscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleVenta leer(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetalleVenta> leerVarios(DetalleVenta bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleVenta rowToBean(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
