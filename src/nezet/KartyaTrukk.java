package nezet;

import modell.Pakli;
import java.util.Scanner;

public class KartyaTrukk {

    private final Scanner sc = new Scanner(System.in);
    Pakli Pakli = new Pakli();

    public KartyaTrukk() {
        indit();
    }
    

    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    private void kirak() {
        for (int i = 1; i < Pakli.getPakli().length; i++) {
            System.out.printf("%-8s", Pakli.getPakli()[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private void indit() {
        Pakli.feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();
            Pakli.kever(oszlop);
        }
        System.out.println("A válaszott lapod a: "+Pakli.ezVolt());
    }
}
