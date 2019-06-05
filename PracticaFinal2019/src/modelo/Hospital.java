package modelo;

import java.util.ArrayList;

import Fachada.Datos;

public class Hospital {

	private ArrayList<Medico> medicos;
	private ArrayList<Paciente> pacientes;
	private Datos datos;

	public Hospital(ArrayList<Medico> medicos, ArrayList<Paciente> pacientes, Datos fachada) {
		super();
		this.medicos = medicos;
		this.pacientes = pacientes;
		this.datos = fachada;
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

}
