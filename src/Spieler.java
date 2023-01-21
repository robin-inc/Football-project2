public class Spieler {

    private String name;
    private int alter;
    private double marktwert;
    private String position;
    private boolean verletzt;
    public Spieler(String name, int alter, double marktwert, String position, boolean verletzt){
        this.name = name;
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
        {System.out.println("Spieler " + b.name + " hat einen höheren Marktwert als " + a.name + ".");
        }
        else {System.out.println("Spieler " + a.name + " hat einen höheren Marktwert als "  + b.name + ".");
        }
        if (a.alter > b.alter){
            System.out.println("Spieler " + a.name + " ist älter als " + b.name + ".");
        }
        else {System.out.println("Spieler "  + b.name + " ist älter als " + a.name + ".");
        }
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

}
