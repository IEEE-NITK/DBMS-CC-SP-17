import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class searchClassTest 
{
	@Test
	public void testSearchClass()throws IOException
	{
		int n=0;
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
		System.out.println("Enter S1 as class to get true value");
		String result=student.searchClass(n, data); //Enter S1 as class
		assertEquals("Milton Huntington,905330,S1,25/04/1997,8679003638",result);	
	}

}
