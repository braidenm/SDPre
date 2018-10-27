public class CreatingVariables {
  public static void main( String[] args) {
    int x, y, age, w;
    double seconds, e, checking, t;
    String firstName, lastName, title, sport, city;

    x = 10;
    y = 400;
    age = 39;
    w = 175;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    t = 3.14;

    firstName = "Braiden";
    lastName = "Miller";
    title = "Mr.";
    sport = "Snowboarding";
    city = "Denver";


    System.out.println( "the variable x contains " + x);
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.print( "To finish this task I will add this info: " );
    System.out.print(+t+" is pi. My favorite sport and city are: " + sport+" " + city);
    System.out.println(" and I weight: " +w);
  }
}
