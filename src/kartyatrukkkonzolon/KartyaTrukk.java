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

        Pakli Pakli = new Pakli();
        Pakli.feltolt();
        for (int i = 0; i < 3; i++) {
            Pakli.kirak();
            int oszlop = melyik();
            Pakli.kever(oszlop);
        }
        Pakli.ezVolt();
    }
}
