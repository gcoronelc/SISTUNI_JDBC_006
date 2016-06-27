package org.nh.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.nh.cuentas.Cliente;
import org.nh.cuentas.Cuenta;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CatalogoTablas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lbResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CatalogoTablas dialog = new CatalogoTablas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CatalogoTablas() {
		setTitle("Mantenimiento de Tablas");
		setBounds(100, 100, 450, 365);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("Mantenimiento de Tabla CLIENTE");

		JLabel lblNewLabel_1 = new JLabel("Mantenimiento de Tabla CUENTA");

		JButton btnCliente = new JButton("CLIENTE");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargar_clientes();
			}
		});

		JButton btnCuenta = new JButton("CUENTA");
		btnCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cargar_cuentas();
			}
		});

		lbResultado = new JLabel("----------------------------------------");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(47)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lbResultado, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel).addComponent(lblNewLabel_1))
										.addGap(27)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(btnCuenta).addComponent(btnCliente))))
						.addContainerGap(19, Short.MAX_VALUE)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(39)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(btnCliente))
						.addGap(41)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
								.addComponent(btnCuenta))
						.addGap(76).addComponent(lbResultado).addContainerGap(68, Short.MAX_VALUE)));
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void cargar_cuentas() {
		// TODO Auto-generated method stub
			Cuenta xcuenta = new Cuenta();
				int num1 = xcuenta.leer_datos_archivo();
				if (num1 > 0) {
					lbResultado.setText("Ingresadas " + num1 + " filas a la tabla CLIENTE");
				} else {
					lbResultado.setText("No hay filas para ingresar a la tabla CLIENTE");
				}
	}

	protected void cargar_clientes() {
		// TODO Auto-generated method stub
		Cliente xcliente = new Cliente();
		int num1 = xcliente.leer_datos_archivo();
		if (num1 > 0) {
			lbResultado.setText("Ingresadas " + num1 + " filas a la tabla CLIENTE");
		} else {
			lbResultado.setText("No hay filas para ingresar a la tabla CLIENTE");
		}
	}
}
