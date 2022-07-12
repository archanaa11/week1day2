package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String r="java";
		String[] s=text.split(" ");
		for(int i=0;i<s.length;i++) 
		{
			if(r.equals(s[i]))
			{
				count++;}
			}
		
		if(count>1)
		{
			for(int j=0;j<s.length;j++)
			{
				if(r.equals(s[j]))
				{
					s[j]="";
				System.out.print(s[j]);	
				}
				else
				{
					System.out.print(s[j]+ " ");
				}
			}
				
		}
		
		

	}

}
