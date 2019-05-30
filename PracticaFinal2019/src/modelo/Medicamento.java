package modelo;

public class Medicamento {

	private int id;
	private String nombre;

	public Medicamento(int id, String nombre) {
		super();
		this.id = id;
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
}
