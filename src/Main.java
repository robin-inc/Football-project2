public class Main {
    public static void main(String[] args) {

        Personal x = new Personal("Ulle", 33, 8.7, "Spieler", false, false);
        Personal y = new Personal("Ibra", 39, 10.3, "Spieler", true, false);
        Personal z = new Personal("Rashford", 23, 100, "Spieler", false, false);

        x.status();
        System.out.println();
        y.status();
        System.out.println();
        System.out.println();


        Personal.Compare(x, y);
        System.out.println();
        Personal.Compare(x, z);

    }
}