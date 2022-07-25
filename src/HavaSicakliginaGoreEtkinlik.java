package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        double derece;
        Scanner inp = new Scanner(System.in);

        System.out.print("Hava kaç derece: ");
        derece = inp.nextDouble();

        if (derece < 5) {
            System.out.println("Kayak yapabilirsin");
        } else if (derece <= 25) {
            if (derece <= 15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if (derece >= 10){
                System.out.println("Pikniğe gidebilirsin");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin");
        }

    }
}
