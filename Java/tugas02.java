package JavaFundamental.PerulanganLanjutan;

import java.util.*;

public class tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jawab;

        while (true) {
            System.out.print("ketikan angka berapapun (kecuali 0): ");
            jawab = input.nextInt();

            if (jawab == 0) {
                break;
            }
        }
    }
}
