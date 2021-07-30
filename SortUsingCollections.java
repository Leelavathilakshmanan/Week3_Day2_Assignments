package week3_Day2Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Assignment 4: Sort using collection

1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

2. Get the length of the array		

3. sort the array			

4. Iterate it in the reverse order

5. print the array
		
6. Required Output: Wipro, HCL , CTS, Aspire Systems
*/

public class SortUsingCollections {

	public static void main(String[] args) {
		
//		String[] language= {"GOOGLE","MICROSOFT","TESTLEAF","MAVERICK"};
		
		List<String> values = new ArrayList<String>();
		
		values.add("GOOGLE");
		values.add("MICROSOFT");
		values.add("TESTLEAF");
		values.add("MAVERICK");
		
		System.out.println("The length of the the array list : "+ values.size());
		System.out.println("The list : " +values);
		Collections.sort(values);
		System.out.println("The Sorted list using collection :" + values);
		Collections.reverse(values);
		System.out.println("The reverse list using collection : " + values);
		
		
		/*
		 * System.out.println("The Reverse Order using for loop : "); for(int
		 * i=values.size()-1;i>=0;i--) { String value=values.get(i);
		 * System.out.println(value); }
		 */
	}

	
}
