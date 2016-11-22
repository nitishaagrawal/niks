package task;

import java.util.Scanner;

public class SpaceAfterToken {

	public void spaceRemove(String s) {
		String str="";
		String new_str=s.trim();
		String[] str1=new_str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			
			if(((str1[i].trim()).length())!=0)
			{
			
			str=str.concat(str1[i]);
			str=str.concat(" ");
			}
			
		}
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		
SpaceAfterToken sp=new SpaceAfterToken();
//Scanner sc=new Scanner(System.in);
// String ss=sp.spaceRemove(sc.next());

sp.spaceRemove("   honesty   is best    policy    ");


	}

}
