/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program that asks for three numbers.
Check first to see that all numbers are different.
If they’re not different, then exit the program.
Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 */
package Exercise_22;

import java.util.Scanner;
public class ex22 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int first, sec, third, max = 0;

        System.out.print("Enter the first number: ");
        first = input.nextInt();

        System.out.print("\nEnter the second number: ");
        sec = input.nextInt();

        System.out.print("\nEnter the third number: ");
        third = input.nextInt();

        if (first == sec || first == third || sec == third)
            System.exit(0);

        if (first > sec && first > third) {
            max = first;
            System.out.printf("\nThe largest number is %d", max);
        }

        else if (sec > first && sec > third) {
            max = sec;
            System.out.printf("\nThe largest number is %d", max);
        }

        else if (third > sec && third > first) {
            max = third;
            System.out.printf("\nThe largest number is %d", max);
        }

    }
}
