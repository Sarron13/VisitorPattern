package de.dataport.VisitorPattern.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import de.dataport.VisitorPattern.model.Bank;
import de.dataport.VisitorPattern.model.Dieb;
import de.dataport.VisitorPattern.model.Groﬂeltern;
import de.dataport.VisitorPattern.model.Markler;
import de.dataport.VisitorPattern.model.Visitor;
import de.dataport.VisitorPattern.model.Wohnhaus;

class VisitorTest {
	
	@Test
	void test() {
		Bank bank1 = new Bank(100, 250000.50);
		Bank bank2 = new Bank(160, 1000000.60);
		Wohnhaus haus1 = new Wohnhaus(64, 250000, 10000.4);
		Wohnhaus haus2 = new Wohnhaus(98, 500000, 100000);
		
		Visitor dieb = new Dieb();
		Visitor markler = new Markler();
		Groﬂeltern oma = new Groﬂeltern();
		//UmbauHaus handwerker = new UmbauHaus();
		
		bank1.empfangen(oma);
		bank2.empfangen(dieb);
		haus1.empfangen(oma);
		haus2.empfangen(markler);
		haus2.empfangen(dieb);
		bank1.empfangen(markler);
		
		System.out.println("1.Bank:\n Wert: " + bank1.getWert() + "\n Geld: " + bank1.getGeld());
		System.out.println("2.Bank:\n Wert: " + bank2.getWert() + "\n Geld: " + bank2.getGeld());
		System.out.println("1.Haus:\n Wert: " + haus1.getWert() + "\n Geld: " + haus1.getGeld());
		System.out.println("2.Haus:\n Wert: " + haus2.getWert() + "\n Geld: " + haus2.getGeld());
		
		assertEquals(404, 404);
	}

}

