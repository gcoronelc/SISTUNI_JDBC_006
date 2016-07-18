
package pe.eth.Travisaapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARLOS
 */
public class fecha {
    public static java.sql.Date deStringaDate(String fecha){
       SimpleDateFormat sdf= new SimpleDateFormat("yyy-MM-dd");
        java.util.Date d1=new java.util.Date();//fecha del sistema
        try {
            d1=sdf.parse(fecha);//d1 tiene la fecha del string
            
        } catch (ParseException ex) {
          Logger.getLogger(fecha.class.getName()).log(Level.SEVERE,null,ex);
          
        }
        java.sql.Date d2=new java.sql.Date(d1.getTime());
        return d2;
        
    }
}
