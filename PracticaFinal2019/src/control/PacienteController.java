package control;

import java.util.ArrayList;

import Fachada.Datos;
import modelo.Cita;
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

	private boolean solicitarCita(Cita cita) {
		boolean respuesta = true;
		for (Cita citaLista : hospital.getCitas()) {
			if (citaLista.getFecha() == cita.getFecha()) {
				respuesta = false;
			}
		}
		return respuesta;
	}

	private boolean comprobarCita(Cita cita) {
		return cita.isPendiente();
	}

	private void asignarCita(Cita cita) {
		// TODO
	}

	private void accederCitasPendientes(Cita cita) {
		// TODO
	}

	private boolean validarPaciente(Paciente paciente) {
		boolean respuesta = false;
		for (Paciente pacienteLista : hospital.getPacientes()) {
			if (pacienteLista.equals(paciente)) {
				respuesta = true;
			}
		}
		return respuesta;
	}

	private boolean validarCita(Cita cita) {
		// TODO
		return false;
	}
}
