package modelo;

import java.util.regex.Pattern;

import utiles.Respuesta;

public abstract class Persona {

	private String nombre;
	private String direccion;
	private String numeroTlf;

	

	public Persona(String nombre, String direccion, String numeroTlf) {
		super();
		assert nombre != null && validaNombre(nombre).resultado;
		this.nombre = nombre;
		this.direccion = direccion;
		assert numeroTlf != null && validaTlf(numeroTlf).resultado;
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

	public static Respuesta validaNombre(String nombre) {
		return new Respuesta(Pattern.matches("[:alpha:]\\s", nombre), "Nombre no válido");
	}

	public static Respuesta validaTlf(String numeroTlf) {
		return new Respuesta(Pattern.matches("[679]\\d{8}", numeroTlf), "Teléfono no válido");
	}

}
