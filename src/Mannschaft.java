import java.util.ArrayList;

public class Mannschaft {

    private ArrayList<Personal> spieler;
    private ArrayList<Personal> trainer;
    private String formation;
    private int kadergroesse;


  /* public static void kaderHinzufuegen() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte fügen Sie für die Verteidigung eine Zahl ein, um einen neuen Kader zu erstellen. (V-M-S)");
        String V = s.nextLine();
        System.out.println("Bitte fügen Sie für das Mittelfeld eine Zahl ein, um einen neuen Kader zu erstellen. (V-M-S)");
        String M = s.nextLine();
        System.out.println("Bitte fügen Sie für den Sturm eine Zahl ein, um einen neuen Kader zu erstellen. (V-M-S)");
        String S = s.nextLine();
        System.out.println("Sie haben erfolgreich einen neuen Kader erstellt.");
        System.out.println("Ihre neue Kaderformation lautet: (" + V + "-" + M + "-" + S + ")");


        ArrayList<String> kader = new ArrayList<String>();
        while (s.hasNext());
        kader.add(s.next());
    }*/

    public static void addtolist(Personal a, ArrayList<Personal> mannschaft_liste) {
        mannschaft_liste.add(a);
    }

    public static void removefromlist(Personal a, ArrayList<Personal> mannschaft_liste) {
        mannschaft_liste.remove(a);
    }

}

    /*private static void status() {


   public static void verletzte() ;


    private static void kaderStreichen()
    }


    */


    /*  public String name;
    private int alter;
    public double marktwert;
    public String aufgabe;
    public boolean verlezt;
    public boolean kapitan;

    public Mannschaft(String name, int alter, double marktwert, String aufgabe, boolean verlezt, boolean kapitan){
        this.name = name;
        this.alter = alter;
        this.marktwert = marktwert;
        this.aufgabe = aufgabe;
        this.verlezt = verlezt;
        this.kapitan = kapitan;
    }
*/






