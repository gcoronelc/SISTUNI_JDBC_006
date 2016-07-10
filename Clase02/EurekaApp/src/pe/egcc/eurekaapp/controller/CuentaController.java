package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.domain.Empleado;
import pe.egcc.eurekaapp.service.espec.CuentaServiceEspec;
import pe.egcc.eurekaapp.service.impl.CuentaServiceImpl;
import pe.egcc.eurekaapp.util.Memoria;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class CuentaController {

  public void procDeposito(String cuenta, double importe) {
    // Obtener el codigo del empleado
    Empleado bean = (Empleado) Memoria.get("usuario");
    // Proceso
    CuentaServiceEspec service = new CuentaServiceImpl();
    service.doDeposito(cuenta, importe, bean.getCodigo());
  }
  
}
