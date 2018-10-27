import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, i, lb;

    System.out.print( "Your height in inches: " );
    i = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    lb = keyboard.nextDouble();
    m = i/39.37;
    kg = lb/2.205;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
