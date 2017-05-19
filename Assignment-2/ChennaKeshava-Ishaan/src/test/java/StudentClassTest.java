import static org.junit.Assert.*;
import java.io.*;
import java.util.*;
import org.junit.Test;

public class StudentClassTest {

	@Test
	public void test() {
		Student stu = new Student();
		int i = 0,j = 0;
		ArrayList<String[]> li = new ArrayList<String[]>();
		li = stu.searchClass("S5");
		// please specify the appropriate absolute location of the expected output file
		String expectedOpFile = "S5 - Sheet1.csv";
		String line = "";
		try(BufferedReader br = new BufferedReader( new FileReader(expectedOpFile))){
			line = br.readLine();
			while((line = br.readLine())!= null){
				String[] a = line.split(",");
				
				
				
					assertEquals("mismatch at "+i,a[0],li.get(i)[0]);
					i++;
				
				
			}
			br.close();
		}catch(Exception e) {e.printStackTrace();}
		
		// test for students of class S1
		ArrayList<String[]> p = new ArrayList<String[]>();
		p = stu.searchClass("S1");
		// please specify the appropriate absolute location of the expected output file
		expectedOpFile = "S1 - Sheet1.csv";
		
		try(BufferedReader br = new BufferedReader( new FileReader(expectedOpFile))){
			line = br.readLine();
			i = 0;
			while((line = br.readLine())!= null){
				String[] a = line.split(",");
				
				
				assertEquals("mismatch at "+i,a[0],p.get(i)[0]);
				i++;
			}
			br.close();
		}catch(Exception e) {e.printStackTrace();}
		
		//test for a class that is not present
		ArrayList<String[]> emp = new ArrayList<String[]>();
		emp = stu.searchClass("S9");
		
		assertEquals("Wrong Logic for classes that aren't present in input file",0,emp.size());
		
		
	}
}
