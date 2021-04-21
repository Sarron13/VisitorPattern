package de.dataport.VisitorPattern.model;

public class UmbauHaus extends Visitor {

	void besuchen(Wohnhaus haus) {
		haus.setWert(haus.getWert() + 1000);
		haus.setGeld(haus.getGeld() - 1000);
	}

	void besuchen(Bank haus) {
		haus.setWert(haus.getWert());
	}
	

}
