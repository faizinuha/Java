
import java.util.Scanner;

public class tugas12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input: ");
            int n = input.nextInt();

            System.out.println("CARA PERTAMA");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("* ");
                    } else if (j == i || j == n - (i - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();       
            }
            System.out.println("CARA KEDUA");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("* ");
                    } else if (j == i || j + i == n + 1) {
                        System.out.print("  *");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }        
    }
}
