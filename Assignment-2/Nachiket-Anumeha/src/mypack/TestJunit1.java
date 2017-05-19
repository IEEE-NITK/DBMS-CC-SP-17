/*
 * TestCase1 for Student Record Program
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
public class TestJunit1 {
	
	
	
	public static String csvLocation;
	
	public static ArrayList<student> stud =new  ArrayList<student>();
	
	@BeforeClass
	public static void beforeTest() throws Exception{
		csvLocation="data.csv";
		
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
		
		Stu_rec.searchN("Jules Ostler",stud);
		String Expectstr="Name : Jules Ostler Contact : 2428174465 Roll : 435077 Section : S1 Date : 07/05/1996\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	@Test
	public void RollSearchTest(){
		PrintStream oldOut = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// Read the above code snippet from Stackoverflow
		
		Stu_rec.searchR(435077,stud);
		String Expectstr="Name : Jules Ostler Roll : 435077 Section : S1 Date : 07/05/1996\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	@Test
	public void getRangeTest(){
		PrintStream oldOut = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// Read the above code snippet from Stackoverflow
		
		Stu_rec.getRange(640000, 630000, stud);
		String Expectstr="Name : Gloria Fabry     Roll : 636484\nName : Kristy Eisner     Roll : 638171\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	@Test
	public void getClassTest(){
		PrintStream oldOut = System.out;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		// Read the above code snippet from Stackoverflow
		
		Stu_rec.getClass("S2", stud);
		String Expectstr="Shayna Bibbs\nAudry Feldmann\nDanny Bohlen\nYing Bakke\nNatasha Westlake\nJoi Kilroy\nShin Crouch\nDino Deardorff\nAngle Burtenshaw\nPamela Ohl\nLorenza Isaman\nMadalene Portis\nKirsten Huwe\nLong Reed\nEssie Malin\nShelba Becerra\nJeanice Dirksen\nKristopher Paik\nShannan Weigle\nFelix Magallon\nFreda Steidl\nOliva Alas\nNeida Neeld\nMargorie Fuentez\nEd Gail\nBrianne Gassner\nBlake Whang\nSudie Tompkins\nDionne Seawell\nEvon Gang\nNubia Crumrine\nRachal Carbin\nVinita Clarkson\nGertrud Roderick\nSylvester Boros\nCathi Garst\n";
			 
		assertEquals(Expectstr,outContent.toString());
		System.setOut(oldOut);
		
	}
	

}
