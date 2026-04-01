/*
 Question (n = 5)
    1
   121
  12321
 1234321
123454321
Requirements:
Create a method:
public static void printNumberPyramid(int n)
Use nested loops
Maintain proper spacing and symmetry
Call the method from main */


package Assignments;

public class number_pyramid {
	
	public static void printnumpyramid(int n)
	{
		for (int i = 1; i <= n; i++) {
            //  Print  spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //  Print ascending numbers
            for (int s = 1; s <= i; s++) {
                System.out.print(s);
            }

            // Print descending numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
	}
	public static void main(String[] args) 
	{
		printnumpyramid(5);

		
		
	}

}
