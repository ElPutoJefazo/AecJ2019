package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Fachada.Datos;
import modelo.Hospital;
import modelo.Medico;
import modelo.Paciente;
import vista.panels.VistaPrincipal;

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

		modificarPaciente.getBtnModificar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pacienteController.modificarPaciente(modificarPaciente.getTxtDireccion().getText(),
						modificarPaciente.getTxtTelefono().getText());
			}
		});

	}

}
