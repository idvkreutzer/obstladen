package de.idv.obstladen.obst;

import de.idv.obstladen.farbe.Farbe;

public record Pflaume (int kerne, Farbe farbe) implements Obst {

	@Override
	public Farbe getFarbe() {
		return this.farbe;
	}}
 