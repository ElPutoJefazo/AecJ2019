package control;

import java.time.LocalDate;

import Fachada.Datos;
import modelo.Hospital;
import modelo.Medico;
import modelo.Paciente;
import modelo.Tratamiento;

public class MedicoController {

	Hospital hospital;
	ParaUI paraUI;
	Datos datos = new Datos();
	
	public MedicoController(ParaUI paraUI, Hospital hospital) {
		super();
		this.paraUI = paraUI;
		this.hospital = hospital;
	}

	public boolean darAltaMedico(Medico medico) {
		return hospital.getMedicos().add(medico);
	}

	public boolean darBajaMedico(Medico medico) {
		return hospital.getMedicos().remove(medico);
	}

	private void consultarDatosPaciente(Paciente paciente) {
		datos.obtenerPaciente(paciente.getId());
	}

	private void recetarTratamiento(String dosis, LocalDate fechaInicio, LocalDate fechaFin) {
		Tratamiento tratamiento = new Tratamiento(dosis, fechaInicio, fechaFin);
	}
	
	private boolean validarMedico(Medico medico) {
		// TODO
		return false;
	}
}
