package controlTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import control.MedicoController;
import modelo.Especialidad;
import modelo.Hospital;
import modelo.Medico;

public class MedicoControllerTest {
	private MedicoController medicoController;
	private Hospital hospital;
	
	
	@Test
	public void testDarAltaMedico() {
		Medico test = new Medico("Joaquin", "direccion", "666666666", Especialidad.cirujano, LocalDate.now(), "1");
		medicoController.darAltaMedico(test);
		assertTrue(hospital.medicos.size()==1);
}
	@Ignore
	public void testDarBajaMedico() {
		Medico test = new Medico("Joaquin", "direccion", "666666666", Especialidad.cirujano, LocalDate.now(), "1");
		medicoController.darBajaMedico(test);
		assertTrue(hospital.medicos.size()==1);
		hospital.medicos.remove(test);
		assertTrue(hospital.medicos.size()==0);
	}
	
	@Ignore
	public void testConsultarDatosPaciente() {
		// TODO
	}
	
	@Ignore
	public void testRecetarTratamiento() {
		// TODO
	}

	
	
}
	