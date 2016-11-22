package task;

import java.util.Scanner;

public class NumberNearVowles {
	char[] vw={'a','e','i','o','u'};
	public void patternMatch(String s)
	{
		for(int i=1;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				char before=s.charAt(i-1);
				char after=s.charAt(i+1);
				boolean first=false;
				boolean last=false;
				for(int j=0;j<vw.length;j++)
				{
				if(before==vw[j]){ first=true;} 
				}
				for(int j=0;j<vw.length;j++)
				{
				if(after==vw[j]){last=true;} 
				}
				if(first & last){System.out.println(ch);}
			}
		}
	}

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		NumberNearVowles nv=new NumberNearVowles();
		nv.patternMatch(s);
	}

}
