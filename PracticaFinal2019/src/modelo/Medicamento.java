package modelo;

import java.util.regex.Pattern;

import utiles.Respuesta;

public class Medicamento {

	private int id;
	private String nombre;

	public Medicamento(int id, String nombre) {
		super();
		this.id = id;
		assert nombre != null && validaNombre(nombre).resultado;
		this.nombre = nombre;
	}

	public Medicamento() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	private Respuesta validaNombre(String nombre) {
		return new Respuesta(Pattern.matches("[:alpha]\\s", nombre), "Nombre no v�lido");
	}
}
