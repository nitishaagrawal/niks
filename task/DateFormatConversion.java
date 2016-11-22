package task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatConversion {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		String dd=Integer.toString(calendar.get(Calendar.DATE));
		String mm= Integer.toString(calendar.get(Calendar.MONTH));
		String yy= Integer.toString(calendar.get(Calendar.YEAR));
		if(dd.length()==1){dd="0"+dd;}
		if(mm.length()==1){mm="0"+mm;}
		String str=mm+"-"+dd+"-"+yy;
		System.out.println("date in format of (mm-dd-yyyy):"+str);
		Date d=new Date();
		SimpleDateFormat df;
		df=new SimpleDateFormat(" MM-dd-yyyy",Locale.ENGLISH);
		System.out.println(df.format(d));
		
	}

}
