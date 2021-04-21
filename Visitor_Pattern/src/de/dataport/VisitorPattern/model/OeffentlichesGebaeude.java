package de.dataport.VisitorPattern.model;

public class OeffentlichesGebaeude extends AbstraktesGebaeude {
	
	private String institution;
	
	public OeffentlichesGebaeude(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche){
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.bewohnt = false;
	}
	public OeffentlichesGebaeude(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche, String institution){
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.bewohnt = true;
		this.institution = institution;
	}
	
	public String getName() {
		return institution;
	}

	@Override
	public void einzug(String institution) {
		this.institution = institution;
		this.bewohnt = true;
	}

	@Override
	public void auszug() {
		this.institution = "alte "+ institution;
		this.bewohnt = false;
	}
	
	@Override
	public void accept(AbstrakterBesucher besucher) {
		besucher.visit(this);
	}

}
