/*This assignment has been completed By Rosa Anil George and Bhavishya Viswanath. In this assignment, Rosa has written the code for
 * both cases to search for a student as well as to get all students of a given class. Bhavishya has coded the last case to get all student
 * names in a given range. */ 

import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class student{

   
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int ch,c=0,flag=0;
		DataInputStream in = new DataInputStream(System.in);
		do
		{
			
			System.out.println("1.Search for a Student");
			System.out.println("2.Get All Students of a given Class");
			System.out.println("3.Get All Student Names which have Roll Number in given range");
			System.out.println("4.Exit Program");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("1.By Name");
			System.out.println("2.By Roll Number");
			c = sc.nextInt();
			flag=0;
			switch(c)
			{
			case 1: System.out.println("Enter the name to be searched for");
			String sname = in.readLine();
			
			String fileName = "data.csv";
			File file = new File(fileName);
			
			try
			{
				Scanner inputStream = new Scanner(file);
				while(inputStream.hasNext())
				{
					String data = inputStream.nextLine();
					String[] values = data.split(",");
					if(values[0].equalsIgnoreCase(sname))
					{
						flag=1;
						display(data);
					}					
					
					
				}
				inputStream.close();
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			if(flag==0)
				System.out.println(sname + " not in the file.");
			break;
			case 2: System.out.println("Enter the roll number to be searched for");
			Long rn = sc.nextLong();
			flag = 0;
			int cv=0;
			String fileName2 = "data.csv";
			File file2 = new File(fileName2);
			try
			{
				Scanner inputStream = new Scanner(file2);
				while(inputStream.hasNext())
				{
					++cv;
					String data = inputStream.nextLine();
					if(cv==1)
						continue;
					String[] values = data.split(",");
					long temp = Long.parseLong(values[1]);
					if(rn==temp)
					{
						flag=1;
						display(data);
					}								
				}
				inputStream.close();
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			if(flag==0)
				System.out.println(rn + " is not in the file.");
			       
		   }
			break;
			case 2: System.out.println("Enter the class to be searched for");
			String cname = sc.next();
			flag = 0;
			String fileName = "data.csv";
			File file = new File(fileName);
			String[] nam = new String[10000000];
			int count=0;
			try
			{
				Scanner inputStream = new Scanner(file);
				while(inputStream.hasNext())
				{
					String data = inputStream.nextLine();
					String[] values = data.split(",");
					
					if(values[2].equalsIgnoreCase(cname))
					{
						flag=1;
						nam[count++] = values[0];
					}										
					
				}
				inputStream.close();
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			if(flag==1)
			{
				System.out.println("The name(s) in " + cname + " are: ");
			for(int i =0;i<count;i++)
				System.out.println(nam[i]);
			}
			else
				System.out.println(cname + " is not in the file.");
			break;
			case 3: System.out.println("Enter the lower and upper limits of the roll number");
			long low = sc.nextLong();
			long high = sc.nextLong();
			flag = 0;
			String fileName3 = "data.csv";
			File file3 = new File(fileName3);
			String[] nam2 = new String[10000000];
			int coun=0,cv=0;
			try
			{
				Scanner inputStream = new Scanner(file3);
				while(inputStream.hasNext())
				{
					++cv;
					String data = inputStream.nextLine();
					if(cv==1)
						continue;
					String[] values = data.split(",");
					long temp = Long.parseLong(values[1]);
					if(temp>low&&temp<high)
					{
						flag=1;
						nam2[coun++] = values[0];
					}										
					
				}
				inputStream.close();
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			if(flag==1)
			{
				System.out.println("The names in the roll number range are: ");
			for(int i =0;i<coun;i++)
				System.out.println(nam2[i]);
			}
			else
				System.out.println("No names in the given range.");
			break;
			}
			
			}while(ch!=4);
	}
	
	static void display(String s)
	{
		System.out.println("Name\t\t\tRoll Number\tClass\t\tDOB\t\tContact");
		String[] values = s.split(",");
		for(int i =0;i<values.length;i++)
			System.out.print(values[i] + "\t\t");
		System.out.println("\n");
	}
}
