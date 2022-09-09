import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
         𝜋 sayısını = 3.14 alınız.
         Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        double pi = 3.14, alan;

        Scanner scan =new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        int r = scan.nextInt();
        System.out.println("Merkez Açısının Ölçüsünü Giriniz : ");
        int a = scan.nextInt();

        alan = (pi * (r*r) * a) / 360;
        System.out.println("Daire diliminin alanı : " + alan);

    }
}
