package modelo;

import java.time.LocalDate;

public class Paciente extends Persona {

	private int id;
	private LocalDate fechaNacimiento;

	public int getId() {
		return id;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
}
