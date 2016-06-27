package org.nh.visual;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio dialog = new Inicio();
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
	public Inicio() {
		setTitle("Sistema Bancario 2016");
		setBounds(100, 100, 358, 479);
		
		JLabel lblBancoDeLa = new JLabel("Banco de la Felicidad y Confianza");
		lblBancoDeLa.setForeground(new Color(138, 43, 226));
		lblBancoDeLa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\banco3.jpg"));
		
		JButton btnIniciarSistema = new JButton("Iniciar Sistema");
		btnIniciarSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Logueo xlogueo = new Logueo();
				xlogueo.setVisible(true);
				dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(98)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(87, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(135, Short.MAX_VALUE)
					.addComponent(btnIniciarSistema)
					.addGap(118))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(lblBancoDeLa)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addComponent(lblBancoDeLa)
					.addGap(64)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(btnIniciarSistema)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
