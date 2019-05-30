package modelo;

import java.time.LocalDate;

public class Cita {

	private int id;
	private LocalDate fecha;
	private boolean asistencia;
	private String observacion;

	public Cita(int id, LocalDate fecha, boolean asistencia, String observacion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.asistencia = asistencia;
		this.observacion = observacion;
	}

	public Cita() {
		super();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getId() {
		return id;
	}
}
