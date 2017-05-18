// test class ie. StudentTest.java

import static org.junit.Assert.*;
import org.junit.Test;



public class StudentTest{

    
	@Test
    public void testSearchString(){

	Student stu = new Student();
	//test-1 for searching by name
	String[] actual = stu.searchString("Veda Shack", -1);
	assertEquals("lengths of the two arrays are the not same",new String[] {"Veda Shack","515584","S1","20/03/1997","1680075154"}.length,actual.length);
	
	int i = 0;
	for(i=0;i<5;i++)
	{
		assertEquals("mismatch at" + i,new String[] {"Veda Shack","515584","S1","20/03/1997","1680075154"}[i],actual[i]);
	}
	
	// test-2 for searching by name
	actual = stu.searchString("Della Huot", -1);
	assertEquals("lengths of the two arrays are the not same",new String[] {"Della Huot","918901","S4","19/07/1997","8091273193"}.length,actual.length);
	
	
	for(i=0;i<5;i++)
	{
		assertEquals("mismatch at" + i,new String[]  {"Della Huot","918901","S4","19/07/1997","8091273193"}.length,actual.length);
	}
	
	
	//testing the roll number searching function.
	
	String[] actualRoll = stu.searchString("",435077);
	assertEquals("lengths of the two arrays are the not same",new String[] {"Jules Ostler","435077","S1","07/05/1996","2428174465"}.length,actualRoll.length);
	
	for(i=0;i<5;i++)
	{
		assertEquals("mismatch at" + i,new String[] {"Jules Ostler","435077","S1","07/05/1996","2428174465"}[i],actualRoll[i]);
	}
	
	// test-2 for searching by roll numbers.
	
	actualRoll = stu.searchString("",849567);
	assertEquals("lengths of the two arrays are the not same",new String[] {"Rina Serafini","849567","S5","08/09/1997","6009284754"}.length,actualRoll.length);
	
	for(i=0;i<5;i++)
	{
		assertEquals("mismatch at" + i,new String[] {"Rina Serafini","849567","S5","08/09/1997","6009284754"}[i],actualRoll[i]);
	}
	
	
    }



}