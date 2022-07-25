package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniAdi, sifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        kullaniAdi = input.nextLine();

        System.out.print("Şifreniz: ");
        sifre = input.nextLine();

        if (kullaniAdi.equals("patika") && sifre.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else{
            System.out.println("Bilgilerinizi Yanlış Girdiniz!");
            System.out.println("");
        }


    }
}
