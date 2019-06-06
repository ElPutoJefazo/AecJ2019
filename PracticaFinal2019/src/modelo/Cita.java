package modelo;

import java.time.LocalDateTime;

public class Cita {

	private int id;
	private LocalDateTime fecha;
	private Medico medico;
	private Paciente paciente;
	private boolean pendiente;
	private Resultado resultado;

	public Cita(int id, LocalDateTime fecha, Medico medico, Paciente paciente, boolean pendiente, Resultado resultado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.medico = medico;
		this.paciente = paciente;
		this.pendiente = pendiente;
		this.resultado = resultado;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(boolean pendiente) {
		this.pendiente = pendiente;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public int getId() {
		return id;
	}
}
