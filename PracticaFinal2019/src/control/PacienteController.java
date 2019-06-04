package control;

import modelo.Hospital;

public class PacienteController {

	private Hospital hospital;
	ParaUI paraUI;
	
	public PacienteController(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	public Hospital getHospital() {
		return hospital;
	}

	private boolean darAltaPaciente() {
		// TODO
		return false;
	}

	private boolean darBajaPAciente() {
		// TODO
		return false;
	}

	private boolean modificarPaciente() {
		// TODO
		return false;
	}

	private boolean solicitarCita() {
		// TODO
		return false;
	}

	private void accederCitasPendientes() {
		// TODO
	}
	
	private boolean validarPaciente() {
		// TODO
		return false;
	}

	private boolean validarCita() {
		// TODO
		return false;
	}
}
