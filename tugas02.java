
import java.util.*;

public class tugas02 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int jawab;

            while (true) {
                System.out.print("ketikan angka berapapun (kecuali 0): ");
                jawab = in.nextInt();

                if (jawab == 0) {
                    break;
                }
            }
        }
    }
}
