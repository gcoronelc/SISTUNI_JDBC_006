package pe.egcc.eurekaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.egcc.eurekaapp.db.AccesoDB;
import pe.egcc.eurekaapp.service.espec.CuentaServiceEspec;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class CuentaServiceImpl implements CuentaServiceEspec {

  @Override
  public void doDeposito(String cuenta, double importe, String codEmp) {
    Connection cn = null;
    try {
      // Abrir conexión
      cn = AccesoDB.getConnection();
      // Iniciar Tx
      cn.setAutoCommit(false);
      // Leer Saldo de la cuenta
      String sql = "select int_cuencontmov "
              + "from cuenta where chr_cuencodigo = ? "
              + "for update";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      ResultSet rs = pstm.executeQuery();
      if (!rs.next()) {
        throw new Exception("Cuenta no existe.");
      }
      int cont = rs.getInt("int_cuencontmov");
      rs.close();
      pstm.close();
      // Actualizar cuenta
      cont++;
      sql = "update cuenta "
              + "set dec_cuensaldo = dec_cuensaldo + ?, "
              + "int_cuencontmov = int_cuencontmov + 1 "
              + "where chr_cuencodigo = ? ";
      pstm = cn.prepareStatement(sql);
      pstm.setDouble(1, importe);
      pstm.setString(2, cuenta);
      int filas = pstm.executeUpdate();
      pstm.close();
      if (filas != 1) {
        throw new Exception("Error, la cuenta no se pudo actualizar.");
      }
      // Insertar el movimiento
      sql = "insert into movimiento(chr_cuencodigo, "
              + "int_movinumero,dtt_movifecha, "
              + "chr_emplcodigo,chr_tipocodigo, "
              + "dec_moviimporte)  "
              + "values(?,?,SYSDATE,?,'003',?)";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      pstm.setInt(2, cont);
      pstm.setString(3, codEmp);
      pstm.setDouble(4, importe);
      pstm.executeUpdate();
      pstm.close();
      // Confirmar TX
      cn.commit();
    } catch (Exception e) {
      String texto = "El proceso ha generado error.";
      if (e != null && !e.getMessage().isEmpty()) {
        texto += "\n" + e.getMessage();
      }
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      throw new RuntimeException(texto);
    } finally {
      try {
        // Cerrando la CN
        cn.close();
      } catch (Exception e) {
      }
    }
  }

}
