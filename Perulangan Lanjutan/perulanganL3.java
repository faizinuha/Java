public class perulanganL3 {
    public static void main(String[] args) {
        int a  = 0, b =1;

        while(true){
            int c = a+b;

            if (c >= 200){
                break;
            }
            if (c < 200){
                System.out.print(c + " ");
            }
            a = b;
            b = c;
        }
    }
}
//output =1 2 3 5 8 13 21 34 55 89 144