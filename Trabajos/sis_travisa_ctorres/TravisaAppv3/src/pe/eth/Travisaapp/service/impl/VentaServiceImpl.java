
package pe.eth.Travisaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.ventas;
import pe.eth.Travisaapp.service.espec.VentaServiceEspec;
import pe.eth.Travisaapp.util.fecha;

/**
 *
 * @author CARLOS
 */
public class VentaServiceImpl implements VentaServiceEspec{

    @Override
    public String insertar(ventas bean) {

        String mensaje = null;
        String sql = "insert into venta(idventa,idcliente,idempleado,fecha,total) values(?,?,?,?,?)";

        try {
            Connection cn = AccesoDB.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, bean.getIDVENTA());
            ps.setString(2, bean.getIDCLIENTE());
            ps.setString(3, bean.getIDEMPLEADO());
            ps.setDate(4, fecha.deStringaDate(bean.getFECHA()));
            ps.setDouble(5, bean.getTOTAL());

            ps.executeUpdate();

//          cn.close();
//            ps.close();
        } catch (SQLException ex) {

        }
        return mensaje;
    }

    @Override
    public String update(ventas bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ventas buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ventas> listabuscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ventas leer(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ventas> leerVarios(ventas bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ventas rowToBean(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int obteneridventa() {
        int idventa = 0;
        try {
            Connection cn = AccesoDB.getConnection();
            String sql = "select distinct max(idventa) from detalleventa";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idventa = rs.getInt(1) + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idventa;

    }

    public ArrayList<ventas> buscarporfecha(String fecha) {
       Connection cn=null;
       ventas v=null;
       ArrayList<ventas> lista=null;
        try {
             cn= AccesoDB.getConnection();
            String sql="select *from venta where fecha=?";
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1, fecha);
          ResultSet rs=  ps.executeQuery();
            while(rs.next()){
                v= new ventas();
                v.setIDVENTA(rs.getInt(1));
                v.setIDCLIENTE(rs.getString(2));
                v.setIDEMPLEADO(rs.getString(3));
                v.setFECHA(rs.getString(4));
                v.setTOTAL(rs.getDouble(5));
            lista.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
