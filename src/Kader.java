import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kader {

    private  ArrayList<Spieler> kader = new ArrayList<>();
    private String formation;


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
  public void showKader()
  {
      System.out.print("+++++++++KADER+++++++++");
      for (int i = 0; i < kader.size(); i++)
      {
          Collections.sort(kader, (a, b) -> Integer.valueOf(a.getNummer()).compareTo(b.getNummer()));
          System.out.println();
          System.out.print(
                  "#" + kader.get(i).getNummer() +
                  "     Name: " + kader.get(i).getName()
                  +
                  "     Alter: " + kader.get(i).getAlter()
                  +
                  "     Marktwert: " + kader.get(i).getMarktwert() + " Mio. €"
                  +
                  "     Position: " + kader.get(i).getPosition()
                  +
                  "     Verletzt?: " + kader.get(i).isVerletzt());
      }

      Collections.sort(kader, (a, b) -> Integer.valueOf(a.getNummer()).compareTo(b.getNummer()));
  }

    public void zumKaderHinzufügen(Spieler s)
    {kader.add(s);}

    public void ausKaderEntfernen(Spieler s)
    {kader.remove(s);}

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






