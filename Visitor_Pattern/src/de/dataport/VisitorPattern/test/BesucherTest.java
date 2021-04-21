package de.dataport.VisitorPattern.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.dataport.VisitorPattern.model.*;

class BesucherTest {

	@Test
	void testGrosseltern() {
		Wohnhaus haus = new Wohnhaus(10, 24, 7.5f, 206.08, "Claus", true);
		Laden primark = new Laden(4, 16, 2, 1200.40, "Primark", "Mr. Prime");
		Bank bank = new Bank(4, 2, 3, 965, "SpassKasse");
		OeffentlichesGebaeude arbeitsamt = new OeffentlichesGebaeude(12, 4, 8, 400.5, "Arbeitsamt");
		
		Grosseltern _OmaUndOpa_ = new Grosseltern(1000);
		
		assertEquals("neutral", _OmaUndOpa_.getLaune());
		haus.accept(_OmaUndOpa_);
		assertEquals("sehr gut", _OmaUndOpa_.getLaune());
		assertEquals(925, _OmaUndOpa_.getVermoegen());
		arbeitsamt.accept(_OmaUndOpa_);
		assertEquals("schlecht", _OmaUndOpa_.getLaune());
		assertEquals(925, _OmaUndOpa_.getVermoegen());
		bank.accept(_OmaUndOpa_);
		assertEquals("neutral", _OmaUndOpa_.getLaune());
		assertEquals(1925, _OmaUndOpa_.getVermoegen());
		primark.accept(_OmaUndOpa_);
		assertEquals("gut", _OmaUndOpa_.getLaune());
		assertEquals(1804.4, _OmaUndOpa_.getVermoegen());
	}
	
	@Test
	void testWanderer() {
		Wohnhaus bewohntesHaus = new Wohnhaus(11, 13, 8, 245, "Grinch", false);
		Wohnhaus unbewohntesHaus = new Wohnhaus(4, 6, 6, 106.5);
		Laden euroshop = new Laden(3, 4, 3, 86);
		Bank verlasseneBank = new Bank(4, 3, 3, 260.4);
		OeffentlichesGebaeude polizei = new OeffentlichesGebaeude(16, 14, 14, 140.64, "Polizei");
		
		Wanderer gandalf = new Wanderer(12.6);
		assertEquals(12.6, gandalf.getGeld());
		assertEquals("neutral", gandalf.getLaune());
		assertEquals(false, gandalf.getSesshaft());
		assertEquals("unbekannt", gandalf.getWohnort());
		
		bewohntesHaus.accept(gandalf);
		assertEquals(23.2, gandalf.getGeld());
		assertEquals("gut", gandalf.getLaune());
		assertEquals(false, gandalf.getSesshaft());
		assertEquals("unbekannt", gandalf.getWohnort());
		
		unbewohntesHaus.accept(gandalf);
		assertEquals(23.2, gandalf.getGeld());
		assertEquals("sehr gut", gandalf.getLaune());
		assertEquals(true, gandalf.getSesshaft());
		assertEquals("Wohnhaus", gandalf.getWohnort());
		assertEquals(true, unbewohntesHaus.getBewohnt());
		assertEquals("der Wanderer", unbewohntesHaus.getFamilienname());
		
		euroshop.accept(gandalf);
		assertEquals(23.2, gandalf.getGeld());
		assertEquals("sehr gut", gandalf.getLaune());
		assertEquals(true, gandalf.getSesshaft());
		assertEquals("leerer Laden", gandalf.getWohnort());
		assertEquals(true, euroshop.getBewohnt());
		assertEquals("leerer Laden", euroshop.getName());
		
		verlasseneBank.accept(gandalf);
		assertEquals(59.2, gandalf.getGeld());
		assertEquals("sehr gut", gandalf.getLaune());
		assertEquals(true, gandalf.getSesshaft());
		assertEquals("verlassene Bank", gandalf.getWohnort());
		assertEquals(true, verlasseneBank.getBewohnt());
		assertEquals("verlassene Bank", verlasseneBank.getName());
		
		polizei.accept(gandalf);
		//assertEquals(44.8, gandalf.getGeld());
		assertEquals("schlecht", gandalf.getLaune());
		assertEquals(true, gandalf.getSesshaft());
		assertEquals("verlassene Bank", gandalf.getWohnort());
		assertEquals(true, polizei.getBewohnt());
		assertEquals("Polizei", polizei.getName());
		
		polizei.auszug();
		polizei.accept(gandalf);
		//assertEquals(44.8, gandalf.getGeld());
		assertEquals("gut", gandalf.getLaune());
		assertEquals(true, gandalf.getSesshaft());
		assertEquals("alte Polizei", gandalf.getWohnort());
		assertEquals(true, polizei.getBewohnt());
		assertEquals("alte Polizei", polizei.getName());
		
	}

}
