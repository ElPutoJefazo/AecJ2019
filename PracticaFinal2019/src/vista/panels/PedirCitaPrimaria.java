package vista.panels;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.subpanels.BuscarMedico;
import vista.subpanels.BuscarPaciente;
import vista.subpanels.Horario;
import vista.subpanels.ValidarError;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.GridLayout;

public class PedirCitaPrimaria extends JPanel {

	private JPanel contentPane;
	protected ValidarError validarError = new ValidarError();
	protected BuscarPaciente buscarPaciente = new BuscarPaciente();
	protected BuscarMedico buscarMedico = new BuscarMedico();
	protected Horario panelHorarioMedico = new Horario();



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


	public PedirCitaPrimaria() {
		setBounds(100, 100, 596, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		buscarPaciente.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		buscarMedico.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		validarError.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		panelHorarioMedico.setLayout(new BoxLayout(buscarPaciente, BoxLayout.Y_AXIS));
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JPanel panelBuscarPaciente = new JPanel();
		panelBuscarPaciente.setLayout(new BorderLayout(0, 0));
		panelBuscarPaciente.add(buscarPaciente.getPanelBuscarPaciente());
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 603, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(panelBuscarPaciente, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		JPanel panelBuscarMedico = new JPanel();
		panel_1.add(panelBuscarMedico);
		panelBuscarMedico.setLayout(new BorderLayout(0, 0));
		panelBuscarMedico.add(buscarMedico.getPanelBuscarMedico());
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel lblOperacion = new JLabel("Operacion");
		lblOperacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JComboBox comboBox = new JComboBox();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(22)
					.addComponent(lblOperacion)
					.addGap(18)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(287, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOperacion)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblEspecialidadDos = new JLabel("");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(21)
					.addComponent(lblEspecialidad)
					.addContainerGap(469, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(26)
					.addComponent(lblEspecialidad)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		JPanel panelErrorValidar = new JPanel();
		panel_6.add(panelErrorValidar);
		panelErrorValidar.setLayout(new BorderLayout(0, 0));
		panelErrorValidar.add(validarError.getPanelValidarError());
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		
		JPanel panelHorarioDelMedico = new JPanel();
		panel_7.add(panelHorarioDelMedico);
		panelHorarioDelMedico.setLayout(new BorderLayout(0, 0));
		panelHorarioDelMedico.add(panelHorarioMedico.getPanelHorarioMedico());
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		
		JButton btnAtras = new JButton("Atras Satanas");
		panel_8.add(btnAtras);
		JButton btnDarCita = new JButton("Dar cita");
		panel_8.add(btnDarCita);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

}
