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
    // declare variable that stores name
    stringName;
    // initialize the name variable with Bob
    name = "Bob";
    // delcare and initialize a constant to store the current year
    final int CURRENT_YEAR= 2020;
    // declare and initialize a variable to store the year they were born in
    int birthYear = 2004;
    //declare and calculate their age
    int age = CURRENT_YEAR - birthYear;
    
  }
}
