/*
 * TestCase2 for Student Record Program
 * 
 * Authors @Nachiket & @Anumeha
 * 
 * External JAR File used: junit-4.10.jar
 * 
 */
package mypack;





import java.io.FileReader;

import java.util.ArrayList;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import com.opencsv.CSVReader;
public class TestJunit2 {
	
	
	
	public static String csvLocation;
	
	public static ArrayList<student> stud =new  ArrayList<student>();
	
	@BeforeClass
	public static void beforeTest() throws Exception{
		csvLocation="/home/nac/workspace/Record/data.csv";
		
		CSVReader reader = new CSVReader(new FileReader(csvLocation));
       
		String [] read;
	
		while ((read = reader.readNext()) != null) {
		
	   		student stu =new student(read[0],Integer.parseInt(read[1]),read[2],read[3],Long.parseLong(read[4]));
	   		stud.add(stu);
	   
		}
	
		reader.close();

	}
	@Test
	public void nameSearchTest(){
		PrintStream oldOut = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// Read the above code snippet from Stackoverflow
		
		Stu_rec.searchN("Misti Sorrell",stud);
		String Expectstr="Name : Misti Sorrell Contact : 8437470770 Roll : 251037 Section : S1 Date : 07/03/1997\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	@Test
	public void RollSearchTest(){
		PrintStream oldOut = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// Read the above code snippet from Stackoverflow
		
		Stu_rec.searchR(232537,stud);
		String Expectstr="Name : Vinita Clarkson Roll : 232537 Section : S2 Date : 06/10/1997\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	@Test
	public void getRangeTest(){
		PrintStream oldOut = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// Read the above code snippet from Stackoverflow
		
		Stu_rec.getRange(999588, 990043, stud);
		String Expectstr="Name : Galina Amick     Roll : 999588\nName : Kenyetta Carruth     Roll : 990043\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	@Test
	public void getClassTest(){
		PrintStream oldOut = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// Read the above code snippet from Stackoverflow
		
		Stu_rec.getClass("S4", stud);
		String Expectstr="Della Huot\nMelaine Rotter\nJacquelynn Liberto\nDorthea Slocumb\nPok Peden\nMerna Escoto\nMitzi Daubert\nEstella Crumrine\nBari Woomer\nSandie Ota\nContessa Hampshire\nOctavia Seidell\nSharen Hinz\nFidel Brunton\nGinger Moseley\nYvonne Gemmell\nElvie Kosakowski\nAngelia Perez\nAurore Heyne\nRebecca Aldinger\nMeggan Mahurin\nMozelle Winnie\nMariah Ugalde\nJovita Cratty\nBilli Villano\nAlysa Spurlin\nErnest Quesada\nHertha Banton\nLu Villareal\nKari Vecchio\nClaudie Gugino\nGertrudis Buettner\nMaurine Rosenau\nDorthey Situ\nNieves Landin\nLivia Preuss\nKatheleen Spiegel\nDelisa Bess\nHailey Talbot\nAnnabell Yokoyama\nElvis Federico\nSherryl Moffitt\nAllie Hargrove\nNelly Stoops\nMarshall Herriott\nRaquel Duck\nHenriette Umfleet\nTonita Aceuedo\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	

}