import java.util.Scanner;

public class deretAritmatikaWhile {

    public static void main(String[] args) {

        int i=1;
        Scanner A = new Scanner(System.in);

        System.out.println("Masukkan angka awal !!!");
        int awal = A.nextInt();

        System.out.println("Masukkan nilai akhir");
        int akhir = A.nextInt();

        System.out.println("Masukkan nilai beda");
        int beda = A.nextInt();

        System.out.println("Deret aritmatikanya adalah = ");
        while (i <= akhir) {
            int hasil = awal + (i -1)*beda;
            System.out.println("suku ke - " + i + " : "+hasil);
            i++;
        }
   

    }

}
