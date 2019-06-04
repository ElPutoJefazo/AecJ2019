package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import vista.subpanels.BuscarPaciente;
import vista.subpanels.ValidarError;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;

public class ConsultarCitas extends JPanel {

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
					ConsultarCitas frame = new ConsultarCitas();
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
	public ConsultarCitas() {
		setBounds(100, 100, 633, 666);
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

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMedico = new JLabel("Medico");
		lblMedico.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblOperacion = new JLabel("Operacion");
		lblOperacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblFechaUno = new JLabel("");
		lblFechaUno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMedicoUno = new JLabel("");
		lblMedicoUno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblOperacionUno = new JLabel("");
		lblOperacionUno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelValidarError, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFechaUno))
							.addGap(63)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMedico)
								.addComponent(lblMedicoUno))
							.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOperacionUno)
								.addComponent(lblOperacion))
							.addGap(96))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelValidarError, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOperacion)
						.addComponent(lblMedico)
						.addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaUno)
						.addComponent(lblMedicoUno)
						.addComponent(lblOperacionUno))
					.addContainerGap(278, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
//	public JLabel getTextDescripcionAltaArticulo() {
//		return validarError.getLblErrorAlIntentar();
//	}

	public JPanel getContentPane() {
		return contentPane;
	}
}
