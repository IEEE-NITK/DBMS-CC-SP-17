import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;
import java.io.*;

//Following test unit studByRollTest is bundled under test suite AllTests
public class studByRollTest {

	// Add a timeout of 1000 to test case.
	@Test(timeout = 1000)
	public void test1() throws IOException {
		// test1: Success Test case
		records test = new records();
		int totalStud = records.init();
		student[] record = records.readCSV(totalStud);
		// Multiline for better readability
		assertEquals( "Name: Long Reed\nRoll Number: 462821\n\n" +
				"Name: Freda Steidl\nRoll Number: 452627\n\n" +
				"Name: Major Cacho\nRoll Number: 452492\n\n" +
				"Name: Rebecca Aldinger\nRoll Number: 451790\n\n" +
				"Name: Lori Sea\nRoll Number: 450711\n\n", test.studByRoll(450000,475000,record, totalStud));
	}
	
	@Test(timeout = 1000)
	public void test2() throws IOException {
		// test1: Fails Test case
		records test = new records();
		int totalStud = records.init();
		student[] record = records.readCSV(totalStud);
		// Multiline for better readability
		assertEquals( "Name: Long Reed\nRoll Number: 462821\n\n" +
				"Name: Freda Steidl\nRoll Number: 452627\n\n" +
				"Name: Major Cacho\nRoll Number: 452492\n\n" +
				"Name: Rebecca Aldinger\nRoll Number: 451790\n\n" +
				"Name: Lori Sea\nRoll Number: 450711\n\n", test.studByRoll(470000,475000,record, totalStud));
	}
	
	

}
