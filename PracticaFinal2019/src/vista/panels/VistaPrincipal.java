package vista.panels;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JMenuBar menuBar;
	private JMenu mnPaciente;
	private JMenuItem mntmAltapaciente;
	private JMenuItem mntmBajaPaciente;
	private JMenuItem mntmModificarPaciente;
	private JMenuItem mntmSolicitarCitas;
	private JMenuItem mntmAccesoCitasPendientes;
	private JMenu mnMedico;
	private JMenuItem mntmAltaMedico;
	private JMenuItem mntmBajaMedico;
	private JMenuItem mntmConsultarDatosPacientes;
	private JMenuItem mntmConsultarCitasPacientes;
	private JMenuItem mntmRecetarTratamiento;
	private JMenu mnOperaciones;

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
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 733, 21);
		setJMenuBar(menuBar);
		
		mnPaciente = new JMenu("Paciente");
		menuBar.add(mnPaciente);
		
		mntmAltapaciente = new JMenuItem("Alta Paciente");
		mnPaciente.add(mntmAltapaciente);
		
		mntmBajaPaciente = new JMenuItem("Baja Paciente");
		mnPaciente.add(mntmBajaPaciente);
		
		mntmModificarPaciente = new JMenuItem("Modificar Paciente");
		mnPaciente.add(mntmModificarPaciente);
		
		mntmSolicitarCitas = new JMenuItem("Solicitar Citas");
		mnPaciente.add(mntmSolicitarCitas);
		
		mntmAccesoCitasPendientes = new JMenuItem("Acceso Citas Pendientes");
		mnPaciente.add(mntmAccesoCitasPendientes);

		
		mnMedico = new JMenu("Medico");
		menuBar.add(mnMedico);
		
		mntmAltaMedico = new JMenuItem("Alta Medico");
		mnMedico.add(mntmAltaMedico);

		mntmBajaMedico = new JMenuItem("Baja Medico");
		mnMedico.add(mntmBajaMedico);
		
		mntmConsultarDatosPacientes = new JMenuItem("Consultar Datos Pacientes");
		mnMedico.add(mntmConsultarDatosPacientes);

		
		mntmConsultarCitasPacientes = new JMenuItem("Consultar Citas Pacientes");
		mnMedico.add(mntmConsultarCitasPacientes);

		
		mntmRecetarTratamiento = new JMenuItem("Recetar Tratamiento");
		mnMedico.add(mntmRecetarTratamiento);

		
		mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
		
		
		mntmAltapaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(pacienteAlta.getContentPane());
			getContentPane().repaint();
			}
			});

		
		mntmBajaPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(pacienteBaja.getContentPane());
			getContentPane().repaint();
			}
			});

		
		mntmModificarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(modificarPaciente.getContentPane());
			getContentPane().repaint();
			}
			});

		
		mntmSolicitarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(pedirCitaPrimaria.getContentPane());
			getContentPane().repaint();
			}
			});

		mntmAccesoCitasPendientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(accesoCitasPendientes.getContentPane());
			getContentPane().repaint();
			}
			});

		
		mntmAltaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(altaMedico.getContentPane());
			contentPane.repaint();
			}
			});

		mntmBajaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(bajaMedico.getContentPane());
			getContentPane().repaint();
			}
			});

		
		mntmConsultarDatosPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			//setContentPane(consultarDatosPacientes.getContentPane());
			getContentPane().repaint();
			}
			});

		
		mntmConsultarCitasPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			getContentPane().remove(contentPane);
			setContentPane(consultarCitas.getContentPane());
			getContentPane().repaint();
			}
			});
		
		
		mntmRecetarTratamiento.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		getContentPane().remove(contentPane);
		//setContentPane(recetaTratamiento.getContentPane());
		getContentPane().repaint();
		}
		});
	}

	public JMenuItem getMntmAltapaciente() {
		return mntmAltapaciente;
	}

	public JMenuItem getMntmBajaPaciente() {
		return mntmBajaPaciente;
	}

	public JMenuItem getMntmModificarPaciente() {
		return mntmModificarPaciente;
	}

	public JMenuItem getMntmSolicitarCitas() {
		return mntmSolicitarCitas;
	}

	public JMenuItem getMntmAccesoCitasPendientes() {
		return mntmAccesoCitasPendientes;
	}

	public JMenuItem getMntmAltaMedico() {
		return mntmAltaMedico;
	}

	public JMenuItem getMntmBajaMedico() {
		return mntmBajaMedico;
	}

	public JMenuItem getMntmConsultarDatosPacientes() {
		return mntmConsultarDatosPacientes;
	}

	public JMenuItem getMntmConsultarCitasPacientes() {
		return mntmConsultarCitasPacientes;
	}

	public JMenuItem getMntmRecetarTratamiento() {
		return mntmRecetarTratamiento;
	}

	public JPanel getContentPane() {
		return contentPane;
	}
	
	
	
	
}
