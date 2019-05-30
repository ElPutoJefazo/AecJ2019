package modelo;

public abstract class Persona {

	private String nombre;
	private String direccion;
	private String numeroTlf;

	public Persona() {
		super();
	}

	public Persona(String nombre, String direccion, String numeroTlf) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroTlf = numeroTlf;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumeroTlf() {
		return numeroTlf;
	}

	public void setNumeroTlf(String numeroTlf) {
		this.numeroTlf = numeroTlf;
	}

	public String getNombre() {
		return nombre;
	}

}
