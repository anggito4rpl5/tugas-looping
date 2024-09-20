import java.util.Scanner;

public class deretAritmatikaFor {
    public static void main(String[] args) {

        //input dari pengguna 

        Scanner B = new Scanner(System.in);
        System.out.println("Masukkan angka awal !!!");
        int awal = B.nextInt();

        System.out.println("Masukkan nilai akhir");
        int akhir = B.nextInt();

        System.out.println("Masukkan nilai beda");
        int beda = B.nextInt();


        //perhitungan aritmatika
        System.out.println("Deret aritmatikanya adalah = ");
        for (int i = awal; i <= akhir; i += beda) {
            System.out.print(i + " ");

        }
        System.out.println();

    }

}
