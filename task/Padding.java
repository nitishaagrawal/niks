package task;

import java.util.Scanner;

public class Padding {
	public void left_padding(String s) 
	{
		int len=s.length();
		int append_len=10-len;
		String str="";
		for(int i=1;i<=append_len;i++)
		{
			str=str+"*";
		}
		str=str+s;
		System.out.println(str);
	}
	public void right_padding(String s)
	{
		int len=s.length();
		int append_len=10-len;
		String str="";
		for(int i=1;i<=append_len;i++)
		{
			str=str+"*";
		}
		str=s+str;
		System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string " );
		String s=sc.next();
		Padding p=new Padding();
		if(s.length()==10){System.out.println(s);}
		else{
		
		System.out.println("string after left padding");
		p.left_padding(s);
		System.out.println("string after right padding");
		p.right_padding(s);
		}
		
	}

}
