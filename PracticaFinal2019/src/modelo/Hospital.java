package modelo;

import java.util.ArrayList;

public class Hospital {

	private ArrayList<Medico> medicos;
	private ArrayList<Paciente> pacientes;
	private Fachada fachada;

	public Hospital(ArrayList<Medico> medicos, ArrayList<Paciente> pacientes, Fachada fachada) {
		super();
		this.medicos = medicos;
		this.pacientes = pacientes;
		this.fachada = fachada;
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

	public Fachada getFachada() {
		return fachada;
	}

	public void setFachada(Fachada fachada) {
		this.fachada = fachada;
	}

}
