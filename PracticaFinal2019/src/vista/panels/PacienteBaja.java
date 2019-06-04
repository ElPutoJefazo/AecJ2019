package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.subpanels.BuscarPaciente;
import vista.subpanels.ValidarError;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PacienteBaja extends JPanel {

	private JPanel contentPane;
	protected ValidarError validarError = new ValidarError();
	protected BuscarPaciente buscarPaciente = new BuscarPaciente();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacienteBaja frame = new PacienteBaja();
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
	public PacienteBaja() {
		setBounds(100, 100, 602, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel panelBuscarPaciente = new JPanel();
		panelBuscarPaciente.setLayout(new BorderLayout(0, 0));
		panelBuscarPaciente.add(buscarPaciente.getPanelBuscarPaciente());
		buscarPaciente.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		JPanel panelValidarError = new JPanel();
		panelValidarError.setLayout(new BorderLayout(0, 0));
		panelValidarError.add(validarError.getPanelValidarError());
		validarError.setLayout(new BoxLayout(validarError, BoxLayout.X_AXIS));
		
		JButton btnEliminarPaciente = new JButton("Eliminar paciente");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 553, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelValidarError, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(465, Short.MAX_VALUE)
					.addComponent(btnEliminarPaciente)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelValidarError, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(btnEliminarPaciente)
					.addGap(50))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

}
