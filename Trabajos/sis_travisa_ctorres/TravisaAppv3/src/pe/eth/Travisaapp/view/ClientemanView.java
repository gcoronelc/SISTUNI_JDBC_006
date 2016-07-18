/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eth.Travisaapp.view;

import pe.eth.Travisaapp.controller.ClienteController;
import pe.eth.Travisaapp.controller.EmpleadoController;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.domain.Empleado;

/**
 *
 * @author CARLOS
 */
public class ClientemanView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClientemanView
     */
    public ClientemanView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEtiquetas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtRucDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();

        setTitle("MANTENIMIENTO DE CLIENTES");

        panelEtiquetas.setBackground(new java.awt.Color(0, 204, 204));
        panelEtiquetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));

        jLabel1.setText("IDCliente");

        jLabel2.setText("Nombres ");

        jLabel3.setText("Direccion");

        jLabel4.setText("Ruc/Dni");

        jLabel5.setText("Telefono");

        javax.swing.GroupLayout panelEtiquetasLayout = new javax.swing.GroupLayout(panelEtiquetas);
        panelEtiquetas.setLayout(panelEtiquetasLayout);
        panelEtiquetasLayout.setHorizontalGroup(
            panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiquetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelEtiquetasLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelEtiquetasLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelefono))
                        .addGroup(panelEtiquetasLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(24, 24, 24)
                            .addComponent(txtRucDni)))
                    .addGroup(panelEtiquetasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEtiquetasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEtiquetasLayout.setVerticalGroup(
            panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiquetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRucDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelBotones.setLayout(new java.awt.GridLayout(1, 0));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/add.png"))); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelBotones.add(btnInsertar);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/running_process.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        panelBotones.add(btnActualizar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelBotones.add(btnEliminar);

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        panelBotones.add(BtnBuscar);

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/salir.png"))); // NOI18N
        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        panelBotones.add(BtnCerrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEtiquetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
String id= txtIdCliente.getText();
        buscarcliente(id);
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
insertarcliente();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
Eliminarcliente();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
actualizarempleado();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelEtiquetas;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRucDni;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void buscarcliente(String id) {
        Cliente clie=ClienteController.BuscarClientexCodigo(id);
    txtNombreCliente.setText(clie.getNOMBRE());
    txtDireccion.setText(clie.getDIRECCION());
    txtRucDni.setText(clie.getRUCDNI());
    txtTelefono.setText(clie.getTELEFONO());
    txtIdCliente.setText(clie.getIDCLIENTE());
    }

    private void Eliminarcliente() {
ClienteController.eliminarCliente(txtIdCliente.getText());
    }

    private void actualizarempleado() {
Cliente cli= new Cliente();
cli.setIDCLIENTE(txtIdCliente.getText());
cli.setNOMBRE(txtNombreCliente.getText());
cli.setRUCDNI(txtRucDni.getText());
cli.setTELEFONO(txtTelefono.getText());
cli.setDIRECCION(txtDireccion.getText());
ClienteController.updateCliente(cli);
    }

    private void insertarcliente() {
Cliente cli=new Cliente();
cli.setIDCLIENTE(txtIdCliente.getText());
cli.setNOMBRE(txtNombreCliente.getText());
cli.setDIRECCION(txtDireccion.getText());
cli.setRUCDNI(txtRucDni.getText());
cli.setTELEFONO(txtTelefono.getText());
ClienteController.insertarCliente(cli);
    }
    
}
