package org.example;

import java.util.Scanner;

/**
 *
 * @author Luboš Mareš
 */

public class Project {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Databaze databaze = new Databaze();

        int volba;
        do {
            volba = menu();
            switch (volba) {
                case 1-> {
                    System.out.print("Zadejte jméno: ");
                    String jmeno = scanner.nextLine();
                    System.out.print("Zadejte přijmení: ");
                    String prijmeni = scanner.nextLine();
                    System.out.print("Zadejte věk: ");
                    int vek = Integer.parseInt(scanner.nextLine());
                    System.out.print("Zadejte telefonní číslo: ");
                    String telefonniCislo = scanner.nextLine();
                    databaze.seznamPojistencu.add(databaze.pridatPojistence(jmeno, prijmeni, vek, telefonniCislo));
                    System.out.print("Data uložena. ");
                    zmackneteKlavesu();
                }
                case 2-> {
                    databaze.vypisPojistenych();
                    zmackneteKlavesu();
                }
                case 3-> {
                    System.out.print("Zadejte jmeno pojisteneho: ");
                    String jmeno = scanner.nextLine();
                    System.out.print("Zadejte prijmeni pojisteneho: ");
                    String prijmeni = scanner.nextLine();
                    databaze.vyhledatPojistence(jmeno, prijmeni);
                    zmackneteKlavesu();
                }
                case 4-> {
                    System.out.println("Děkujeme za použítí aplikace evidence pojištěných!");
                    System.out.close();
                }
            }
        } while(volba != 4);

    }

    // Tato metoda je pro stisknutí ENTER
    public static void zmackneteKlavesu() {
        System.out.println("Pro pokračování stiskněte Enter...");
        scanner.nextLine();
    }

    public static int menu() {
        //Vypíše menu aplikace pro evidenci pojištěných
        System.out.println("Evidence pojištěných");
        System.out.println("____________________");
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěnce.");
        System.out.println("2 - Vypsat všechny pojištěnce.");
        System.out.println("3 - Vyhledat pojištěnce.");
        System.out.println("4 - Konec.");
        return Integer.parseInt(scanner.nextLine());
    }
}