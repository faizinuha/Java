public class perulanganL7 {
    public static void main(String[] args) {
        int n = 5; // jumlah baris dan kolom
        int[][] numbers = new int[n][n];

        // mengisi array numbers dengan angka 1 sampai 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = i + 1;
            }
        }

        // mencetak array numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }
    }
}
