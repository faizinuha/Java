package Percabangan;
import java.util.Scanner;

public class TugasP9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String pilihan;

        System.out.print("menu\n"
        + "1.Penentuan angka terbesar\n"
        + "2.Penentuan angka ganjil genap\n"
        + "pilih [1/2]\n"
        + "PILIH: ");
        pilihan = input.next();

        switch(pilihan){
            case "1":
            System.out.println("\npenentuan angka terbesar");
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
        break;

        case "2":
        System.out.println("\npenentuan angka ganjil genap");
        int bilangan;

        System.out.print("inputkan bilangan: ");
        bilangan = input.nextInt();

        if(bilangan % 2 == 0){
            System.out.println("Bil " + bilangan + " adalah bilangan genap");
        }else{
            System.out.println("Bil " + bilangan + " adalah bilangan ganjil");
        }
        break;
        default :
        System.out.println("\n!!!inputan anda tidak tersedia!!!");
        }
    }
}