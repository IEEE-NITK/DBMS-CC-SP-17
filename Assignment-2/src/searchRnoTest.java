import static org.junit.Assert.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class searchRnoTest {

	@Test
	public void testSearchRno()throws IOException
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
	System.out.println("Enter 322131 as roll no. to get true");
	String result=student.searchRno(n, data); //Enter 322131 as roll no.
	assertEquals("Belkis Mart,322131,S1,07/09/1996,3065432661",result);	
	}
}
