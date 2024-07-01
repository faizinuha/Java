
import java.util.Scanner;

public class Tugasl9 {
    static int Faktorial(int num) {
        if (num == 1 || num == 0 )
            return 1;
        else
            return num * Faktorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int angka = input.nextInt();
        System.out.println("faktorialnya adalah: " + Faktorial(angka));
    }
}