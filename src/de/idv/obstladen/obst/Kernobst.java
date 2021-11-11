package de.idv.obstladen.obst;

import de.idv.obstladen.farbe.Farbe;

public abstract sealed class Kernobst permits Apfel, Birne {

	public abstract int getAnzahlKerne();

	public abstract Farbe getFarbe();
}
