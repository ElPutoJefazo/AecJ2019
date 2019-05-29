package modelo;

public class Fachada {

	private AlmacenList almacenList;
	private AlmacenIndice almacenIndice;

	public AlmacenList getAlmacenList() {
		return almacenList;
	}

	public void setAlmacenList(AlmacenList almacenList) {
		this.almacenList = almacenList;
	}

	public AlmacenIndice getAlmacenIndice() {
		return almacenIndice;
	}

	public void setAlmacenIndice(AlmacenIndice almacenIndice) {
		this.almacenIndice = almacenIndice;
	}

	private boolean grabar() {
		// TODO
		return false;
	}

	private boolean borrar() {
		// TODO
		return false;
	}

	private Paciente obtenerPaciente() {
		// TODO
		return null;
	}

	private Medico obtenerMedico() {
		// TODO
		return null;
	}

	private AlmacenList getPacientes() {
		// TODO
		return null;
	}

	private AlmacenList getMedicos() {
		// TODO
		return null;
	}
}
