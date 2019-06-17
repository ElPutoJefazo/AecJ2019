package controlTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.Ignore;
import org.junit.Test;

import control.PacienteController;
import modelo.Hospital;
import modelo.Paciente;

public class PacienteControllerTest {
	private PacienteController pacienteController;
	private Hospital hospital;

	@Test
	public void testDarAltaPaciente() {
		Paciente test = new Paciente("Joaquin", "direccion", "666666666", "1", LocalDate.now());
		pacienteController.darAltaPaciente(test);
		assertTrue(hospital.pacientes.size() == 1);
	}

	@Ignore
	public void testDarBajaPaciente() {
		Paciente test = new Paciente("Joaquin", "direccion", "666666666", "1", LocalDate.now());
		pacienteController.darBajaPaciente(test);
		assertTrue(hospital.pacientes.size() == 1);
		hospital.pacientes.remove(test);
		assertTrue(hospital.pacientes.size() == 0);
	}

	@Ignore
	public void testModificarPaciente() {
		Paciente test = new Paciente("Joaquin", "direccion", "666666666", "1", LocalDate.now());
		Paciente testDos = new Paciente("Joaquin", "direccion", "666666666", "1", LocalDate.now());
		pacienteController.modificarPaciente(test.getId(), test.getDireccion());
		assertFalse(test == testDos);
	}

	@Ignore
	private void testSolicitarCita() {
		// TODO
	}

	@Ignore
	private void testAccederCitasPendientes() {
		// TODO
	}
	/*
	 * @Ignore private void testValidarPaciente() { // TODO }
	 * 
	 * @Ignore private void testValidarCita() { // TODO }
	 */
}
