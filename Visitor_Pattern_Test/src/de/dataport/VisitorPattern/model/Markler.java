package de.dataport.VisitorPattern.model;

public class Markler extends Visitor {

	void besuchen(Wohnhaus haus) {
		double wohnflaeche = haus.getFlaeche();
		double mWert = haus.getWert();
		double nWert = mWert + mWert % wohnflaeche * 10;
		haus.setWert(nWert);
		
	}

	void besuchen(Bank haus) {
		double geld = haus.getGeld();
		haus.setWert(geld + 100000);
		haus.setGeld(geld);
	}

}
