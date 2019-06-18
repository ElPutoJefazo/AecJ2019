package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import Fachada.Datos;
import modelo.Especialidad;
import modelo.Hospital;
import modelo.Medico;
import modelo.Paciente;
import vista.panels.VistaPrincipal;
import vista.subpanels.BuscarMedico;
import vista.subpanels.BuscarPaciente;

public class ParaUI extends VistaPrincipal {

	private ParaUI myself = this;
	Hospital hospital;
	ArrayList<Medico> ListMedicos;
	ArrayList<Paciente> ListPacientes;
	Datos datos;
	PacienteController pacienteController = new PacienteController(myself, hospital);
	MedicoController medicoController = new MedicoController(myself, hospital);

	public ParaUI() {
		super();
		hospital = new Hospital(ListMedicos, ListPacientes, datos);
		pacienteController = new PacienteController(this, hospital);
		medicoController = new MedicoController(this, hospital);

		//Modificar paciente
		modificarPaciente.getBtnModificar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pacienteController.modificarPaciente(modificarPaciente.getTxtDireccion().getText(),
						modificarPaciente.getTxtTelefono().getText());
			}
		});
		
		//Dar alta paciente
		pacienteAlta.getBtnDarAltaPaciente().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pacienteController.darAltaPaciente(new Paciente(pacienteAlta.getTxtNombre().getText(), pacienteAlta.getTxtDireccion().getText()
						, pacienteAlta.getTxtTelefono().getText(), LocalDate.parse(pacienteAlta.getTxtFecha().getText())));
			}
		});
		
		//Dar baja paciente
		pacienteBaja.getBtnEliminarPaciente().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarPaciente buscarPaciente = new BuscarPaciente();
				int index = (int)buscarPaciente.getComboBoxID().getSelectedItem();
				pacienteController.darBajaPaciente(ListPacientes.get(index));
			}
		});
		
		//Dar alta medico
		medicoAlta.getBtnDarAlta().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medicoController.darAltaMedico(new Medico(medicoAlta.getTxtNombreMedico().getText(), medicoAlta.getTxtDireccionMedico().getText(), 
						medicoAlta.getTxtTelefonoMedico().getText(),(Especialidad) medicoAlta.getComboEspecialidad().getSelectedItem()));
			}
		});
		
		//Dar baja medico
		medicoBaja.getBtnEliminarMedico().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarMedico buscarMedico = new BuscarMedico();
				int index = (int) buscarMedico.getComboBoxID().getSelectedItem();
				medicoController.darBajaMedico(ListMedicos.get(index));
			}
		});

	}

}
