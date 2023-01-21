import java.util.ArrayList;

public class Verein {
    public String name;
    private int gruendungsjahr;
    private double vermoegen_in_millionen;
    public Stadion stadion;
    public Trikot trikot;
    private static ArrayList<Verein> vereins_register = new ArrayList<>(); //erstellt ein Vereinsregister

    public Verein(String name, int gruendungsjahr, double vermoegen_in_millionen, Stadion stadion, Trikot trikot)
    {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.vermoegen_in_millionen = vermoegen_in_millionen;
        this.stadion = stadion;
        this.trikot = trikot;
    }

    public void Information() //zeigt Informationen über den Verein an
    {
        System.out.println("+++VEREINSPROFIL+++");
        System.out.println("Vereinsname: " + name);
        System.out.println("Gründungsjahr: " + gruendungsjahr);
        System.out.println("Stadion: " + stadion.getName());
        System.out.println("Aktuelles Vereinsvermögen: " + vermoegen_in_millionen + " Millionen €");
        System.out.println("-------------------");
    }

    public static void Compare(Verein a, Verein b) //vergleicht zwei angegebene Vereine miteinander
    {
        if (a.gruendungsjahr < b.gruendungsjahr)
        {System.out.println("Der Verein " + a.name + " ist älter als " + b.name + ".");}
        else {System.out.println("Der Verein " + b.name + " ist älter als " + a.name + ".");}
        if (a.vermoegen_in_millionen > b.vermoegen_in_millionen){System.out.println("Der Verein " + a.name + " ist wohlhabender als " + b.name + ".");}
        else {System.out.println("Der Verein " + b.name + " ist wohlhabender als " + a.name + ".");}
    }

    public static void addToRegister(Verein e)
    {vereins_register.add(e);}

    public static void removeFromRegister(Verein e)
    {vereins_register.remove(e);}

    public static void showRegister()
    {
        System.out.println("+++REGISTER+++");
        for (int i = 0; i < vereins_register.size(); i++)
        {
            System.out.println("#" + i + " -> " + vereins_register.get(i).getName());
        }
    }

    public static void showSpecificClub(int index)
    {
        Verein showable = vereins_register.get(index);
        showable.Information();
    }




    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getVermoegen_in_millionen() {return vermoegen_in_millionen;}
    public void setVermoegen_in_millionen(double vermoegen_in_millionen) {this.vermoegen_in_millionen = vermoegen_in_millionen;}
    public int getGruendungsjahr() {return gruendungsjahr;}
    public void setGruendungsjahr(int gruendungsjahr) {this.gruendungsjahr = gruendungsjahr;}
    public Stadion getStadion() {return stadion;}
    public void setStadion(Stadion stadion) {this.stadion = stadion;}
    public Trikot getTrikot() {return trikot;}
    public void setTrikot(Trikot trikot) {this.trikot = trikot;}
}
