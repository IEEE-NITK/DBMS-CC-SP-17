import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;
import java.io.*;

//Following test unit searchByNameTest is bundled under test suite AllTests
public class searchByNameTest {

	// Add a timeout of 1000 to test case.
		@Test(timeout = 1000)
		// test1: Success Test case
		public void test1() throws IOException { 
			records test = new records();
			int totalStud = records.init();
			student[] record = records.readCSV(totalStud);
			assertEquals( "Name: Ahmed Frost\nRoll Number: 103194\nClass: S1\nDOB: 12/10/1997\nContact: 5591880115\n\n", test.searchByName("Ahmed Frost",record, totalStud));
		}
	
		@Test(timeout = 1000)
		// test2: Fails Test case
		public void test2() throws IOException {
			records test = new records();
			int totalStud = records.init();
			student[] record = records.readCSV(totalStud);
			assertEquals( "Name: Pol Peden\nRoll Number: 950786\nClass: S4\nDOB: 06/06/1996\nContact: 1318742667\n\n", test.searchByName("Hello There",record, totalStud));
		}
	
	

}
