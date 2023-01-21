public class Main {
    public static void main(String[] args) {

        Stadion betze = new Stadion("Fritz-Walter-Stadion",1920,49850);
        Stadion carlbenzstadion = new Stadion("Carl-Benz-Stadion",1994,24302);

        Trikot svw = new Trikot("Suntat","blau");
        Trikot fck = new Trikot("Allgäuer Latschenkiefer","rot");

        Verein kaiserslautern = new Verein("1. FC K'lautern",1900,13.13, betze, fck);
        Verein waldhofmannheim = new Verein("SV Waldhof Mannheim 07",1907,6.3,carlbenzstadion,svw);



    }
}