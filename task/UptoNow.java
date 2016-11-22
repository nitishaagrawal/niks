package task;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UptoNow {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter date(dd-mm-yyyy)");
		String date=sc.next();
		
		boolean b=date.matches("([1-9]{2})-(0[1-9]|1[012])-([0-9]{4})");
		if(b)
		{
			SimpleDateFormat myFormat=new SimpleDateFormat("dd-MM-yyyy");
			Calendar cal=Calendar.getInstance();
		 String date1=myFormat.format(cal.getTime());
		//System.out.println(date1);
		 try {
			Date d1=myFormat.parse(date);
			Date d2=myFormat.parse(date1);
			long diff=d2.getTime()-d1.getTime();
			//System.out.println(diff);
			System.out.println("days:"+TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		}
		else
		{
		System.out.println("invalid format");
		}

	}

}
