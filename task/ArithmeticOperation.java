package task;

import java.util.Scanner;
class Operation
{
	Scanner sc= new Scanner(System.in);
	int var1=0;
	int var2=0;
 int flag=0;
 int flag1=0;
	synchronized public int inputForT1() 
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
	int temp= sc.nextInt();
	var1=temp;
	 flag=1;
     notify();
	return temp;
    }	
	synchronized public int inputForT2()
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
		int temp= sc.nextInt();
		var2=temp;
		choice();
		 flag=0;
	     notify();
		return temp;
	}
	public void choice() {
		
		System.out.println("please enter your choice");
		System.out.println("1. addition");
		System.out.println("2. subtarction");
		System.out.println("3. multiplication");
		System.out.println("4.division");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: int result= add(var1,var2);
		System.out.println("addition:"+result);
		if(flag1==1){System.out.println(" execution over");}
		else{
		System.out.println("please enter two integer values");
		break;}
		case 2:int result1=  sub(var1,var2);
		System.out.println("subtraction:"+result1);
		if(flag1==1){System.out.println(" execution over");}
		else{
		System.out.println("please enter two integer values");
		break;}
		case 3:int result2=  mul(var1,var2);
		System.out.println("multiplication:"+result2);
		if(flag1==1){System.out.println(" execution over");}
		else{
		System.out.println("please enter two integer values");
		break;}
		case 4:int result3=  div(var1,var2);
		System.out.println("division:"+result3);
		if(flag1==1){System.out.println(" execution over");}
		else{
		System.out.println("please enter two integer values");
		break;}
		}
	}
	public int add(int x,int y)
	{
		
		return (x+y);
	}

	public int sub(int x,int y)
	{
		
		return (x-y);
	}
	public int mul(int x,int y)
	{
		
		return (x*y);
	}
	public int div(int x,int y)
	{
		if(y==0){
		return 0;}
		else{ return (x/y);}
	}


}
class Thread01 extends Thread
{
	Operation o;
	public Thread01(Operation o)
	{
		this.o=o;
		
	}
 public void  run() 
	{
		

		for(int i=0;i<10;i++)
		{
			
		   	int tmp=o.inputForT1();
		    try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		

}
}
class Thread02 extends Thread
{
	Operation o;
	public Thread02(Operation o)
	{
		this.o=o;
		
	}
 public void  run() 
	{
		for(int i=0;i<10;i++)
		{
			if(i==9){o.flag1=1;}
			int tmp=o.inputForT2();
			
			
		    try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 	
		}
	}


}
public class ArithmeticOperation {

	public static void main(String[] args) {
		Operation o=new Operation();
		Thread01 t1=new Thread01(o);
		Thread02 t2=new Thread02(o);
		System.out.println("please enter two integer values");
	t1.start();
	t2.start();
	

	}

}
