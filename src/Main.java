import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Scanner.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean runner = true;

        Stadion betze = new Stadion("Fritz-Walter-Stadion",1920,49850);
        Stadion wildparkstadion = new Stadion("Wildparkstadion", 1955, 26000);
        Stadion allianzarena = new Stadion("Allianz-Arena",2002,57343);
        Stadion signalidunapark = new Stadion("Signal Iduna Park",1971,81365);

        Trikot fck_trikot = new Trikot("Allgäuer Latschenkiefer","rot");
        Trikot ksc_trikot = new Trikot("GEM", "blau");
        Trikot fcb_trikot = new Trikot("Telekom", "rot");
        Trikot bvb_trikot = new Trikot("1&1", "gelb");

        Kader fck_kader = new Kader();
        Kader ksc_kader = new Kader();
        Kader fcb_kader = new Kader();
        Kader bvb_kader = new Kader();

        Spieler fck0 = new Spieler("Andreas Luthe", 1, 35,0.5,"TW",false);
        Spieler fck1 = new Spieler("Marlon Ritter", 7,28,0.7,"ZM",true);
        Spieler fck2 = new Spieler("Terrence Boyd",13,31,0.75,"ST",false);
        Spieler ksc0 = new Spieler("Kai Eisele",1,27,0.2,"TW",false);
        Spieler ksc1 = new Spieler("Tim Breithaupt", 38,20,3.5,"ZDM",false);
        Spieler ksc2 = new Spieler("Simone Rapp", 7,30,0.4,"ST",false);
        Spieler fcb0 = new Spieler("Manuel Neuer",1,36,12,"TW",true);
        Spieler fcb1 = new Spieler("Jamal Musiala",42,19,100,"ZOM",false);
        Spieler fcb2 = new Spieler("Thomas Müller",25,33,18,"MS",false);
        Spieler bvb0 = new Spieler("Gregor Kobel",1,25,25,"TW",false);
        Spieler bvb1 = new Spieler("Jude Bellingham",22,19,110,"ZM",false);
        Spieler bvb2 = new Spieler("Marco Reus",11,33,9,"ZOM",false);

        fck_kader.zumKaderHinzufügen(fck0);fck_kader.zumKaderHinzufügen(fck1);fck_kader.zumKaderHinzufügen(fck2);
        ksc_kader.zumKaderHinzufügen(ksc0);ksc_kader.zumKaderHinzufügen(ksc1);ksc_kader.zumKaderHinzufügen(ksc2);
        fcb_kader.zumKaderHinzufügen(fcb0);fcb_kader.zumKaderHinzufügen(fcb1);fcb_kader.zumKaderHinzufügen(fcb2);
        bvb_kader.zumKaderHinzufügen(bvb0);bvb_kader.zumKaderHinzufügen(bvb1);bvb_kader.zumKaderHinzufügen(bvb2);

        Verein fck = new Verein("1. FC Kaiserslautern",1900,13.13, fck_kader, betze, fck_trikot);
        Verein ksc = new Verein("Karlsruher SC", 1952, 18.55, ksc_kader,wildparkstadion,ksc_trikot);
        Verein fcb = new Verein("FC Bayern München", 1900,944.7,fcb_kader,allianzarena,fcb_trikot);
        Verein bvb = new Verein("Borussia Dortmund",1909,526.7,bvb_kader,signalidunapark,bvb_trikot);

        Verein.addToRegister(fck);
        Verein.addToRegister(ksc);
        Verein.addToRegister(fcb);
        Verein.addToRegister(bvb);

        Verein.showRegister();


        while (runner)
        {
            System.out.println("\nWas möchtest du gerne tun?" +
                "\n> 'I' Informationen über ausgewählten Verein anzeigen"+
                "\n> 'V' Vergleich zweier Vereine durchführen"+
                "\n> 'K' Kader eines ausgewählten Vereines anzeigen" +
                "\n> 'X' Schließen"

            );

                char operation = sc.next().charAt(0);
                Character.toLowerCase(operation);

                if (operation == 'i') {
                    System.out.println("Über welchen Verein möchtest du dich informieren? (BITTE ID NUMMER EINGEBEN)");
                    int id = sc.nextInt();
                    Verein.showSpecificClub(id);
                } else if (operation == 'v') {
                    System.out.println("Welche Vereine möchtest du miteinander vergleichen? (BITTE ID NUMMER EINGEBEN)");
                    System.out.print("Erster Verein: ");
                    int v1 = sc.nextInt();
                    System.out.print("Zweiter Verein: ");
                    int v2 = sc.nextInt();
                    Verein.Compare(Verein.vereins_register.get(v1), Verein.vereins_register.get(v2));
                } else if (operation == 'k') {
                    System.out.println("Welchen Kader möchtest du einsehen? (BITTE ID NUMMER EINGEBEN)");
                    int k = sc.nextInt();
                    Verein.vereins_register.get(k).getKader().showKader();
                    break;
                } else if (operation == 'x')
                {
                    runner = false;
                } else {System.out.println("BITTE EINE GÜLTIGE OPERATION AUSWÄHLEN!");}

        }








    }
}