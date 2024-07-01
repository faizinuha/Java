
import java.util.Scanner;

public class tugas06 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int hasil = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Masukan angka ke-" + i + " = ");
                int angka = input.nextInt();

                if (angka %5 != 0) {
                    continue;
                }
                hasil += angka;
            }
            System.out.println("Hasil Penjumlahannya adalah = " + hasil);
        }
    }
}
