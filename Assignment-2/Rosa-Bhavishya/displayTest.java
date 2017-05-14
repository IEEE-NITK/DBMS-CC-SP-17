import static org.junit.Assert.*;

import org.junit.Test;

public class displayTest {

	@Test
	public void test()
	{
	 int a = student.display("Thomas Clark,122334,S1,03/10/1996,9900054179");
	 assertEquals(5,a); 
	}

}
