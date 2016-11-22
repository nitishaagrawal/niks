package task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Eavalution {

	String input="";
	char []ch;
	char []operator={'+','-','*','/'};
	char []sp={'(',')'};
	List<String> list= new ArrayList<String>();
	public void  compute(String str)
	{
		input=str;
		ch=str.toCharArray();
		
		String temp=input;
		System.out.println();
		//check for ()in expression
		while(temp.contains("(") & temp.contains(")") )
		{
		
		int in1=temp.indexOf(40);
		int la1=temp.indexOf(41);
		String temp1=temp.substring(in1+1, la1);
		String temp2=temp.substring(0, in1);
		String temp3=temp.substring(la1+1, temp.length());
		list.add(temp1);
		list.add(temp2);
		list.add(temp3);
		temp=temp1;
		}
		
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
		
			System.out.println(it.next());
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Eavalution e=new  Eavalution();
		//Scanner sc= new Scanner(System.in);
		String str="4*(3+7)-5";
		e.compute(str);
		//System.out.println("result of expression:"+e.compute(str));

	}

}
