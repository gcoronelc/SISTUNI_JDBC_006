package pe.eth.Travisaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.espec.EmpleadoServiceEspec;
public class EmpleadoServiceImpl implements EmpleadoServiceEspec{
  
 // private final String SQL_SELECT = "Select idEmpleado,Nombre,Apellidos,Email,Usuario from Empleados";
  private final String SQL_SELECT = "Select idEmpleado,Nombre,Apellidos,Email,Usuario from Empleado";
  private final String SQL_INSERT = " ";
  private final String SQL_UPDATE = " ";
  private final String SQL_DELETE = " ";
  

  @Override
  public Empleado validar(String usuario, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      // Obtener el objeto Connection
      cn = AccesoDB.getConnection();
      // Preparar la sentencia
     // String sql = SQL_SELECT + "where Usuario = ? and Clave = ?";
      String sql = SQL_SELECT + " where Usuario = ? and Clave = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if(!rs.next()){
        throw  new SQLException("Datos incorrectos.");
      }
      bean = rowToBean(rs);
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      throw  new RuntimeException(e.getMessage());
    } catch (Exception e) {
      String texto = "No se tiene acceso al servidor.";
      if(e != null && !e.getMessage().isEmpty()){
        texto += "\n" + e.getMessage();
      }
      throw  new RuntimeException(texto);
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    
    return bean;
  }
//buscar empleado por id
 
  @Override
  public  String insertar(Empleado bean) {
   String mensaje=null;
      String sql="insert into empleado( IDEMPLEADO,NOMBRE,APELLIDOS,EMAIL,USUARIO,CLAVE) values(?,?,?,?,?,?)";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          ps.setString(1, bean.getIdEmpleado());
          ps.setString(2, bean.getNombre());
          ps.setString(3, bean.getApellidos());
          ps.setString(4, bean.getEmail());
          ps.setString(5, bean.getUsuario());
          ps.setString(6, bean.getClave());
ps.executeUpdate();

      } 
     
      catch (SQLException ex) {
//          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
mensaje= ex.getMessage();
      }
      return mensaje;
  }

  @Override
  public  String update(Empleado bean) {
String mensaje=null;
      String sql="update empleado set NOMBRE=?,APELLIDOS=?,EMAIL=?,USUARIO=?,CLAVE=? where IDEMPLEADO=? ";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          ps.setString(1, bean.getNombre());
          ps.setString(2, bean.getApellidos());
          ps.setString(3, bean.getEmail());
          ps.setString(4, bean.getUsuario());
          ps.setString(5, bean.getClave());
          ps.setString(6, bean.getIdEmpleado());
ps.executeUpdate();

      } 
     
      catch (SQLException ex) {
//          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
mensaje= ex.getMessage();
      }
      return mensaje;
  }

  @Override
  public String delete(String codigo) {
String mensaje=null;
      String sql="delete from empleado where IDEMPLEADO=? ";
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
  public Empleado leer(String codigo) {
    Empleado emp=null;
      String sql="select *from empleado where idempleado=?";
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps=cn.prepareStatement(sql);
          
          ps.setString(1, codigo);
          ResultSet rs= ps.executeQuery();
          while(rs.next()){
              emp= new Empleado();
              emp.setIdEmpleado(rs.getString(1));
              emp.setNombre(rs.getString(2));
              emp.setApellidos(rs.getString(3));
              emp.setEmail(rs.getString(4));
              emp.setUsuario(rs.getString(5));
              emp.setClave(rs.getString(6));
          }
          ps.close();
          rs.close();
          cn.close();
      } catch (SQLException ex) {
          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      return emp;
  }

  @Override
  public List<Empleado> leerVarios(Empleado bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  //retorna un objeto empleado
  public Empleado rowToBean(ResultSet rs) throws SQLException {
    Empleado bean = new Empleado();
    bean.setIdEmpleado(rs.getString("idEmpleado"));
    bean.setApellidos(rs.getString("Apellidos"));
    bean.setNombre(rs.getString("Nombre"));
    bean.setUsuario(rs.getString("Usuario"));
    bean.setEmail(rs.getString("Email"));
    return bean;
  }

    @Override
    public Empleado buscar(String codigo) {
String sql="select IDEMPLEADO from empleado where IDEMPLEADO=?";
Empleado emp=null;
      try {
          Connection cn= AccesoDB.getConnection();
          PreparedStatement ps= cn.prepareStatement(sql);
   ps.setString(1, codigo);
    ResultSet rs=  ps.executeQuery();
    if(rs.next()){
        emp= new Empleado();
        emp.setIdEmpleado(rs.getString(1));
    }
      } catch (SQLException ex) {
          Logger.getLogger(EmpleadoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      return emp;
    }

    @Override
    public ArrayList<Empleado> listabuscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
