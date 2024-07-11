package Percabangan;
import java.util.Scanner;

public class TugasP7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan angka1: ");
        int angka1 = input.nextInt();
        
        System.out.print("Inputkan angka2: ");
        int angka2 = input.nextInt();

        if(angka1 >= angka2){
            System.out.println("angka terbesar adalah: " + angka1);
        }else
        if(angka2 >= angka1) {
            System.out.println("angka terbesar adalah: " + angka2);
        }
    }
}
