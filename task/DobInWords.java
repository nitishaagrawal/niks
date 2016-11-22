package task;

import java.util.Scanner;

public class DobInWords {
	NumberToWords nw1;
	String dob="";
	String cdob="";
	String mnth[]={"","january","february","march","april","may","june","july","august","september","october","november","december"};
	public DobInWords(NumberToWords obj) {
		nw1=obj;
	}
	public void wordConversion (String s)
   {
		dob=s;
		String[] db=dob.split("-");
		int dd=Integer.parseInt(db[0]);
		int mm=Integer.parseInt(db[1]);
		int yy=Integer.parseInt(db[2]);
		int yy1=Integer.parseInt(db[2].substring(0,2));
		
		int yy2=Integer.parseInt(db[2].substring(2,4));
		
		int q=yy/1000;
		int r=yy%1000;
		
	String ddw=	nw1.two_digit(dd);
	String mmw=	mnth[mm];
	String yyw="";
	int temp=0;
	int len=0;
	if(yy1<=19)
	{ yyw=	nw1.first_digit_cons[yy1]+	" "+nw1.two_digit(yy2);
	}
	if(yy1>19)
	{
		 yyw=	nw1.two_digit(q)+" "+nw1.last_digit_cons[2];
	     temp=r;
		
		len=nw1.digit_count(r);
		if(len==1)
		{
			yyw=yyw+" "+nw1.first_digit_cons[temp];
			
		}
		if(len==2)
		{
			yyw=yyw+" "+nw1.two_digit(temp);
			
		}
		if(len==3)
		{
			yyw=yyw+" "+nw1.three_digit(temp);
			
		}
		
	}
	cdob=ddw+" "+mmw+" "+yyw;
	System.out.println(cdob);
	}

	public static void main(String[] args) throws InvalidDateFormatException  {
		NumberToWords nw=new NumberToWords();
		DobInWords dw=new DobInWords(nw);
		String s="";
		CustomExceptionDemo cd= new CustomExceptionDemo();
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date of birth in dd-mm-yyyy format" );
		s=sc.next();
		cd.validate_dateformat(s);
		}
        catch( InvalidDateFormatException   e )
		
		{
			System.out.println("exception Caught " +e);
			
		}
		if(cd.dob_flag==true)
		{
		dw.wordConversion(s);	
		}
		
	}

}
