import javax.swing.JOptionPane;
import java.util.HashMap;

public class LoginSystem {
    private static HashMap<String, String> kredensial = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            String pilihan = JOptionPane.showInputDialog("Pilih opsi:\n1. Daftar\n2. Masuk\n3. Keluar");

            switch (pilihan) {
                case "1":
                    daftar();
                    break;
                case "2":
                    masuk();
                    break;
                case "3":
                    int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar dari aplikasi?", "Keluar", 
                        JOptionPane.YES_NO_OPTION);

                    if (opsi == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan aplikasi.");
                       JOptionPane.showMessageDialog(null,  JOptionPane.showInputDialog(null, "Masukkan alasan ya "));

                        System.exit(0);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Terima kasih sudah menggunakan aplikasi saya");
            }
        }
    }

    public static void daftar() {
        String username = JOptionPane.showInputDialog("Masukkan username:");
        String password = JOptionPane.showInputDialog("Masukkan password:");

        kredensial.put(username, password);

        JOptionPane.showMessageDialog(null, "Pendaftaran berhasil!");
        System.out.println("Terima kasih telah mendaftar.");
    }

    public static void masuk() {
        String username = JOptionPane.showInputDialog("Masukkan username:");
        String password = JOptionPane.showInputDialog("Masukkan password:");

        if (kredensial.containsKey(username) && kredensial.get(username).equals(password)) {
            JOptionPane.showMessageDialog(null, "Login berhasil!");
        } else {
            JOptionPane.showMessageDialog(null, "Username atau password salah. Silakan coba lagi.");
        }
    }
}
