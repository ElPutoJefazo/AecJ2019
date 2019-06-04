package Fachada;


import almacenes.AlmacenList;
import modelo.Medico;
import modelo.Paciente;
import almacenes.AlmacenRutaDestino;

public class Datos {

	private AlmacenRutaDestino<Paciente>AlmacenPaciente= new AlmacenRutaDestino<>(RUTAPACIENTES, "pacientes.pac");
	public static final String RUTAPACIENTES = "./data/clientes/clientes.data";
	

	public boolean grabarPaciente(Paciente paciente) {
		return AlmacenPaciente.grabar(paciente.getId(),paciente);
	}

	private boolean borrar() {
		// TODO
		return false;
	}

	public Paciente obtenerPaciente(String id) {
		return AlmacenPaciente.obtener(id);
	}


	public String[] getPacientes() {
		return AlmacenPaciente.getFiles(); 
	}

	private AlmacenList getMedicos() {
		// TODO
		return null;
	}

	private Medico obtenerMedico() {
		// TODO
		return null;
	}
}
