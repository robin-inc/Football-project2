public class Spieler {

    private int nummer;
    private String name;
    private int alter;
    private double marktwert;
    private String position;
    private boolean verletzt;
    public Spieler(String name,int nummer, int alter, double marktwert, String position, boolean verletzt){
        this.name = name;
        this.nummer = nummer;
        this.alter = alter;
        this.marktwert = marktwert;
        this.position = position;
        this.verletzt = verletzt;
    }


    public void Information(){
        System.out.println("Name des Spielers: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Marktwert: " + marktwert);
        System.out.println("Position: " + position);
        System.out.println("Ist der Spieler verletzt?: " + verletzt);
    }

    public static void Compare(Spieler a, Spieler b){
        if (a.marktwert < b.marktwert)
        {System.out.println("Spieler " + b.name + " hat einen höheren Marktwert ("+ b.getMarktwert() + ") als " + a.name + " (" + a.getMarktwert() + ").");
        }
        else {System.out.println("Spieler " + a.name + " hat einen höheren Marktwert ("+ a.getMarktwert() + ") als " + b.name + " (" + b.getMarktwert() + ").");
        }
        if (a.alter > b.alter){
            System.out.println("Spieler " + a.name + " (" + a.alter + ") ist älter als " + b.name + " (" + b.alter +").");
        }
        else if (a.alter < b.alter) {System.out.println("Spieler " + b.name + " (" + b.alter + ") ist älter als " + a.name + " (" + a.alter +").");
        } else {System.out.println(a.name + " und " + b.name + " sind beide " + a.alter + " Jahre alt!");}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getMarktwert() {
        return marktwert;
    }

    public void setMarktwert(double marktwert) {
        this.marktwert = marktwert;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isVerletzt() {
        return verletzt;
    }

    public void setVerletzt(boolean verletzt) {
        this.verletzt = verletzt;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}
