package control;

import modelo.Hospital;
import modelo.Paciente;

public class PacienteController {

	private Hospital hospital;
	ParaUI paraUI;
	
	public PacienteController(ParaUI paraUI, Hospital hospital) {
		super();
		this.paraUI = paraUI;
		this.hospital = hospital;
	}

	public boolean darAltaPaciente(Paciente paciente) {
		// TODO
		return false;
	}

	public boolean darBajaPaciente(Paciente paciente) {
		// TODO
		return false;
	}

	public boolean modificarPaciente(Paciente paciente) {
		// TODO
		return false;
	}

	private boolean solicitarCita(Paciente paciente) {
		// TODO
		return false;
	}

	private void accederCitasPendientes(Paciente paciente) {
		// TODO
	}
	
	private boolean validarPaciente(Paciente paciente) {
		// TODO
		return false;
	}

	private boolean validarCita(Paciente paciente) {
		// TODO
		return false;
	}
}
