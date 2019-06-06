package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolBar;
import javax.swing.RootPaneContainer;
import javax.swing.JDesktopPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	protected ConsultarCitas consultarCitas = new ConsultarCitas();
	protected PacienteAlta pacienteAlta = new PacienteAlta();
	protected AtenderCitaMedico atenderCitaMedico = new AtenderCitaMedico();
	protected ModificarPaciente modificarPaciente = new ModificarPaciente();
	protected PacienteBaja pacienteBaja = new PacienteBaja();
	protected PedirCitaPrimaria pedirCitaPrimaria = new PedirCitaPrimaria();
	protected ResultadoCitaMedico resultadoCitaMedico = new ResultadoCitaMedico();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VistaPrincipal() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 606);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblBienvenidosAlHospital = new JLabel("Bienvenidos al Hospital Mata Sanos");
		lblBienvenidosAlHospital.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBienvenidosAlHospital);
		lblBienvenidosAlHospital.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 733, 21);
		setJMenuBar(menuBar);
		
		JMenu mnPaciente = new JMenu("Paciente");
		menuBar.add(mnPaciente);
		
		JMenuItem mntmAltapaciente = new JMenuItem("Alta Paciente");
		mnPaciente.add(mntmAltapaciente);
		
		mntmAltapaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(pacienteAlta.getContentPane());
			getContentPane().repaint();
			}
			});
		
		JMenuItem mntmBajaPaciente = new JMenuItem("Baja Paciente");
		mnPaciente.add(mntmBajaPaciente);
		
		mntmBajaPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(pacienteBaja.getContentPane());
			getContentPane().repaint();
			}
			});
		
		JMenuItem mntmModificarPaciente = new JMenuItem("Modificar Paciente");
		mnPaciente.add(mntmModificarPaciente);
		
		mntmModificarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(modificarPaciente.getContentPane());
			getContentPane().repaint();
			}
			});
		
		JMenuItem mntmSolicitarCitas = new JMenuItem("Solicitar Citas");
		mnPaciente.add(mntmSolicitarCitas);
		
		mntmSolicitarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(pedirCitaPrimaria.getContentPane());
			getContentPane().repaint();
			}
			});
		
		JMenuItem mntmAccesoCitasPendientes = new JMenuItem("Acceso Citas Pendientes");
		mnPaciente.add(mntmAccesoCitasPendientes);
		
		mntmAccesoCitasPendientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(accesoCitasPendientes.getContentPane());
			getContentPane().repaint();
			}
			});
		
		JMenu mnMedico = new JMenu("Medico");
		menuBar.add(mnMedico);
		
		JMenuItem mntmAltaMedico = new JMenuItem("Alta Medico");
		mnMedico.add(mntmAltaMedico);
		
		mntmAltaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(altaMedico.getContentPane());
			contentPane.repaint();
			}
			});
		
		JMenuItem mntmBajaMedico = new JMenuItem("Baja Medico");
		mnMedico.add(mntmBajaMedico);
		
		mntmBajaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(bajaMedico.getContentPane());
			getContentPane().repaint();
			}
			});

		
		JMenuItem mntmConsultarDatosPacientes = new JMenuItem("Consultar Datos Pacientes");
		mnMedico.add(mntmConsultarDatosPacientes);
		
		mntmConsultarDatosPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(consultarDatosPacientes.getContentPane());
			getContentPane().repaint();
			}
			});
		
		JMenuItem mntmConsultarCitasPacientes = new JMenuItem("Consultar Citas Pacientes");
		mnMedico.add(mntmConsultarCitasPacientes);
		
		mntmConsultarCitasPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(consultarCitas.getContentPane());
			getContentPane().repaint();
			}
			});
		
		JMenuItem mntmRecetarTratamiento = new JMenuItem("Recetar Tratamiento");
		mnMedico.add(mntmRecetarTratamiento);
		
		mntmRecetarTratamiento.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		getContentPane().remove(contentPane);
		//setContentPane(recetaTratamiento.getContentPane());
		getContentPane().repaint();
		}
		});
		
		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
	}
	
	
	
	
}
