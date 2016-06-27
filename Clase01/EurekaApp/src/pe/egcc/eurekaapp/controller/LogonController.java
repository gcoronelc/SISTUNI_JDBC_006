package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.service.espec.EmpleadoServiceEspec;
import pe.egcc.eurekaapp.service.impl.EmpleadoServiceImpl;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class LogonController {
  
  public void validar(String usuario, String clave){
    EmpleadoServiceEspec service;
    service = new EmpleadoServiceImpl();
    service.validar(usuario, clave);
  }
  
}
