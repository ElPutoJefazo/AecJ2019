package modelo;

import java.time.LocalDate;

public class Paciente extends Persona {

	private String id;
	private LocalDate fechaNacimiento;

	public Paciente(String id, LocalDate fechaNacimiento) {
		super();
		this.id = id;
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
