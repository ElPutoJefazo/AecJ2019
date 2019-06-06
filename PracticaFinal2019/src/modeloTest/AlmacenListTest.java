package modeloTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import almacenes.AlmacenList;
import modelo.Especialidad;
import modelo.Medico;

public class AlmacenListTest {
	private AlmacenList almacenList;
	private Medico medico;
	Medico medico1= new Medico("Joaquin", "direccion", "666666666", Especialidad.cirujano, LocalDate.now(), "1");
	String path= "./medicos.txt";
	private File file;
	IAdaptador<Medico> adaptador;
	
	@BeforeEach
	void setUp() throws Exception {
		
		file = new File(path);
	}

	@AfterEach
	void tearDown() throws Exception {
		file.delete();
	}
	
	
	private void pruebaCreacion() {
		assertFalse(file.exists());
		assertTrue(adaptador.grabar(path, medico));
		assertTrue(file.exists());
	}

	private void assertArrayNotEquals(Object[] expecteds, Object[] actuals) {
		try {
			assertArrayEquals(expecteds, actuals);
		} catch (AssertionError e) {
			return;
		}
		fail("The arrays are equal");
	}
	
	@Test
	private void obtener() {
		ArrayList<Medico> medicos = new ArrayList<>();
		medicos.add(medico1);
		ArrayList<Medico> leer = adaptador.leer(path);
		assertArrayNotEquals(medicos.toArray(), leer.toArray());
		pruebaCreacion();
		leer = adaptador.leer(path);
		assertArrayEquals(medicos.toArray(), leer.toArray());
		assertArrayNotEquals(medicos.toArray(), leer.toArray());
	}
	
	@Test
	private boolean grabar() {
		pruebaCreacion();
		return false;
	}
}
