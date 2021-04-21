package de.dataport.VisitorPattern.model;

public class Laden extends AbstraktesGebaeude {
	
	private String besitzer;
	private String name;
	
	public Laden(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche) {
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.bewohnt = false;
	}
	public Laden(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche, String name, String besitzer) {
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.bewohnt = false;
		this.name = name;
		this.besitzer = besitzer;
	}
	
	public String getBesitzer() {
		return besitzer;
	}
	public String getName() {
		return name;
	}
	

	@Override
	public void einzug(String besitzer) {
		this.besitzer = besitzer;
		this.bewohnt = true;
	}
	public void einzug(String name, String besitzer) {
		this.name = name;
		this.besitzer = besitzer;
		this.bewohnt = true;
	}

	@Override
	public void auszug() {
		this.besitzer = "";
		this.name = "";
		this.bewohnt = false;
	}

	@Override
	public void accept(AbstrakterBesucher besucher) {
		besucher.visit(this);
	}

}
