import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;
import java.io.*;

//Following test unit searchByRollTest is bundled under test suite AllTests
public class searchByRollTest{
	
	// Add a timeout of 1000 to test case.
	@Test(timeout = 1000)
	// test1: Success Test case
	public void test1() throws IOException {
		records test = new records();
		int totalStud = records.init();
		student[] record = records.readCSV(totalStud);
		assertEquals( "Name: Mariah Ugalde\nRoll Number: 571861\nClass: S4\nDOB: 19/06/1997\nContact: 7013107961\n\n", test.searchByRoll(571861,record, totalStud));
	}
	
		@Test(timeout = 1000)
		// test2: Fails Test case
		public void test2() throws IOException {
			records test = new records();
			int totalStud = records.init();
			student[] record = records.readCSV(totalStud);
			assertEquals( "Name: Mariah Ugalde\nRoll Number: 571861\nClass: S4\nDOB: 19/06/1997\nContact: 7013107961\n\n", test.searchByRoll(000000,record, totalStud));
		}

}
