import java.util.Random;
    public class Stadion {
        public String name;
        private String vereinsname;
        private int baujahr;
        private int zuschauerzahl;

        public Stadion(String name, String vereinsname, int baujahr, int zuschauerzahl) {
            this.name = name;
            this.vereinsname = vereinsname;
            this.baujahr = baujahr;
            this.zuschauerzahl = zuschauerzahl;
        }

        public void displayAttributes() {
            System.out.println(this.name);
            System.out.println(this.vereinsname);
            System.out.println(this.baujahr);
            System.out.println(this.zuschauerzahl);
        }

        public void Stadionauslastung() {
            Random rd = new Random();
            int r = rd.nextInt(this.zuschauerzahl - 10000, this.zuschauerzahl + 1);
            int durchschnitt = r * 100 / this.zuschauerzahl;
            if (durchschnitt >= 10) {
                System.out.println("AUSVERKAUFT!!");
            } else {
                System.out.println("" + durchschnitt + "% der Tickets wurden verkauft!");
            }

        }

        public static void Compare(Stadion a, Stadion b) {
            if (a.baujahr < b.baujahr) {
                System.out.println(a.name + " ist älter als " + b.name + " !");
            } else {
                System.out.println(b.name + " ist älter als " + a.name + " !");
            }

            if (a.zuschauerzahl < b.zuschauerzahl) {
                System.out.println(b.name + " hat mehr Plätze als " + a.name);
                System.out.println("......................");
            } else {
                System.out.println(a.name + " hat mehr Plätze als " + b.name);
                System.out.println("......................");
            }

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVereinsname() {
            return vereinsname;
        }

        public void setVereinsname(String string) {
            this.vereinsname = string;
        }

        public int getBaujahr() {
            return baujahr;
        }

        public void setBaujahr(int baujahr) {
            this.baujahr = baujahr;
        }

        public int getZuschauerzahl() {
            return zuschauerzahl;
        }

        public void setZuschauerzahl(int zuschauerzahl) {
            this.zuschauerzahl = zuschauerzahl;
        }
    }
