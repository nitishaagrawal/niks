package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class JoiningLetter {

	public static void main(String[] args) throws IOException {
		String details[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details");
		
		System.out.println("Name of Candidate:");
		 details[0]=sc.next();
		System.out.println("Date of joining(dd-mm-yyyy):");
	
		 details[1]=sc.next();
		System.out.println("Designation:");
		 details[2]=sc.next();
		System.out.println("Current CTC");
		sc.nextLine();
		 details[3]=sc.next();
		 String filename=details[0]+"_LOJ.txt";
		 File f= new File(filename);
		 FileOutputStream fis=new FileOutputStream(f);
		 PrintStream ps=new PrintStream(fis);
		String str[]=new String[18];
		str[0]="                                Letter of Appointment                  ";
		str[1]="   ";
		str[2]="Dear " +details[0]+",";
		str[3]="  ";
		str[4]="   ";
		str[5]="We are pleased to inform you that you have been selected for the position of ";
		str[6]=details[2]+" at Sunrise Enterprises. We had many qualified ";
		str[7]="candidates,but you seemed to be the best fit for our growing organization.";
		str[8]="   ";
		str[9]="Your job appointment will begin on "+details[1]+" at 8am.You will";
	str[10]="recieve the salary of "+ details[3]+ " per annum,along with any possible bounses.";
	str[11]="You will be given one month of paid leave per year,and will have the use of";
	str[12]="company car.";
	str[13]=" ";
	str[14]="we look forward to hearing back from you to accept this position.";
	str[15]=" ";
	str[16]="Sincerely,";
	str[17]="Sunrise Enterprises ";
	
	for(int i=0;i<str.length;i++)
	{
		ps.println(str[i]);
	}
	
	
	
	
	Runtime.getRuntime().exec("notepad.exe "+f.getAbsolutePath());	
	
	
	
	
	
	
	}

}
