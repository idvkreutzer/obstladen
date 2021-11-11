package de.idv.obstladen.obst;

import de.idv.obstladen.farbe.Farbe;

public final class Apfel extends Kernobst implements Obst {

	private int kerne;
	private Farbe farbe;
	
	public Apfel(int kerne, Farbe farbe) {
		super();
		this.kerne = kerne;
		this.setFarbe(farbe);
	}

	@Override
	public int getAnzahlKerne() {
		return kerne;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	
}
