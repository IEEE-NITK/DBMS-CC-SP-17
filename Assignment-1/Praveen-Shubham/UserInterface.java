package StudentRecorder;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args){
		ReadCsv.Read();
		
		SortRoll.Sorter();
		int p=0,q=0;
		
		test: while(true){
		System.out.println("1. Search for a Student");
		System.out.println("2. All students of a Class");
		System.out.println("3. Students in a given Range of Roll Numbers");
		System.out.println("4. Exit");
		System.out.println(" ");
		Scanner user = new Scanner(System.in);
		System.out.println("Give your Choice for Searching .........");
		
		int userChoice = user.nextInt();
		System.out.println(" ");

		switch(userChoice){
		case 1:
			test2: while(true){
			System.out.println("1. Search by Name");
			System.out.println("2. Search by Roll Number");
			System.out.println(" ");
			System.out.println("Give your Choice for Searching .........");
			int userChoice_2 = user.nextInt();
			
			switch(userChoice_2){
			case 1:
				System.out.println("Give the Name of the Student.....");
				Scanner user2 = user.useDelimiter(System.getProperty("line.separator"));
				String userName = user2.next();
				Searcher.SearchByName(userName);
				q=111;
				break;
			case 2:
				System.out.println("Give the Roll Number of the Student.....");
				String userRoll = user.next();
				Searcher.SearchByRoll(userRoll);
				q=111;
				break;
			default: 
				System.out.println("Sorry, Wrong choice!.... Try again");
				q=23;
			}
			userChoice_2 = -1;
				if(q==23){
					System.out.println("*******************************************");
					continue test2;
				}
				else if(q==111){
					System.out.println("*******************************************");
					System.out.println("Would u like to continue Y/N");
					Scanner ask = new Scanner(System.in);
					String userAsk = ask.next();
					userAsk = userAsk.toLowerCase();
					System.out.println("*******************************************");
					if(userAsk.equals("y"))
						continue test;
					else{
						System.out.println("Bye!");
						System.exit(0);
					}
					ask.close();		
				}
			}
		
		case 2:
			
			System.out.println("Give the Class.....");
			String userClass = user.next();
			Searcher.SearchByClass(userClass);
			
			System.out.println("*******************************************");
			System.out.println("Would u like to continue Y/N");
			Scanner ask2 = new Scanner(System.in);
			String userAsk2 = ask2.next();
			userAsk2 = userAsk2.toLowerCase();
			System.out.println("*******************************************");
			if(userAsk2.equals("y"))
				continue test;
			else{
				System.out.println("Bye!");
				System.exit(0);
			}
			ask2.close();		
			break;
		case 3:
			
			System.out.println("Give the Range of Roll Numbers.....");
			System.out.print("From Roll No. :-  ");
			String userLow = user.next();
			System.out.print("To Roll No. :-  ");
			String userHigh = user.next();
			
			Searcher.SearchByRange(userLow,userHigh);
			System.out.println("*******************************************");
			System.out.println("Would u like to continue Y/N");
			Scanner ask3 = new Scanner(System.in);
			String userAsk3 = ask3.next();
			userAsk3 = userAsk3.toLowerCase();
			System.out.println("*******************************************");
			if(userAsk3.equals("y"))
				continue test;
			else{
				System.out.println("Bye!");
				System.exit(0);
			}
			ask3.close();
			break;
		
		case 4:
			
			System.out.println("*******************************************");
			System.out.println("Bye!");
			System.exit(0);
			break;
		default :
			System.out.println("Sorry, Wrong choice!.... Try again");
			continue test;
			
		}
		
		user.close();
		}
		
	}
		
}

