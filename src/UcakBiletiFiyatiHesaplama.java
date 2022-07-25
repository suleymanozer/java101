package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double kmUcreti = 0.10, tutar, indirimliTutar, gidisDonusIndirim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini seçiniz: 1 = > Tek Yön 2 = > Gidiş Dönüş : ");
        yolculukTipi = inp.nextInt();

        if (km < 1) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else if (km > 0) {

            tutar = km * kmUcreti;

            switch (yolculukTipi) {
                case 1:
                    if (yas < 12) {
                        indirimliTutar = tutar - ((tutar * 50) / 100);
                    } else if (yas >= 12 && yas <= 65) {
                        indirimliTutar = tutar - ((tutar * 10) / 100);
                    } else {
                        indirimliTutar = tutar - ((tutar * 30) / 100);
                    }
                    System.out.println("Toplam Tutar: " + indirimliTutar);
                    break;
                case 2:
                    if (yas < 12) {
                        indirimliTutar = tutar - ((tutar * 50) / 100);
                    } else if (yas >= 12 && yas <= 65) {
                        indirimliTutar = tutar - ((tutar * 10) / 100);
                    } else {
                        indirimliTutar = tutar - ((tutar * 30) / 100);
                    }
                    gidisDonusIndirim = 2 * (indirimliTutar - ((indirimliTutar * 20) / 100));
                    System.out.println("Toplam Tutar: " + gidisDonusIndirim);
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz");

            }
        }

    }
}
