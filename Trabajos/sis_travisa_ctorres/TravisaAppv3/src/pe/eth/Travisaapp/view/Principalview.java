

package pe.eth.Travisaapp.view;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import pe.eth.Travisaapp.db.AccesoDB;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.impl.Mensaje;
import pe.eth.Travisaapp.util.Memoria;

/**
 *
 * @author Alumno
 */
public class Principalview extends javax.swing.JFrame {

 /**
  * Creates new form Principalview
  */
    
 public Principalview() {
  initComponents();
  setExtendedState(MAXIMIZED_BOTH);
  establecerTitulo();
 
 }
  
  private void establecerTitulo(){
    Empleado bean = (Empleado) Memoria.get("usuario");
    String titulo = "TRAVISA   [Usuario:" + bean.getUsuario() + "]";
    this.setTitle(titulo);
    
  }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        reportelistadeprecios = new javax.swing.JMenuItem();
        reporteventasporfecha = new javax.swing.JMenuItem();
        ReporteClientes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL EMPRESARIAL");

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/logo_travisa_1.jpg"))); // NOI18N
        jLabel1.setOpaque(true);

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Cliente.png"))); // NOI18N
        jMenuItem1.setMnemonic('c');
        jMenuItem1.setText("Clientes");
        jMenuItem1.setToolTipText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Business_People.png"))); // NOI18N
        jMenuItem2.setText("Empleados");
        jMenuItem2.setToolTipText("Empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/categoria.png"))); // NOI18N
        jMenuItem3.setText("Categoria");
        jMenuItem3.setToolTipText("Categorias");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/shopping_cart.png"))); // NOI18N
        jMenuItem4.setText("Productos");
        jMenuItem4.setToolTipText("Prodcutos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Vista Users.png"))); // NOI18N
        jMenuItem5.setText("Proveedores");
        jMenuItem5.setToolTipText("Proveedores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/old-go-previous.png"))); // NOI18N
        jMenuItem6.setText("Salir");
        jMenuItem6.setToolTipText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        menuBar.add(jMenu1);

        jMenu2.setText("Procesos");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/shopping_cart.png"))); // NOI18N
        jMenuItem7.setText("Compras");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/libro_azul.png"))); // NOI18N
        jMenuItem8.setText("Pedidos");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/monedas_24x24.png"))); // NOI18N
        jMenuItem9.setText("Ventas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        menuBar.add(jMenu2);

        jMenu3.setText("Consultas");

        jMenuItem10.setText("Productos Todo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Productos por Linea");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Productos por Nombre");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Productos por proveedor");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        menuBar.add(jMenu3);

        jMenu4.setText("Reportes");

        reportelistadeprecios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        reportelistadeprecios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/US-dollar.png"))); // NOI18N
        reportelistadeprecios.setText("Lista de precios");
        reportelistadeprecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportelistadepreciosActionPerformed(evt);
            }
        });
        jMenu4.add(reportelistadeprecios);

        reporteventasporfecha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        reporteventasporfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/view_icon.png"))); // NOI18N
        reporteventasporfecha.setText("Ventas por Fecha");
        reporteventasporfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteventasporfechaActionPerformed(evt);
            }
        });
        jMenu4.add(reporteventasporfecha);

        ReporteClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/Cliente.png"))); // NOI18N
        ReporteClientes.setText("Lista de Clientes");
        ReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteClientesActionPerformed(evt);
            }
        });
        jMenu4.add(ReporteClientes);

        menuBar.add(jMenu4);

        jMenu5.setText("Utilitarios");
        menuBar.add(jMenu5);

        jMenu6.setText("Ayuda");

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/valores.png"))); // NOI18N
        jMenuItem16.setText("Indice");
        jMenu6.add(jMenuItem16);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/help.png"))); // NOI18N
        jMenuItem17.setText("Acerca de");
        jMenu6.add(jMenuItem17);

        menuBar.add(jMenu6);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void reporteventasporfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteventasporfechaActionPerformed
