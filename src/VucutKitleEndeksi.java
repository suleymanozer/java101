import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, vucutKitleEndeksi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu(metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vucutKitleEndeksi = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksiniz: " +vucutKitleEndeksi);
    }
}
