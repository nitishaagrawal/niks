package task;
class TablePrint
{
	
	     int flag=0;	
	  synchronized  void TwoTablePrint(int j )
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
		  int a=2;
		  int i =j;
			
		  
			System.out.println(a+"*"+i+"="+(a*i));
           flag=1;
           notifyAll();
		}

	  synchronized  void ThreeTablePrint(int j)
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
		    int a=3;
		    int i =j;
			
			 System.out.println(a+"*"+i+"="+(a*i));
			 flag=2;
	           notifyAll();	
			
		}
	  synchronized  void FourTablePrint(int j)
		{
		  if(flag!=2)
			 {
				  try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 }
		  int a=4;
		  int i =j;	
		
         		System.out.println(a+"*"+i+"="+(a*i));
         		
         		flag=0;
                notifyAll();
	        
					 
		}
}
class TwoTable extends Thread
{
	TablePrint t;
	public TwoTable( TablePrint t) {
	this.t= t;	
	}
	public void run()
	{
		
			
		 for(int i=1;i<=10;i++)
			{
			 t.TwoTablePrint(i);
			  try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
				
			
			
			
			
		
		

	
	}

}
class ThreeTable extends Thread
{
	
	TablePrint t;
	public ThreeTable( TablePrint t) {
	this.t= t;	
	}
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			t.ThreeTablePrint(i);
			
            try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		

	}

}
class FourTable extends Thread
{
	TablePrint t;
	public FourTable( TablePrint t) {
	this.t= t;	
	}

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		
			t.FourTablePrint(i);
			
			  try {
				 
					Thread.sleep(100);
                   System.out.println("--------");
                  
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
public class ThreadCommTask {

	public static void main(String[] args) {
		
	TablePrint t=new TablePrint();
	
	TwoTable t1= new TwoTable(t);
	ThreeTable t2= new ThreeTable(t);
	FourTable t3= new FourTable(t);
	t1.start();
	t2.start();
	t3.start();

	}

}
