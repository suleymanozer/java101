import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        int a, b, UcgeninAlani;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("b kenarını giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " +c);

        UcgeninAlani = (a * b) / 2;
        System.out.println("Üçgenin Alanı: " +UcgeninAlani);


    }
}
