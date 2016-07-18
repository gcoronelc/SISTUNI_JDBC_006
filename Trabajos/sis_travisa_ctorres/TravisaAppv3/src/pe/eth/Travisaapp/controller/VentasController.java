
package pe.eth.Travisaapp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javax.swing.JOptionPane;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.DetalleVenta;
import pe.eth.Travisaapp.domain.ventas;
import pe.eth.Travisaapp.service.impl.DetalleVentaServiceImpl;
import pe.eth.Travisaapp.service.impl.VentaServiceImpl;
import pe.eth.Travisaapp.util.Mensaje;

/**
 *
 * @author CARLOS
 */
public class VentasController {

    public static boolean registrarPedido(ventas ve, ArrayList<DetalleVenta> list) throws SQLException {
        Connection cn = AccesoDB.getConnection();
        boolean flag = false;
        try {
            cn.setAutoCommit(false);
            //for (int i = 0; i < list.size(); i++) {
                //actualizar la tabla productos:
                //1.leemos los valores de cantidad y idprod del arraylist
                for (DetalleVenta dv : list) {
                    String idprovendido = dv.getIDPRODUCTO();
                    int cantidadPedida = dv.getCANTIDAD();
                    //2.hacemos una consulta a la tabla productos con el codigo del producto a vender
                    String sql = "select stock from producto where idproducto=?";
                    PreparedStatement ps = cn.prepareStatement(sql);
                    ps.setString(1, idprovendido);
//retorna una fila con el producto del codigo pedido
                    ResultSet rs = ps.executeQuery();
               //3.leemos de la table producto el stock con el idproducto a vender 
                    if (rs.next()) {
                        if (cantidadPedida > rs.getInt("STOCK")) {
                      throw new Exception("No hay suficiente stock para el producto con codigo");
                        }
                        //4. si la cantidad es menor a la que hay en stcok entonces actualizamos el stock de la tabla producto
                        sql = "update producto set stock=stock-? where idproducto=?";
                        ps = cn.prepareStatement(sql);
                        ps.setInt(1, cantidadPedida);
                        ps.setString(2, idprovendido);
                        int filas = ps.executeUpdate();
                        if (filas < 1) {
                            throw new Exception("error la venta no se pudo realizar");
                        }
                    }
                    ps.close();
                    rs.close();
                }
            //}
            //insertar un registro en la tabla ventas
            VentaServiceImpl vsi = new VentaServiceImpl();
            vsi.insertar(ve);
            //recorrer el arreglo de detalles e insertar cada uno de los detalles
            for (DetalleVenta d : list) {
                DetalleVentaServiceImpl dvsi = new DetalleVentaServiceImpl();
                dvsi.insertar(d);
            }
            //si los inserts fueron exitosos entonces hacer un commit
            cn.commit();
            flag = true;
            cn.close();

        } catch (Exception ex) {
            try {
                //en caso de tener errores hacer un roolback
                cn.rollback();
            } catch (SQLException ex1) {
                System.out.println("pedido no registrado" + ex1);
            }
        }
        return flag;
    }

    public static int obteneridventa() {
        int cod = 0;
        VentaServiceImpl vsi = new VentaServiceImpl();
        try {
            //Connection cn= AccesoDB.getConnection();

            cod = vsi.obteneridventa();
        } catch (Exception ex) {
            Logger.getLogger(VentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;
    }

    public static ArrayList<ventas> ventasporfecha(String fecha) {
VentaServiceImpl vsi= new VentaServiceImpl();
return vsi.buscarporfecha(fecha);

    }
}
