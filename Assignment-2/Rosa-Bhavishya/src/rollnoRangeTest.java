import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class rollnoRangeTest {

	@Test
	public void test()
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
       	int ans=student.rollnoRange(n,data,"430185","435077");
       	assertEquals(0,ans);
       	if (ans==0)
       	 	System.out.println("Upper Limit is greater than Lower Limit");
       	else
       		System.out.println("Upper Limit is lower than Lower Limit");
	}

}
