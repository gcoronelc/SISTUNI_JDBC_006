package pe.eth.Travisaapp.service.espec;

import pe.eth.Travisaapp.domain.Empleado;

public interface EmpleadoServiceEspec 
        extends CrudServiceEspec<Empleado>, RowMapper<Empleado>{
  
  Empleado validar(String usuario, String clave);
  
}
