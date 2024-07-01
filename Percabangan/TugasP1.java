package percabangan;
import java.util.Scanner;

public class TugasP1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Inputkan total belanja anda: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat Anda mendapat hadiah gantungan kunci");
        }
    }
}
