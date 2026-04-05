
/*Check if Array is Sorted

ðŸ‘‰ Steps:

Input array
Create method isSorted()
Check ascending order
Return true/false*/


package Assignments;

public class array_sorting {

	public static void main(String[] args) {

int[] arr= {1,2,3,4,5,6};
if (isSorted(arr)) {
    System.out.println("true.");
} else {
    System.out.println("false");
}
	}

	public static boolean isSorted(int[] arr)
	{
		if(arr.length<=1) return  true;
		for(int i=0;i< arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
			
		}
		return true;
		
	}
}
