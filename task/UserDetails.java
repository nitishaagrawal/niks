package task;


import java.util.Scanner;
class StoreDetails
{
	int user_no=0;
	String[][] details;
	StoreDetails(int count)
	{
		user_no=count;
	details	= new String[user_no][6]; 
	}
	Scanner sc=new Scanner(System.in);

	int flag=0;
	int status=0;
	
	
	synchronized public void first3Deatils (int i)
		{
		
		if(flag!=0)
		 {
			  try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		status=i;
			System.out.println("enter "+(i+1)+" user details");
			System.out.println("enter user first name");
		details[status][0]=	 sc.next();
		System.out.println("enter user last name");
		details[status][1]=	 sc.next();	
		System.out.println("enter user mobile number");
		String mn=sc.next();
		boolean b= check(mn);
	
		if (b)
		{
			details[status][2]=	 mn;
		}
		else 
		{
			
			System.out.println("enter valid user mobile number");
			details[status][2]=	 sc.next();	
		}
		flag=1;
		notify();
		
		}
	public boolean check(String num) 
	{
		String temp=num;	
		int len=temp.length();
		boolean b=temp.matches("[0-9]+");
		if( len==10  && b )
		{
			return true;
		}
		else
		{
			
			return false;
		}

	}
	public boolean check1(String num) 
	{
		String temp=num;
		int len=temp.length();
		boolean b=temp.matches("[0-9]+");
		if( len==6  && b )
		{
			return true;
		}
		else
		{
			
			return false;
		}

	}
	public void show(int m) {
		for(int i=0;i<6;i++)
		{
		System.out.println(	details[m-1][i]);
		}
		
		
	}
	synchronized public void Second3Deatils (int i)
	{
	if(flag!=1)
	 {
		  try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	status=i;
			
			System.out.println("enter user address");
			
			sc.nextLine();
				 String add=sc.nextLine();
			
		details[status][3]=	add;
		System.out.println("enter user email_id");
		details[status][4]=	 sc.next();	
		System.out.println("enter user  area pincode");
		String pin=sc.next();
		boolean b= check1(pin);
		if (b)
		{
			details[status][5]=	 pin;	
		}
		else 
		{
			
			System.out.println("enter valid user  area pincode");
			details[status][5]=	 sc.next();	
		}
		
		flag=0;
		notify();
		
	}


}
class Thread001 extends Thread
{
	StoreDetails s;
	int lp=0;
	public Thread001(StoreDetails s) 
	{
		this.s=s;
	}
	public void run()
	{
		lp=s.user_no;
		
		for(int i=0;i<=lp-1;i++)
		{
			s.first3Deatils(i);
		   	
		    
			
		}
	}


}
class Thread002 extends Thread
{
	StoreDetails s;
	int lp=0;
	public Thread002(StoreDetails s) 
	{
		this.s=s;
	}
	public void run()
	{
		lp=s.user_no;
		for(int i=0;i<=lp-1;i++)
		{
			s.Second3Deatils(i);
		   	
		   
			
		}
	}



}
public class UserDetails {
	
	public static void main(String[] args) throws InterruptedException {
		int user=0;	
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter number of user");
	user=sc.nextInt();
	StoreDetails sd=new StoreDetails(user);
	Thread001 t1=new Thread001(sd);
	Thread002 t2=new Thread002(sd);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	//try {
		//Thread.currentThread().sleep(50000);
	//} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	/*for(int i=0;i<user;i++)
	{
		
		for(int j=0;j<6;j++)
		{
			System.out.println(sd.details[i][j]);
		}
	}*/
	System.out.println("which user details you want to print");
	int n=sc.nextInt();
	sd.show(n);
	
	
	}

}
