package control;

import modelo.Hospital;
import modelo.Medico;

public class MedicoController {

	Hospital hospital;
	ParaUI paraUI;
	
	public MedicoController(ParaUI paraUI, Hospital hospital) {
		super();
		this.paraUI = paraUI;
		this.hospital = hospital;
	}

	public boolean darAltaMedico(Medico medico) {
		// TODO
		return false;
	}

	public boolean darBajaMedico(Medico medico) {
		// TODO
		return false;
	}



	private void consultarDatosPaciente(Medico medico) {
		// TODO
	}

	private void recetarTratamiento(Medico medico) {
		// TODO
	}
	
	private boolean validarMedico(Medico medico) {
		// TODO
		return false;
	}
}
