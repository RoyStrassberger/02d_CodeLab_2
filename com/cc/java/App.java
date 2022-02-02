package com.cc.java;

public class App {
	public static void main(String[] args) {

        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);
    
        pollAccounts(konto1,konto2,konto3);
    
        output("--------------------------");
    
        // Update ...
        konto1.updateKontostand(2);
        konto2.updateKontostand(3);
        konto3.updateKontostand(10);
    
        pollAccounts(konto1,konto2,konto3);
    
    }

    private static void pollAccounts(Konto k1, Konto k2, Konto k3) {
        output("Konto1: " + Integer.toString(k1.getKontostand()));
        output("Konto2: " + Integer.toString(k2.getKontostand()));
        output("Konto3: " + Integer.toString(k3.getKontostand()));
    }
    
    private static void output(String outStr) {
        System.out.println(outStr);
    }

}
