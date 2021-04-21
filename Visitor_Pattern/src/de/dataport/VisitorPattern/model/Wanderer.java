package de.dataport.VisitorPattern.model;

public class Wanderer extends AbstrakterBesucher {
	
	private double geld;
	private String laune;
	private boolean sesshaft;
	private String wohnort;
	
	public Wanderer() {
		geld = 0;
		laune = "neutral";
		sesshaft = false;
		wohnort = "unbekannt";
	}
	public Wanderer(double vermoegen) {
		geld = vermoegen;
		laune = "neutral";
		sesshaft = false;
		wohnort = "unbekannt";
	}
	
	public boolean getSesshaft() {
		return sesshaft;
	}
	public double getGeld() {
		return geld;
	}
	public String getLaune() {
		return laune;
	}
	public String getWohnort() {
		return wohnort;
	}

	@Override
	public void visit(Wohnhaus haus) {
		if(haus.getBewohnt()==true) {
			geld += 10.60;
			laune = "gut";
		}else {
			laune = "sehr gut";
			sesshaft = true;
			wohnort = "Wohnhaus";
			haus.einzug("der Wanderer");
		}	
	}

	@Override
	public void visit(Laden haus) {
		if(haus.getBewohnt()==true) {
			laune = "gut";
		}else {
			laune = "sehr gut";
			sesshaft = true;
			wohnort = (haus.getName() == "" || haus.getName() == null ? "leerer Laden": haus.getName());
			haus.einzug(wohnort, "Mr. Wanderer");
		}	
	}

	@Override
	public void visit(Bank haus) {
		if(haus.getBewohnt()==true) {
			laune = "neutral";
		}else {
			geld += 36.00;
			laune = "sehr gut";
			sesshaft = true;
			wohnort = (haus.getName() == "" || haus.getName() == null ? "verlassene Bank": haus.getName());
			haus.einzug(wohnort);
		}
	}

	@Override
	public void visit(OeffentlichesGebaeude haus) {
		if(haus.getBewohnt()==true) {
			laune = "schlecht";
			if(geld > 14.4) {
				geld -= 14.40;
			}else {
				geld = 0;
			}
		}else {
			laune = "gut";
			sesshaft = true;
			wohnort = (haus.getName() == "" || haus.getName() == null ? "verlassenes Arbeitsamt": haus.getName());
			haus.einzug(wohnort);
		}
	}
	

}
