import javax.sound.midi.Soundbank;
import java.util.Random;
    public class Stadion {
        public String name;
        private int baujahr;
        private int capacity;

        public Stadion(String name, int baujahr, int capacity) {
            this.name = name;
            this.baujahr = baujahr;
            this.capacity = capacity;
        }

        public void Information() {
            System.out.println("+++STADIONPROFIL+++");
            System.out.println("Name: " + this.name);
            System.out.println("Baujahr: " + this.baujahr);
            System.out.println("Kapazität: " + this.capacity);
            System.out.println("-------------------");
        }

        public void Stadionauslastung() {
            Random rd = new Random();
            int r = rd.nextInt(this.capacity - 15000, this.capacity + 1);
            int durchschnitt = r * 100 / this.capacity;
            if (durchschnitt >= 95) {
                System.out.println(" >95% -> AUSVERKAUFT!");
            } else {
                System.out.println("" + durchschnitt + "% der Tickets wurden am letzten Spieltag verkauft!");
            }
        }

        public static void Compare(Stadion a, Stadion b) {

            int differenz = a.capacity - b.capacity;

            System.out.println("+++STADIONVERGLEICH+++");
            if (a.baujahr < b.baujahr) {
                System.out.println(">>> Das " + a.name + " ist älter als das " + b.name + "!");
                System.out.println("[Das " + a.name + " wurde bereits im Jahre " + a.baujahr + " errichtet, das " + b.name + " hingegen im Jahre " + b.baujahr + ".]");
            } else {
                System.out.println(">>> Das " + b.name + " ist älter als das " + a.name + "!");
                System.out.println("[Das " + b.name + " wurde bereits im Jahre " + b.baujahr + " errichtet, das " + a.name + " hingegen im Jahre " + a.baujahr + ".]");
            }
            if (a.capacity < b.capacity) {
                System.out.println(">>> Das " + b.name + " hat mit einer Kapazität von " + b.capacity + ", rund " + differenz + " mehr Plätze als das " + a.name + ".");
            } else {
                System.out.println(">>> Das " + a.name + " hat mit einer Kapazität von " + a.capacity + ", rund " + differenz + " mehr Plätze als das " + b.name + ".");
            }
            System.out.println("-------------------");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBaujahr() {
            return baujahr;
        }

        public void setBaujahr(int baujahr) {
            this.baujahr = baujahr;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }
