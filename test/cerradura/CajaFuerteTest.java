package cerradura;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaFuerteTest {

	@Test
	public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
		CajaFuerte caja1 = new CajaFuerte();
		
		assertTrue(caja1.estaAbierta());
		
	}

}
