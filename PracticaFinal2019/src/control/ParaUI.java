package control;

import vista.panels.VistaPrincipal;

public class ParaUI extends VistaPrincipal  {

	private ParaUI myself = this;
	PacienteController pacienteController = new PacienteController(myself);
	MedicoController medicoController = new MedicoController(myself);


	public ParaUI() {
		super();
		pacienteController = new PacienteController(this);
		medicoController = new MedicoController(this);
		

//		getBtnValidar().addActionListener((e) -> {
//	
//		});

		
		
	}

}
