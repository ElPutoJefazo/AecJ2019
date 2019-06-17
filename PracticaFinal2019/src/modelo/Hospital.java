package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import Fachada.Datos;

public class Hospital {

	public ArrayList<Medico> medicos;
	public ArrayList<Paciente> pacientes;
	private Datos datos;
	private ArrayList<Cita> citas;

	public Hospital(ArrayList<Medico> medicos, ArrayList<Paciente> pacientes, Datos fachada) {
		super();
		this.medicos = medicos;
		this.pacientes = pacientes;
		this.datos = fachada;
		this.citas = citas;
	}

	public Paciente getPaciente(String id) {
		Paciente pacienteFinal = new Paciente();
		for (Paciente paciente : pacientes) {
			if (paciente.getId() == id) {
				pacienteFinal = paciente;
			}
		}
		return pacienteFinal;
	}

	public Medico getMedico(String id) {
		Medico medicoFinal = new Medico();
		for (Medico medico : medicos) {
			if (medico.getId() == id) {
				medicoFinal = medico;
			}
		}
		return medicoFinal;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Medico> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public Datos getFachada() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}

}
