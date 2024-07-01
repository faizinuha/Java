
import java.util.Scanner;

class tugasl7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 3, beda = 4, deret;

System.out.print("Masukkan jumlah deret: ");
deret = input.nextInt();
 
for(int i=0; i<deret; i++) {
    System.out.print(angka);
    System.out.print(" , ");
    angka += beda;
    beda *= 2;
        }
    }
}