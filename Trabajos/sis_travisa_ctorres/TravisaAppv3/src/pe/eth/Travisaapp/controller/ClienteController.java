
package pe.eth.Travisaapp.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.espec.ClienteServiceEspec;
import pe.eth.Travisaapp.service.impl.ClienteServiceImpl;
import pe.eth.Travisaapp.service.impl.EmpleadoServiceImpl;

/**
 *
 * @author CARLOS
 */
public class ClienteController {

    public static Cliente BuscarClientexCodigo(String codigo) {
       Cliente cli= null;
        ClienteServiceEspec objcsi=new ClienteServiceImpl();
        cli=objcsi.buscar(codigo);
         if (cli == null) {
            mensaje("cliente no existe con ese codigo..¡¡", "error");
        }
        return cli;
                
    }

    private static void mensaje(String msj, String tipo) {
               JOptionPane.showMessageDialog(null, msj,tipo,JOptionPane.INFORMATION_MESSAGE);

    }

    public static void eliminarCliente(String codigo) {
ClienteServiceEspec obj= new ClienteServiceImpl();
String mensaje=obj.delete(codigo);
    if(mensaje==null){
        cuadromensaje("cliente se elimino con exito...!!");
    }
        cuadromensaje("cliente no se pudo eliminar..");
    }

    private static void cuadromensaje(String msj) {
    JOptionPane.showMessageDialog(null,msj);

    }

    public static void updateCliente(Cliente cli) {

        ClienteServiceEspec obj= new ClienteServiceImpl();
        String msje=obj.update(cli);
        if(msje==null){
            cuadromensaje("cliente se actualizo con exito..!!");
        }
        else{
            cuadromensaje("cliente no se pudo actualizar");
        }
    }

    public static void insertarCliente(Cliente cli) {
ClienteServiceEspec obj= new ClienteServiceImpl();
String mensaje=obj.insertar(cli);
if(mensaje==null){
    cuadromensaje("cliente se registro con exito..!!");
}
else{
    cuadromensaje("cliente no se registro");
}
    }

    

    }
    

