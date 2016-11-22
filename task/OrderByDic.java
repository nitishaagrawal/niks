package task;

import java.util.Scanner;

public class OrderByDic {
	String str="";
public void arrange(String s) {
	
	 String str1=s;
	 int k=0;
	 String[] ss=str1.split(" ");
	 
	 String temp="";
	 for(int i=0;i<ss.length-1;i++)
	 {
		
		 for(int j=0;j<ss.length-1;j++)
		 {
			
			 if(ss[j].compareToIgnoreCase(ss[j+1])>0)
			 {
				temp=ss[j];
				ss[j]=ss[j+1];
				ss[j+1]=temp;
			 }
			 if(ss[j].compareToIgnoreCase(ss[j+1])<0)
			 {
				
			 }
			 if(ss[j].compareToIgnoreCase(ss[j+1])==0)
			 {
				
			 }
		 }
	 }
	 for(String str: ss)
	 {
		 System.out.print(str+ " ");
	 }
}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		OrderByDic o=new OrderByDic();
		o.arrange(s);
		
			
		
	}

}
