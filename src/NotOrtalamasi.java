import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double notOrtalaması;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        notOrtalaması = ((mat + fizik + kimya + turkce + tarih + muzik) / 6);
        System.out.println("Not Ortalamanız: "+notOrtalaması);

        String sonuc = notOrtalaması >= 60 ? "Geçti" : "Kaldı";
        System.out.println("Sonucunuz: " +sonuc);


    }
}
