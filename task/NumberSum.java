package task;


import java.util.Scanner;

public class NumberSum {
	
	
	public int findNumbers(String str) 
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(Character.isDigit(str.charAt(i)))
			{
				//System.out.println(str.charAt(i));
				System.out.println(Character.getNumericValue(str.charAt(i)));
				sum=sum+(Character.getNumericValue(str.charAt(i)));
				
			}
		}
			
		return sum;
	}
			
	
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string contains alphanumeric value" );
	String s=sc.next();
	NumberSum n= new NumberSum();
	
	int  sum=n.findNumbers(s);
	System.out.println("sum="+sum);
	}

}
