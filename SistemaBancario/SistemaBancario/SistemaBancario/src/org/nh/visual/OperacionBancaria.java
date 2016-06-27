package org.nh.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.nh.cuentas.Cliente;
import org.nh.cuentas.Cuenta;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OperacionBancaria extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodigo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtmonto;
	private JLabel lbnombres;
	DefaultTableModel tablita = new DefaultTableModel();
	private JTable tblCuenta;
	LinkedList<String[]> listar;
	private JLabel lcuenta;
	private JLabel lapetura;
	private JLabel ltipo;
	private JLabel lmoneda;
	private JLabel lsaldo;
	int rfila, ioperar;
	private JRadioButton rbDeposito;
	private JRadioButton rbRetiro;
	private JRadioButton rdbtnretCts;
	private JRadioButton rbDepCts;
	private JButton btnEjecutar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OperacionBancaria dialog = new OperacionBancaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OperacionBancaria() {
		setTitle("Operacion Bancaria ");
		setBounds(100, 100, 580, 663);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JLabel lblCodigoDelCliente = new JLabel("Codigo del cliente:");

		txtcodigo = new JTextField();
		txtcodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar_cliente();
			}
		});
		txtcodigo.setColumns(10);

		JLabel lbhora = new JLabel("New label");

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblCuentasDelCliente = new JLabel("Cuentas del cliente:");

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255)), "Datos de la cuenta escogida",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));

		lbnombres = new JLabel("---------");
		lbnombres.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbnombres.setForeground(Color.RED);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel
				.setHorizontalGroup(
						gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_contentPanel.createSequentialGroup().addGap(30).addGroup(gl_contentPanel
												.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
														.createSequentialGroup().addComponent(
																panel,
																GroupLayout.PREFERRED_SIZE, 497,
																GroupLayout.PREFERRED_SIZE)
														.addContainerGap())
												.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPanel.createSequentialGroup()
																.addComponent(lblCuentasDelCliente).addGap(31)
																.addComponent(lbnombres, GroupLayout.PREFERRED_SIZE,
																		256, GroupLayout.PREFERRED_SIZE)
																.addContainerGap())
														.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_contentPanel.createSequentialGroup()
																		.addComponent(scrollPane,
																				GroupLayout.PREFERRED_SIZE, 466,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
																.addGroup(gl_contentPanel.createSequentialGroup()
																		.addComponent(lblCodigoDelCliente)
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addComponent(txtcodigo,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED,
																				254, Short.MAX_VALUE)
																		.addComponent(lbhora).addGap(40)))))));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addGap(32)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblCodigoDelCliente)
						.addComponent(txtcodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lbhora))
				.addGap(37)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblCuentasDelCliente)
						.addComponent(lbnombres))
				.addGap(18).addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
				.addGap(18).addComponent(panel, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(34, Short.MAX_VALUE)));

		tblCuenta = new JTable();
		tblCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ifila = tblCuenta.getSelectedRow();
				mostrar_cuenta_escogida(ifila);
			}
		});
		tblCuenta.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "NumCuenta", "Tipo", "Moneda", "Saldo" }) {
					Class[] columnTypes = new Class[] { String.class, String.class, String.class, Double.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}

					boolean[] columnEditables = new boolean[] { false, false, true, false };

					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
		tblCuenta.getColumnModel().getColumn(1).setPreferredWidth(80);
		tblCuenta.getColumnModel().getColumn(2).setPreferredWidth(88);
		scrollPane.setViewportView(tblCuenta);

		rbDeposito = new JRadioButton("Deposito");
		rbDeposito.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ioperar = 1;
				txtmonto.setEnabled(true);
			}
		});
		buttonGroup.add(rbDeposito);

		rbRetiro = new JRadioButton("Retiro");
		rbRetiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ioperar = 2;
				txtmonto.setEnabled(true);
			}
		});
		buttonGroup.add(rbRetiro);

		rdbtnretCts = new JRadioButton("Retiro CTS");
		rdbtnretCts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ioperar = 3;
				txtmonto.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnretCts);

		JLabel lblCuenta = new JLabel("Cuenta:");

		lcuenta = new JLabel("--------");
		lcuenta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lcuenta.setForeground(Color.BLUE);

		JLabel lblApertura = new JLabel("Apertura:");

		lapetura = new JLabel("--------");
		lapetura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lapetura.setForeground(Color.BLUE);

		JLabel lblTipo = new JLabel("Tipo:");

		ltipo = new JLabel("--------");
		ltipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		ltipo.setForeground(Color.BLUE);

		JLabel lblMoneda = new JLabel("Moneda:");

		lmoneda = new JLabel("--------");
		lmoneda.setFont(new Font("Tahoma", Font.BOLD, 12));
		lmoneda.setForeground(Color.BLUE);

		JLabel lblSaldo = new JLabel("Saldo:");

		txtmonto = new JTextField();
		txtmonto.setEnabled(false);
		txtmonto.setColumns(10);

		JLabel lblMontoDeOperacion = new JLabel("Monto de Operacion:");

		lsaldo = new JLabel("--------");
		lsaldo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lsaldo.setForeground(Color.BLUE);

		rbDepCts = new JRadioButton("Deposito CTS");
		buttonGroup.add(rbDepCts);
		rbDepCts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ioperar = 4;
				txtmonto.setEnabled(true);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(
														lblCuenta)
												.addComponent(lblTipo))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addComponent(lcuenta)
														.addGap(34).addComponent(lblApertura).addGap(18).addComponent(
																lapetura, GroupLayout.PREFERRED_SIZE, 132,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(ltipo)))
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblMoneda).addComponent(lblSaldo))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addComponent(lsaldo)
														.addPreferredGap(ComponentPlacement.RELATED, 377,
																Short.MAX_VALUE))
												.addGroup(Alignment.TRAILING,
														gl_panel.createSequentialGroup()
																.addComponent(lblMontoDeOperacion).addGap(18)
																.addComponent(txtmonto, GroupLayout.PREFERRED_SIZE, 78,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(41))
												.addGroup(gl_panel.createSequentialGroup().addComponent(lmoneda)
														.addPreferredGap(ComponentPlacement.RELATED, 0,
																Short.MAX_VALUE)))))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(rdbtnretCts)
								.addComponent(rbRetiro).addComponent(rbDeposito).addComponent(rbDepCts))
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(20).addComponent(rbDeposito))
						.addGroup(gl_panel.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblCuenta)
										.addComponent(lcuenta).addComponent(lblApertura).addComponent(lapetura))))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
								.createSequentialGroup().addComponent(rbRetiro).addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(rdbtnretCts)
										.addComponent(lblMoneda).addComponent(lmoneda)))
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblTipo)
										.addComponent(ltipo)))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(28)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblSaldo).addComponent(lsaldo)))
								.addGroup(gl_panel.createSequentialGroup().addGap(18).addComponent(rbDepCts)))
						.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblMontoDeOperacion)
								.addComponent(txtmonto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(30)));
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnEjecutar = new JButton("Ejecutar Transaccion");
				btnEjecutar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						validar_transaccion();
					}
				});
				btnEjecutar.setActionCommand("OK");
				buttonPane.add(btnEjecutar);
				getRootPane().setDefaultButton(btnEjecutar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
		}
		comenzar();
	}

	protected void validar_transaccion() {
		// TODO Auto-generated method stub
		try {
			double imonto = Double.parseDouble(txtmonto.getText());
			double nsaldo = Double.parseDouble(lsaldo.getText());
			switch (ioperar) {
			case 1: 
			case 4:double ilimite = Double.
					parseDouble(listar.get(rfila)[7]);
			       if((nsaldo + imonto) > ilimite){
			    	   JOptionPane.showMessageDialog(this,
								"Saldo final no puede ser mayor que "+
			    	             ilimite+" , intente de nuevo");
						txtmonto.setText("0");   
			       }else{
			    	   nsaldo += imonto;
			    	   guardar_transaccion(nsaldo,imonto);
			       }
				break;

			case 2:
			case 3:
				if ((nsaldo - imonto) < 0) {
					JOptionPane.showMessageDialog(this,
							"Saldo final no puede ser menor que 0, intente de nuevo");
					txtmonto.setText("0");
				}else{
					nsaldo -= imonto;
					guardar_transaccion(nsaldo,imonto);
				}
				break;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Valor ingresado es invalido, intente de nuevo");
			txtmonto.setText("0");

		}
	}

	private void guardar_transaccion(double nsaldo, double imonto) {
		// TODO Auto-generated method stub
		System.out.println("Transaccion "+nsaldo);
      Cuenta xcuenta = new Cuenta();
      boolean exito = xcuenta.insertar_transaccion(imonto,
    		  listar.get(rfila),ioperar,nsaldo);
      if(exito){
    	  JOptionPane.showMessageDialog(this, "Transaccion completada correctamente",
    			  "Transaccion Exitosa",JOptionPane.INFORMATION_MESSAGE);
    	  btnEjecutar.setEnabled(false);
      }else{
    	  JOptionPane.showMessageDialog(this, "Error durante transaccion realizada",
    			  "Transaccion Fallida",JOptionPane.ERROR_MESSAGE);  
      }
	}

	protected void mostrar_cuenta_escogida(int ifila) {
		// TODO Auto-generated method stub
		String[] xcuenta = listar.get(ifila);
		lcuenta.setText(xcuenta[0]);
		lapetura.setText(xcuenta[1]);
		lsaldo.setText(xcuenta[4]);
		ltipo.setText(xcuenta[5]);
		lmoneda.setText(xcuenta[6]);
		this.rfila = ifila;
		String stipo = xcuenta[2];
		switch (stipo) {
		case "1":
		case "2":
			rbDepCts.setEnabled(false);
			rdbtnretCts.setEnabled(false);
			rbDeposito.setEnabled(true);
			rbRetiro.setEnabled(true);
			break;

		default:
			rbDepCts.setEnabled(true);
			rdbtnretCts.setEnabled(true);
			rbDeposito.setEnabled(false);
			rbRetiro.setEnabled(false);
			break;
		}
      txtmonto.setEnabled(false);
      tblCuenta.setEnabled(false);
	}

	private void comenzar() {
		activar_reloj();
		tablita = (DefaultTableModel) tblCuenta.getModel();
	}

	private void activar_reloj() {
		// TODO Auto-generated method stub

	}

	protected void buscar_cliente() {
		// TODO Auto-generated method stub
		String codigo = txtcodigo.getText();
		Cliente xcliente = new Cliente();
		String nomcliente = xcliente.nombre_cliente(codigo);
		if (nomcliente.equals("x")) {
			JOptionPane.showMessageDialog(this, "Codigo invalido");
			txtcodigo.setText("");
			txtcodigo.grabFocus();
		} else {
			lbnombres.setText(nomcliente);
			listar = buscar_cuentas_cliente(codigo);
			mostrar_filas(listar);

		}

	}

	private void mostrar_filas(LinkedList<String[]> listar) {
		// TODO Auto-generated method stub
		if (tablita.getRowCount() > 0) {
			for (int i = 0; i < tablita.getRowCount(); i++) {
				tablita.removeRow(0);
			}

		}
		for (String[] unacuenta : listar) {
			Vector temp1 = armar_fila(unacuenta);
			tablita.addRow(temp1);
			System.out.println("fila cargada");
		}

	}

	private Vector armar_fila(String[] unacuenta) {
		// TODO Auto-generated method stub
		Vector fila = new Vector();
		fila.add(unacuenta[0]);
		fila.add(unacuenta[5]);
		fila.add(unacuenta[6]);
		fila.add(new Double(unacuenta[4]));
		return fila;
	}

	private LinkedList<String[]> buscar_cuentas_cliente(String codigo) {
		// TODO Auto-generated method stub
		Cuenta xcuenta = new Cuenta();
		return xcuenta.lista_cuentas(codigo);
	}
}
