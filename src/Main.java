import java.util.Scanner;
import java.util.Scanner.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        Verein fck = new Verein("1. FC Kaiserslautern",1900,13.13, fcb_kader, betze, fck_trikot);
        Verein ksc = new Verein("Karlsruher SC", 1952, 18.55, ksc_kader,wildparkstadion,ksc_trikot);
        Verein fcb = new Verein("FC Bayern München", 1900,944.7,fcb_kader,allianzarena,fcb_trikot);
        Verein bvb = new Verein("Borussia Dortmund",1909,526.7,bvb_kader,signalidunapark,bvb_trikot);







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