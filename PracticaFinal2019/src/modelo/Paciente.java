package modelo;

import java.time.LocalDate;

public class Paciente extends Persona {

	private String id;
	private LocalDate fechaNacimiento;

	public Paciente(String nombre, String direccion, String numeroTlf, String id, LocalDate fechaNacimiento) {
		super(nombre, direccion, numeroTlf);
		this.id = id;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Paciente(String nombre, String direccion, String numeroTlf, LocalDate fechaNacimiento) {
		super(nombre, direccion, numeroTlf);
		this.fechaNacimiento = fechaNacimiento;
	}

	public Paciente() {
		super();
	}

	public String getId() {
		return id;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
}
