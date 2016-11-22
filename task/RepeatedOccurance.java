package task;

import java.util.Scanner;

public class RepeatedOccurance {
	public void check(String str)
	
	{
		int len=str.length();
		int[] cn=new int[len];
		char[] ch1=new char[len];
		char[] ch=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			int count=0;
			for(int j=0;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			cn[i]=count;
		}
		for(int i=0;i<len;i++)
		{
			
			if(cn[i]>1)
			{
				ch1[i]=ch[i];
				
			}
			
		}
		char current=ch1[0];
		boolean flag=false;
		for(int j=0;j<len;j++)
		{
			if(current==ch1[j] && !flag)
			{
				flag=true;
			}
			else if(current !=ch1[j])
			{
				System.out.print(""+current);
				current=ch1[j];
				flag=false;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		RepeatedOccurance r=new RepeatedOccurance();
		r.check(s);

	}

}
