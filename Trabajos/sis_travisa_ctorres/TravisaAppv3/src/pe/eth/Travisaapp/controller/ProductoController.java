
package pe.eth.Travisaapp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.domain.Producto;
import pe.eth.Travisaapp.service.espec.ProductoServiceEspec;
import pe.eth.Travisaapp.service.impl.ProductoServiceImpl;


public class ProductoController {

    public static ArrayList<Producto> listarProducto(String inicialesprod) {
        ArrayList<Producto> list ;
        ProductoServiceImpl obj= new ProductoServiceImpl();
        
        list = obj.listabuscar(inicialesprod);

        return list; 
    }

    public static Producto leertodos() {
return null;
    }

    public static void agregar(Producto p) {
       String mensaje=null;
        ProductoServiceEspec obj= new ProductoServiceImpl();
      mensaje=  obj.insertar(p);
        if(mensaje==null){
            cuadromensaje("producto ingresado exitosamente..!!");
            
        }
        else{
            cuadromensaje("producto no se pudo ingresar..");
        }
        
    }

    private static void cuadromensaje(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

    public static void update(Producto p) {
 String mensaje=null;
        ProductoServiceEspec obj= new ProductoServiceImpl();
      mensaje=  obj.update(p);
        if(mensaje==null){
            cuadromensaje("producto modificado exitosamente..!!");
            
        }
        else{
            cuadromensaje("producto no se pudo modificar..");
        }
    
    }

    public static Producto buscar(String idpro) {
        ProductoServiceEspec obj= new ProductoServiceImpl();
Producto p=obj.buscar(idpro);
if(p==null){
    cuadromensaje("no se encontro producto...");
}

 return p;
}

    public static void eliminar(String idpro) {
   String p=null;     
ProductoServiceEspec obj=new ProductoServiceImpl();
 p=obj.delete(idpro);
   if(p==null){
            cuadromensaje("producto eliminado exitosamente..!!");
            
        }
        else{
            cuadromensaje("producto no se pudo eliminar..");
        }
    }

 public static ArrayList<Producto> buscarpornombre(String nombre) {
ArrayList<Producto>pro=null;
 ProductoServiceEspec obj= new ProductoServiceImpl();
 pro=obj.listabuscar(nombre);
    if(pro==null){
            cuadromensaje("no se encontro producto..!!");
            
        }
      return pro;
 }
}
