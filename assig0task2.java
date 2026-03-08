/**
 * Assig0task2.java
 * 
 * KIT107 Assignment 0 -- Task 2
 * 
 * @author Alex Mickan (761588)
 * @version	6th March 2026
 * 
 * This file is part of the KIT107 Assignment 0.
 * 
 * Program Use: You must write a Python (or Java) program to ask the user to enter two int variables
   from the keyboard and display all numbers between these.
 */
import java.util.Scanner;

public class assig0task2
{
    // Declaring the Constant Identifiers as per Assessment Brief
    public static final String FIRST_PROMPT = "Please enter your first value: ";   // Prompt for first value for user input
    public static final String SECOND_PROMPT = "Please enter your second value: "; // rompt for second value for user input 

    public static void main(String[] args)
    {
        // Declaring the variables to be used in the program
        Scanner readline;     // Scanner object to read user input  
        int first_value;      // Variable to hold the first integer value entered by the user
        int second_value;     // Variable to hold the second integer value entered by the user
        int temp_value;      // Temporary variable to assist in swapping the values 

        // Initialising the Scanner object to read user input
        readline = new Scanner(System.in);

        // Prompting the user to enter the first and second integer values
        System.out.print(FIRST_PROMPT);
        first_value = readline.nextInt();

        System.out.print(SECOND_PROMPT);
        second_value = readline.nextInt();

        // Using an if statement to ensure that first_value is less than or equal to second_value for the loop to work correctly
        if (first_value > second_value)
        {
            temp_value = first_value; // Store the value of first_value in temp_value
            first_value = second_value;  // Assign the value of second_value to first_value
            second_value = temp_value;  // Assign the value stored in temp_value back to second_value
        }

        // Using a for loop to display all numbers between first_value and second_value (inclusive)
        for (int i = first_value; i <= second_value; i++)
        {
            System.out.println(i);
        }

        // Closing the Scanner object
        readline.close();
    }
}