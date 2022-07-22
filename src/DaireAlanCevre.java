import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int r, merkezAcisi;
        double Alan, Cevre, pi = 3.14, DaireDilimininAlani;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz: ");
        r = input.nextInt();


        Alan = pi * r * r;
        Cevre = 2 * pi * r;
        System.out.println("Alan: " + Alan);
        System.out.println("Çevre: " + Cevre);

        System.out.print("Merkez açısı: ");
        merkezAcisi = input.nextInt();
        DaireDilimininAlani = (pi * (r * r) * merkezAcisi) / 360;
        System.out.println("Daire diliminin alanı: " +DaireDilimininAlani);

    }
}
