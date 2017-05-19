//Driver class for all the tests.
public class DriverTest {
	
	public static void main(String[] args) throws Exception{
	
		StudentTest stu = new StudentTest();
		// JUnit tests for searching by name and roll number.
		stu.testSearchString();
		StudentClassTest s = new StudentClassTest();
		s.test();
		
		StudentRollRangeTest p = new StudentRollRangeTest();
		p.test();
	}
	
	
	
	

}
