
import java.util.Scanner;
public class Tugasl1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int number = scan.nextInt();
        int i = 1;
        int result= 0;
 
        while(true) {
            if(i % 3 == 0) {
                System.out.print(i + " ");
                result++;
 
                if(result == 11) break;
            }
            i++;
        }
    }
}