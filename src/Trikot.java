import java.util.ArrayList;
public class Trikot {
        private String Sponsor;
        private String Farbe;
        private int Nummer;
        private boolean waschen;


        public Trikot(String Sponsor, String Farbe, int Nummer, boolean waschen){
            this.Sponsor = Sponsor;
            this.Farbe = Farbe;
            this.Nummer = Nummer;
            this.waschen = waschen;
        }

        public void addToList(Trikot a, ArrayList<Trikot> trikot_liste){
            trikot_liste.add(a);
        }

        public void removeFromList(Trikot a, ArrayList<Trikot> trikot_liste) {
            trikot_liste.remove(a);
        }
        private void trikotDreckig(){

            if(waschen == true){
                System.out.println("Das Trikot wurde gewaschen und ist jetzt wieder Sauber.");


            } else if (waschen == false) {
                System.out.println("Das Trikot ist sauber und muss nicht gewaschen werden.");
            }
            waschen = false;
        }

        public String getSponsor() {
            return Sponsor;
        }
        public void setSponsor(String  SponsorSET) {
            Sponsor = SponsorSET;
        }

        public String getFarbe() {
            return Farbe;
        }
        public void setFarbe(String FarbeSET) {
            Farbe = FarbeSET;
        }

        public int getNummer() {
            return Nummer;
        }
        public void setNummer(int NummerSET) {
            Nummer = NummerSET;
        }

        public boolean getWaschen() {
            return waschen;
        }
        public void setWaschen(boolean waschenSET) {
            waschen = waschenSET;
        }
}
