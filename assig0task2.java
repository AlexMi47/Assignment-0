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
    
    public static final String FIRST_PROMPT = "Please enter your first value: ";   // prompt for first number
    public static final String SECOND_PROMPT = "Please enter your second value: "; // prompt for second number

    public static void main(String[] args)
    {
        Scanner readline;         
        int first_value;   
        int second_value;   
        int temp_value;     

        readline = new Scanner(System.in);

        System.out.print(FIRST_PROMPT);
        first_value = readline.nextInt();

        System.out.print(SECOND_PROMPT);
        second_value = readline.nextInt();

        if (first_value > second_value)
        {
            temp_value = first_value; 
            first_value = second_value;  
            second_value = temp_value;  
        }

        for (int i = first_value; i <= second_value; i++)
        {
            System.out.println(i);
        }

        readline.close();
    }
}