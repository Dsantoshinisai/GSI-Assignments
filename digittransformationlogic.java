package Assignments;

public class digittransformationlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=57243;
		int position =1;
		int result = 0;
		int place =1;
		while (n>0)
		{
			int digit = n%10;
			if (position%2!=0 && digit <= 4 )
			{
				digit = digit *2;
			}
			else if (position%2==0)
			{
				digit = 1;
			}
			
			result = result + (digit * place);
			place = place *10;
			position++;
			n=n/10;
		}
		
		System.out.println(result);
	}

}
