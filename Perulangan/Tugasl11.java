

import java.util.Scanner;

public class Tugasl11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String ganjil = "";
        String genap = "";

        System.out.print("inputkan panjang deret: ");
        int deret = scan.nextInt();

        int i = 1;
        do {
            if (i % 2 == 1){
                ganjil  = ganjil + i + "";
            }else{
                genap = genap + i + "";
            }
            i++;
        }while (i <= deret);

        System.out.println("Bilangan ganjil: " + ganjil);
        System.out.println("Bilangan genap: " + genap);
    }
}
