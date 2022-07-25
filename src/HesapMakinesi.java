package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                sonuc = n1 + n2;
                System.out.println("Toplama sonucu: " + sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println("Çıkarma sonucu: " + sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println("Çarpma sonucu: " + sonuc);
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı sıfıra bölünemez!");
                        break;
                    default:
                        sonuc = n1 / n2;
                        System.out.println("Bölme sonucu: " + sonuc);
                        break;
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!!");
        }


    }
}
