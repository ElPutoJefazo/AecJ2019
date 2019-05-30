package modelo;

import java.util.ArrayList;

public class Hospital {

	private ArrayList<Medico> medicos;
	private ArrayList<Paciente> pacientes;

	public Hospital(ArrayList<Medico> medicos, ArrayList<Paciente> pacientes) {
		super();
		this.medicos = medicos;
		this.pacientes = pacientes;
	}

	public Hospital() {
		super();
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

}
