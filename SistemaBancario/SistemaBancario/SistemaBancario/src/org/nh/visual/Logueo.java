package org.nh.visual;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.nh.bancos.Valores;
import org.nh.cuentas.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logueo extends JDialog {
	private JTextField txtUsuario;
	private JPasswordField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logueo dialog = new Logueo();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Logueo() {
		setTitle("Ingreso al Sistema");
		setBounds(100, 100, 389, 474);

		JLabel lblUsuario = new JLabel("Usuario:");

		JLabel lblClave = new JLabel("Clave:");

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);

		txtClave = new JPasswordField();

		JButton btnValidar = new JButton("Validar Usuario");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validar_usuario();
			}

		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\banco1a.jpg"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(
								groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(
												groupLayout.createSequentialGroup().addGap(37)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(lblUsuario).addComponent(lblClave))
														.addGap(42)
														.addGroup(groupLayout
																.createParallelGroup(Alignment.LEADING, false)
																.addComponent(txtClave).addComponent(txtUsuario)))
										.addGroup(groupLayout.createSequentialGroup().addGap(138)
												.addComponent(btnValidar))
										.addGroup(groupLayout.createSequentialGroup().addGap(77)
												.addComponent(lblNewLabel)))
						.addContainerGap(78, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(42)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblUsuario).addComponent(
						txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(26)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblClave).addComponent(
						txtClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(48).addComponent(btnValidar).addGap(26).addComponent(lblNewLabel)
				.addContainerGap(33, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);

	}

	protected void validar_usuario() {
		// TODO Auto-generated method stub
		boolean encontre = false;
		String xusuario = txtUsuario.getText();
		String xclave = txtClave.getText();
		if ((xusuario.length() > 0) && (xclave.length() > 0)) {
			Usuario pusuario = new Usuario();
			String snombre = pusuario.verif_usuario(xusuario,xclave);
			if(snombre.equals("x")){
				JOptionPane.showMessageDialog(this, "Usuario o clave invalidos, intente de nuevo");
				txtClave.setText("");
				txtUsuario.setText("");
				txtUsuario.grabFocus();
			}else{
				JOptionPane.showMessageDialog(this, "Bienvenido " +
			snombre, "Acceso Validado",
						JOptionPane.WARNING_MESSAGE);
				new Principal().setVisible(true);
				dispose();
			}
			
		} else {
			JOptionPane.showMessageDialog(this, "Una de las cajas esta vacia, intente de nuevo");
			txtClave.setText("");
			txtUsuario.setText("");
			txtUsuario.grabFocus();

		}

	}
}
