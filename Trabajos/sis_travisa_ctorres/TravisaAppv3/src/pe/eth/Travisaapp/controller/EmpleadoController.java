
package pe.eth.Travisaapp.controller;

import javax.swing.JOptionPane;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.espec.EmpleadoServiceEspec;
import pe.eth.Travisaapp.service.impl.EmpleadoServiceImpl;

/**
 *
 * @author CARLOS
 */
public class EmpleadoController {
    
    public static Empleado buscarEmpleado(String id) {
        Empleado emp = null;
        EmpleadoServiceImpl obj = new EmpleadoServiceImpl();
        emp = obj.leer(id);

        if (emp == null) {
            mensaje("empleado no existe con ese codigo..¡¡", "error");
        }
        return emp;

    }
    private static void mensaje(String msj, String tipo) {
               JOptionPane.showMessageDialog(null, msj,tipo,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void insertarEmpleado(Empleado emp) {
EmpleadoServiceImpl obj= new EmpleadoServiceImpl();
String mensaje=obj.insertar(emp);
if(mensaje==null){
    cuadromensaje("empleado se registro con exito..!!");
    
}
else{
    cuadromensaje("empleado no se registro..");
}
    }

    private static void cuadromensaje(String msj) {
JOptionPane.showMessageDialog(null,msj);
    }

    public static void updateEmpleado(Empleado emp) {
EmpleadoServiceEspec obj= new EmpleadoServiceImpl();
String mensaje= obj.update(emp);

if(mensaje==null){
    cuadromensaje("empleado se actualizo con exito..!!");
    
}
else{
    cuadromensaje("empleado no se pudo actualizar");
}
    }

    public static void eliminarempleado(String codigo) {
        EmpleadoServiceEspec obj= new EmpleadoServiceImpl();
String mensaje= obj.delete(codigo);

if(mensaje==null){
    cuadromensaje("empleado se elimino con exito..!!");
    
}
else{
    cuadromensaje("empleado no se pudo eliminar");
}
    }
    
}
