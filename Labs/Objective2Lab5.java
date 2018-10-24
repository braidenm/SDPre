public class Objective2Lab5 {
  public static void main(String[] args ) {
    double side1, side2, hypontenuse;
    side1 = 3;
    side2 = 4;
    hypontenuse = Math.pow(side1, 2) + Math.pow(side2, 2) ;
    System.out.println( " The hypontenuse of a triangle with sides " + side1 + " and " + side2 + " is " + Math.sqrt(hypontenuse) );
  }
}
