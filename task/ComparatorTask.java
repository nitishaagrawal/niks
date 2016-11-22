package task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Employee1 
{
	Integer id;
	String name;
	Integer salary;
	
	 Employee1(Integer id,String name,Integer salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	 
	 public void showDetails() {
		 System.out.print("ID:"+id);
		 System.out.print("Name:"+name);
		 System.out.print("Salary"+salary);
		
	}


}
class Manager implements Comparator<Employee1>
{
	 static int choice=0;
	 static int order=0;
	public int compare(Employee1 e1,Employee1 e2) {
		if(choice==1 && order==1)
		{
			
			return(e1.id-e2.id);
		}
		if(choice==1 && order==2)
		{
			
			return(e2.id-e1.id);
		}
		if(choice==2  && order==1)
		{
			
			return((e1.name).compareTo(e2.name));
		}
		if(choice==2  && order==2)
		{
			
			return((e2.name).compareTo(e1.name));
		}
		if(choice==3 && order==1)
		{
			
			return((e1.salary)-(e2.salary));
		}
		if(choice==3 && order==2)
		{
			
			return((e2.salary)-(e1.salary));
		}
		else
		{
		 
		 return 0;
		}
		
	}

}
public class ComparatorTask {

	public static void main(String[] args) {
		Manager m=new Manager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of user");
		int no_user=sc.nextInt();
		Employee1 e[]=new Employee1[no_user];
		System.out.println("enter user details");
		for(int i=0;i<no_user;i++)
		{
			Integer id=0,sal=0;
			String name="";
			System.out.print("id:");
		   
		    	id=sc.nextInt();
			System.out.print("name:");
			
			 name=sc.next();
			
			System.out.print("salary:");
			
			sal=sc.nextInt();
			
		e[i]= new Employee1(id,name,sal);
		System.out.println();
		}
		String ch="y";
		while(ch!="n")
		{
			
		System.out.println("choose sorting criteria");
		System.out.println("1.id");
		System.out.println("2.name");
		System.out.println("3.salary");
		
		int choice1=sc.nextInt();
		if(choice1==1 | choice1==2 | choice1==3 ){m.choice=choice1;}
		else{m.choice=1;}
		System.out.println("choose sorting order");
		System.out.println("1.ascending");
		System.out.println("2.descending");
		int order1=sc.nextInt();
		if(order1==1 | order1==2){m.order=order1;}
		else{m.order=1;}
		Arrays.sort(e,m);
		for(Employee1 e1: e)
		{
			e1.showDetails();
			System.out.println();
		}
		System.out.println("type n to stop and y to continue");
		ch=sc.next();
		}
		

	}

}
