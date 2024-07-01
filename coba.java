

public class coba {

  public static void main(String[] args) {

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }

    System.out.println("");

    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (j == i) {
          break;
        }
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.println("");

    for (int i = 0; i < 8; i++) {
      for (int j = 0; i < 8; j++) {
        if ((j + i == 7)) {
          break;
        }
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.println("");

    for (int i = 0; i < 11; i++) {
      for (int j = 0; j < 11; j++) {
        System.out.print("* ");

        if (i == j) {
          break;
        } else if ((i + j == 10)) {
          break;
        }      
      }
      System.out.print("\n");
    }
    System.out.println("");

    for (int i = 5; i > -5; i--) {
      for (int j = 0; j < i; j++) {
          System.out.print(" ");
      }
      for (int j = 0; j >= i; j--) {
          System.out.print(" ");
      }
      System.out.println("*");
    }

  }
}
