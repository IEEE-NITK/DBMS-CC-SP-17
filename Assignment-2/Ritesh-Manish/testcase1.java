package ieee;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class testcase1 {
	

	@Test
	public void test() throws FileNotFoundException, IOException {
		
		ArrayList<studentRecordTestDrive> student = new ArrayList<studentRecordTestDrive>();

		String csvFile = "data.csv";
		String line = "";
		String csvSeparator = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				studentRecordTestDrive a = new studentRecordTestDrive();
				String[] st = line.split(csvSeparator);

				a.name = st[0];
				a.rollNumber = st[1];
				a.Class = st[2];
				a.dateOfBirth = st[3];
				a.contact = st[4];
				student.add(a);
			}
		}
		
		studentRecordTestDrive a=new studentRecordTestDrive();
		 a = student.get(5).search(student.get(5).name, "Blossom Shill");
		assertEquals(788119,Integer.parseInt(a.rollNumber));
		
	}

}
