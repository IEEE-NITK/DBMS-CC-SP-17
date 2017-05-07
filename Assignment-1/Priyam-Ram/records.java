import java.util.Scanner;
import java.io.*;

public class records{
    public static void main(String []args){
        int lv=1;
        try{
	        BufferedReader reader = new BufferedReader(new FileReader("/home/priyam/workspace/Records/src/data.csv"));
	        int totalStud = -1;
	        while (reader.readLine() != null) totalStud++;
	        reader.close();
        
            File file = new File(("/home/priyam/workspace/Records/src/data.csv"));
	        student [] record = new student[totalStud];
	        Scanner inputStream = new Scanner(file);
	        inputStream.nextLine();
	        for(int i=0; i<totalStud; i++){
	        	record[i] = new student();
	            
	            if (inputStream.hasNext() ){
	            	String data = inputStream.nextLine();
	                String[] values = data.split(",");
	                record[i].studName = values[0];
	                record[i].studRoll = Integer.parseInt(values[1]);
	                record[i].studClass = values[2];
	                record[i].studDob = values[3];
	                record[i].studContact = Long.parseLong(values[4]);
	                }
	        }
	        inputStream.close();
	        
	        while (lv!=0){
	        	System.out.println("============ Select Operation to Perform ===========");
	            System.out.println("1. Search Student \n\t- By Name \n\t- By Roll Number");
	            System.out.println("2. Get all students of a given class");
	            System.out.println("3. Get all students Names which have Roll Number in given range");
	            System.out.println("0. Exit ");
	            System.out.println("====================================================");
	            System.out.print("Enter Input: ");
	            Scanner inp = new Scanner(System.in);
	            Scanner inps = new Scanner(System.in);
	            int option = inp.nextInt();
	            if (option==1){	
	                System.out.print("\nWould you like to search by: \n1.Name \n2.Roll Number\nEnter Input:");
	                int option2 = inp.nextInt();
	                if (option2==1){
	                	System.out.println("Enter student name: ");
	                	String search = inps.nextLine();
	                	int flag=0;
		                for(int i=0;i<totalStud;i++){
		                	if (record[i].studName.equals(search)){
		                		System.out.println("\nRecord Found!");
	                            System.out.printf("Name: %s \nRoll Number: %d \nClass: %s \nDOB: %s \nContact: %d\n\n",record[i].studName,record[i].studRoll,record[i].studClass,record[i].studDob,record[i].studContact);
	                            flag+=1;
		                	}
		                }
		                if (flag==0){
		                	System.out.println("Sorry no record found!");
		                }
	                }
	                else if (option2==2){
	                	System.out.println("Enter student Roll No: ");
	                	int search = inp.nextInt();
	                    int flag=0;
	                    for(int i=0;i<totalStud;i++){
		                	if (record[i].studRoll == search){
		                		System.out.println("\nRecord Found!");
	                            System.out.printf("Name: %s \nRoll Number: %d \nClass: %s \nDOB: %s \nContact: %d\n\n",record[i].studName,record[i].studRoll,record[i].studClass,record[i].studDob,record[i].studContact);
		                		flag+=1;
		                	}
		                }
		                if (flag==0){
		                	System.out.println("Sorry no record found!");
		                }
	                    
	                }
	                else{
	                	System.out.println("Sorry, Invalid Input!");
	                }
	            } 
	            else if (option==2){
	                System.out.print("\nEnter class: ");
	                String search = inp.next();
	                search = search.toUpperCase();
	                int flag=0;
	                for(int i=0;i<totalStud;i++){
	                	if (record[i].studClass.equals(search)){
	                		System.out.printf("Name: %s\nRoll No: %d\n\n",record[i].studName,record[i].studRoll);
	                		flag+=1;
	                	}
	                }
	                if (flag==0){
	                	System.out.println("Sorry no record found!");
	                }
	            }
	            else if (option==3){
	                System.out.print("Enter starting number: ");
	                int start = inp.nextInt();
	                System.out.print("Enter ending number: ");
	                int last = inp.nextInt();
	                int flag=0;
	                for(int i=0; i<totalStud; i++){
	                	if ((record[i].studRoll >= start) && (record[i].studRoll <=last)){
	                		System.out.printf("\nName: %s\nRoll No: %d\n\n",record[i].studName,record[i].studRoll);
	                		flag+=1;
	                	}
	                }
	                if (flag==0){
	                	System.out.println("Sorry no record found!");
	                }
	            }
	            else if (option==0){
	                System.out.println("Terminating.");
	                break;
	            }
	            else{
	                System.out.println("Sorry! Invalid Input, please try again!");
	            }
	            System.out.println("Would you like to continue? \n0 - No / 1 - Yes");
	            lv = inp.nextInt();
	        }
        }
        catch (IOException e){
        	e.printStackTrace();
        }
    }
}

