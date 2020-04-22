import java.util.Scanner;
/*
* The CompareStrings program is an assignment from Java Bootcamp
* It incorrectly compares two strings and needs to be correct to 
*   run properly
* Kim Levin
* 4/21/2020
*/
public class CompareStrings{

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //Prompt user for weather conditions
      System.out.println("How is the weather?");
      String answer = sc.nextLine();

      //Display message to the console based on answer
      //   from user about weather conditions
      if (answer.equals("rain")) {
         System.out.println("Take your umbrella!");
      } else if (answer.equals("windy")) {
         System.out.println("Wear a jacket!");    
      } else if (answer.equals("snow")) {
         System.out.println("Wear a coat and take a shovel!");
      } else {
         System.out.println("Enjoy your day!");
      }
   }
}
