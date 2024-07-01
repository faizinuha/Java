package percabangan;
import java.util.Scanner;

public class TugasP8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("program untuk menentukan bilangan ganjil dan genap");
        System.out.println("==================================================");

        int bilangan;

        System.out.print("inputkan bilangan: ");
        bilangan = input.nextInt();

        if(bilangan % 2 == 0){
            System.out.println("bilangan: " + bilangan + " adalah bilangan genap");
        }else{
            System.out.println("bilangan: " + bilangan + " adalah bilangan ganjil");
        }
    }
    
}
