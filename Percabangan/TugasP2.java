package Percabangan;

import java.util.Scanner;

public class TugasP2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Inputkan total belanja anda: ");
        belanja = input.nextInt();

        if (belanja >= 500000)
        {
            System.out.println("Selamat anda mendapat hadiah gantungan kunci");
        }
        else
        {
        int selisihbelanja = 500000 - belanja;
        System.out.println("belanja anda kurang dari Rp.500.000");
        System.out.println("silahkan tambah lagi belanjanya senilai Rp." + selisihbelanja);
        System.out.println("Agar bisa mendapatkan bonus gantungan kunci");
        }
    }
}
