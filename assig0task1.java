/**
 * Assig0task1.java
 * 
 * KIT107 Assignment 0 -- Task 1
 * 
 * @author Alex Mickan (761588)
 * @version	6th March 2026
 * 
 * This file is part of the KIT107 Assignment 0.
 * 
 * Program Use: You must write a Python (or Java) program to define two str variables with values
'A' and '$' and to swap their values.
 */
public class assig0task1
{
    // Declaring my Constant Identifiers as per Assessment Brief
    public static final char INITIAL_VALUE_ONE = 'A';
    public static final char INITIAL_VALUE_TWO = '$';

    public static void main(String[] args) 
    {
        // Declaring the variables to be used in the program
        char first_value;  // Variable to hold the first value
        char second_value; // Variable to hold the second value
        char temp_value;  // Temporary variable to assist in swapping the values
                
        // Initialising the variables with the constant values
        first_value = INITIAL_VALUE_ONE;
        second_value = INITIAL_VALUE_TWO;

        // Displaying the initial values before swapping
        System.out.println("Before swapping:");
        System.out.println("First Value: " + first_value);
        System.out.println("Second Value: " + second_value);

       
    }   
}
