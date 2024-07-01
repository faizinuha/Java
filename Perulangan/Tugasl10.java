
import java.util.Scanner;

public class Tugasl10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean runing = true;
        String qsn;

        while(runing){
            System.out.print("Apakah anda yakin ingin kelaur? (ya/tidak): ");

            qsn = scan.next();

            if(qsn.equalsIgnoreCase("ya")){
               runing = false;
            }
        }
    }
}