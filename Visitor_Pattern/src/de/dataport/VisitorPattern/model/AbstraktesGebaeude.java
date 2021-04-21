package de.dataport.VisitorPattern.model;

public abstract class AbstraktesGebaeude implements Gebaeude {
	
	protected int anzahlFenster;
	protected int anzahlTueren;
	protected float anzahlZimmer;
	protected double flaeche;
	protected boolean bewohnt;
	
	public int getFenster() {
		return anzahlFenster;
	}
	public int getTueren() {
		return anzahlTueren;
	}
	public float getZimmer() {
		return anzahlZimmer;
	}
	public double getFlaeche() {
		return flaeche;
	}
	public boolean getBewohnt() {
		return bewohnt;
	}
	
	public abstract void einzug(String besitzer);
	public abstract void auszug();
	
}
