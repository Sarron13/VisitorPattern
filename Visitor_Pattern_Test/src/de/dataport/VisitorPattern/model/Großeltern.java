package de.dataport.VisitorPattern.model;

public class Gro�eltern extends Visitor {

	void besuchen(Wohnhaus haus) {
		haus.setGeld(haus.getGeld()+ 400);
		haus.setWert(haus.getWert()+400);
	}

	void besuchen(Bank haus) {
		haus.setGeld(haus.getGeld()-400);
	}

}
