package de.dataport.VisitorPattern.model;

public interface Gebaeude {
	
	void accept(AbstrakterBesucher besucher);

}
