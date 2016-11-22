package task;

import java.awt.Font;
import java.awt.im.InputContext;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JLabel;

import MultiThreading.SuspendResume;

public class FileOperation {
	
	 File f;
	 File tempf;
	 FileOutputStream fos;
	 PrintStream ps;
	 FileInputStream fis;
	 public FileOperation() throws FileNotFoundException {
		
		 
	}

public boolean replaceContent(String str1,String str2)
{
	String oldfilename="content.txt";
	String tempfilename="temp_content.txt";
	BufferedInputStream bis=null;
	BufferedOutputStream bos=null;
	boolean flag=false;
	try
	{
		f=new File(oldfilename);
		tempf=new File(tempfilename);
		fis=new FileInputStream(f);
		fos=new FileOutputStream(tempf);
		bis=new BufferedInputStream(fis);
		bos=new BufferedOutputStream(fos);
		byte arr[]=new byte[fis.available()];
		byte arr1[]=new byte[fis.available()];
		int i=0;
		fis.read(arr);
		
			String  d=new String(arr);
			if(d.contains(str1))
			{
				d=d.replace(str1, str2);
				
				arr1=d.getBytes();
				fos.write(arr1);
				
			flag=true;
			}
			else{
				flag=false;
			}
		
		
	} 
	catch ( IOException e) {
		
		e.printStackTrace();
	}
	if(flag){System.out.println("done");f.delete(); tempf.renameTo(f);}
	
	return flag;
	

}
public boolean deleteContent(String str)
{
	String oldfilename="content.txt";
String tempfilename="temp_content.txt";
BufferedInputStream bis=null;
BufferedOutputStream bos=null;
boolean flag=false;
try
{
	f=new File(oldfilename);
	tempf=new File(tempfilename);
	fis=new FileInputStream(f);
	fos=new FileOutputStream(tempf);
	bis=new BufferedInputStream(fis);
	bos=new BufferedOutputStream(fos);
	byte arr[]=new byte[fis.available()];
	byte arr1[]=new byte[fis.available()];
	int i=0;
	fis.read(arr);
	
		String  d=new String(arr);
		if(d.contains(str))
		{
			d=d.replace(d," ");
			arr1=d.getBytes();
			fos.write(arr1);
			
		flag=true;
		}
		else{
			flag=false;
		}
	
	
} 
catch ( IOException e) {
	
	e.printStackTrace();
}
if(flag){f.delete(); tempf.renameTo(f);}

return flag;

}
public boolean boldContent(String str)
{
	String oldfilename="content.txt";
	String tempfilename="temp_content.txt";
	BufferedInputStream bis=null;
	BufferedOutputStream bos=null;
	boolean flag=false;
	try
	{
		f=new File(oldfilename);
		tempf=new File(tempfilename);
		fis=new FileInputStream(f);
		fos=new FileOutputStream(tempf);
		bis=new BufferedInputStream(fis);
		bos=new BufferedOutputStream(fos);
		byte arr[]=new byte[fis.available()];
		byte arr1[]=new byte[fis.available()];
		int i=0;
		fis.read(arr);
		
			String  d=new String(arr);
			if(d.contains(str))
			{
				JLabel j=new JLabel(d);
				j.setFont(new Font("Arial",Font.BOLD,15));
				
				String temp1=j.getText();
				d=d.replace(d, temp1);
				arr1=d.getBytes();
				fos.write(arr1);
				
			flag=true;
			}
			else{
				flag=false;
			}
		
		
	} 
	catch ( IOException e) {
		
		e.printStackTrace();
	}
	if(flag){System.out.println("done");f.delete(); tempf.renameTo(f);}
	
	return flag;
	
	
}
public boolean writeInFile(String str)
{
	
	 try {
		 f = new File("content.txt");
		fos = new FileOutputStream(f);
		ps=new PrintStream(fos);
		
		
		ps.print(str);
	  }
	 catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	return  true;
}
	public static void main(String[] args) throws IOException {
	FileOperation fo= new FileOperation();
	
    Scanner sc=new Scanner(System.in);
  
    System.out.println("enter data");
 String str=sc.nextLine();
  System.out.println(str);
    boolean status= fo.writeInFile(str);
	if(status){System.out.println("Succesfully data insert into file");}
	else{System.out.println("error");}
	
	String ch=" ";
	
	
	
	System.out.println("Choose operation youwant to perform on file");
	System.out.println("1.replace content");
	System.out.println("2.delete content");
	System.out.println("3.change the content font to Bold");

	int i=sc.nextInt();
	do
	{
	switch(i)
	{
		case 1:System.out.println("enter the content you want to replace");
	           String st1=sc.next();
	           System.out.println("enter the new content replace with");
	           String st2=sc.next();
			   boolean flag=fo.replaceContent(st1,st2);
			   if(flag){System.out.println("content successfully replaced");}
			   else{System.out.println("content you want to replace is not found ");}
			   break;
		
		
		case 2:System.out.println("enter the content you want to delete");
			   String st3=sc.next();
			   boolean flag1=fo.deleteContent(st3);
			   if(flag1){System.out.println("content successfully deleted");}
			   else{System.out.println("content you want to delete is not found ");}
			   break;
			   
		case 3: System.out.println("enter the new content replace with");
	    		String st4=sc.next();
			    boolean flag2=fo.boldContent(st4);
			    if(flag2){System.out.println("content successfully changed");}
				else{System.out.println("content is not found ");}
				break;
	}
	}
	while(ch.equals("y"));
	
	}
	

}
