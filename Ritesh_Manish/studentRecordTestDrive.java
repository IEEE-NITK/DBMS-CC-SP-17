package ieee;


import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class studentRecordTestDrive 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		ArrayList<studentRecord> student = new ArrayList<studentRecord>(); 
		
		String csvFile = "F:/ieee/ieee.csv";
		String line = "";
		String csvSeparator = ",";
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
		{
			while((line = br.readLine()) != null)
			{
				studentRecord a = new studentRecord();
				String[] st = line.split(csvSeparator);
				
				a.name = st[0];
				a.rollNumber = st[1];
				a.Class = st[2];
				a.dateOfBirth = st[3];
				a.contact = st[4];
				
				student.add(a);
			}
		}
		
		int x = student.size(),n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1.Name Search \n2.Roll no search\n3.Class\n4.Range of Roll nos");
		n=sc.nextInt();
		
	switch(n)
	{
		case 1:	
		System.out.println("Enter the name to be searched");
		String nameToSearch1 = sc.next();
		String nameToSearch2 = sc.next();
		
		String nameToSearch = nameToSearch1 + " " + nameToSearch2;
		int v=0;
		for(int i=1; i<x; i++)
			student.get(i).search(student.get(i).name,nameToSearch,v);
		if(v==0)
			System.out.println("Not found");
		System.out.println("");
		break;
		case 2:	v=0;
		System.out.println("Enter the roll number to be searched");
		String numberToSearch = sc.next();
		for(int i=1; i<x; i++)
			student.get(i).search(student.get(i).rollNumber,numberToSearch,v);
		if(v==0)
			System.out.println("Not found");
		System.out.println("");
		break;
		case 3:		
		System.out.println("Enter the class");
		String classToSearch = sc.next();
		v=0;
		for(int i=1; i<x; i++)
			student.get(i).search(student.get(i).Class,classToSearch,v);if(v==0)
				System.out.println("Not found");
		
		System.out.println("");
		break;
		case 4:		
		System.out.println("Enter the range of the roll numbers");
		int lowerNumber = sc.nextInt();
		int upperNumber = sc.nextInt();
		
		for(int i=1; i<x; i++)
			student.get(i).searchNumber(lowerNumber, upperNumber);
	}
		System.exit(0);
	}
}

class studentRecord
{
	String name;
	String rollNumber;
	String Class;
	String dateOfBirth;
	String contact;
	
	
	public void search(String b, String c, int v)
	{
		if(b.equals(c))
		{
			System.out.println("The student is ");
			System.out.println("name = " + name);
			System.out.println("Roll number = " + rollNumber);
			System.out.println("Class = " + Class);
			System.out.println("DOB = " + dateOfBirth);
			System.out.println("Contact = " + contact);
			System.out.println("");
			v=1;
			
		}
	}
	
	public void searchNumber(int b, int c)
	{
		int rNumber = Integer.parseInt(rollNumber);
		if((rNumber >= b) && (rNumber <= c))
		{
			System.out.println("The student name is " + name);
			System .out.println("");
		}
	}
	
}

