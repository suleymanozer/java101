import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double ARMUT=2.14, ELMA=3.67, DOMATES=1.11, MUZ=0.95, PATLICAN=5.00, toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç kilo: ");
        ARMUT *= input.nextDouble();

        System.out.print("Elma Kaç kilo: ");
        ELMA *= input.nextDouble();

        System.out.print("Domates Kaç Kilo: ");
        DOMATES *= input.nextDouble();

        System.out.print("Muz Kaç Kilo: ");
        MUZ *= input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo: ");
        PATLICAN *= input.nextDouble();

        toplam = (ARMUT + ELMA + DOMATES + MUZ + PATLICAN);
        System.out.print("Toplam Tutar: " +toplam);

    }
}
