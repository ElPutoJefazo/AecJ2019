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
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PacienteBaja extends JPanel {

	private JPanel contentPane;
	protected ValidarError validarError = new ValidarError();
	protected BuscarPaciente buscarPaciente = new BuscarPaciente();
	private JButton btnEliminarPaciente;


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
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		contentPane.add(panelBuscarPaciente);
		contentPane.add(panelValidarError);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		btnEliminarPaciente = new JButton("Eliminar paciente");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(28)
					.addComponent(btnEliminarPaciente)
					.addContainerGap(620, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(47)
					.addComponent(btnEliminarPaciente)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getBtnEliminarPaciente() {
		return btnEliminarPaciente;
	}

}
