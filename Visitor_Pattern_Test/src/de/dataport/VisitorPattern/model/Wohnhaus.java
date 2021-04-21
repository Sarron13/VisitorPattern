package de.dataport.VisitorPattern.model;

public class Wohnhaus extends AbstraktesBauwerk {

	public Wohnhaus(double flaeche, double wert, double vermoegen) {
		this.flaeche = flaeche;
		this.wert = wert;
		this.gelagertesGeld = vermoegen;
	}
	
	public void empfangen(Visitor besucher) {
		besucher.besuchen(this);
	}
	
	public void setWert(double wert) {
		this.wert = wert;
	}
	
	public void setGeld(double geld) {
		this.gelagertesGeld = geld;
	}
}
