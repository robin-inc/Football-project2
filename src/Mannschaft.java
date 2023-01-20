//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class Mannschaft {
    private static ArrayList<String> Array = new ArrayList();
    static ArrayList<Integer> ArrayInt = new ArrayList();

    public static void main(String[] args) {
        SpielerNamen();
        kaderHinzufuegen();
    }

    public static void SpielerNamen() {
        String[] SN = new String[]{"Serge Gnabry", "Thomas Mueller", "Manuell Neuer", "Benjamin Pavart", "Joschua Kimmich", "Leroy Sane"};

        for(int i = 0; i < SN.length; ++i) {
            System.out.println("Der Spieler: " + SN[i]);
        }

    }

    private void status() {
    }

    public static void verletzte() {
        System.out.println();
    }

    private void kaderStreichen() {
    }

    public static void kaderHinzufuegen() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte fügen Sie für die Verteidigung eine Zahl ein, um einen neuen Kader zu erstellen. (V-M-S)");
        String V = s.nextLine();
        System.out.println("Bitte fügen Sie für das Mittelfeld eine Zahl ein, um einen neuen Kader zu erstellen. (V-M-S)");
        String M = s.nextLine();
        System.out.println("Bitte fügen Sie für den Sturm eine Zahl ein, um einen neuen Kader zu erstellen. (V-M-S)");
        String S = s.nextLine();
        System.out.println("Ihre neue Kaderformation lautet: (" + V + "-" + M + "-" + S + ")");
    }
}
