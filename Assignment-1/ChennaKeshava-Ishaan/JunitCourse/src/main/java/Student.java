
import java.io.*;
import java.util.*;

public class Student{


    private String csvfile = "C:\\Users\\ChennaKeshava\\Desktop\\eclipse\\JunitCourse\\src\\main\\java\\data.csv";
    private String csvSplitBy=",";
    private String line = "";
    
    
    
public String[] searchString(String s,int i){

    	
    	
		
		String[] comp = new String[5];
		try(BufferedReader br = new BufferedReader( new FileReader(csvfile))){
	    line = br.readLine();
	    while((line=br.readLine())!=null){
	    	comp = line.split(csvSplitBy);	
		if(comp[0].equals(s)&&i==-1||comp[1].equals(Integer.toString(i))&&s.equals(""))
		{
		    System.out.println("Name : "+comp[0]);
		    System.out.println("Roll Number : "+comp[1]);
		    System.out.println("Class : "+comp[2]);
		    System.out.println("DOB : "+comp[3]);
		    System.out.println("Contact : "+comp[4]);
		    break;
		}
		
	    }
	    br.close();
	}
	catch(Exception e) {
		}
	
    	return comp;
    }

    public ArrayList<String[]> searchClass(String str)
    {
	
	ArrayList<String[]> li = new ArrayList<String[]>();
	try(BufferedReader br = new BufferedReader(new FileReader(csvfile))){
	    line = br.readLine();

	    while((line=br.readLine())!=null)
	    {
		String[] comp = line.split(csvSplitBy);

		if(comp[2].equals(str))
		{
		    System.out.println("Name : "+ comp[0]);
		    System.out.println("Roll Number : "+ comp[1]);
		    System.out.println("DOB : "+ comp[3]);
		    System.out.println("Contact : "+ comp[4]);
		    
		    li.add(comp);
		}
	    }
	    br.close();
	}
	catch(Exception e) {e.printStackTrace();}
    	return li;
    }




    public static void main(String[] args) throws Exception{
    	
    	Scanner in = new Scanner(System.in);
    	Student stu = new Student();
    	Range pf = new Range();
    	String s = "";
    	int i,j;
    	String[] comp = new String[5];
    	do
    	{
    	    System.out.println("This program gives the details of students. Press the appropriate keys to search students : \n 1.By Name\n 2.By Roll Number\n 3.Get All Students of a given Class\n 4.Get All Student Names which have Roll Number in given range\n 5.Exit Program\nChoose any option");
    	i = in.nextInt();	
    		   

    		  switch(i)
    		  {
    		      case 1:
    			  System.out.println("Enter the name of the student");
    			s = in.nextLine();
    			s = in.nextLine();
    			System.out.println("Details of student with the name "+s+" : ");
    			comp = stu.searchString(s,-1);
    			if(comp == null) System.out.println("No student with name "+s+ " was found");
    			break;

    		      case 2:
    			System.out.println("Enter the roll number of the student");
    			j = in.nextInt();
    			System.out.println("The details student with roll number "+j+" is");
    			comp = stu.searchString("",j);
    			if(comp == null) System.out.println("No student with roll number "+j+ " was found");
    			break;

    		      case 3:
    			
    			System.out.println("Enter the class of the student");
    			String str = in.nextLine();
    			str = in.nextLine();
    			System.out.println("The students of class " + str + " are ");
    			ArrayList<String[]> li = new ArrayList<String[]>();
    			li = stu.searchClass(str);
    			if(li.size() == 0) System.out.println("No students of class  "+str+ " were found");
    			break;

    		      case 4:	
    		    	  System.out.println("Enter two roll numbers");
    		    		int a = in.nextInt();
    		    		int b = in.nextInt();
    		    		pf.range(a,b);
    		    		break;

    		      case 5:
    			System.exit(0);

    		  }
    	}while(1<20);
        }
}