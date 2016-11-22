package task;

import java.util.Arrays;
import java.util.Scanner;
class Employee implements Comparable<Employee>
{
	Integer id;
	String name;
	Integer salary;
	 static int choice=0;
	 static int order=0;
	 Employee(Integer id,String name,Integer salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	 public int compareTo(Employee e) {
		if(choice==1 && order==1)
		{
			
			return(this.id-e.id);
		}
		if(choice==1 && order==2)
		{
			
			return(e.id-this.id);
		}
		if(choice==2  && order==1)
		{
			
			return((this.name).compareTo(e.name));
		}
		if(choice==2  && order==2)
		{
			
			return((e.name).compareTo(this.name));
		}
		if(choice==3 && order==1)
		{
			
			return((this.salary)-(e.salary));
		}
		if(choice==3 && order==2)
		{
			
			return((e.salary)-(this.salary));
		}
		else
		{
		 
		 return 0;
		}
		
	}
	 public void showDetails() {
		 System.out.print("ID:"+id);
		 System.out.print("Name:"+name);
		 System.out.print("Salary"+salary);
		
	}


}
public class ComparableTask {

	public static void main(String[] args)
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the no of user");
				int no_user=sc.nextInt();
				Employee e[]=new Employee[no_user];
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
					
				e[i]= new Employee(id,name,sal);
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
				if(choice1==1 | choice1==2 | choice1==3 ){Employee.choice=choice1;}
				else{Employee.choice=1;}
				System.out.println("choose sorting order");
				System.out.println("1.ascending");
				System.out.println("2.descending");
				int order1=sc.nextInt();
				if(order1==1 | order1==2){Employee.order=order1;}
				else{Employee.order=1;}
				Arrays.sort(e);
				for(Employee e1: e)
				{
					e1.showDetails();
					System.out.println();
				}
				System.out.println("type n to stop and y to continue");
				ch=sc.next();
				
				}
				
				
				
				
				
	}

}
