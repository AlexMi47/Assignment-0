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
        final int MAX = 10; 
        final double STOP = -1.0; 

        double[] numbers;
        double entry;
        int count;
        double sum;
        Scanner readline;

        count = 0;
        sum = 0.0;
        readline = new Scanner(System.in);
        numbers = new double[MAX];

        System.out.print(" Please enter a number (-1.0 to Stop the program): ");
        entry = readline.nextDouble();

        while((count < MAX) && (entry != STOP))
        {
            numbers[count] = entry;
            sum = sum + numbers[count];
            count++;

            if (count < MAX)
            {
                System.out.print("Please enter a number (-1.0 to Stop the program): ");
                entry = readline.nextDouble();
            }
        }
        System.out.println("The sum of the entered numbers is: " + sum);

        readline.close();
    }
    
}
