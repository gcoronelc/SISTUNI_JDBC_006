package pe.eth.Travisaapp.prueba;

import java.sql.Connection;
import pe.eth.Travisaapp.db.AccesoDB;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    try {
      Connection cn = AccesoDB.getConnection();
      System.out.println("Conexión ok.");
      cn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
