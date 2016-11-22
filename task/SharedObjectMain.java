package task;




 class SharedObject {
	synchronized void m1(SharedObject ob1)
	{
		System.out.println("inside m1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob1.m1(this);
		System.out.println("m1 end");
	}
	synchronized void m2(SharedObject ob1)
	{
		System.out.println("inside m2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				ob1.m1(this);
		System.out.println(" m2 end");
	}
	
}
class Thread19 extends Thread{
	SharedObject ob1,ob2;
Thread19(SharedObject ob1,SharedObject ob2)
	{
	this.ob1=ob1;
	this.ob2=ob2;
	}
	public void run()
	{
		
		ob1.m1(ob2);
	}
}
class Thread29 extends Thread{
	SharedObject ob1,ob2;
Thread29(SharedObject ob1,SharedObject ob2)
	{
	this.ob1=ob1;
	this.ob2=ob2;
	}
	public void run()
	{
		
		ob2.m2(ob1);
	}
}
public class SharedObjectMain {

	public static void main(String[] args) {
	SharedObject s1=new SharedObject();
	SharedObject s2=new SharedObject();
	Thread19 t1=new Thread19(s1, s2);
	Thread29 t2=new Thread29(s1, s2);
	t1.start();
	t2.start();
	System.out.println("main over");
	}

}
