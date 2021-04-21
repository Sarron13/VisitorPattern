package de.dataport.VisitorPattern.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.dataport.VisitorPattern.model.*;

class GebaeudeTest {

	@Test
	void testWohnhaus() {
		Wohnhaus haus1 = new Wohnhaus(8, 12, 4.5f, 106.42);
		Wohnhaus haus2 = new Wohnhaus(10, 24, 7.5f, 206.08, "Claus", true);
		
		assertNotEquals(haus1, haus2);
		assertEquals(8, haus1.getTueren());
		assertEquals("Claus", haus2.getFamilienname());
		
		haus2.auszug();
		assertEquals(false, haus2.getBewohnt());
		
		haus1.einzug("Santa", true);
		assertEquals(true, haus1.getHaustiere());		
	}

}
