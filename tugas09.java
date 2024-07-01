
import java.util.*;

public class tugas09 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Masukan input: ");
          int Input = input.nextInt();

          for (int i = 0; i < Input; i++) {
              for (int j = 0; j < Input; j++) {
                System.out.print("* ");
              }
              System.out.println("");
            }
        }
    }
}
