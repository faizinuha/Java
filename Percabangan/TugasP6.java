package Percabangan;
import javax.swing.JOptionPane;

public class TugasP6 {
    public static void main (String[] args){

        String plat =JOptionPane.showInputDialog("masukan plat nomor: ");

        if(plat.equals("p")){
            System.out.println("Jember, Banyuwangi, Bondowoso, Situbondo");
        }else
        System.out.println("yang anda inputkan tidak tersedia di data kami");
    }
    
}
