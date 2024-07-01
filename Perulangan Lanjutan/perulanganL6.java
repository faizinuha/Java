import java.util.Scanner;

public class perulanganL6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0; // inisialisasi variabel untuk menyimpan hasil penjumlahan
    System.out.println("Masukkan lima angka: ");
    for (int i = 1; i <= 5; i++) {
      int num = input.nextInt();
      if (num % 5 != 0) {
        continue;
      }
      sum += num; 
    }
    System.out.println("Jumlah angka kelipatan 5 adalah: " + sum);
  }
}
