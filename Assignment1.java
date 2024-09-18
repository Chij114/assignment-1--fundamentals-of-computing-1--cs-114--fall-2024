// Import libraries here
import java.util.*;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here

    float userTemp, celsiusTemp;
    String randomString, newRandString, finalString;
    char char1, char2, char3;
    Random randomNumGen;
    int randomNum;

    Scanner scan = new Scanner(System.in);

    //Initials
    System.out.println();
    System.out.println("  CCCCCC\tEEEEEEEE");
    System.out.println(" CCCCCCC\tEEEEEEE");
    System.out.println("CCC\t\tEEE");
    System.out.println("CCC\t\tEEE");
    System.out.println("CCC\t\tEEEEEEE");
    System.out.println("CCC\t\tEEEEEEE");
    System.out.println("CCC\t\tEEE");
    System.out.println("CCC\t\tEEE");
    System.out.println(" CCCCCCC\tEEEEEEE");
    System.out.println("  CCCCCC\tEEEEEEEE");
    System.out.println();

    //Temperature
    System.out.println("Please enter a temperature in Fahrenheit below:");

    userTemp = scan.nextFloat();

    celsiusTemp = (userTemp - 32) * 5 / 9;

    //Random String
    System.out.println("Please enter a random sequence of five letters below:");
    
    randomString = scan.next();
 
    scan.close();

    //New String
    char1 = randomString.charAt(1);
    char2 = randomString.charAt(2);
    char3 = randomString.charAt(3);
  
    newRandString = "" + char3 + char2 + char1;

    //Random Number Generator
    System.out.println("Generating random number...");

    randomNumGen = new Random();

    randomNum = randomNumGen.nextInt(16353) + 32;

    //Final Combination
    finalString = "" + celsiusTemp + newRandString + randomNum;

    System.out.println("Your final string is: " + finalString);
  }
}
