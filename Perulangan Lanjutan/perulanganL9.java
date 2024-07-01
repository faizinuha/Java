import java.util.*;


class Dcoder {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("input: ");
    int n = input.nextInt();

    System.out.println("Output");
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
