public class Personal {

    public String name;
    private int alter;
    public double marktwert;
    public String aufgabe;
    public boolean verlezt;
    public boolean kapitan;

    public Personal(String name, int alter, double marktwert, String aufgabe, boolean verletzt, boolean kapitan){
        this.name = name;
        this.alter = alter;
        this.marktwert = marktwert;
        this.aufgabe = aufgabe;
        this.verlezt = verletzt;
        this.kapitan = kapitan;
    }




    public void status(){
        System.out.println("Name des " + aufgabe +"s: " + name);
        System.out.println("Alter des " + aufgabe + "s: " + alter);
        System.out.println("Marktwert des " + aufgabe + "s: " + marktwert);
        System.out.println("Aufgabe des Personals: " + aufgabe);
        System.out.println("Ist der " + aufgabe + " verletzt? " + verlezt);
        System.out.println("Ist der " + aufgabe + " Kapitän? " + kapitan);
    }

    public static void Compare(Personal a, Personal b){
        if (a.marktwert < b.marktwert)
        {System.out.println("Der " + b.aufgabe + " " + b.name + " hat einen höheren Marktwert als " + a.aufgabe + " " + a.name + ".");
        }
        else {System.out.println("Der " + a.aufgabe + " " + a.name + " ist älter als " + b.aufgabe + " " + b.name + ".");
        }

        if (a.alter > b.alter){
            System.out.println("Der " + a.aufgabe + " " + a.name + " ist älter als " + b.aufgabe+ " " + b.name + ".");
        }
        else {System.out.println("Der " + b.aufgabe + " " + b.name + " ist älter als " +a.aufgabe + " " + a.name + ".");
        }


    }
}
