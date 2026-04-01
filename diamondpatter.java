
/*Question: Diamond Pattern using Method

(n = 5)
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
Requirements:
Create a method:
public static void printDiamond(int n)
Use loops only
Divide logic into upper and lower half
Call the method from main*/


package Assignments;

public class diamondpatter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		printDiamond(5);
		
	}
	
	public static void printDiamond(int n)
	{
		//upper pyramid
		
		for (int i =1 ; i<=n;i++)
		{
			for (int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			for(int s = 1 ; s<=(2*i-1);s++)
			{
				System.out.print("*");
			}
		System.out.println(" ");
		}
		
		//lower pyramid
		
		for (int i =n-1 ; i>=1;i--)
		{
			for (int j= 1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			for(int s = 1 ; s<=(2*i-1);s++)
			{
				System.out.print("*");
			}
		System.out.println(" ");
		}
	}

}
