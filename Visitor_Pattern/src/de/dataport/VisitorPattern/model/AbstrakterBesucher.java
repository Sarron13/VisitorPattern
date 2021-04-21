package de.dataport.VisitorPattern.model;

public abstract class AbstrakterBesucher {
	
	public abstract void visit(Wohnhaus haus);
	public abstract void visit(Laden haus);
	public abstract void visit(Bank haus);
	public abstract void visit(OeffentlichesGebaeude haus);

	void visit(Object objekt) {
		throw new IllegalArgumentException("Objekt ist nicht bekannt.");
	}
}
