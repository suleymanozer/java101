package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100)
            mat = 0;
        if (fizik < 0 ||fizik > 100)
            fizik = 0;
        if (kimya < 0 || kimya > 100)
            kimya = 0;
        if (turkce < 0 || turkce > 100)
            turkce = 0;
        if (muzik < 0 || muzik > 100)
            muzik = 0;

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
        if (ortalama >= 55) {
            System.out.println("Sınıfı geçtiniz!");
        } else {
            System.out.println("Kaldınız!!");
        }
        System.out.println("Ortalamanız: " + ortalama);

    }
}
