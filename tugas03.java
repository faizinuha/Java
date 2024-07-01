

public class tugas03 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;

        System.out.println(b + " ");
        for (int i = 3; i <= 100; i++) {
            c = a + b;
            if (c >= 200) {
                break;
            }
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
