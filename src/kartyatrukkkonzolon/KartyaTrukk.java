package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukk {

    private final Scanner sc = new Scanner(System.in);

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

    public void indit() {
        Pakli p1 = new Pakli();
        p1.feltolt();
        for (int i = 0; i < 3; i++) {
            p1.kirak();
            int oszlop = melyik();
            p1.kever(oszlop);
        }
        p1.ezVolt();
    }
}
