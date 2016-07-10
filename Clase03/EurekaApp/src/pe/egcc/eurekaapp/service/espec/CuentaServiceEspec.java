package pe.egcc.eurekaapp.service.espec;

import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public interface CuentaServiceEspec {
  
  void doDeposito(String cuenta, double importe, String codEmp);
  
  Map<String,Object> datosCuenta(String cuenta);
  
  
}
