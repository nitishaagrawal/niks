package task;

import java.io.*;

public class CustomExceptionDemo {
static boolean  dob_flag=false;
	static void validate_mobileno(String num) throws InvalidMobileNumberException
	{
		
		String temp=num;
		int len=temp.length();
		boolean b=temp.matches("[0-9]+");
		if( len==10  && b )
		{
		//System.out.println("valid mobile number");	
		}
		if(len<10 || len>10 || b==false)
		{
			
			throw new InvalidMobileNumberException("invalid mobile number");
		}
	}
	
	static void validate_dateformat(String date) throws InvalidDateFormatException
	{
		String temp=date;
		int len=temp.length();
		//boolean b=temp.matches("([1-9]{2})-(0[1-9]|1[012])-([0-9]{4})");
		boolean b=temp.matches("(0?[1-9]|[12][0-9]3[01]|)-(0[1-9]|1[012])-([0-9]{4})");
		if( len==10  && b )
		{
			dob_flag=true;
		//System.out.println("valid date format");	
		}
		if(len<10 || len>10 || b==false)
		{
			
			throw new InvalidDateFormatException("invalid date format");
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String str;
					System.out.println("First Enter date in format dd-mm-yyyy");
					
					
				
					str = br.readLine();
					
					
			validate_dateformat(str);
			
					
		}
		catch( InvalidDateFormatException   e )
		
		{
			System.out.println("exception Caught " +e);
			
		}
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String str1;
					
					System.out.println("Now Enter mobile number ");
					
				
					
					str1=br.readLine();
				
			
			validate_mobileno(str1);
					
		}
		catch (InvalidMobileNumberException e1) 
		{
			System.out.println("exception Caught " +e1);
		}
         catch (IOException e2) 
		{
	          System.out.println("exception Caught " +e2);
        }
	}

}
