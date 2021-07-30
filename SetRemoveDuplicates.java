package week3_Day2Assignment6;

import java.util.LinkedHashSet;
import java.util.Set;

/*Assignment 5: RemoveDuplicates 
------------------------------

Declare a String as PayPal India

1.Convert it into a character array

2.Declare a Set as charSet for Character

3.Declare a Set as dupCharSet for duplicate Character

4.Iterate character array and add it into charSet
Note: add() method in a set returns boolean value. 
      Duplicate values will not be added and hence will return "false"
      So, we can find out if an element is added to the set or not using IF condition. 

5. If the element is not added in the step 4,
   it means the character is a duplicate and the character is already in the charSet
   Then, add it to the dupCharSet

6.Check the dupCharSet elements and remove those in the charSet
  Note: use removeAll()

7.Iterate using charSet

8.Check the iterator variable isn't equals to an empty space

9.print it


*/


public class SetRemoveDuplicates {

	public static void main(String[] args) {


		String value="PayPal India";
		char[] a=value.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();

		for(int i=0;i<a.length;i++)
		{
		    
			if(charSet.add(a[i]))
			{
				
			}
			
			else
			{
				dupCharSet.add(a[i]);
			}
		}
		
		System.out.println("Print charSet : "+charSet);
		System.out.println("Print DupCharSet : "+dupCharSet);
		charSet.removeAll(dupCharSet);
		System.out.println("Print charSet : "+charSet);
		System.out.println("Print DupCharSet : "+dupCharSet);
		
		System.out.println("The remove Duplicates set : ");
		for(Character eachChar:charSet)
		{
			if(eachChar == ' ')
			{
				continue;
			}
			else
			   System.out.println(eachChar);
		}
		
	}

}
