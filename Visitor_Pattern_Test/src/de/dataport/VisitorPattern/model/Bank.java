package de.dataport.VisitorPattern.model;

public class Bank extends AbstraktesBauwerk {
	
	public Bank(double flaeche, double geldlieferung) {
		this.flaeche = flaeche;
		this.gelagertesGeld = geldlieferung;
		this.wert = this.flaeche * 40 + this.gelagertesGeld * 2;
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
