package pe.eth.Travisaapp.view;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.eth.Travisaapp.controller.ClienteController;
import pe.eth.Travisaapp.controller.LogonController;
import pe.eth.Travisaapp.controller.ProductoController;
import pe.eth.Travisaapp.controller.VentasController;
import pe.eth.Travisaapp.domain.Cliente;
import pe.eth.Travisaapp.domain.DetalleVenta;
import pe.eth.Travisaapp.domain.Empleado;
import pe.eth.Travisaapp.domain.Producto;
import pe.eth.Travisaapp.domain.ventas;
import pe.eth.Travisaapp.util.Memoria;


public class VentasView extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    
       public void tabla(){
        setTitle("REGISTRAR VENTA DE PRODUCTOS");
        //establecer columnas a la bd
        String[]cabezera={"ID","NOMBRE","CANTIDAD","PRECIO","SUBTOTAL"};
        //estableciendo el modelo de la tabla
       model= new DefaultTableModel(null, cabezera);
        //asignar modelo a la tabla
        tabladetalle.setModel(model);
    }
    public VentasView() {
        initComponents();
        tabla();
        fecha();
cargarEmpleado();
txtidventa.setText(String.valueOf(VentasController.obteneridventa()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneldatosventa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnrodoc = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtidventa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtNomCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        panelproductos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtiniciales = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        paneldetalleventa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnagregardetalle = new javax.swing.JButton();
        btnquitardetalle = new javax.swing.JButton();
        btnregistraventa = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblEmpleado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<String>();
        txtDescripcion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 204, 255));
        setClosable(true);
        setMaximizable(true);
        setTitle("R E G I S T R A R   V E N T A S");

        paneldatosventa.setBackground(new java.awt.Color(255, 255, 255));
        paneldatosventa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nro Ruc");

        txtnrodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnrodocActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Venta"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidventa, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtidventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Fecha");

        txtIdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdClienteMouseClicked(evt);
            }
        });
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombres");

        javax.swing.GroupLayout paneldatosventaLayout = new javax.swing.GroupLayout(paneldatosventa);
        paneldatosventa.setLayout(paneldatosventaLayout);
        paneldatosventaLayout.setHorizontalGroup(
            paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldatosventaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneldatosventaLayout.createSequentialGroup()
                        .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paneldatosventaLayout.createSequentialGroup()
                        .addComponent(txtnrodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30)))
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfecha))
                .addGap(16, 16, 16))
        );
        paneldatosventaLayout.setVerticalGroup(
            paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldatosventaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paneldatosventaLayout.createSequentialGroup()
                        .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneldatosventaLayout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneldatosventaLayout.createSequentialGroup()
                        .addGroup(paneldatosventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnrodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        panelproductos.setBackground(new java.awt.Color(255, 255, 255));
        panelproductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de producto"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Stock");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Codigo");

        txtprecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStockKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Iniciales");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Cantidad");

        txtiniciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinicialesActionPerformed(evt);
            }
        });
        txtiniciales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinicialesKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelproductosLayout = new javax.swing.GroupLayout(panelproductos);
        panelproductos.setLayout(panelproductosLayout);
        panelproductosLayout.setHorizontalGroup(
            panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtiniciales)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtcodigo)
                    .addComponent(txtprecio)
                    .addComponent(txtStock))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelproductosLayout.setVerticalGroup(
            panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtiniciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panelproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        paneldetalleventa.setBackground(new java.awt.Color(255, 255, 255));
        paneldetalleventa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Detalle"));

        tabladetalle.setBackground(new java.awt.Color(102, 204, 255));
        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalle);

        javax.swing.GroupLayout paneldetalleventaLayout = new javax.swing.GroupLayout(paneldetalleventa);
        paneldetalleventa.setLayout(paneldetalleventaLayout);
        paneldetalleventaLayout.setHorizontalGroup(
            paneldetalleventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        paneldetalleventaLayout.setVerticalGroup(
            paneldetalleventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetalleventaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Total");

        txttotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnagregardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/add.png"))); // NOI18N
        btnagregardetalle.setText("Agregar Detalle");
        btnagregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregardetalleActionPerformed(evt);
            }
        });

        btnquitardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/eliminar.png"))); // NOI18N
        btnquitardetalle.setText("Quitar Detalle");
        btnquitardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitardetalleActionPerformed(evt);
            }
        });

        btnregistraventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/grabar.png"))); // NOI18N
        btnregistraventa.setText("Registrar Venta");
        btnregistraventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraventaActionPerformed(evt);
            }
        });

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/printer.png"))); // NOI18N
        btnimprimir.setText("Imprimir");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/eth/Travisaapp/img/salir.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Empleado");

        lstProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Productos"));
        lstProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstProductos);

        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion de Productos"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(36, 36, 36)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(paneldetalleventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnimprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnregistraventa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnquitardetalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnagregardetalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(paneldatosventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(paneldatosventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnagregardetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnquitardetalle)
                        .addGap(2, 2, 2)
                        .addComponent(btnregistraventa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnimprimir))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneldetalleventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(lblEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // cerrar
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyReleased
       
    }//GEN-LAST:event_txtStockKeyReleased

    private void btnagregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregardetalleActionPerformed
   agregarItemaTabla();

    }//GEN-LAST:event_btnagregardetalleActionPerformed

    private void btnquitardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitardetalleActionPerformed
    borrarFilaTablaPedidos();

    }//GEN-LAST:event_btnquitardetalleActionPerformed

    private void btnregistraventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraventaActionPerformed
        try {
            RegistrarVenta();
        } catch (SQLException ex) {
            Logger.getLogger(VentasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnregistraventaActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
 buscarclienteporcodigo();
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtinicialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinicialesActionPerformed
Productosenlalista();
    }//GEN-LAST:event_txtinicialesActionPerformed

    private void txtinicialesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinicialesKeyPressed

    }//GEN-LAST:event_txtinicialesKeyPressed

    private void lstProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductosValueChanged
      asignarproductosentext();

    }//GEN-LAST:event_lstProductosValueChanged

    private void txtIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyPressed
 
    }//GEN-LAST:event_txtIdClienteKeyPressed

    private void txtIdClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyReleased
 
    }//GEN-LAST:event_txtIdClienteKeyReleased

    private void txtIdClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdClienteMouseClicked
 //buscarclienteporcodigo();
    }//GEN-LAST:event_txtIdClienteMouseClicked

    private void txtnrodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnrodocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnrodocActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnimprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnagregardetalle;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnquitardetalle;
    private javax.swing.JButton btnregistraventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JPanel paneldatosventa;
    private javax.swing.JPanel paneldetalleventa;
    private javax.swing.JPanel panelproductos;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtidventa;
    private javax.swing.JTextField txtiniciales;
    private javax.swing.JTextField txtnrodoc;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
