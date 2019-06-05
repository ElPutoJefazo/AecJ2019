package Fachada;


import almacenes.AlmacenList;
import modelo.Medico;
import modelo.Paciente;
import almacenes.AlmacenRutaDestino;

public class Datos {

	private AlmacenRutaDestino<Paciente>AlmacenPaciente= new AlmacenRutaDestino<>(RUTAPACIENTES, "pacientes.pac");
	public static final String RUTAPACIENTES = "\\AecJ2019\\PracticaFinal2019\\Datos\\Pacientes";
	

	public boolean grabarPaciente(Paciente paciente) {
		return AlmacenPaciente.grabar(paciente.getId(),paciente);
	}

//	private boolean borrar(String nombreElemento) {
//		return AlmacenPaciente.borrar(nombreElemento);
//	}

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
