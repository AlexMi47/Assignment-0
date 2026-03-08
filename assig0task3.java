/**
 * Assig0task3.java
 * 
 * KIT107 Assignment 0 -- Task 3
 * 
 * @author Alex Mickan (761588)
 * @version	6th March 2026
 * 
 * This file is part of the KIT107 Assignment 0.
 * 
 * Program Use: You must write a Python (or Java) program to define a list (array) of ten non-negative
  float values — with up to ten values entered by the user (stopping before ten if they
  enter –1.0) — and then display the sum of all values stored in the array.
 */
import java.util.Scanner;

public class assig0task3 
{   
    public static void main(String[] args)
    {
        // Declaring the Constant variables to be used in the program
        final int MAX = 10; 
        final double STOP = -1.0; 

        // Declaring the variables to be used in the program
        double[] numbers;  // Array to hold the non-negative float values entered by the user
        double entry;  // Variable to hold the current float value entered by the user
        int count;  // Variable to keep track of the number of values entered by the user
        double sum;  // Variable to hold the sum of the values entered by the user
        Scanner readline;  // Scanner object to read user input

        // Initialising the variables
        count = 0;
        sum = 0.0;

        // Initialising the Scanner object and the array to hold the user input values
        readline = new Scanner(System.in);
        numbers = new double[MAX];

        // Prompting the user to enter float values and storing them in the array
        System.out.print(" Please enter a number (-1.0 to Stop the program): ");
        
        // Reading the first entry from the user
        entry = readline.nextDouble();

        // Using a while loop to read up to the MAX values from the user, stopping if the user enters STOP
        while((count < MAX) && (entry != STOP))
        {
            // Storing the entered value in the array and adding it to the sum
            numbers[count] = entry;
            sum = sum + numbers[count];
            count++;

            // Using an if statement to check if the count is still less than MAX before prompting the user for another entry
            if (count < MAX)
            {
                // Prompting the user to enter another float value
                System.out.print("Please enter a number (-1.0 to Stop the program): ");
                
                // Reading the next entry from the user
                entry = readline.nextDouble();
            }
        }
        // Displaying the sum of the entered numbers
        System.out.println("The sum of the entered numbers is: " + sum);

        // Closing the Scanner object
        readline.close();
    }
    
}
