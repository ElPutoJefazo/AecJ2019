package modelo;

public class Intervencion {

	private boolean realizacion;
	private TipoIntervencion tipoIntervencion;
	private boolean resultado;

	public Intervencion() {
		super();
	}

	public Intervencion(boolean realizacion, TipoIntervencion tipoIntervencion, boolean resultado) {
		super();
		this.realizacion = realizacion;
		this.tipoIntervencion = tipoIntervencion;
		this.resultado = resultado;
	}

	public boolean isRealizacion() {
		return realizacion;
	}

	public void setRealizacion(boolean realizacion) {
		this.realizacion = realizacion;
	}

	public TipoIntervencion getTipoIntervencion() {
		return tipoIntervencion;
	}

	public void setTipoIntervencion(TipoIntervencion tipoIntervencion) {
		this.tipoIntervencion = tipoIntervencion;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
}
