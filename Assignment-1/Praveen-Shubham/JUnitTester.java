package StudentRecorder;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

public class JUnitTester {
	@BeforeClass
	public static void ReadTheCsv(){
		ReadCsv.Read();
	}

	@Test(timeout = 100) // Test for time of execution
	public void SearchByNameIgnore() {
		
		String expectedValue = new String();
		expectedValue = "The Student is ....." + '\n' + "Name..." + "Willodean Tobar" + '\n' + "Roll Number..."+ "583430" + '\n' + "Class..." + "S1" + '\n' + "DOB..." + "27/05/1996" + '\n' + "Contact..."	+ "9444358575";

		String actualValue = new String();
		actualValue = Searcher.SearchByName("Willodean Tobar");
		assertEquals(expectedValue, actualValue);// Test when Name is present in the record.

		expectedValue = "Sorry no such Name found... Try again";
		actualValue = Searcher.SearchByName("Praveen Raj");
		assertEquals(expectedValue, actualValue);// Test when Name is not present in the record.

	}

	@Test(timeout = 100)
	public void SearchByRollIgnore() {
		
		String expectedValue2 = new String();
		String actualValue2 = new String();
		expectedValue2 = "The Student is ....." + '\n' + "Name..." + "Tequila Driskell" + '\n' + "Roll Number..."+ "430185" + '\n' + "Class..." + "S1" + '\n' + "DOB..." + "13/06/1996" + '\n' + "Contact..."+ "1312659711";

		actualValue2 = Searcher.SearchByRoll("430185");
		assertEquals(expectedValue2, actualValue2);// Test when the Roll No is present in the record

		expectedValue2 = "Sorry no such Roll No found... Try again";
		actualValue2 = Searcher.SearchByRoll("1234");

		assertEquals(expectedValue2, actualValue2);// Test when the Roll No is not present in the record

	}

	@Test(expected = NullPointerException.class)
	public void SearchByRangeIgnore1() {
		String expectedValue3 = new String();
		String actualValue3 = new String();

		expectedValue3 = "Sorry no such Roll No found... Try again";
		actualValue3 = Searcher.SearchByRange("43018", "583430");
		assertEquals(expectedValue3, actualValue3);// Test when one or both the Roll No are not present in the record.
	}

	@Test(timeout = 100)
	public void SearchByRangeIgnore2() {
		
		String expectedValue3 = new String();
		String actualValue3 = new String();
		expectedValue3 = "Please input Roll No in correct order";
		actualValue3 = Searcher.SearchByRange("583430", "430185");
		assertEquals(expectedValue3, actualValue3);// Test when the Roll No are inputed in reverse order

	}

	@Test(timeout = 100)
	public void SearchByClass() {
		
		String expectedValue4 = new String();
		String actualValue4 = new String();
		expectedValue4 = "Sorry no such Class found... Try again";
		actualValue4 = Searcher.SearchByClass("S22");
		assertEquals(expectedValue4, actualValue4);// Tesst when The Class doesn't exist.

	}

	@Test(timeout = 100)
	public void SorterIgnore() {
		// Test for correct sorting of the Roll No in the record within the expected time.
		SortRoll.toSort = new String[12];
		String[] ToBeSorted = { "16CO115", "16CH007", "16CV104", "16EC110", "16IT249", "16EC109", "16CO251", "16CH026","16EE119", "16CO212", "16EE121", "16CV139" };
		String expectedValue5[] = { "16CH007", "16CH026", "16CO115", "16CO212", "16CO251", "16CV104", "16CV139","16EC109", "16EC110", "16EE119", "16EE121", "16IT249" };
		for (int i = 0; i < 12; i++) {
			SortRoll.toSort[i] = ToBeSorted[i];
		}
		SortRoll.Sorter();
		for (int i = 0; i < 12; i++) {
			assertEquals(expectedValue5[i], SortRoll.toSort[i]);
		}

	}

}
