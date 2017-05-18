import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;
import java.io.*;

// Following test unit studByClassTest is bundled under test suite AllTests
public class studByClassTest{

	// Add a timeout of 1000 to test case.
	@Test(timeout = 1000)
	public void test1() throws IOException {
		// test1: Success Test case
		records test = new records();
		int totalStud = records.init();
		student[] record = records.readCSV(totalStud);
		// Multiline for better readability
		assertEquals( "Name: Vincenzo Viger\nRoll Number: 521380\n\n" +
				"Name: Tabatha Salzano\nRoll Number: 892625\n\n" +
				"Name: Lori Sea\nRoll Number: 450711\n\n" +
				"Name: Ninfa Feliciano\nRoll Number: 800192\n\n" +
				"Name: Ma Defilippo\nRoll Number: 314901\n\n" +
				"Name: Laurel Heiser\nRoll Number: 788271\n\n" +
				"Name: Denisse Partain\nRoll Number: 547276\n\n" +
				"Name: Mistie Koenig\nRoll Number: 522254\n\n" +
				"Name: Arletta Schapiro\nRoll Number: 917790\n\n" +
				"Name: Olene Townley\nRoll Number: 371904\n\n" +
				"Name: Harlan Hullinger\nRoll Number: 141326\n\n" +
				"Name: Cyndy Eisenbarth\nRoll Number: 401053\n\n" +
				"Name: Lavonna Dominick\nRoll Number: 360221\n\n" +
				"Name: Murray Reels\nRoll Number: 282365\n\n" +
				"Name: Basilia Doughty\nRoll Number: 288347\n\n" +
				"Name: Lavonne Brayton\nRoll Number: 892821\n\n" +
				"Name: Joanne Laiche\nRoll Number: 153465\n\n" +
				"Name: Romeo Didier\nRoll Number: 855841\n\n" +
				"Name: Tenesha Mitchel\nRoll Number: 234563\n\n" +
				"Name: Hien Selander\nRoll Number: 578181\n\n" +
				"Name: Kristy Eisner\nRoll Number: 638171\n\n" +
				"Name: Andria Wynter\nRoll Number: 180439\n\n" +
				"Name: Tomeka Morais\nRoll Number: 370291\n\n" +
				"Name: Rina Serafini\nRoll Number: 849567\n\n" +
				"Name: Prudence Fuhrman\nRoll Number: 540261\n\n" +
				"Name: Sally Ivory\nRoll Number: 366753\n\n" +
				"Name: Marchelle Prim\nRoll Number: 904855\n\n" +
				"Name: Kenyetta Carruth\nRoll Number: 990043\n\n" +
				"Name: Rayford Treadway\nRoll Number: 616711\n\n" +
				"Name: Olen Bassi\nRoll Number: 291797\n\n" +
				"Name: Marisela Mathes\nRoll Number: 234521\n\n", test.studByClass("S5",record, totalStud));
	}
	
		@Test(timeout = 1000)
		public void test2() throws IOException {
			// test2: Failure Test case
			records test = new records();
			int totalStud = records.init();
			student[] record = records.readCSV(totalStud);
			// Multiline for better readability
			assertEquals( "Name: Vincenzo Viger\nRoll Number: 521380\n\n" +
					"Name: Tabatha Salzano\nRoll Number: 892625\n\n" +
					"Name: Lori Sea\nRoll Number: 450711\n\n" +
					"Name: Ninfa Feliciano\nRoll Number: 800192\n\n" +
					"Name: Ma Defilippo\nRoll Number: 314901\n\n" +
					"Name: Laurel Heiser\nRoll Number: 788271\n\n" +
					"Name: Denisse Partain\nRoll Number: 547276\n\n" +
					"Name: Mistie Koenig\nRoll Number: 522254\n\n" +
					"Name: Arletta Schapiro\nRoll Number: 917790\n\n" +
					"Name: Olene Townley\nRoll Number: 371904\n\n" +
					"Name: Harlan Hullinger\nRoll Number: 141326\n\n" +
					"Name: Cyndy Eisenbarth\nRoll Number: 401053\n\n" +
					"Name: Lavonna Dominick\nRoll Number: 360221\n\n" +
					"Name: Murray Reels\nRoll Number: 282365\n\n" +
					"Name: Basilia Doughty\nRoll Number: 288347\n\n" +
					"Name: Lavonne Brayton\nRoll Number: 892821\n\n" +
					"Name: Joanne Laiche\nRoll Number: 153465\n\n" +
					"Name: Romeo Didier\nRoll Number: 855841\n\n" +
					"Name: Tenesha Mitchel\nRoll Number: 234563\n\n" +
					"Name: Hien Selander\nRoll Number: 578181\n\n" +
					"Name: Kristy Eisner\nRoll Number: 638171\n\n" +
					"Name: Andria Wynter\nRoll Number: 180439\n\n" +
					"Name: Tomeka Morais\nRoll Number: 370291\n\n" +
					"Name: Rina Serafini\nRoll Number: 849567\n\n" +
					"Name: Prudence Fuhrman\nRoll Number: 540261\n\n" +
					"Name: Sally Ivory\nRoll Number: 366753\n\n" +
					"Name: Marchelle Prim\nRoll Number: 904855\n\n" +
					"Name: Kenyetta Carruth\nRoll Number: 990043\n\n" +
					"Name: Rayford Treadway\nRoll Number: 616711\n\n" +
					"Name: Olen Bassi\nRoll Number: 291797\n\n" +
					"Name: Marisela Mathes\nRoll Number: 234521\n\n", test.studByClass("S1",record, totalStud));
		}
	
	

}
