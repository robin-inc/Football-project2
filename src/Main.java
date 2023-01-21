import java.util.Scanner;
import java.util.Scanner.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stadion betze = new Stadion("Fritz-Walter-Stadion",1920,49850);
        Stadion carlbenzstadion = new Stadion("Carl-Benz-Stadion",1994,24302);

        Trikot svw = new Trikot("Suntat","blau");
        Trikot fck = new Trikot("Allgäuer Latschenkiefer","rot");

        Verein kaiserslautern = new Verein("1. FC K'lautern",1900,13.13, betze, fck);
        Verein waldhofmannheim = new Verein("SV Waldhof Mannheim 07",1907,6.3,carlbenzstadion,svw);

        Spieler robin = new Spieler("Robin Kühn",21,3,"ST",false);

        Kader.zumKaderHinzufügen(robin);
        Kader.showKader();


        /*kaiserslautern.Information();
        waldhofmannheim.Information();
        Verein.Compare(kaiserslautern,waldhofmannheim);*/
        /*
        Verein.addToRegister(kaiserslautern);
        Verein.addToRegister(waldhofmannheim);
        Verein.showRegister();


        System.out.println("Über welchen Verein möchtest du dich informieren? (BITTE INDEX NUMMER ANGEBEN)");
        System.out.print("> ");
        int indexnumber = sc.nextInt();
        Verein.showSpecificClub(indexnumber);*/








    }
}