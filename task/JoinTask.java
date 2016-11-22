package task;
class Thread1 extends Thread 
{
	Thread2 t2;
	public Thread1(Thread2 t2) {
		this.t2=t2;
		
	}
	public void run()
	{ try{
		t2.join();
		for(int i=11;i<=20;i++)
		{
		System.out.println("i= "+ i);	
		}
		
	}catch(InterruptedException e){System.out.println(e);}
			
	}
}
class Thread2 extends Thread 
{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("i= "+ i);	
		}
			
	}
}
public class JoinTask {

	public static void main(String[] args) {
		
		try{
		
		Thread2 t2=new Thread2();
		Thread1 t1=new Thread1(t2);
		t1.start();
	    t2.start();
		t1.join();
		}
		
		catch(InterruptedException e){
			System.out.println("Thread Interrupted");
			}
		
		
		
		for(int i=21;i<=30;i++)
		{
		System.out.println("i= "+ i);	
		}
	}

}
