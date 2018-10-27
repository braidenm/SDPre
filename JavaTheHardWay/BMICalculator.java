import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, i, lb, ft, in;

    System.out.print( "Your height (feet only): ");
    ft = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    i = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    lb = keyboard.nextDouble();

    in= ft*12+i;
    m = in/39.37;
    kg = lb/2.205;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