ArrayList<Producto> productos;
    private void Productosenlalista() {
        productos=ProductoController.listarProducto(txtiniciales.getText());
        DefaultListModel modelo= new  DefaultListModel();
        for(Producto a:productos){
           modelo.addElement(a.getDESCRIPCION());
        }
       lstProductos.setModel(modelo); 
    }

    private void asignarproductosentext() {
   productos=ProductoController.listarProducto(String.valueOf(lstProductos.getSelectedValue()));
        for(Producto x:productos){
          txtcodigo.setText(x.getIDPRODUCTO()+"");
          txtDescripcion.setText(x.getDESCRIPCION());
          txtprecio.setText(String.valueOf(x.getPRECIOVENTA()));
          txtStock.setText(String.valueOf(x.getSTOCK()));
        }
    }

    private void agregarItemaTabla() {
if(txtcodigo.getText().trim().length()!=0 && txtcantidad.getText().trim().length()!=0){
         int cantidad= Integer.parseInt(txtcantidad.getText());
         double pr=Double.parseDouble(txtprecio.getText());
         double subtotal=cantidad*pr;
         model.addRow(new Object[]{txtcodigo.getText(),txtDescripcion.getText(),txtcantidad.getText()
         ,txtprecio.getText(),subtotal});
         
     totalpedido();
     }
     else{
       mensaje("ingrese datos del articulo");  
     }
    }

    private void totalpedido() {
            
  double total=0;
  for(int i=0;i<tabladetalle.getRowCount();i++){
      total= total+(double)tabladetalle.getValueAt(i, 4);
      
  }
  txttotal.setText(String.valueOf(total));
    }

    private void mensaje(String msg) {
 JOptionPane.showMessageDialog(null, msg);
    }

    private void borrarFilaTablaPedidos() {
          if(this.tabladetalle.getSelectedRow()>=0){
          model.removeRow(tabladetalle.getSelectedRow());
          
      }
      else{
          mensaje("seleccione filas  a quitar..!!");
      }   
    }

    private void fecha() {
        Date ahora= new Date(System.currentTimeMillis());
        SimpleDateFormat formateador= new SimpleDateFormat("yyyy-MM-dd");
        txtfecha.setText(formateador.format(ahora));
        txtfecha.setEnabled(false);
    }

    private void buscarclienteporcodigo() {
     Cliente clien= ClienteController.BuscarClientexCodigo(txtIdCliente.getText());
       
        txtNomCliente.setText(clien.getNOMBRE());
        txtnrodoc.setText(clien.getRUCDNI());
    
    }

    private void RegistrarVenta() throws SQLException {
       // VentasController Objpedido;
        ventas ve;
        //si la jtable tiene registros encapsulamos datos tanto 
        //para encabezado de pedido y detalles de pedido
        if(tabladetalle.getRowCount()>0){
        ve= new ventas();
        int idventa= Integer.parseInt(txtidventa.getText());
      ve.setIDVENTA(idventa);
      ve.setIDEMPLEADO(bean.getIdEmpleado());
      ve.setFECHA(txtfecha.getText());
      ve.setIDCLIENTE(txtIdCliente.getText());
      ve.setTOTAL(Double.parseDouble(txttotal.getText()));
        //DaoPedido.registar(ve);
        //numero de filas del jtable
        int nfilas= tabladetalle.getRowCount();
        //objeto arraylist para agregar conjunto de articulos que se insertaran en
        //la tabla detalle
        ArrayList<DetalleVenta> list= new ArrayList<DetalleVenta>();
        DetalleVenta det;
        for(int i=0;i<nfilas;i++){
            det = new DetalleVenta();
            det.setIDVENTA(Integer.parseInt(txtidventa.getText()));
            det.setIDPRODUCTO(String.valueOf(tabladetalle.getValueAt(i,0)));
            det.setPRECIO(Double.parseDouble(String.valueOf(tabladetalle.getValueAt(i, 3))));
            det.setCANTIDAD(Integer.parseInt(String.valueOf(tabladetalle.getValueAt(i, 2))));
            det.setIMPORTE(Double.parseDouble(String.valueOf(tabladetalle.getValueAt(i, 4))));
            list.add(det);
        }
        //entregamos como parametros los objetos para el encabezado del pedido
        // que se insertara una sola vez en la tabla pedido y la lista se insertara
        //en funcion a la cantidad de registros que haya en la tabla
        boolean f=VentasController.registrarPedido(ve, list);
        if(f){
            mensaje("venta registrada");
            
        }
        }
        else{
            mensaje("ingrese datos a la tabla");
        }

    }
Empleado bean;
    public void cargarEmpleado() {
 
     bean = (Empleado) Memoria.get("usuario");
   // String titulo = "TRAVISA   [Usuario:" + bean.getUsuario() + "]";
  mostrarnombreEmpleado();
    }

    private void mostrarnombreEmpleado() {
       lblEmpleado.setText(bean.getNombre()+","+bean.getApellidos());
    }
  
    
}
