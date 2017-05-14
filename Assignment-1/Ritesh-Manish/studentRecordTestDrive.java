package ieee;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class studentRecordTestDrive {
	String name;
	String rollNumber;
	String Class;
	String dateOfBirth;
	String contact;
	int v=0;
	private static Scanner sc;
	public static ArrayList<studentRecordTestDrive> student = null;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		student = new ArrayList<studentRecordTestDrive>();

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

		int x = student.size(), n;
		sc = new Scanner(System.in);
		System.out.println("Enter \n1.Name Search \n2.Roll no search\n3.Class\n4.Range of Roll nos");
		n = sc.nextInt();
		studentRecordTestDrive m=new studentRecordTestDrive();

		switch (n) {
		case 1:
			System.out.println("Enter the name to be searched");
			String nameToSearch1 = sc.next();
			String nameToSearch2 = sc.next();

			String nameToSearch = nameToSearch1 + " " + nameToSearch2;
			
			for (int i = 1; i < x; i++){
				m = student.get(i).search(student.get(i).name, nameToSearch);
				if (m.v == 1) {
					break;
				}
			}
			if (m.v == 0)
				System.out.println("Not found");
			else{
				System.out.println("The student is ");
				System.out.println("name = " + m.name);
				System.out.println("Roll number = " + m.rollNumber);
				System.out.println("Class = " + m.Class);
				System.out.println("DOB = " + m.dateOfBirth);
				System.out.println("Contact = " + m.contact);
			}
			System.out.println("");
			break;
		case 2:
			
			System.out.println("Enter the roll number to be searched");
			String numberToSearch = sc.next();
			for (int i = 1; i < x; i++){
				m = student.get(i).search(student.get(i).rollNumber, numberToSearch);
				if (m.v == 1) {
					break;
				}
			}
			if (m.v == 0)
				System.out.println("Not found");
			else{
				System.out.println("The student is ");
				System.out.println("name = " + m.name);
				System.out.println("Roll number = " + m.rollNumber);
				System.out.println("Class = " + m.Class);
				System.out.println("DOB = " + m.dateOfBirth);
				System.out.println("Contact = " + m.contact);
			}
			System.out.println("");
			break;
		case 3:
			System.out.println("Enter the class");
			String classToSearch = sc.next();
			
			for (int i = 1; i < x; i++){
				m = student.get(i).search(student.get(i).Class, classToSearch);
				
			}
			if (m.v == 0)
				System.out.println("Not found");
			else{
				System.out.println("The student is ");
				System.out.println("name = " + m.name);
				System.out.println("Roll number = " + m.rollNumber);
				System.out.println("Class = " + m.Class);
				System.out.println("DOB = " + m.dateOfBirth);
				System.out.println("Contact = " + m.contact);
			}

			System.out.println("");
			break;
		case 4:
			System.out.println("Enter the range of the roll numbers");
			int lowerNumber = sc.nextInt();
			int upperNumber = sc.nextInt();
			System.out.println("The students are");
			String c="\0";
			for (int i = 1; i < x; i++){
				c=student.get(i).searchNumber(lowerNumber, upperNumber);
				if(c!="\0")
			System.out.println(c+"");
			}
		}
		System.exit(0);
	}

	public studentRecordTestDrive search(String fromCSV, String fromScanner) {

		studentRecordTestDrive a= new studentRecordTestDrive();
		if (fromCSV.equals(fromScanner)) {

			/*System.out.println("The student is ");
			System.out.println("name = " + name);
			System.out.println("Roll number = " + rollNumber);
			System.out.println("Class = " + Class);
			System.out.println("DOB = " + dateOfBirth);
			System.out.println("Contact = " + contact);
			System.out.println("");
			reference = 1;*/
			
			a.name= name;
			a.rollNumber=rollNumber;
			a.Class=Class;
			a.dateOfBirth=dateOfBirth;
			a.contact=contact;
			a.v=1;

		}
		return a;
	}

	public String searchNumber(int b, int c) {
		int rNumber = Integer.parseInt(rollNumber);
		String n="\0";
		if ((rNumber >= b) && (rNumber <= c)) {
			/*System.out.println("" + name);
			System.out.println("");*/
			n=name;
		}
		return n;
	}
	
}
