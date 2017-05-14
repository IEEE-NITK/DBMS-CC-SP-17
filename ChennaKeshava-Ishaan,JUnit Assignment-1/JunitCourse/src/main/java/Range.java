import java.io.*;
import java.util.*;

public class Range {
    public ArrayList<String[]> range(int a,int b) throws Exception{
	String csvFile = "C:\\Users\\ChennaKeshava\\Desktop\\eclipse\\JunitCourse\\src\\main\\java\\data.csv";
	String line = "";
	String csvSplitBy = ",";
	
	
	if(a<0||b<0)
	{
	    System.out.println("Invalid Input. Roll numbers are not negative");
	    return null ;
	}
	
	int max,min;

	max = (a>b)?a:b;
	min = a+b-max;

	System.out.println("Students present within the given roll numbers are");
	
	ArrayList<String[]> one = new ArrayList<String[]>();
	try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
		
	    int f = 0;
	    line = br.readLine();
	    
	    while((line=br.readLine())!=null)
	    {
		String[] comp = line.split(csvSplitBy);
		f = Integer.valueOf(comp[1]);
		
		if(f>=min && f<=max)
		{
		    System.out.println("Name : " +comp[0]);
		    System.out.println("Roll Number : " +comp[1]);
		    System.out.println("Class : " +comp[2]);
		    System.out.println("DOB : " +comp[3]);
		    System.out.println("Contact : " +comp[4]);  
		    one.add(comp);
		}
	    }
	    br.close();
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}

	if(one.size() == 0) System.out.println("No students were found within the given range of roll numbers");
	
	return one;
	

    }
}
