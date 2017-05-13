import java.io.*;
import java.util.*;
public class student
{
	public static void main(String[] args)throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		Scanner scan=new Scanner(System.in);
		int n=0;
		int choice1, choice2;
		String filename ="data.csv";
		File file=new File(filename);
		String[] data=new String[10000000];
		try
		{
		Scanner inputStream=new Scanner(file);
		while(inputStream.hasNext())
			data[n++]=inputStream.nextLine();
		inputStream.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		do
		{
			System.out.println("STUDENT RECORDS");
			System.out.println("\nMENU");
			System.out.println("1.Seach for a student");
			System.out.println("2.Display all student details of a particular class");
			System.out.println("3.Display student names which have roll number in the given range");
			System.out.println("4.Exit Program");
			System.out.println("\nEnter your choice : ");
			choice1=scan.nextInt();
			switch(choice1)
			{
			case 1:
			{
				System.out.println("\n1.By Name\n2.By Roll Number\n");
				System.out.println("Enter your choice : ");
				choice2=scan.nextInt();
				switch(choice2)
				{
					case 1:
					{
						String a=searchName(n,data);
						break;
					}
					case 2:
					{
						String a=searchRno(n,data);
						break;
					}
					default:System.out.println("Invalid Choice");				
				}
				break;				
			}
			case 2:
			{
				String a=searchClass(n,data);
				break;
			}
			case 3:
			{
				System.out.println("Enter the lower and upper limits of roll numbers :");
				String low=in.readLine();
				String high=in.readLine();
				int a=rollnoRange(n,data,low,high);
				break;
			}
			case 4:
			{
				break;
			}
			default: System.out.println("Invalid choice ");			
			}
		}while(choice1!=4);
		scan.close();
	
	}
	
	static String searchName(int n, String data[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("Enter the name to be searched for : ");
	    String sname=in.readLine();
	    int flag=0;
	    for(int i=0;i<n;i++)
	    {
	    	String[] values=data[i].split(",");
	    	if(values[0].equalsIgnoreCase(sname))
	    	{
	    		flag=1;
	    		System.out.println("Name\t\t\tRoll no.\tClass\t\tDOB\t\t\tContact");
	    		int a=display(data[i]);
	    		return data[i];
	    	}					
	    }
	    if(flag==0)
		System.out.println(sname + " is not in the file.");	
	    in.close();
	    return null;
	}
	
	static String searchRno(int n,String data[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("Enter the roll no. to be searched for : ");
		String rno=in.readLine();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			String[] values=data[i].split(",");
			if(values[1].equalsIgnoreCase(rno))
			{
				flag=1;
				System.out.println("Name\t\t\tRoll no.\tClass\t\tDOB\t\t\tContact");
				int a=display(data[i]);
				return data[i];
			}
		}
		if(flag==0)
			System.out.println(rno + " is not in the file.");
		in.close();
		return null;
	}
	
	static String searchClass(int n,String data[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("Enter the class to be searched for : ");
		String cname=in.readLine();
		int flag=0,i;
		System.out.println("Name\t\t\tRoll no.\tClass\t\tDOB\t\t\tContact");
		for(i=0;i<n;i++)
		{
			String[] values=data[i].split(",");
			if(values[2].equalsIgnoreCase(cname))
			{
				flag=1;
				int a=display(data[i]);
			}
		}
			if(flag==0)
			{
				System.out.println(cname + " is not in the file.");
				return null;
			}
			in.close();
			return data[--i];
	}
	static int rollnoRange(int n,String data[],String low,String high)
	{	
		if(low.compareTo(high)>=0)
		{
			System.out.println("Invalid range");
			return 1;
		}
		int flag=0;
		int count=0;
		String[] names=new String[10000000];
		for(int i=0;i<n;i++)
		{
			String[] values=data[i].split(",");
			if(values[1].compareTo(low)>=0 && values[1].compareTo(high)<=0)
			{
			 flag=1;
			 names[count++]=values[0];
			}						
		}
		if(flag==1)
		{
			System.out.println("The names in the given range of roll nos. are : ");
			for(int i=0;i<count;i++)
				System.out.println(names[i]);
		}
		else
			System.out.println("No names in the given range ");
		return 0;
	}

	static int display(String s)
	{	
		int success=0;
		String[] values=s.split(",");
		success=values.length;
		for(int i=0;i<values.length;i++)
		{
			System.out.print(values[i] + "\t\t");
		}
		System.out.print("\n");
		return success;
	}
}

