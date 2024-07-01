public class perulanganL8 {
    public static void main(String[] args) {
        int n = 5; // jumlah baris dan kolom
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j + " "); // mencetak hasil perkalian antara baris dan kolom
            }
            System.out.println(); // mencetak baris baru setelah selesai mencetak satu baris
        }
    }
}
