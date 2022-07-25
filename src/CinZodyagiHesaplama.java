package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumYili, kalan;
        String burc = " ";
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılı giriniz: ");
        dogumYili = inp.nextInt();

        kalan = dogumYili % 12;

        if (kalan == 0){
            burc = "Maymun";
        } else if (kalan == 1) {
            burc = "Horoz";
        } else if (kalan == 2) {
            burc = "Köpek";
        } else if (kalan == 3) {
            burc = "Domuz";
        } else if (kalan == 4) {
            burc = "Fare";
        } else if (kalan == 5) {
            burc = "Öküz";
        } else if (kalan == 6) {
            burc = "Kaplan";
        } else if (kalan == 7) {
            burc = "Tavşan";
        } else if (kalan == 8) {
            burc = "Ejderha";
        } else if (kalan == 9) {
            burc = "Yılan";
        } else if (kalan == 10) {
            burc = "At";
        } else if (kalan == 11) {
            burc = "Koyun";
        } else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
