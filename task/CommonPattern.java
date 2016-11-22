package task;

import java.util.Scanner;

public class CommonPattern
{
	String pattern_string="";
    public boolean find(String ss)
    {
	int i=0,j=0,x=0;
	int len=ss.length();
	int upto1=(len/2);
	int upto2=(len/3);
	String region1,region2="";
	boolean flag=false;
	int p=2;
	int count=len%2;
	boolean even_len=(ss.length()%2==0);
	boolean odd_len=(ss.length()%2!=0);
	
	if(even_len)
	{
		//System.out.println("string is even length" +len + " "+upto);
		if(len<=8)
		{
			for(int k=0;k<upto1;k++)
			{
				flag=false;
				 
				region1=ss.substring(0,k+1);
				
				System.out.println(region1);
				
				region2=ss.substring(k+1,p); 
			
				System.out.println(region2);
				flag=region2.regionMatches(true, 0, region1, 0, region2.length());
			   p=p+2;
			    if(flag)
			    {
			    	pattern_string=region1;
			    	return true;
			    	
			    }
			   
			}
			 if(flag==false)
			    {
			    	pattern_string=ss;
			    	return true;
			    	
			    }
			
			
		}
		else
		{
				for(int k=0;k<upto1;k++)
				{
					
					 flag=false;
					
					region1=ss.substring(0,k+1);
					region2=ss.substring(k+1,p); 
				
					flag=region2.regionMatches(true, 0, region1, 0, region2.length());
				   p=p+2;
				    if(flag)
				    {
				    	pattern_string=region1;
				    	return true;
				    	
				    }
				    
				}
				if(flag==false)
			    {
			    	pattern_string=ss;
			    	return true;
			    	
			    }
		}
	}
	if(odd_len)
	{
		if(len%2 !=0 && len/3!=0)
		{
			
			if(len==2)
			{
				
				if(	ss.charAt(0)==ss.charAt(1))
				{
					pattern_string=ss.substring(0,1);
					return true;
				}
				else
				{
					pattern_string=ss;
					return true;
				}
				
			}
			else
			{
				pattern_string=ss;
				return true;
			}
			
		}
		else
		{
		for(int k=0;k<upto2;k++)
		{
			 flag=false;
			region1=ss.substring(0,x+1);
			//System.out.println("(0,"+(x+1)+")");
			//System.out.println(region1);
			
			region2=ss.substring(x+1,j+2);
			//System.out.println("("+(x+1)+","+(j+2)+")");
			
			 x=x+2;
			// System.out.println("x"+x);
			 j=j+4;
			// System.out.println("j"+j);
			flag=region2.regionMatches(true, 0, region1, 0, region2.length());
		   
		    if(flag)
		    {
		    	pattern_string=region1;
		    	return true;
		    	
		    }
		    
		}
		}
		
	}
	return flag;

    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		
		CommonPattern c=new CommonPattern();
		boolean b=c.find(s);
		if(b==true)
		{
			System.out.print("there is a common pattern "+c.pattern_string+" in string ");
			
		}
		

   }
}
