package de.dataport.VisitorPattern.model;

public class Grosseltern extends AbstrakterBesucher {
	
	private double vermoegen;
	private String laune;
	
	public Grosseltern(double vermoegen) {
		this.vermoegen = vermoegen;
		this.laune = "neutral"; //ENUM wäre passender
	}
	
	public double getVermoegen() {
		return vermoegen;
	}
	public String getLaune() {
		return laune;
	}

	@Override
	public void visit(Wohnhaus haus) {
		vermoegen -= 10 * haus.getZimmer();
		laune = "sehr gut";

	}

	@Override
	public void visit(Laden haus) {
		vermoegen -= 120.60;
		laune = "gut";

	}

	@Override
	public void visit(Bank haus) {
		vermoegen += 1000;
		switch(laune) {
		case "gut":
			laune = "sehr gut";
			break;
		case "neutral":
			laune = "gut";
			break;
		case "schlecht":
			laune = "neutral";
			break;
		default:
			break;
		}
	}

	@Override
	public void visit(OeffentlichesGebaeude haus) {
		laune = "schlecht";

	}

}
