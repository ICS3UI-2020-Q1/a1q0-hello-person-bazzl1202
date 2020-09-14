import java.util.Scanner;

/**
 * This program says hello to a person and calculates their approximate age.
 * @author Liana Bazzarella 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // declare variable that stores name
    String userName;

    // ask the user for their name
    System.out.println("Please enter your name:");
    // initialize the user's name
    userName = input.nextLine();

    //say hell to the user
    System.out.println("Hello " + userName + "!");

    //ask the user for their year of birth
    System.out.println("Please enter the year you were born:");
    // delcare and initialize a variable for the birthYear
    int birthYear = input.nextInt();

    // declare and initialize a constant for the current year 
    final int CURRENT_YEAR = 2020;

    // declare and calculate the user's age
    int age = CURRENT_YEAR - birthYear; 

    //tell the user their age
    System.out.println("You are " + age + " years old.");
    
    
  }
}
