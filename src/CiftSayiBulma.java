package Donguler;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int sayi, toplam = 0,adet = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            if (i%12 == 0){
                toplam += i;
                adet++;
            }
        }
        ortalama = toplam/adet;
        System.out.println("3 ve 4 e bölünen sayıların ortalaması: " +ortalama);
    }
}
