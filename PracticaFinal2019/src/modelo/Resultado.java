package modelo;

public class Resultado {

	private Tratamiento tratamiento;
	private String observacion;

	public Resultado(Tratamiento tratamiento, String observacion) {
		super();
		this.tratamiento = tratamiento;
		this.observacion = observacion;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
