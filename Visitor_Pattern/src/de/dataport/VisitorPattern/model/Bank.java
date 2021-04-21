package de.dataport.VisitorPattern.model;

public class Bank extends AbstraktesGebaeude {
	
	private String nameKreditinstitut;
	
	public Bank(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche){
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.bewohnt = false;
	}
	public Bank(int anzahlTueren, int anzahlFenster, float anzahlZimmer, double flaeche, String kreditinstitut){
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.anzahlZimmer = anzahlZimmer;
		this.flaeche = flaeche;
		this.bewohnt = true;
		this.nameKreditinstitut = kreditinstitut;
	}
	
	public String getName() {
		return nameKreditinstitut;
	}

	@Override
	public void einzug(String kreditinstitut) {
		this.nameKreditinstitut = kreditinstitut;
		this.bewohnt = true;
	}

	@Override
	public void auszug() {
		this.nameKreditinstitut = "";
		this.bewohnt = false;
	}
	
	@Override
	public void accept(AbstrakterBesucher besucher) {
		besucher.visit(this);	
	}

}
