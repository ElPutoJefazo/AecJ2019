package modelo;

import java.time.LocalDate;

public class Paciente extends Persona {

	private int id;
	private LocalDate fechaNacimiento;

	public Paciente(int id, LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Paciente() {
		super();
	}

	public int getId() {
		return id;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
}
