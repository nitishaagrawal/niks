package task;

import java.util.Scanner;

public class FirstLetterUppercase
{
	String new_str="";
public void changeCase(String s) {
	String[] ss=s.split("\\s");
	
	for(int i=0;i<ss.length;i++)
	{
		char first=ss[i].charAt(0);
		char first_new=Character.toUpperCase(first);
		ss[i]= first_new+ss[i].substring(1, ss[i].length());
					
    }
	
	for(String a: ss)
	{
	new_str=new_str+a+" ";
	}
	
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		FirstLetterUppercase f=new FirstLetterUppercase();
		f.changeCase(s);
System.out.println(f.new_str);

 }
}
