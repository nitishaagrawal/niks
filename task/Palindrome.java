package task;

import java.util.Scanner;

public class Palindrome {
public boolean check(String s) {
	boolean ans;
	int j=s.length()-1;
	char ch[]=s.toCharArray();
	char ch1[]=new char[ch.length];
	
	for(int  i=0; i<ch.length;i++)
	{
		ch1[j]=ch[i];
		j--;
		
	}
	
	
	String str=new String(ch1);
	if(s.equals(str)){ans=true;}
	else ans=false;
	return ans;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
Palindrome p=new Palindrome();

if(p.check(s)==true)
{
	System.out.println("string is palendrome");
}
else{System.out.println("string is  not palendrome");}
	}

}
