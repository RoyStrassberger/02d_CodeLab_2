package com.cc.java;

public class App {

	public static void main(String[] args) {
	
	Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mütze", "Maxine", "CTO", 2017);
	Mitarbeiter mitarbeiter2 = new Mitarbeiter("Mützerich", "Max", "COO", 2018);
	Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);
	
	pollMitarbeiter(mitarbeiter1);
	pollMitarbeiter(mitarbeiter2);
	pollMitarbeiter(mitarbeiter3);

	}

	private static void pollMitarbeiter(Mitarbeiter ma) {
		ausgabe(ma.getInfo("#name"));
		ausgabe(ma.getInfo("#position"));
		ausgabe(ma.getInfo("#time"));
		ausgabe("-------------------");
	} 

	private static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

};
