package percabangan;
import java.io.*;

import javax.lang.model.util.ElementScanner6;

public class TugasP4 {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Mereknya apa: ");
        String merk = input.readLine();

        int ukuran = 0;
        int harga = 0;

        if (merk.equals("ABC"))
        {
            System.out.println("Ukurannya apa: ");
            ukuran = Integer.parseInt(input.readLine());

            if (ukuran >= 26 && ukuran <= 30)
            {
                harga = 160000;
            }
            else
            if ( ukuran >= 31 && ukuran <= 34)
            {
                harga = 180000;
            }

            System.out.println("Merk: " + merk);
            System.out.println("Ukuran: " + ukuran);
            System.out.println("Harga: Rp." + harga);
        }
        else
        if(merk.equals("DEF"))
        {
            System.out.println("Ukurannya apa: ");
            ukuran = Integer.parseInt(input.readLine());

            if (ukuran >= 26 && ukuran <= 30)
            {
                harga = 210000;
            }
            else
            if(ukuran >= 31 && ukuran <= 34)
            {
                harga = 220000;
            }
            
            System.out.println("Merk: " + merk);
            System.out.println("Ukururan: " + ukuran);
            System.out.println("harga: " + harga);
        }
        else
        {
            System.out.println("Maaf, tidak ada merk yang anda inputkan");
        }
    }
}