//reporteVentasPorFecha f= new reporteVentasPorFecha();
//desktopPane.add(f);
//f.show();
cargarFormulario(reporteVentasPorFecha.class);
 }//GEN-LAST:event_reporteventasporfechaActionPerformed

 private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
  productostodoView f = new productostodoView();
  desktopPane.add(f);
  f.show();
 }//GEN-LAST:event_jMenuItem10ActionPerformed

 private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
  productoxlineaView f=null;
     try {
         f = new productoxlineaView();
     } catch (Exception ex) {
         Logger.getLogger(Principalview.class.getName()).log(Level.SEVERE, null, ex);
     }
  desktopPane.add(f);
  f.show();
 }//GEN-LAST:event_jMenuItem11ActionPerformed

 private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
  productoxnombreView f = new productoxnombreView();
  desktopPane.add(f);
  f.show();
 }//GEN-LAST:event_jMenuItem12ActionPerformed

 private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
  productomanview f = new productomanview();
  desktopPane.add(f);
  f.show();
 }//GEN-LAST:event_jMenuItem4ActionPerformed

 private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
  VentasView f = new VentasView();
  desktopPane.add(f);
  f.show();
 }//GEN-LAST:event_jMenuItem9ActionPerformed

 private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
  empleadomanView f = new empleadomanView();
  desktopPane.add(f);
  f.show();
 }//GEN-LAST:event_jMenuItem2ActionPerformed

 private void reportelistadepreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportelistadepreciosActionPerformed
//  try {
//   InformeView app = new InformeView("/pe/eth/Travisaapp/reports/reportedeprecios.jasper");
//   app.setBounds(0, 0, desktopPane.getWidth(), desktopPane.getHeight());
//   app.setVisible(true);
//   desktopPane.add(app);
//   app.setSelected(true);
//  } catch (Exception ex) {
//    //Logger.getLogger(reporteView.class.getName()).log(Level.SEVERE, null, ex);
//  }

 Connection cn=null;
        try {

	// Usando el archivo JRXML y el objeto Connection
	          cn = AccesoDB.getConnection();
	          Map pars = new HashMap();
                  String rutareporte="/pe/eth/Travisaapp/reports/reportedeprecios.jrxml";
                  InputStream isrepodeprecios=getClass().getResourceAsStream(rutareporte);
	          JasperReport rep = JasperCompileManager.compileReport(isrepodeprecios);
                  //reporte para mostrar
	          JasperPrint print = JasperFillManager.fillReport(rep, pars, cn);

	// Visualizando el Reporte
	          JasperViewer viewer = new JasperViewer(print, false);
	viewer.setTitle("Reporte de precios");
	viewer.setVisible(true);

	//JasperViewer.viewReport(print);
	
} catch (Exception ex) {
    //ex.printStackTrace();
	         //JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRORE", JOptionPane.ERROR_MESSAGE);
Mensaje.showError(rootPane,ex.getMessage());

}
finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
 
 }//GEN-LAST:event_reportelistadepreciosActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // salir
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
ClientemanView f = new ClientemanView();
  desktopPane.add(f);
  f.show();    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteClientesActionPerformed
       Connection cn=null;
        try {

	// Usando el archivo JRXML y el objeto Connection
	          cn = AccesoDB.getConnection();
	          Map pars = new HashMap();
                  Empleado emp=(Empleado) Memoria.get("usuario");
               pars.put("USUARIO", emp.getNombre()+"," +emp.getApellidos());
               
                  String rutareporte="/pe/eth/Travisaapp/reports/reporteclientes.jrxml";
                  InputStream isrepoclientes=getClass().getResourceAsStream(rutareporte);
	          JasperReport rep = JasperCompileManager.compileReport(isrepoclientes);
                  //reporte para mostrar
	          JasperPrint print = JasperFillManager.fillReport(rep, pars, cn);

	// Visualizando el Reporte
	          JasperViewer viewer = new JasperViewer(print, false);
	viewer.setTitle("Reporte de Clientes");
	viewer.setVisible(true);

	//JasperViewer.viewReport(print);
	
} catch (Exception ex) {
    //ex.printStackTrace();
	         //JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRORE", JOptionPane.ERROR_MESSAGE);
Mensaje.showError(rootPane,ex.getMessage());

}
finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
 
    }//GEN-LAST:event_ReporteClientesActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

 /**
  * @param args the command line arguments
  */
 public static void main(String args[]) {
  /*
   * Set the Nimbus look and feel
   */
  //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
   * If Nimbus (introduced in Java SE 6) is not available, stay with the default
   * look and feel. For details see
   * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
   */
  try {
   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
    }
   }
  } catch (ClassNotFoundException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>
  //</editor-fold>

  /*
   * Create and display the form
   */
  java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
   public void run() {
    new Principalview().setVisible(true);
   }
  });
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ReporteClientes;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem reportelistadeprecios;
    private javax.swing.JMenuItem reporteventasporfecha;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario(Class<?> aClass) {

         try {
      // Buscar una instancia
      JInternalFrame view = null;
      for (JInternalFrame frame : desktopPane.getAllFrames()) {
        if (aClass.isInstance(frame)) {
          view = frame;
          break;
        }
      }
      // Crear la instancia
      if (view == null) {
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
      }
      // Hacerlo visible
      view.setVisible(true);
      view.setSelected(true);
      view.setMaximum(true);
    } catch (Exception e) {
    }

    }

  
}
