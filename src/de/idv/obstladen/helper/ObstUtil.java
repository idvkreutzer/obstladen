package de.idv.obstladen.helper;

import de.idv.obstladen.farbe.Farbe;

public class ObstUtil {

	public static String ermittleReifegrad(Farbe farbe) {
		return switch (farbe) {
			case GRUEN -> "unreif";
			case GELB -> "noch nicht ganz reif";
			case ROT -> "reif";
			default -> throw new IllegalArgumentException("something is murky!");
		};

	}
}
