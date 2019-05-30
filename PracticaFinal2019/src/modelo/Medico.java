package modelo;

import java.time.LocalDate;

public class Medico extends Persona {

	private Especialidad especialidad;
	private LocalDate horario;

	public Medico() {
		super();
	}

	public Medico(Especialidad especialidad, LocalDate horario, int id) {
		super();
		this.especialidad = especialidad;
		this.horario = horario;
		this.id = id;
	}

	private int id;

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public LocalDate getHorario() {
		return horario;
	}

	public void setHorario(LocalDate horario) {
		this.horario = horario;
	}

	public int getId() {
		return id;
	}

}
