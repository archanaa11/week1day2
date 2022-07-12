package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String str="good";
		char[] c=str.toCharArray();
		String rev="";
		int a=c.length;
		System.out.println("The given string is "+str);		
		for (int i=a-1; i >=0; i--) 
		{
			rev=rev+c[i];
		}
		System.out.println("The reverse string is "+rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given String is Palindrome");
		}
			else {
				System.out.println("Given String is not Palindrome");}
		

	}

}
