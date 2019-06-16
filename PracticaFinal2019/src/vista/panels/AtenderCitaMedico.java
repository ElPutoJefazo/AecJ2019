package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.subpanels.BuscarMedico;
import vista.subpanels.BuscarPaciente;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class AtenderCitaMedico extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	protected BuscarPaciente buscarPaciente = new BuscarPaciente();
	protected BuscarMedico buscarMedico = new BuscarMedico();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtenderCitaMedico frame = new AtenderCitaMedico();
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
	public AtenderCitaMedico() {
		setBounds(100, 100, 872, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		buscarMedico.setLayout(new BoxLayout(buscarMedico, BoxLayout.Y_AXIS));
		buscarPaciente.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JPanel panelBuscarMedico = new JPanel();
		panel.add(panelBuscarMedico);
		panelBuscarMedico.setLayout(new BorderLayout(0, 0));
		panelBuscarMedico.add(buscarMedico.getPanelBuscarMedico());
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		JPanel panelBuscarPaciente = new JPanel();
		panel_1.add(panelBuscarPaciente);
		panelBuscarPaciente.setLayout(new BorderLayout(0, 0));
		panelBuscarPaciente.add(buscarPaciente.getPanelBuscarPaciente());
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		JButton btnAtender = new JButton("Atender");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAtender)
					.addContainerGap(524, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(26)
					.addComponent(btnAtender)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(262)
					.addComponent(lblMensaje)
					.addContainerGap(277, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(71, Short.MAX_VALUE)
					.addComponent(lblMensaje)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(117)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(5)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(82, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextField() {
		return textField;
	}

	public BuscarPaciente getBuscarPaciente() {
		return buscarPaciente;
	}

	public BuscarMedico getBuscarMedico() {
		return buscarMedico;
	}
}