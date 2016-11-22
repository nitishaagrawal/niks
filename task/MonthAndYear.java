package task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MonthAndYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number");
		String  input=sc.next();
		String mnth[]={"","january","february","march","april","may","june","july","august","september","october","november","december"};
		List<String> mnth_list=new ArrayList<String>();
		Calendar c=Calendar.getInstance();
		int mm=0,yy=0;
		int flag=0;
		int k=0,j=0;
		String op="";
		int ip=Integer.parseInt(input);
		boolean b=ip<=12;
		
		if(b)
		{
			
			    mm=ip;
				yy=c.get(Calendar.YEAR);
				
				for(k=mm;k<=12& mm<=12;k++)
				{
					
					flag=flag+1;
					op=mnth[mm]+"-"+yy;
					mnth_list.add(op);
				    mm++;
					
				}
				
				if(flag!=12)
				{
					mm=1;yy=yy+1;
					j=12-flag;
					for(k=1;k<=j;k++)
					{
						
						
						op=mnth[mm]+"-"+yy;
						mnth_list.add(op);
					    mm++;
						
					}
				}
				
				Iterator<String> it=mnth_list.iterator();
				 
				while (it.hasNext()) {
				System.out.println(it.next());
					
				}
			
			
		}
		else
		{
			System.out.println("invalid month");
			
		}
	
	

	}

}
