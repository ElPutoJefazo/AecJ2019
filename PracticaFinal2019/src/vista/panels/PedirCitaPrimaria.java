package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.subpanels.BuscarMedico;
import vista.subpanels.BuscarPaciente;
import vista.subpanels.PanelHorarioMedico;
import vista.subpanels.ValidarError;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;

public class PedirCitaPrimaria extends JPanel {

	private JPanel contentPane;
	protected ValidarError validarError = new ValidarError();
	protected BuscarPaciente buscarPaciente = new BuscarPaciente();
	protected BuscarMedico buscarMedico = new BuscarMedico();
	protected PanelHorarioMedico panelHorarioMedico = new PanelHorarioMedico();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedirCitaPrimaria frame = new PedirCitaPrimaria();
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
	public PedirCitaPrimaria() {
		setBounds(100, 100, 596, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel panelBuscarPaciente = new JPanel();
		panelBuscarPaciente.setLayout(new BorderLayout(0, 0));
		panelBuscarPaciente.add(buscarPaciente.getPanelBuscarPaciente());
		buscarPaciente.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		JPanel panelBuscarMedico = new JPanel();
		panelBuscarMedico.setLayout(new BorderLayout(0, 0));
		panelBuscarMedico.add(buscarMedico.getPanelBuscarMedico());
		buscarMedico.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		JPanel panelErrorValidar = new JPanel();
		panelErrorValidar.setLayout(new BorderLayout(0, 0));
		panelErrorValidar.add(validarError.getPanelValidarError());
		validarError.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		JButton btnDarCita = new JButton("Dar cita");
		
		JPanel panelHorarioDelMedico = new JPanel();
		panelHorarioDelMedico.setLayout(new BorderLayout(0, 0));
		panelHorarioDelMedico.add(panelHorarioMedico.getPanelHorarioMedico());
		panelHorarioMedico.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblEspecialidadDos = new JLabel("");
		
		JLabel lblOperacion = new JLabel("Operacion");
		lblOperacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnAtras = new JButton("Atras Satanas");
		
		JComboBox comboBox = new JComboBox();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelBuscarMedico, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnAtras)
							.addPreferredGap(ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
							.addComponent(btnDarCita))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(panelHorarioDelMedico, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panelErrorValidar, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEspecialidad)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEspecialidadDos, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblOperacion)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelBuscarMedico, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEspecialidad)
								.addComponent(lblEspecialidadDos, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
							.addGap(26))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblOperacion)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(panelErrorValidar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelHorarioDelMedico, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDarCita)
						.addComponent(btnAtras))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
