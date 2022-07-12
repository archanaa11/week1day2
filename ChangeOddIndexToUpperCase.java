package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code

		 * Declare String Input as Follow

		 * String test = "changeme";

		 * a) Convert the String to character array

		 * b) Traverse through each character (using loop)

		 * c)find the odd index within the loop (use mod operator)

		 * d)within the loop, change the character to uppercase, if the index is odd else don't change

		 */

		String test="changeme";
		char ch1;
		int x=2;
		
		char[] str=test.toCharArray();
		
		for (int i = 0; i < str.length; i++) 
		{
			if(i%x==0) 
			{
				ch1=Character.toUpperCase(str[i]);
				System.out.print(ch1);
			}
			else 
			{
				System.out.print(str[i]);
			}
		}



	}


}
