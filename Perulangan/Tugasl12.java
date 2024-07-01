
import java.util.Scanner;

public class Tugasl12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.print("Menu: \n1.Penjumlahan\n2.Pengurangan\n3.Keluar\nmasukan menu pilihan anda: ");
        int select = scan.nextInt();

        switch (select){
            case 1 :
            System.out.println("Anda memilih PENJUMLAHAN");
            System.out.println("\n\n---------------------------");
            break;

            case 2:
            System.out.println("Anda memilih PENGURANGAN");
            System.out.println("\n\n---------------------------");
            break;

            case 3:
            System.out.println("Program berhenti!");
            break;
        }
    }
    
}
