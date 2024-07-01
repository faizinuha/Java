

public class perulanganL5 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 6; i++){
            System.out.print(i + "\t");
        }

        for (int i = 6; i <= 20; i++){
            if (i >= 6 && i <= 16){
                continue;
            }
        }

        for (int i = 16; i <= 20; i++){
            System.out.print(i + "\t");
        }
    }
}
