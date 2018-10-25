import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args ){
    Scanner input = new Scanner(System.in);

    int number1, number2, solution;

    System.out.println( "Please enter a number: " );
    number1 = input.nextInt();

    System.out.println( "Please enter another number: ");
    number2 = input.nextInt();

    solution = number1 + number2;

    System.out.print( "The sum of " + number1 + " and " );
    System.out.println( number2 + " is " + solution );

    input.close();
  }
}
