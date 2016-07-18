package pe.eth.Travisaapp.view;

import javax.swing.JOptionPane;
import pe.eth.Travisaapp.controller.EmpleadoController;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.service.impl.EmpleadoServiceImpl;


public class empleadomanView extends javax.swing.JInternalFrame {

    public empleadomanView() {
        initComponents();
        //estado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        panelbotones = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setTitle("MANTENIMIENTO DE EMPLEADO");
        setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado"));

        jLabel1.setText("Id Empleado");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Email");

        jLabel5.setText("Usuario");

        jLabel6.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addComponent(txtEmail)
                            .addComponent(txtUsuario)
                            .addComponent(txtIdEmpleado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelbotones.setLayout(new java.awt.GridLayout());

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/add.png"))); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelbotones.add(btnInsertar);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/editar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        panelbotones.add(btnActualizar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelbotones.add(btnEliminar);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelbotones.add(btnBuscar);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/exit.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelbotones.add(btnCerrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelbotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelbotones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
 }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
     
        insertarempleado();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
     
        actualizarempleado();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminarempleado();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String id= txtIdEmpleado.getText();
        buscarempleado(id);
    }//GEN-LAST:event_btnBuscarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelbotones;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void buscarempleado(String id) {
     Empleado empl=EmpleadoController.buscarEmpleado(id);
    txtNombre.setText(empl.getNombre());
    txtApellido.setText(empl.getApellidos());
    txtEmail.setText(empl.getEmail());
    txtUsuario.setText(empl.getUsuario());
    txtPassword.setText(empl.getClave());
    txtIdEmpleado.setText(empl.getIdEmpleado());
       
    }

    private void estado() {
txtApellido.setEnabled(false);
txtNombre.setEnabled(false);
txtEmail.setEnabled(false);
txtUsuario.setEnabled(false);
txtPassword.setEnabled(false);
    }

    void mensaje(String msj,String tipo){
               JOptionPane.showMessageDialog(this, msj,tipo,JOptionPane.INFORMATION_MESSAGE);
           }

    private void insertarempleado() {
    //crear objeto empleado y pasar los valores
    Empleado emp= new Empleado();
    emp.setIdEmpleado(txtIdEmpleado.getText());
    emp.setNombre(txtNombre.getText());
    emp.setApellidos(txtApellido.getText());
    emp.setEmail(txtEmail.getText());
    emp.setUsuario(txtUsuario.getText());
    emp.setClave(String.valueOf(txtPassword.getPassword()));
    
    EmpleadoController.insertarEmpleado(emp);
    
    }

    private void actualizarempleado() {
    //crear objeto empleado y pasar los valores
    Empleado emp= new Empleado();
    emp.setIdEmpleado(txtIdEmpleado.getText());
    emp.setNombre(txtNombre.getText());
    emp.setApellidos(txtApellido.getText());
    emp.setEmail(txtEmail.getText());
    emp.setUsuario(txtUsuario.getText());
    emp.setClave(String.valueOf(txtPassword.getPassword()));
    
    EmpleadoController.updateEmpleado(emp);
    }

    private void eliminarempleado() {
EmpleadoController.eliminarempleado(txtIdEmpleado.getText());
    }
   
}
