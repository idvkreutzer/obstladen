package de.idv.obstladen.obst;

import de.idv.obstladen.farbe.Farbe;

public interface Obst {
	public Farbe getFarbe();
	
	public default void printFarbe() {
		System.out.println(getAusgabe());
	}

	private String getAusgabe() {
		return "Die Farbe ist " + this.getFarbe().name();
	}
}
