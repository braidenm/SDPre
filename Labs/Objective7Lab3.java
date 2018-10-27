import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      System.out.print("Selection: ");
      selection = scanner.nextInt();
      System.out.println();

      if (selection == 1){
      System.out.println("Hello Human \n");
      }

      else if (selection == 2){
      System.out.println("Pizza, beer, wings \n");
      }

      else {
        System.out.println( "Goodbye \n");
        break;
      }
    }


  }
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1) Say Hello");
    System.out.println("2) List My Favorite Foods");
    System.out.println("3) Exit");
    System.out.println();
  }
}
