/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.domain.Producto;
import pe.eth.Travisaapp.service.espec.ProductoServiceEspec;

/**
 *
 * @author CARLOS
 */
public class ProductoServiceImpl implements ProductoServiceEspec{

    @Override
    public String insertar(Producto bean) {
        String mensaje=null;
        Connection cn=null;
        
            String sql="INSERT INTO PRODUCTO(IDPRODUCTO,DESCRIPCION,IDCATEGORIA,PRECIOVENTA,PRECIOCOMPRA,STOCK) VALUES(?,?,?,?,?,?)";
        try {
            cn=AccesoDB.getConnection();
              PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1, bean.getIDPRODUCTO());
            ps.setString(2, bean.getDESCRIPCION());
            ps.setInt(3, bean.getIDCATEGORIA());
            ps.setDouble(4, bean.getPRECIOVENTA());
            ps.setDouble(5, bean.getPRECIOCOMPRA());
            ps.setInt(6, bean.getSTOCK());
            ps.executeQuery();
        } catch (SQLException ex) {
            mensaje=ex.getMessage();
        }
   return mensaje;
    }

    @Override
    public String update(Producto bean) {
        Connection cn = null;
        String mensaje = null;

        try {

            String sql = "updtate producto set  IDPRODUCTO=?,DESCRIPCION=?,IDCATEGORIA=?,PRECIOVENTA=?,PRECIOCOMPRA=?,STOCK=? where IDPRODUCTO=? ";
            cn = AccesoDB.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, bean.getIDPRODUCTO());
            ps.setString(2, bean.getDESCRIPCION());
            ps.setInt(3, bean.getIDCATEGORIA());
            ps.setDouble(4, bean.getPRECIOVENTA());
            ps.setDouble(5, bean.getPRECIOCOMPRA());
            ps.setInt(6, bean.getSTOCK());
            ps.executeUpdate();
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
        }
        return mensaje;
    }

    @Override
    public String delete(String codigo) {
String mensaje=null;
      String sql="delete from producto where IDPRODUCTO=? ";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          ps.setString(1, codigo);
          ps.executeUpdate();
      } 
     
      catch (SQLException ex) {
mensaje= ex.getMessage();
      }
      return mensaje;
    }

    @Override
    public Producto buscar(String codigo) {
     Producto pro=null;
      String sql="select *from producto where idproducto = ?";
        Connection cn=null;
        try {
            cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
              pro= new Producto();
              pro.setIDPRODUCTO(rs.getString(1));
              pro.setDESCRIPCION(rs.getString(2));
              pro.setIDCATEGORIA(rs.getInt(3));
              pro.setPRECIOVENTA(rs.getInt(4));
              pro.setPRECIOCOMPRA(rs.getInt(5));
              pro.setSTOCK(rs.getInt(6));
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        return null;
        }
        return pro;
    }

    @Override
    public Producto leer(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> leerVarios(Producto bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto rowToBean(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> listabuscar(String nombre) {
    ArrayList<Producto> list = new ArrayList<>();
    String sql="select *from producto where descripcion like ?";
    Producto pro= null;
        try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1,nombre+'%');
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                pro= new Producto();
                pro.setIDPRODUCTO(rs.getString(1));
                pro.setDESCRIPCION(rs.getString(2));
                pro.setIDCATEGORIA(rs.getInt(3));
                pro.setPRECIOVENTA(rs.getInt(4));
                pro.setPRECIOCOMPRA(rs.getInt(5));
                pro.setSTOCK(rs.getInt(6));
                list.add(pro);
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
