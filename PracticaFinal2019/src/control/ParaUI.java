package control;

import java.util.ArrayList;

import Fachada.Datos;
import modelo.Hospital;
import modelo.Medico;
import modelo.Paciente;
import vista.panels.VistaPrincipal;

public class ParaUI extends VistaPrincipal  {

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
	
	}

}
