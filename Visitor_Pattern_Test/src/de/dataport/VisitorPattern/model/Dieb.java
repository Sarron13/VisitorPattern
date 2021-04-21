package de.dataport.VisitorPattern.model;

public class Dieb extends Visitor {
	
	private double geld;

	void besuchen(Wohnhaus haus) {
		geld += haus.getGeld();
		haus.setWert(haus.getWert()*0.8);
	}

	void besuchen(Bank haus) {
		geld += haus.getGeld();
		
	}
	
	public double angeben() {
		return geld;
	}

}
