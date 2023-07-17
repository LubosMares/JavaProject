package org.example;

import java.util.ArrayList;

/**
 *
 * @author Luboš Mareš
 */

public class Databaze {

    public ArrayList<Pojistenec> seznamPojistencu = new ArrayList();

    // Tato metoda je pro přidání pojištěnců
    public Pojistenec pridatPojistence(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        return new Pojistenec(jmeno, prijmeni, vek, telefonniCislo);
    }

    // Tata metoda je pro výpis pojištěnců
    public void vypisPojistenych() {
        for(int i = 0; i < seznamPojistencu.size(); ++i) {
            System.out.println(seznamPojistencu.get(i));
        }

    }

    // Tato metoda je pro vyhledání pojištěnce
    public void vyhledatPojistence(String jmeno, String prijmeni) {
        boolean nalezen = false;

        for(int i = 0; i < seznamPojistencu.size(); ++i) {
            if (((Pojistenec)seznamPojistencu.get(i)).getJmeno().equals(jmeno) && ((Pojistenec)seznamPojistencu.get(i)).getPrijmeni().equals(prijmeni)) {
                System.out.println(seznamPojistencu.get(i));
                nalezen = true;
            }
        }
//Pokud nebude pojištěnec nalezen vypíše to "Pojištěný neexistuje!"
        if (!nalezen) {
            System.out.println("Pojištěný neexistuje!");
        }

    }

}

