package de.dataport.VisitorPattern.model;

public class Wohnhaus extends AbstraktesGebaeude {
	
	private String familienname;
	private boolean haustiere;


	public Wohnhaus(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche) {
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.bewohnt = false;
	}
	public Wohnhaus(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche, String familie, boolean haustiere) {
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.familienname = familie;
		this.haustiere = haustiere;
		this.bewohnt = true;
	}

	public String getFamilienname() {
		return familienname;
	}
	public boolean getHaustiere() {
		return haustiere;
	}
	
	@Override
	public void einzug(String familienname) {
		this.familienname = familienname;
		this.bewohnt = true;
	}
	public void einzug(String familienname,boolean haustiere) {
		this.familienname = familienname;
		this.haustiere = haustiere;
		this.bewohnt = true;
	}

	@Override
	public void auszug() {
		this.familienname ="";
		this.haustiere = false;
		this.bewohnt = false;		
	}
	
	@Override
	public void accept(AbstrakterBesucher besucher) {
		besucher.visit(this);	
	}

}
