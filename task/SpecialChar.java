package task;

import java.util.Scanner;

public class SpecialChar {
public void specialMatch(String s) 
{
	for(int i=0;i<s.length();i++)
	{
	char c=s.charAt(i);
	if(!Character.isLetterOrDigit(c)){System.out.println(c);}
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string contains special characters value" );
		String s=sc.next();
		SpecialChar obj=new SpecialChar();
	
		obj.specialMatch(s);
	}

}
