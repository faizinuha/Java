import java.util.Scanner;

public class perluangan11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran sisi persegi: ");
        int sisi = scanner.nextInt();

        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                if (i == j || i == 1 || i == sisi || j == 1 || j == sisi) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}