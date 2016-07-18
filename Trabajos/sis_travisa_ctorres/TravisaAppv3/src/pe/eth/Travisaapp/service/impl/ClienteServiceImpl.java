
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
import pe.eth.Travisaapp.service.espec.ClienteServiceEspec;
import pe.eth.Travisaapp.service.espec.EmpleadoServiceEspec;

/**
 *
 * @author CARLOS
 */
public class ClienteServiceImpl implements ClienteServiceEspec{

    @Override
    public String insertar(Cliente bean) {
String mensaje=null;
Connection cn=null;
String sql="insert into cliente(IDCLIENTE,NOMBRE,DIRECCION,RUCDNI,TELEFONO) VALUES(?,?,?,?,?)";
        try {
            cn=AccesoDB.getConnection();
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setString(1, bean.getIDCLIENTE());
            pst.setString(2, bean.getNOMBRE());
            pst.setString(3, bean.getDIRECCION());
            pst.setString(4, bean.getRUCDNI());
            pst.setString(5, bean.getTELEFONO());
            pst.executeQuery();
        } catch (SQLException ex) {
mensaje= ex.getMessage();
        }
        return mensaje;
    }

    @Override
    public String update(Cliente bean) {
String mensaje=null;
String sql="updtate cliente set  IDCLIENTE=?,NOMBRE=?,DIRECCION=?,RUCDNI=?,TELEFONO=? where IDCLIENTE=?" ;
Connection cn=null;        
try {
            cn=AccesoDB.getConnection();
  PreparedStatement ps=cn.prepareStatement(sql);
  ps.setString(1, bean.getIDCLIENTE());
  ps.setString(2, bean.getNOMBRE());
  ps.setString(3, bean.getDIRECCION());
  ps.setString(4, bean.getRUCDNI());
  ps.setString(5, bean.getTELEFONO());
  ps.executeUpdate();
        } catch (Exception e) {
        mensaje= e.getMessage();
        }
return mensaje;
    }

    @Override
    public String delete(String codigo) {
String mensaje=null;
      String sql="delete from cliente where IDCLIENTE=? ";
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
    public Cliente buscar(String codigo) {

      Cliente cli=null;
      String sql="select *from cliente where idcliente = ?";
        
        try {
            Connection cn= AccesoDB.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,codigo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
              cli= new Cliente();
              cli.setIDCLIENTE(rs.getString(1));
              cli.setNOMBRE(rs.getString(2));
              cli.setDIRECCION(rs.getString(3));
              cli.setRUCDNI(rs.getString(4));
              cli.setTELEFONO(rs.getString(5));
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
        return null;
        }
        return cli;
    }

    @Override
    public ArrayList<Cliente> listabuscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente leer(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> leerVarios(Cliente bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente rowToBean(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
