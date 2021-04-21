package de.dataport.VisitorPattern.model;

public abstract class Visitor {
	
	abstract void besuchen(Wohnhaus haus);
	abstract void besuchen(Bank haus);
}
