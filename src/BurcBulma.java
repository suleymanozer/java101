package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int gun, ay;
        String burc = " ";
        boolean hata = false;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz gün: ");
        gun = inp.nextInt();

        System.out.print("Doğduğunuz ay: ");
        ay = inp.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    hata = true;
                }
                break;
            case 2:
                if (gun >=1 && gun <= 28){
                    if (gun < 20) {
                        burc = "Kova";
                    }else {
                        burc = "Balık";
                    }
                }else {
                    hata = true;
                }
                break;
            case 3:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21){
                        burc = "Balık";
                    }else {
                        burc = "Koç";
                    }
                }else {
                    hata = true;
                }
                break;
            case 4:
                if (gun >= 1 && gun <= 30){
                    if (gun < 21){
                        burc = "Koç";
                    }else {
                        burc = "Boğa";
                    }
                }else {
                    hata = true;
                }
                break;
            default:
                System.out.println("Hatalı bir ay girdiniz!");
        }
        if (hata) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz");
        }else {
            System.out.println("Burcunuz: " +burc);
        }
    }
}
