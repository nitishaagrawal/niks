package task;


import java.util.Scanner;

public class NumberToWords {
	String[] first_digit_cons={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen"
			,"Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String[] sec_digit_cons={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
String[] last_digit_cons={"","Hundred","Thousand","Lakh","Crore"};
	public int digit_count(int no)
	{
		int temp;
		int num=no;
		int digit_c=0;
		while(num>0)
		{
			temp=num%10;
			digit_c++;
			num=num/10;
		}
		return digit_c ;
	}
	public String two_digit(int no)
	{
		int num=no;
		String str="";
		int temp1,temp2;
		temp1=num%10;
		temp2=num/10;
		if(num<19)
		{
			
			str=str+first_digit_cons[num];
		}
		if(num>19)
		{
		str=str+sec_digit_cons[temp2]+ " "+ first_digit_cons[temp1];	
		}
		
	    return str;
	}
	public String three_digit(int no)
	{
		int num=no;
		String str="";
		int temp1,temp2;
		temp1=num%100;
		temp2=num/100;
		if(temp1==0)
		{
			
			str=str+first_digit_cons[temp2]+" " +last_digit_cons[1];
		}
		if(temp1!=0)
		{
			//System.out.println("temp1 "+temp1);
			//System.out.println("temp2 "+temp2);
		str=str+first_digit_cons[temp2]+" "+last_digit_cons[1]+" and "+two_digit(temp1);	
		}
		
	    return str;
	}
	

	public static void main(String[] args) 
	{
		NumberToWords nw=new NumberToWords();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number" );
		int s=sc.nextInt();
		String word="";
		int d;
		if(s<0)
		{
		System.out.println("number is  or less than zero");	
		}
		else
		{
			while(s>0)
			{
			d=nw.digit_count(s);
			if(d==1)
			{
				word=word+" "+nw.first_digit_cons[d];
				s=0;
			}
			if(d==2)
			{
				word=word+" "+nw.two_digit(s);
				s=0;
			}
			if(d==3)
			{
				word=word+nw.three_digit(s);
				s=0;
			}
			if(d==4 | d==5)
			{
				int temp1,temp2;
				temp1=s%1000;
				temp2=s/1000;
				
				word=word+nw.two_digit(temp2)+ " "+nw.last_digit_cons[2] +" ";
				s=temp1;
			}
			if(d==6 | d==7 )
			{
				int temp1,temp2;
				temp1=s%100000;
				temp2=s/100000;
				word=word+nw.two_digit(temp2)+ " "+nw.last_digit_cons[3]+" ";
				s=temp1;
				
				
			}
			if(d==8 )
			{
				int temp1,temp2;
				temp1=s%10000000;
				temp2=s/10000000;
				word=word+nw.two_digit(temp2)+ " "+nw.last_digit_cons[4]+" ";
				s=temp1;
				
				
			}
			
		}
		}
		System.out.println(word);
		
	}

}
