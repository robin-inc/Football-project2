import java.util.ArrayList;

public class Verein {
    public String name;
    private int gruendungsjahr;
    private double vermoegen;
    public Stadion stadion;
    public Trikot trikot;

    public Verein(String name, int gruendungsjahr, double vermoegen, Stadion stadion, Trikot trikot)
    {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.vermoegen = vermoegen;
        this.stadion = stadion;
        this.trikot = trikot;
    }

    public void Information() //zeigt Informationen über den Verein an
    {
        System.out.println("++++++++++++++++++++");
        System.out.println("Vereinsname: " + name);
        System.out.println("Gründungsjahr: " + gruendungsjahr);
        System.out.println("Stadion: " + stadion);
        System.out.println("Aktuelles Vereinsvermögen: " + vermoegen);
        System.out.println("++++++++++++++++++++");
    }

    public static void Compare(Verein a, Verein b) //vergleicht zwei angegebene Vereine miteinander
    {
        if (a.gruendungsjahr < b.gruendungsjahr)
        {System.out.println("Der Verein " + a.name + " ist älter als " + b.name + ".");}
        else {System.out.println("Der Verein " + b.name + " ist älter als " + a.name + ".");}
        if (a.vermoegen > b.vermoegen){System.out.println("Der Verein " + a.name + " ist wohlhabender als " + b.name + ".");}
        else {System.out.println("Der Verein " + b.name + " ist wohlhabender als " + a.name + ".");}
    }

    public void addToList(Verein e,ArrayList<Verein> verein_liste)
    {verein_liste.add(e);}

    public void removeFromList(Verein e, ArrayList<Verein> verein_liste)
    {verein_liste.remove(e);}

    public static void Register(ArrayList<Verein> verein_liste)
    {
        System.out.println("+++REGISTER+++\n" + verein_liste.toString());
    }





    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getVermoegen() {return vermoegen;}
    public void setVermoegen(double vermoegen) {this.vermoegen = vermoegen;}
    public int getGruendungsjahr() {return gruendungsjahr;}
    public void setGruendungsjahr(int gruendungsjahr) {this.gruendungsjahr = gruendungsjahr;}
    public Stadion getStadion() {return stadion;}
    public void setStadion(Stadion stadion) {this.stadion = stadion;}
    public Trikot getTrikot() {return trikot;}
    public void setTrikot(Trikot trikot) {this.trikot = trikot;}
}
