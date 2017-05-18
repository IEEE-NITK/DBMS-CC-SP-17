import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.Scanner;

public class Assignment
{
 
   public static void main(String[] args) throws Exception
   {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter filename");
     String filename=scan.nextLine();
     
      CSVReader reader = new CSVReader(new FileReader(filename), ',' , '"' , 1);
      System.out.println("To search student by name press 1 , by roll 2, to get all students of a class press 3, to get all students in the given roll number range press 4 and to exit press 5"); 
      int num = scan.nextInt();
      switch (num){
      case 1:
    	  System.out.println("Enter first name");
    	  String firstname = scan.next();
    	  System.out.println("Enter last name");
    	  String lastname = scan.next();
    	  String names;
    	  names= firstname + " " + lastname;
    	  String[] nextLine;
    	  
    	  int i;
          while ((nextLine = reader.readNext()) != null) {
        	  
            
            	if(nextLine!=null){
            		
       
            	 if(nextLine[0].equals(names))
            	 { 
            		 for(i=0;i<5;i++)
            		 {
            			 System.out.println(nextLine[i]);
            		 }
            		 break; // System.exit(0);
            	 }
            	 else
            	 { 
            		continue;
            	 }
            	}
            	
            	         
          }
          
          break;
    	  
    	  
     
      case 2:
      
    	  System.out.println("Enter roll number");
    	  double roll=scan.nextDouble();
    	  String[] nextLine2;
    	  int j;
          while ((nextLine2 = reader.readNext()) != null) {
             if (nextLine2!= null) {
       
            	 if(Double.parseDouble(nextLine2[1])==roll)
            	 { 
            		 for(i=0;i<5;i++)
            		 {
            			 System.out.println(nextLine2[i]);
            		 }
            		 break; // System.exit(0);
            	 }
            	 else
            	 { 
            		continue;
            	 }
            	    
             }
             
          
          }
          
          break;
      case 3:
    	  System.out.println("enter class");
    	  String classno=scan.next();
    	  String[] nextLine3;
    	  int k;
          while ((nextLine3 = reader.readNext()) != null) {
             if (nextLine3!= null) {
       
            	 if(nextLine3[2].equals(classno))
            	 {        		 
            			 System.out.println(nextLine3[0]);           		 
            	 }
            	 else
            	 { 
            		continue;
            	 }
            	    
             }
             
          
          }
          
          break;
      case 4:
    	  System.out.println("enter lower range of roll numbers");
    	  double low = scan.nextDouble();
    	  System.out.println("enter upper range for roll numbers");
    	  double high = scan.nextDouble();
    	  String[] nextLine4;
    	  int l;
          while ((nextLine4 = reader.readNext()) != null) {
             if (nextLine4!= null) {
       
            	 if(Double.parseDouble(nextLine4[1])>low && Double.parseDouble(nextLine4[1])<high )
            	 {        		 
            			 System.out.println(nextLine4[0]);           		 
            	 }
            	 else
            	 { 
            		continue;
            	 }
            	    
             }
             
          
          }
          
          break;
      case 5:
    	  System.exit(0);
    	  break;
    	  
    
    	  
    	  		
      }
    	  
      
     
   }}
