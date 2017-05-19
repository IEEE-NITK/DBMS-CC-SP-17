import java.io.*;
import java.util.*;

public class Range {
    public static void range() throws Exception{
	String csvFile = "DBMS-CC-SP-17/Assignment-1/Chenna_Keshava-Ishaan/data.csv";
	String line = "";
	String csvSplitBy = ",";
	Scanner in = new Scanner (System.in);
	System.out.println("Enter two roll numbers");
	int a = in.nextInt();
	int b = in.nextInt();

	if(a<0||b<0)
	{
	    System.out.println("Invalid Input. Roll numbers are not negative");
	    return ;
	}

	int max,min;

	max = (a>b)?a:b;
	min = a+b-max;

	System.out.println("Students present within the given roll numbers are");
	int count = 0;
	try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){

	    line = br.readLine();
	    line = br.readLine();
	    while((line=br.readLine())!=null)
	    {
		String[] comp = line.split(csvSplitBy);

		if(comp[1].compareTo(Integer.toString(min))>=0&&comp[1].compareTo(Integer.toString(max))<=0)
		{
		    System.out.println("Name : " +comp[0]);
		    System.out.println("Roll Number : " +comp[1]);
		    System.out.println("Class : " +comp[2]);
		    System.out.println("DOB : " +comp[3]);
		    System.out.println("Contact : " +comp[4]);
		    count++;
		}

	    }
	    br.close();
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}

	if(count==0) System.out.println("No students were found within the given range of roll numbers");


    }
}
