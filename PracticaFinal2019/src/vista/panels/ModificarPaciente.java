package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.subpanels.BuscarPaciente;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class ModificarPaciente extends JPanel {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtEspecialidad;
	private JLabel lblMensaje;
	private JTextField txtMensaje;
	private JPanel panelBuscarMedico;
	private JButton btnModificar;
	protected BuscarPaciente buscarPaciente = new BuscarPaciente();
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarPaciente frame = new ModificarPaciente();
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
	public ModificarPaciente() {
		setBounds(100, 100, 749, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		buscarPaciente.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		
				panelBuscarMedico = new JPanel();
				panelBuscarMedico.setLayout(new BorderLayout(0, 0));
				panelBuscarMedico.add(buscarPaciente.getPanelBuscarPaciente());
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panelBuscarMedico, GroupLayout.PREFERRED_SIZE, 481, Short.MAX_VALUE)
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(panelBuscarMedico, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
				panel.setLayout(gl_panel);
		
		panel_14 = new JPanel();
		contentPane.add(panel_14);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		
				JLabel lblNombre = new JLabel("Nombre");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GroupLayout gl_panel_1 = new GroupLayout(panel_1);
				gl_panel_1.setHorizontalGroup(
					gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(79)
							.addComponent(lblNombre)
							.addContainerGap(322, Short.MAX_VALUE))
				);
				gl_panel_1.setVerticalGroup(
					gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(26)
							.addComponent(lblNombre)
							.addContainerGap(33, Short.MAX_VALUE))
				);
				panel_1.setLayout(gl_panel_1);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		
				txtNombre = new JTextField();
				txtNombre.setEnabled(false);
				txtNombre.setColumns(10);
				GroupLayout gl_panel_2 = new GroupLayout(panel_2);
				gl_panel_2.setHorizontalGroup(
					gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(80)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(118, Short.MAX_VALUE))
				);
				gl_panel_2.setVerticalGroup(
					gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(31)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(31, Short.MAX_VALUE))
				);
				panel_2.setLayout(gl_panel_2);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3);
		
				JLabel lblApellidos = new JLabel("Apellidos");
				lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GroupLayout gl_panel_3 = new GroupLayout(panel_3);
				gl_panel_3.setHorizontalGroup(
					gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(81)
							.addComponent(lblApellidos)
							.addContainerGap(310, Short.MAX_VALUE))
				);
				gl_panel_3.setVerticalGroup(
					gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(22)
							.addComponent(lblApellidos)
							.addContainerGap(37, Short.MAX_VALUE))
				);
				panel_3.setLayout(gl_panel_3);
		
		panel_4 = new JPanel();
		contentPane.add(panel_4);
		
				txtApellidos = new JTextField();
				txtApellidos.setEnabled(false);
				txtApellidos.setColumns(10);
				GroupLayout gl_panel_4 = new GroupLayout(panel_4);
				gl_panel_4.setHorizontalGroup(
					gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(80)
							.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(117, Short.MAX_VALUE))
				);
				gl_panel_4.setVerticalGroup(
					gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(26)
							.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(36, Short.MAX_VALUE))
				);
				panel_4.setLayout(gl_panel_4);
		
		panel_5 = new JPanel();
		contentPane.add(panel_5);
		
				JLabel lblTelefono = new JLabel("Telefono");
				lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GroupLayout gl_panel_5 = new GroupLayout(panel_5);
				gl_panel_5.setHorizontalGroup(
					gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(82)
							.addComponent(lblTelefono)
							.addContainerGap(311, Short.MAX_VALUE))
				);
				gl_panel_5.setVerticalGroup(
					gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(23)
							.addComponent(lblTelefono)
							.addContainerGap(36, Short.MAX_VALUE))
				);
				panel_5.setLayout(gl_panel_5);
		
		panel_6 = new JPanel();
		contentPane.add(panel_6);
		
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				GroupLayout gl_panel_6 = new GroupLayout(panel_6);
				gl_panel_6.setHorizontalGroup(
					gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(82)
							.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(116, Short.MAX_VALUE))
				);
				gl_panel_6.setVerticalGroup(
					gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(29)
							.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(33, Short.MAX_VALUE))
				);
				panel_6.setLayout(gl_panel_6);
		
		panel_7 = new JPanel();
		contentPane.add(panel_7);
		
				JLabel lblDireccion = new JLabel("Direccion");
				lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GroupLayout gl_panel_7 = new GroupLayout(panel_7);
				gl_panel_7.setHorizontalGroup(
					gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(87)
							.addComponent(lblDireccion)
							.addContainerGap(302, Short.MAX_VALUE))
				);
				gl_panel_7.setVerticalGroup(
					gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(28)
							.addComponent(lblDireccion)
							.addContainerGap(31, Short.MAX_VALUE))
				);
				panel_7.setLayout(gl_panel_7);
		
		panel_8 = new JPanel();
		contentPane.add(panel_8);
		
				txtDireccion = new JTextField();
				txtDireccion.setColumns(10);
				GroupLayout gl_panel_8 = new GroupLayout(panel_8);
				gl_panel_8.setHorizontalGroup(
					gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(86)
							.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(113, Short.MAX_VALUE))
				);
				gl_panel_8.setVerticalGroup(
					gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(28)
							.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(34, Short.MAX_VALUE))
				);
				panel_8.setLayout(gl_panel_8);
		
		panel_9 = new JPanel();
		contentPane.add(panel_9);
		
				JLabel lblEspecialidad = new JLabel("Especialidad");
				lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GroupLayout gl_panel_9 = new GroupLayout(panel_9);
				gl_panel_9.setHorizontalGroup(
					gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(93)
							.addComponent(lblEspecialidad)
							.addContainerGap(268, Short.MAX_VALUE))
				);
				gl_panel_9.setVerticalGroup(
					gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGap(27)
							.addComponent(lblEspecialidad)
							.addContainerGap(32, Short.MAX_VALUE))
				);
				panel_9.setLayout(gl_panel_9);
		
		panel_10 = new JPanel();
		contentPane.add(panel_10);
		
				txtEspecialidad = new JTextField();
				txtEspecialidad.setEditable(false);
				txtEspecialidad.setColumns(10);
				GroupLayout gl_panel_10 = new GroupLayout(panel_10);
				gl_panel_10.setHorizontalGroup(
					gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(88)
							.addComponent(txtEspecialidad, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(112, Short.MAX_VALUE))
				);
				gl_panel_10.setVerticalGroup(
					gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGap(31)
							.addComponent(txtEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(31, Short.MAX_VALUE))
				);
				panel_10.setLayout(gl_panel_10);
		
		panel_11 = new JPanel();
		contentPane.add(panel_11);
		
				lblMensaje = new JLabel("Mensaje");
				lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GroupLayout gl_panel_11 = new GroupLayout(panel_11);
				gl_panel_11.setHorizontalGroup(
					gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(97)
							.addComponent(lblMensaje)
							.addContainerGap(300, Short.MAX_VALUE))
				);
				gl_panel_11.setVerticalGroup(
					gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(30)
							.addComponent(lblMensaje)
							.addContainerGap(29, Short.MAX_VALUE))
				);
				panel_11.setLayout(gl_panel_11);
		
		panel_12 = new JPanel();
		contentPane.add(panel_12);
		
				txtMensaje = new JTextField();
				txtMensaje.setEditable(false);
				txtMensaje.setColumns(10);
				GroupLayout gl_panel_12 = new GroupLayout(panel_12);
				gl_panel_12.setHorizontalGroup(
					gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(91)
							.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(112, Short.MAX_VALUE))
				);
				gl_panel_12.setVerticalGroup(
					gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(32)
							.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(30, Short.MAX_VALUE))
				);
				panel_12.setLayout(gl_panel_12);
		
		panel_13 = new JPanel();
		contentPane.add(panel_13);
		
				btnModificar = new JButton("Modificar");
				panel_13.add(btnModificar);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}
}