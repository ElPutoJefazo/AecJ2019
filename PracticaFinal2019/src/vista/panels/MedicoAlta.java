package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Utilities;

import modelo.Especialidad;
import utiles.ComboBox;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MedicoAlta extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreMedico;
	private JTextField txtDireccionMedico;
	private JTextField txtTelefonoMedico;
	private JTextField txtMensaje;
	private JButton btnDarAlta;
	private JComboBox comboEspecialidad;
	ComboBox rellenarCombo = new ComboBox();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicoAlta frame = new MedicoAlta();
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
	public MedicoAlta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDarAltaMedico = new JLabel("Dar alta medico");
		lblDarAltaMedico.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtNombreMedico = new JTextField();
		txtNombreMedico.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtDireccionMedico = new JTextField();
		txtDireccionMedico.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTelefonoMedico = new JTextField();
		txtTelefonoMedico.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnDarAlta = new JButton("Dar alta");
		
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		txtMensaje.setColumns(10);
		
		comboEspecialidad = new JComboBox();
		rellenarCombo.rellenarComboBox(comboEspecialidad);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDireccion)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtDireccionMedico, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblTelefono)
									.addGap(18)
									.addComponent(txtTelefonoMedico, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
								.addComponent(lblDarAltaMedico)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNombre)
									.addGap(18)
									.addComponent(txtNombreMedico, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblEspecialidad)
									.addGap(9)
									.addComponent(comboEspecialidad, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
							.addGap(341))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMensaje)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMensaje, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnDarAlta)
							.addGap(172))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDarAltaMedico)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombreMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDireccion)
						.addComponent(txtDireccionMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTelefono)
						.addComponent(txtTelefonoMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblEspecialidad))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(comboEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDarAlta)
						.addComponent(lblMensaje)
						.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JButton getBtnDarAlta() {
		return btnDarAlta;
	}

	public JTextField getTxtNombreMedico() {
		return txtNombreMedico;
	}

	public JTextField getTxtDireccionMedico() {
		return txtDireccionMedico;
	}

	public JTextField getTxtTelefonoMedico() {
		return txtTelefonoMedico;
	}

	public JComboBox getComboEspecialidad() {
		return comboEspecialidad;
	}

}
