package Assignments;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1= {"flower", "flow", "flight"};
		System.out.println("Output1 : "+Prefix(arr1));
		
		String[] arr2= {"dog", "racecar", "car"};
		System.out.println("Output2 : "+Prefix(arr2));
		
		String[] arr3= {"interview", "internet", "internal", "interval"};
		System.out.println("Output3 : "+Prefix(arr3));
		
		
		
		

	}
	
	public static String Prefix (String[] strs)
	{
		
if (strs == null || strs.length == 0) return "";
        
        // Initialize prefix as the first string
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it is found at the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) 
                	return "";
            }
        }
        
        return prefix;
    }
	}
	
	


