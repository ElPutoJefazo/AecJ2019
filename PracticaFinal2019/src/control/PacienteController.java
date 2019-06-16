package control;

import Fachada.Datos;
import modelo.Hospital;
import modelo.Paciente;
import vista.panels.ModificarPaciente;

public class PacienteController {

	private Hospital hospital;
	ParaUI paraUI;
	Datos datos = new Datos();

	public PacienteController(ParaUI paraUI, Hospital hospital) {
		super();
		this.paraUI = paraUI;
		this.hospital = hospital;
	}

	public boolean darAltaPaciente(Paciente paciente) {
		return datos.grabarPaciente(paciente);

	}

	public boolean darBajaPaciente(Paciente paciente) {
		return datos.borrar(paciente.getId());
	}

	public boolean modificarPaciente(String id, String nuevaDireccion) {
		Paciente paciente = this.hospital.getPaciente(id);
		paciente.setDireccion(nuevaDireccion);
		return datos.grabarPaciente(paciente);
	}

	private boolean solicitarCita(Paciente paciente) {
		// TODO
		return false;
	}

	private void comprobarCita(Paciente paciente) {
		// TODO
	}

	private void asignarCita(Paciente paciente) {
		// TODO
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
