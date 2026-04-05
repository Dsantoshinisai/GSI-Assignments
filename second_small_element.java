/*Find Second Smallest Element

ðŸ‘‰ Steps:

Take an array of size 6
Traverse and find smallest
Traverse again to find second smallest
Handle case when all elements are same

ðŸ‘‰ Example:
[4, 2, 7, 2, 9, 1] â†’ Output: 2*/


package Assignments;

public class second_small_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,2,2,2,2,2};

int result = smallelement(arr);

if (result == Integer.MAX_VALUE) {
    System.out.println("No second smallest element exists.");
} else {
    System.out.println("Output: " + result);
}
		
	}
	
	public static int smallelement(int arr[])
	{
		if (arr.length<2) 
			return Integer.MAX_VALUE;
		
		int smallest = Integer.MAX_VALUE;
		int second_smallest=Integer.MAX_VALUE;
		
		for(int num : arr)
		{
			if(num < smallest)
			{
				smallest=num;
			}
		}
		
		
		for(int num : arr)
		{
			if (num > smallest && num < second_smallest)
			{
				second_smallest =num;
			}
		}
		return second_smallest;
			

	}

}
