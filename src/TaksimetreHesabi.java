import java.util.Scanner;

public class TaksimetreHesabi {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden girin: ");
        km = input.nextInt();

        total = 10 + (km * perKm);

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);


    }
}
