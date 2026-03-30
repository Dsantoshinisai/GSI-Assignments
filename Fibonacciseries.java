package Assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int terms =10;
		int first = 0;
		int second = 1;
		int third;
		
		System.out.println(first+ " " + second +" " );
		
		for(int n = 1; n<=terms;n++)
		{
			third = first + second ;
			System.out.println(third + " ");
			first = second;
			second=third;
			if(third > 100)
			{
				break;
			}
		}
	}

}
