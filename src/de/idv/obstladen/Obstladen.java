package de.idv.obstladen;

import java.util.List;
import java.util.Optional;

import de.idv.obstladen.farbe.Farbe;
import de.idv.obstladen.helper.ObstUtil;
import de.idv.obstladen.obst.Apfel;
import de.idv.obstladen.obst.Birne;
import de.idv.obstladen.obst.Kernobst;
import de.idv.obstladen.obst.Obst;
import de.idv.obstladen.obst.Pflaume;

public class Obstladen {

	
	public static void besuche() {
		String willkommen = """
				   ################################################
				   # Willkommen im  Obstladen.                    #
				   # Wir haben Kernobst uvm.                      #
				   # Schau dich einfach um und such Dir was aus!  #
				   ################################################
				""";
		System.out.println(willkommen);
		
		
		var pflaume = new Pflaume(1, Farbe.GRUEN);
		List<Obst> obstkorb = List.of(new Birne(4, Farbe.GELB), new Apfel(8, Farbe.ROT), pflaume);
		
		System.out.println("Eine " + pflaume.getClass().getSimpleName() + " ist ein Steinobst.");
		
		
		obstkorb.stream().forEach(k -> {
			Optional.ofNullable(k).ifPresentOrElse(Obstladen::printObst, () -> System.err.println("Leer"));
		});
		
	}
	
	static void printObst(Obst obst) {
		if (obst instanceof Kernobst k) {
			System.out.println("Diese" + k.getClass().getSimpleName() + " besitzt " + k.getAnzahlKerne() + " Kerne.");
		}
		
		String welcherReifeGrad = "Diese " + obst.getClass().getSimpleName() + " ist " + ObstUtil.ermittleReifegrad(obst.getFarbe());
		System.out.println(welcherReifeGrad);
		
		obst.printFarbe();
	}
	
}
