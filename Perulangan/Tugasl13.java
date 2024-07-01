
import java.util.Scanner;

class Tugasl13{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bilInput, total = 0, bil1 = 0,bil2 = 1, bilUlang = 0;
        System.out.print("masukan angka: ");
        bilInput = scan.nextInt();

        System.out.print("deret Fibonanci dari " + bilInput + " = ");

        do{
            if (bilUlang < bilInput){
                total = bil1 + bil2;
                bil2 = bil1;
                bil1= bil2;
                bil1= total;

                System.out.print(" " + total);
                bilUlang++;
            }
        }while (bil1 == total);
    }
}