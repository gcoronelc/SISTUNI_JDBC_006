package org.nh.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.nh.cuentas.Cliente;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class NuevoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodigo;
	private JTextField txtapellidos;
	private JTextField txtnombres;
	private JTextField txtfnac;
	private JTextField txtdireccion;
	private JTextField txtdni;
	private final ButtonGroup buttonGroup = new ButtonGroup();
    String nsexo, ecivil;
    private JComboBox cbcivil;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoCliente dialog = new NuevoCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoCliente() {
		setTitle("Ingreso de nuevo cliente");
		setBounds(100, 100, 449, 469);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		
		JLabel lblNombres = new JLabel("Nombres:");
		
		txtcodigo = new JTextField();
		txtcodigo.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setColumns(10);
		
		txtnombres = new JTextField();
		txtnombres.setColumns(10);
		
		JLabel lblFecnac = new JLabel("Fec.Nac:");
		
		JLabel lblDireccionn = new JLabel("Direccion:");
		
		txtfnac = new JTextField();
		txtfnac.setColumns(10);
		
		JLabel lblddmmaaaa = new JLabel("(dd/mm/aaaa)");
		
		txtdireccion = new JTextField();
		txtdireccion.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		
		txtdni = new JTextField();
		txtdni.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		
		JRadioButton cbhombre = new JRadioButton("Hombre");
		cbhombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				nsexo="H";
			}
		});
		buttonGroup.add(cbhombre);
		
		JRadioButton cbmujer = new JRadioButton("Mujer");
		cbmujer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nsexo="M";
			}
		});
		buttonGroup.add(cbmujer);
		
		JLabel lblEstcivil = new JLabel("Est.Civil:");
		
		cbcivil = new JComboBox();
		cbcivil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ecivil= cbcivil.getSelectedItem().toString();
			}
		});
		cbcivil.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Viudo", "Divorciado", "Conviviente"}));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEstcivil)
						.addComponent(lblDni)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(lblCodigo)
							.addComponent(lblApellidos)
							.addComponent(lblNombres)
							.addComponent(lblFecnac)
							.addComponent(lblDireccionn)))
					.addGap(23)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(txtfnac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(lblddmmaaaa))
						.addComponent(txtapellidos, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtcodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtnombres, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtdireccion, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(cbcivil, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
									.addComponent(txtdni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(32)
									.addComponent(lblSexo)))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(cbmujer)
								.addComponent(cbhombre))))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodigo)
						.addComponent(txtcodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidos)
						.addComponent(txtapellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombres)
						.addComponent(txtnombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFecnac)
						.addComponent(txtfnac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblddmmaaaa))
					.addGap(27)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDireccionn)
						.addComponent(txtdireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni)
						.addComponent(txtdni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSexo)
						.addComponent(cbhombre))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(cbmujer)
							.addGap(18)
							.addComponent(lblEstcivil))
						.addComponent(cbcivil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnGrabar = new JButton("Grabar");
			btnGrabar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					agregar_cliente();
				}
			});
			buttonPane.add(btnGrabar);
			{
				JButton btnOtro = new JButton("Otro Cliente");
				btnOtro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						limpiar_ventana();
					}
				});
				btnOtro.setActionCommand("OK");
				buttonPane.add(btnOtro);
				getRootPane().setDefaultButton(btnOtro);
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
	}

	protected void limpiar_ventana() {
		// TODO Auto-generated method stub
		txtapellidos.setText("");
		txtcodigo.setText("");
		txtdireccion.setText("");
		txtdni.setText("");
		txtfnac.setText("");
		txtnombres.setText("");
		buttonGroup.clearSelection();
		cbcivil.setSelectedIndex(0);
		txtcodigo.grabFocus();
	}

	protected void agregar_cliente() {
		// TODO Auto-generated method stub
		int opcion= JOptionPane.showConfirmDialog(this,
				"Esta seguro que los datos del cliente\n son correctos?",
				"Aviso de confirmacion para grabacion", 
				JOptionPane.YES_NO_OPTION);
		if(opcion == JOptionPane.YES_OPTION){
			Cliente xcliente = new Cliente();
			xcliente.setApellidos(txtapellidos.getText());
			xcliente.setCodigo(txtcodigo.getText());
			xcliente.setDireccion(txtdireccion.getText());
			xcliente.setDni(txtdni.getText());
			xcliente.setEst_civil(ecivil);
			xcliente.setFec_nac(new Date(txtfnac.getText()));
			xcliente.setNombres(txtnombres.getText());
			xcliente.setSexo(nsexo);
			boolean exito = xcliente.crear_cliente();
			if(exito){
				JOptionPane.showMessageDialog(this,
						"El cliente fue creado correctamente");
			}else{
				JOptionPane.showMessageDialog(this,
						"Error durante ingreso de datos");
			}
		}
	}
}
