
import java.util.Scanner;

public class Tugasl5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan angka: ");
        int num = scan.nextInt();
        if(num%2==1){
            System.out.println(num + " Adalah bilangan ganjil");
        }else{
            System.out.println(num + " Adalah bilangan genap");
        }

    }
}
