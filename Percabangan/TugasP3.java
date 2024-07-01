package percabangan;
import javax.swing.JOptionPane;

public class TugasP3 {
    public static void main(String[] args){
    int nilai;

    System.out.print("Inputkan nilai: ");
    nilai = Integer.parseInt(JOptionPane.showInputDialog("Inputkan nilai: "));
    System.out.println(nilai);

    if(nilai >= 81 && nilai <= 100){
        System.out.println("Nilai A");
    }else if (nilai >= 71 && nilai <= 80){
        System.out.println("Nilai B");
    }else if (nilai >= 51 && nilai <= 70){
        System.out.println("Nilai C");
    }else if(nilai >= 21 && nilai <= 50){
        System.out.println("Nilai D");
    }else if (nilai >= 0 && nilai <= 20){
        System.out.println("Nilai E");
    }

    }
}
