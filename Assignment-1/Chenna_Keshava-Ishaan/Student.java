import java.io.*;
import java.util.*;

public class Student{


    private String csvfile="DBMS-CC-SP-17/Assignment-1/Chenna_Keshava-Ishaan/data.csv";
    private String csvSplitBy=",";
    private String line = "";



    public int searchString(String s,int i,int flag){
	int count=0;
	try(BufferedReader br = new BufferedReader( new FileReader(csvfile))){
	    line = br.readLine();
	    while((line=br.readLine())!=null){

		String[] comp = line.split(csvSplitBy);


		if(comp[0].equals(s)&&i==-1||comp[1].equals(Integer.toString(i))&&s.equals(""))

		{
		    System.out.println("Name : "+comp[0]);
		    System.out.println("Roll Number : "+comp[1]);
		    System.out.println("Class : "+comp[2]);
		    System.out.println("DOB : "+comp[3]);
		    System.out.println("Contact : "+comp[4]);
		    count++;
		    if(flag==0) break;

		}

	    }
	    br.close();
	}
	catch(Exception e) {
	    e.printStackTrace();
		}

    	return count;
    }

    public int searchClass(String i)
    {
	int count = 0;

	try(BufferedReader br = new BufferedReader(new FileReader(csvfile))){
	    line = br.readLine();

	    while((line=br.readLine())!=null)
	    {
		String[] comp = line.split(csvSplitBy);

		if((comp[2].trim()).equals(i))
		{
		    System.out.println("Name : "+ comp[0]);
		    System.out.println("Roll Number : "+ comp[1]);
		    System.out.println("DOB : "+ comp[3]);
		    System.out.println("Contact : "+ comp[4]);
		    count++;
		}

	    }
	    br.close();
	}
	catch(Exception e) {e.printStackTrace();}
    	return count;
    }


    public static void main(String[] args) throws Exception{

	Scanner in = new Scanner(System.in);
	Student stu = new Student();
	Range pf = new Range();
	String s = "";
	int i,j,c;
	do
	{
	    System.out.println("This program gives the details of students. Press the appropriate keys to search for students : \n 1.By Name\n 2.By Roll Number\n 3.Get All Students of a given Class\n 4.Get All Student Names which have Roll Number in given range\n 5.Exit Program\nChoose any option");
	i = in.nextInt();


		  switch(i)
		  {
		      case 1:
			  System.out.println("Enter the name of the student");
			s = in.nextLine();
			s = in.nextLine();
			System.out.println("Details of student with the name "+s+" : ");
			c = stu.searchString(s,-1,0);
			if(c==0) System.out.println("No student with name "+s+ " was found");
			break;

		      case 2:
			System.out.println("Enter the roll number of the student");
			j = in.nextInt();
			System.out.println("The details student with roll number "+j+" is");
			c=stu.searchString("",j,0);
			if(c==0) System.out.println("No student with roll number "+j+ " was found");
			break;

		      case 3:

			System.out.println("Enter the class of the student");
			String str = in.nextLine();
			str = in.nextLine();
			System.out.println("The students of class " + str + " are ");
			c=stu.searchClass(str);
			if(c==0) System.out.println("No students of class  "+str+ " were found");
			break;

		      case 4:

			System.out.println("Students present in the given range of roll numbers are");
			pf.range();
			break;

		      case 5:
			System.exit(0);

		  }
	}while(1<20);
    }
}
