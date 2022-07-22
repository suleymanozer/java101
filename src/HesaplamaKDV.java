import java.util.Scanner;

public class HesaplamaKDV {
    public static void main(String[] args) {
        double KdvsizFiyat;
        double KdvliFiyat, KdvOrani=18;
        double KdvTutari;

        Scanner input = new Scanner(System.in);

        System.out.print("KDVsiz Fiyat: ");
        KdvsizFiyat = input.nextDouble();

        KdvliFiyat = KdvsizFiyat + (KdvsizFiyat*KdvOrani)/100;
        System.out.println("Kdvli Fiyat: " +KdvliFiyat);

        KdvTutari = (KdvsizFiyat*KdvOrani)/100;
        System.out.println("Kdv Tutarı: " + KdvTutari);


    }
}
