package de.dataport.VisitorPattern.model;

public abstract class AbstraktesBauwerk {
	
	protected double wert;
	protected double gelagertesGeld;
	protected double flaeche;
	
	public double getWert() {
		return wert;
	}
	public double getGeld() {
		double beute = gelagertesGeld;
		gelagertesGeld = 0;
		return beute;
	}
	public double getFlaeche() {
		return flaeche;
	}
	
	public abstract void setWert(double wert);
	public abstract void setGeld(double geld);
	
	public abstract void empfangen(Visitor besucher);
}
