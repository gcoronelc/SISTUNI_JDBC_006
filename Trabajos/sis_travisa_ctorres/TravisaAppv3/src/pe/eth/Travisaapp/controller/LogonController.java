package pe.eth.Travisaapp.controller;

import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.espec.EmpleadoServiceEspec;
import pe.eth.Travisaapp.service.impl.EmpleadoServiceImpl;
import pe.eth.Travisaapp.util.Memoria;
public class LogonController {
  
  public boolean validar(String usuario, String clave) {
      boolean v;
    EmpleadoServiceEspec service;
    service = new EmpleadoServiceImpl();
    Empleado bean = service.validar(usuario, clave);
    Memoria.put("usuario", bean);
    if(bean==null){
        v=false;
    }
    else{
        v=true;
    }
    return v;
  }
  
  
    
//  public void validar(String usuario, String clave) {
//    
//    EmpleadoServiceEspec service;
//    service = new EmpleadoServiceImpl();
//    Empleado bean = service.validar(usuario,clave);
//    Memoria.put("usuario", bean);
//   
//  }
}
