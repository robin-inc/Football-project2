import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kader {

    private ArrayList<Spieler> kader = new ArrayList<>();
    private Spieler spieler;



  public void showKader()
  {
      System.out.print("+++++++++KADER+++++++++");
      for (int i = 0; i < kader.size(); i++)
      {
          Collections.sort(kader, (a, b) -> Integer.valueOf(a.getNummer()).compareTo(b.getNummer()));
          System.out.println();
          System.out.print(
                  "ID"+ i + " #" + kader.get(i).getNummer() +
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

    public void zumKaderHinzufügen(Spieler spieler)
    {kader.add(spieler);}

    public void ausKaderEntfernen(Spieler spieler)
    {kader.remove(spieler);}

    public Spieler getSpieler(int i) {
      return kader.get(i);
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }
}






