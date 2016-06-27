package org.nh.visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Sistema Bancario - Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 545);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProcesos = new JMenu("Procesos");
		mnProcesos.setMnemonic('c');
		menuBar.add(mnProcesos);
		
		JMenuItem mntmNuevoCliente = new JMenuItem("Nuevo Cliente");
		mntmNuevoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NuevoCliente().setVisible(true);
			}
		});
		mnProcesos.add(mntmNuevoCliente);
		
		JMenuItem mntmAperturaCuenta = new JMenuItem("Apertura Cuenta");
		mntmAperturaCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AperturaCuenta().setVisible(true);
			}
		});
		mntmAperturaCuenta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, InputEvent.SHIFT_MASK));
		mnProcesos.add(mntmAperturaCuenta);
		
		JSeparator separator = new JSeparator();
		mnProcesos.add(separator);
		
		JMenuItem mntmReporteClientes = new JMenuItem("Reporte Clientes");
		mnProcesos.add(mntmReporteClientes);
		
		JMenu mnOperaciones = new JMenu("Operaciones");
		mnOperaciones.setMnemonic('p');
		menuBar.add(mnOperaciones);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Depositos");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mnOperaciones.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Retiros");
		mnOperaciones.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Transferencias");
		mnOperaciones.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Retiro CTS");
		mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnOperaciones.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Deposito CTS");
		mnOperaciones.add(mntmNewMenuItem_4);
		
		JSeparator separator_1 = new JSeparator();
		mnOperaciones.add(separator_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Reporte Diario");
		mnOperaciones.add(mntmNewMenuItem_5);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setMnemonic('i');
		menuBar.add(mnMantenimiento);
		
		JMenu mnUsuario = new JMenu("Usuario");
		mnMantenimiento.add(mnUsuario);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnUsuario.add(mntmNuevo);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mnUsuario.add(mntmModificar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnUsuario.add(mntmEliminar);
		
		JMenu mnRedex = new JMenu("Redex");
		mnMantenimiento.add(mnRedex);
		
		JMenuItem mntmNuevo_1 = new JMenuItem("Nuevo");
		mnRedex.add(mntmNuevo_1);
		
		JMenuItem mntmModificar_1 = new JMenuItem("Modificar");
		mnRedex.add(mntmModificar_1);
		
		JMenuItem mntmRetirar = new JMenuItem("Retirar");
		mnRedex.add(mntmRetirar);
		
		JMenuItem mntmTablas = new JMenuItem("Tablas");
		mntmTablas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CatalogoTablas().setVisible(true);
			}
		});
		mnMantenimiento.add(mntmTablas);
		
		JSeparator separator_2 = new JSeparator();
		mnMantenimiento.add(separator_2);
		
		JMenuItem mntmCambiarClave = new JMenuItem("Cambiar Clave");
		mnMantenimiento.add(mntmCambiarClave);
		
		JMenu mnSalir = new JMenu("Salir");
		mnSalir.setMnemonic('s');
		menuBar.add(mnSalir);
		
		JMenuItem mntmTerminar = new JMenuItem("Terminar");
		mntmTerminar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.CTRL_MASK));
		mnSalir.add(mntmTerminar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnCuenta = new JButton("");
		btnCuenta.setToolTipText("Aperturar Cuenta");
		btnCuenta.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCuenta.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\icono1.jpg"));
		toolBar.add(btnCuenta);
		
		JButton btnDeposito = new JButton("");
		btnDeposito.setToolTipText("Ingresar Deposito bancario");
		btnDeposito.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDeposito.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\icono2.jpg"));
		toolBar.add(btnDeposito);
		
		JButton btnRetiro = new JButton("");
		btnRetiro.setToolTipText("Retiro en Cuenta");
		btnRetiro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRetiro.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\icono3.jpg"));
		toolBar.add(btnRetiro);
		
		JButton btnReporte = new JButton("");
		btnReporte.setToolTipText("Reporte Diario");
		btnReporte.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReporte.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\icono4.jpg"));
		toolBar.add(btnReporte);
		
		JButton btnClave = new JButton("");
		btnClave.setToolTipText("Cambiar Clave");
		btnClave.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClave.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\icono5.jpg"));
		toolBar.add(btnClave);
		
		JButton btnTerminar = new JButton("");
		btnTerminar.setToolTipText("Terminar la aplicacion");
		btnTerminar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTerminar.setIcon(new ImageIcon("D:\\java1\\tarea\\SistemaBancario\\imagenes\\exit.jpg"));
		toolBar.add(btnTerminar);
	}

}
