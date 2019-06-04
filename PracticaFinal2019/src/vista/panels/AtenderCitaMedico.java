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
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		
		JPanel panelBuscarMedico = new JPanel();
		panelBuscarMedico.setLayout(new BorderLayout(0, 0));
		panelBuscarMedico.add(buscarMedico.getPanelBuscarMedico());
		buscarMedico.setLayout(new BoxLayout(buscarMedico, BoxLayout.Y_AXIS));
		JPanel panelBuscarPaciente = new JPanel();
		panelBuscarPaciente.setLayout(new BorderLayout(0, 0));
		panelBuscarPaciente.add(buscarPaciente.getPanelBuscarPaciente());
		buscarPaciente.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		JButton btnAtender = new JButton("Atender");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblMensaje)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 706, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(panelBuscarMedico, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 863, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(794, Short.MAX_VALUE)
					.addComponent(btnAtender)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelBuscarMedico, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAtender)
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMensaje)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27))
		);
		contentPane.setLayout(gl_contentPane);
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