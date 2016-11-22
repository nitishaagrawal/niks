package task;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IndexNumberMapping {

	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		List<Integer> list=new LinkedList<Integer>();
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char arr[]=s.toCharArray();
		Integer arr1[]=new Integer[49];
		String arr2[]=new String[49];
		Integer arr3[]=new Integer[49];
		int j=0,k=0,j1=0,k1=1;
		for(int i=0;i<=48;i++)
		{
			if(i<26)
			{
			arr2[i]=Character.toString(arr[j]);
			arr1[i]=k;
			arr3[i]=k1;
			j++;
			k++;
			k1++;
			}
			else
			{
				if(j1<=22)
				{
					arr2[i]="A"+Character.toString(arr[j1]);
					arr1[i]=k;
					arr3[i]=k1;
				j1++;
				k++;
				k1++;
				}
			}
			
		}
		Collections.addAll(list, arr3);
		
		for(int m=0;m<49;m++)
		{
			map.put(arr2[m],arr1[m]);
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter index value");
		String input=sc.next();
		int len=input.length();
		String output="";
		String temp1="",temp2="",pt1="",temp="";
		Integer pt2;
		//System.out.println(len);
		if(len==2 | len==3 | len==4)
		{
			if(len==2)
			{
				 pt1=Character.toString(input.charAt(0));
				 pt2=Integer.parseInt((Character.toString(input.charAt(1))));
				 temp1=Integer.toString(map.get(pt1));
			      temp2=Integer.toString(list.indexOf(pt2));
				output="["+temp2+"]"+"["+temp1+"]";
				
			}
			if(len==3)
			{
				for(int l=0;l<3;l++)
				{
					if(Character.isLetter(input.charAt(l)))
					{
						pt1=pt1+Character.toString(input.charAt(l));
						
					}
					if(Character.isDigit(input.charAt(l)))
					{
						
						temp=temp+Character.toString(input.charAt(l));
						
					}
					
				}
				pt2=Integer.parseInt(temp);
				temp1=Integer.toString(map.get(pt1));
			    temp2=Integer.toString(list.indexOf(pt2));
				output="["+temp2+"]"+"["+temp1+"]";
		
			}
			if(len==4)
			{
				for(int l=2;l<4;l++)
				{
					temp=temp+Character.toString(input.charAt(l));
				}
				pt2=Integer.parseInt(temp);
				pt1=Character.toString(input.charAt(0))+Character.toString(input.charAt(1));
				temp1=Integer.toString(map.get(pt1));
				temp2=Integer.toString(list.indexOf(pt2));
				output="["+temp2+"]"+"["+temp1+"]";
			}
			System.out.println("index representation of string:"+output);
		}
		else
		{
			
		   System.out.println("invalid input");	
		}
	}

}
