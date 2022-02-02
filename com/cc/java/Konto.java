package com.cc.java;

public class Konto {
    
    private int kontostand;

    public Konto(int kontostand) {
       this.kontostand = kontostand;
    }
 
    // Getter
    public int getKontostand() {
       return kontostand;
    }
 
    // eine Art Setter ...
    public void updateKontostand(int factor) {
       this.kontostand *= factor;
    }

}
