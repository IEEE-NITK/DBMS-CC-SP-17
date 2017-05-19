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
		String expectedOpFile = "C:\\Users\\ChennaKeshava\\Desktop\\eclipse\\JunitCourse\\S5.csv";
		String line = "";
		try(BufferedReader br = new BufferedReader( new FileReader(expectedOpFile))){
			line = br.readLine();
			
			while((line = br.readLine())!= null){
				String[] a = line.split(",");
				
				for(i = 0;i< 5;i++){
					assertEquals("mismatch at "+i + j,a[i],li.get(j)[i]);
				}
				i++;
			}
			br.close();
		}catch(Exception e) {e.printStackTrace();}
		
		// test for students of class S1
		
		li = stu.searchClass("S1");
		// please specify the appropriate absolute location of the expected output file
		expectedOpFile = "C:\\Users\\ChennaKeshava\\Desktop\\eclipse\\JunitCourse\\S1.csv";
		
		try(BufferedReader br = new BufferedReader( new FileReader(expectedOpFile))){
			line = br.readLine();
			
			while((line = br.readLine())!= null){
				String[] a = line.split(",");
				
				for(i = 0;i < 5;i++){
					assertEquals("mismatch at "+i + j,a[i],li.get(j)[i]);
				}
				i++;
			}
			br.close();
		}catch(Exception e) {e.printStackTrace();}
		
		//test for a class that is not present
		
		li = stu.searchClass("S9");
		
		assertEquals("Wrong Logic for classes that aren't present in input file",0,li.size());
		
		
	}
}
