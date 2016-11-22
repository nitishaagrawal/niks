package task;

import java.util.Scanner;

class ArrayDemo
{
	 Integer i=0;

	ArrayDemo(int i)
	{
		this.i=i;
		
		//System.out.println(i);
	}
	public String toString() {
		String str=this.i.toString();
		return str ;
		
	}
	
}
class ArrayGen<T>
{
	T t[];
	  Integer capacity=10;
	 Integer index=0;
	ArrayGen()
	{
		
		this.t=(T[])new Object[10];
	}
	public void add(T obj)
	{
		if(index<=capacity-1)
		{
			
			t[index]=obj;
			//System.out.println("index"+index+"value:"+t[index]);
			index=index+1;
			
		}
		else
		if(index==capacity)
		{
			
			
				int  new_size=capacity+((capacity*5)/10);
				
				 T t1[]=(T[])new Object[new_size];
				
				for(int j=0;j<t.length;j++)
				{
					
					t1[j]=t[j];
				
				}
				
				
				capacity=new_size;
				t=t1;
				
				t[index]=obj;
				//System.out.println("index"+index+"value:"+t[index]);
				index=index+1;
			
			
			
		}
	}
	
	public void show() {
		for(int h=0;h<t.length;h++)
		{
		if(t[h]!=null)	
		System.out.println(t[h].toString());
		
		}
		System.out.println("current size:" +capacity);
	}
	
}
public class GenericsTask {

	public static void main(String[] args) {
		int n=0,n1=0;
	ArrayGen <ArrayDemo> ag=new ArrayGen<ArrayDemo>();
	ArrayGen <String> ag1=new ArrayGen<String>();
	Scanner sc=new Scanner(System.in);
	String ch="y";
	while(ch!="n")
	{
	System.out.println("no. of elements you want to add ");
	int no=sc.nextInt();
	for(int x=0;x<no;x++)
	{
		n=n+1;
	n1=n1+1;
	String str="abc"+n1;
		ag.add(new ArrayDemo(n));
		ag1.add(new String(str));
	}
	
	System.out.println("contents in array");
	ag.show();
    ag1.show();
	System.out.println("type n to stop and y to continue");
	ch=sc.next();

	}
	}

}
