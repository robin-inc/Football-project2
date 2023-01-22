import java.util.ArrayList;
public class Trikot {
        private String Sponsor;
        private String Farbe;
        private int Nummer;
        private boolean dreckig;


        public Trikot(String Sponsor, String Farbe, boolean dreckig){
            this.Sponsor = Sponsor;
            this.Farbe = Farbe;
            this.dreckig = dreckig;
        }

        public void addToList(Trikot a, ArrayList<Trikot> trikot_liste){
            trikot_liste.add(a);
        }
        public void removeFromList(Trikot a, ArrayList<Trikot> trikot_liste) {
            trikot_liste.remove(a);
        }

        private void trikotWaschen(){

            if(dreckig == true){
                System.out.println("Das Trikot wurde gewaschen und ist jetzt wieder Sauber.");


            } else if (dreckig == false) {
                System.out.println("Das Trikot ist sauber und muss nicht gewaschen werden.");
            }
            dreckig = false;
        }

        public String getSponsor() {
            return Sponsor;
        }
        public void setSponsor(String SponsorSET) {
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

        public boolean getDreckig() {
            return dreckig;
        }
        public void setDreckig(boolean waschenSET) {
            dreckig = waschenSET;
        }
}
