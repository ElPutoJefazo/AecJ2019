package modelo;

import java.time.LocalDate;

public class Medico extends Persona {

	private Especialidad especialidad;
	private LocalDate horario;
	private String id;

	public Medico(String nombre, String direccion, String numeroTlf, Especialidad especialidad, LocalDate horario,
			String id) {
		super(nombre, direccion, numeroTlf);
		this.especialidad = especialidad;
		this.horario = horario;
		this.id = id;
	}

	public Medico() {
		super();
	}

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

	public String getId() {
		return id;
	}

}
