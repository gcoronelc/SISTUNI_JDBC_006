package org.nh.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.nh.cuentas.Cliente;
import org.nh.cuentas.Cuenta;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AperturaCuenta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigoC;
	private JTextField txtnumcuenta;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtmonto;
	private JLabel lblFecha;
	private JLabel lblNombreCliente;
    String tipo,moneda;
    Cliente xcliente;
    private JButton btnGuardar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AperturaCuenta dialog = new AperturaCuenta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AperturaCuenta() {
		setTitle("Apertura de nueva cuenta");
		setBounds(100, 100, 448, 488);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		lblFecha = new JLabel("New label");
		
		JLabel lblIngreseCodigoCliente = new JLabel("Ingrese codigo cliente:");
		
		txtCodigoC = new JTextField();
		txtCodigoC.setColumns(10);
		
		JButton btnBuscar = new JButton("...");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar_cliente(txtCodigoC.getText());
			}
		});
		
		lblNombreCliente = new JLabel("------");
		lblNombreCliente.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNombreCliente.setForeground(new Color(139, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19)), "Datos de la cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(178, 34, 34)));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
						.addComponent(lblNombreCliente, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblIngreseCodigoCliente)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCodigoC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuscar)
							.addGap(32)
							.addComponent(lblFecha)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIngreseCodigoCliente)
						.addComponent(txtCodigoC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar)
						.addComponent(lblFecha))
					.addGap(29)
					.addComponent(lblNombreCliente)
					.addGap(29)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JLabel lblNumCuenta = new JLabel("Num. Cuenta:");
		
		txtnumcuenta = new JTextField();
		txtnumcuenta.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		
		JRadioButton rdbtnAhorro = new JRadioButton("Ahorro");
		rdbtnAhorro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tipo= rdbtnAhorro.getText();
			}
		});
		buttonGroup.add(rdbtnAhorro);
		
		JRadioButton rdbtnCorriente = new JRadioButton("Corriente");
		rdbtnCorriente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tipo= rdbtnCorriente.getText();
			}
		});
		buttonGroup.add(rdbtnCorriente);
		
		JRadioButton rdbtnCts = new JRadioButton("CTS");
		rdbtnCts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tipo= rdbtnCts.getText();
			}
		});
		buttonGroup.add(rdbtnCts);
		
		JLabel lblMoneda = new JLabel("Moneda:");
		
		JComboBox cbMoneda = new JComboBox();
		cbMoneda.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				moneda = cbMoneda.getSelectedItem().toString();
			}
		});
		cbMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		cbMoneda.setModel(new DefaultComboBoxModel(new String[] {"<Escoger Moneda>", "Soles", "Dolares", "Euros"}));
		
		JLabel lblMontoDeApertura = new JLabel("Monto de apertura:");
		
		txtmonto = new JTextField();
		txtmonto.setColumns(10);
		
		JLabel lblmontoNoDebe = new JLabel("(monto no debe sobrepasar 15000.00)");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblTipo)
									.addGap(53)
									.addComponent(rdbtnAhorro)
									.addGap(18)
									.addComponent(rdbtnCorriente)
									.addGap(18)
									.addComponent(rdbtnCts))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNumCuenta)
										.addComponent(lblMoneda))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(cbMoneda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtnumcuenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblMontoDeApertura)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtmonto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(122)
							.addComponent(lblmontoNoDebe)))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumCuenta)
						.addComponent(txtnumcuenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo)
						.addComponent(rdbtnAhorro)
						.addComponent(rdbtnCorriente)
						.addComponent(rdbtnCts))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMoneda)
						.addComponent(cbMoneda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMontoDeApertura)
						.addComponent(txtmonto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblmontoNoDebe)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnGuardar = new JButton("Guardar");
				btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						abrir_cuenta();
					}
				});
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
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

	protected void abrir_cuenta() {
		// TODO Auto-generated method stub
		Cuenta xcuenta = new Cuenta();
		double xmonto = Double.parseDouble(txtmonto.getText());
		if(xmonto > xcuenta.getLimite()){
			JOptionPane.showMessageDialog(this,
					"Monto de apertura supera al limite",
					"Error en ingreso de datos",
					JOptionPane.ERROR_MESSAGE);
			txtmonto.setText("");
			txtmonto.grabFocus();
		}else{
			xcuenta.setSaldo(xmonto);
			xcuenta.setNum_cuenta(txtnumcuenta.getText());
			xcuenta.setPoseedor(xcliente);
			xcuenta.setTipo(tipo);
			xcuenta.setTipo_moneda(moneda);
			boolean exito = xcuenta.guardar_nueva_cuenta();
			if(exito){
				JOptionPane.showMessageDialog(this, "La cuenta fue aperturada correctamente");
				btnGuardar.setEnabled(false);
			}else{
				JOptionPane.showMessageDialog(this,
						"Error durante apertura de cuenta",
						"Error en operacion",JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	

	protected void buscar_cliente(String ccliente) {
		// TODO Auto-generated method stub
		xcliente = new Cliente();
		String[] vuelta= xcliente.ubicar_cliente(ccliente);
		String ubico = vuelta[0];
		if(ubico.equals("1")){
		  lblNombreCliente.setText(vuelta[1]);
		  xcliente.setCodigo(ccliente);
		  xcliente.setApellidos(vuelta[1]);
		}else{
			JOptionPane.showMessageDialog(this,
					"Error en codigo ingresado, intente de nuevo",
					"Error en ingreso",
					JOptionPane.ERROR_MESSAGE);
			txtCodigoC.setText("");
			txtCodigoC.grabFocus();
		}
	}

	private void comenzar() {
		// TODO Auto-generated method stub
		Date hoy = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		lblFecha.setText(formato.format(hoy));
	}
}
