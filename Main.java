import java.util.Scanner;
/**
 * asks user for positive integer, if it's positive it ask again, if negative, it exits the program
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //create variable to store user's number
    int number;

    //start the loop
    do{
      //ask user for number
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      number = input.nextInt();
    }while(number >= 0); //if the number is positve, repeat

    //if the number is negative tell the user the program is done
    System.out.println("All done!");
  }
}
