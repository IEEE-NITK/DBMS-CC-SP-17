import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class StudentRollRangeTest {

	@Test
	public void test() {
		Range stu = new Range();
		ArrayList<String[]> one = new ArrayList<String[]>();
		
		try{
			one = stu.range(435077,622173);
		}
		catch(Exception e) {e.printStackTrace();}
		
		ArrayList<String[]> expec = new ArrayList<String[]>();
		// this link contains records of students with roll numbers between 430185 and 622173.
		String expectedOp = "C:\\Users\\ChennaKeshava\\Desktop\\eclipse\\JunitCourse\\rollRangeInput-1 - Sheet1.csv";
		String line = "";
		try(BufferedReader br = new BufferedReader(new FileReader(expectedOp))){
			line = br.readLine();
			
			while((line = br.readLine())!=null) {
				String[] comp = line.split(",");
				expec.add(comp);	
			}
			br.close();
		}
		catch(Exception e) {e.printStackTrace();}
		
	
		
		//checking only the names of the students, because for a given name, the remaining parts of the record remain the same.
		int i = 0,j = 0;
		for(i=0;i<one.size();i++){
			
			assertEquals("mismatch at record "+ j,expec.get(i)[j],one.get(i)[j]);
			
		
		}
		expec.clear();
		
		// test-2 for searching by roll numbers.
		
		expectedOp = "C:\\Users\\ChennaKeshava\\Desktop\\eclipse\\JunitCourse\\rollRangeInput-2 - Sheet1.csv";
		
		try{
			one = stu.range(322131,894729);
		}
		catch(Exception e) {e.printStackTrace();}
		
		try(BufferedReader br = new BufferedReader(new FileReader(expectedOp))){
			line = br.readLine();
			
			while((line = br.readLine())!=null) {
				String[] comp = line.split(",");
				expec.add(comp);	
			}
			br.close();
		}
		catch(Exception e) {e.printStackTrace();}
		
		
		j = 0;
		for(i=0;i<one.size();i++){
			assertEquals("mismatch at record "+ j,expec.get(i)[j],one.get(i)[j]);		
		}
	}
}
