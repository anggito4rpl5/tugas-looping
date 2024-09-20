import java.util.Scanner;

public class faktorial {

    public static void main(String[] args) {

        int angka, temp = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        angka = input.nextInt();

        for (int i = angka; i >= 1; i--) {
            System.out.print(i + " " + " X" + " ");
            temp *= i;

        }
        System.out.println();
        System.out.println("total faktorial = " + temp);

    };
}
