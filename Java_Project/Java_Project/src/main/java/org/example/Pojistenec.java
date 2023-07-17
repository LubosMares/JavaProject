package org.example;

/**
 *
 * @author Luboš Mareš
 */

/**
 * Třída reprezentuje osobu pojištěnce a jeho atributy (jméno, přijmení, věk, telefonní číslo)
 * final String je použit, aby po zadání přiřazená hodnota nešla měnit
 * */
public class Pojistenec {
    private final String jmeno;
    private  final String prijmeni;
    private final int vek;
    private final String telefonniCislo;

    public Pojistenec(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    /**
     *Vrátí jméno pojištěnce
     * @return jmeno
     */
    public String getJmeno(){
        return jmeno;
    }

    /**
     *Vrátí přijmení pojištěnce
     * @return prijmeni
     */
    public String getPrijmeni(){
        return prijmeni;
    }
    /**
     *Vrátí věk pojištěnce
     * @return vek
     */
    public int getVek(){
        return vek;
    }

    /**
     *Vrátí telefonní číslo pojištěnce
     * @return telefonniCislo
     */
    public String getTelefonniCislo(){
        return telefonniCislo;
    }

    /**
     * Přepíšu metodu toString
     * @return pro celý výpis osoby(jméno, přijmení, věk, tel. číslo)
     */
    @Override
    public String toString() {
        return this.jmeno + "\t" + this.prijmeni + "\t" + this.vek + "\t" + this.telefonniCislo;
    }
}
