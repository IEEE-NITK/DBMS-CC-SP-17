package StudentRecorder;


public class Searcher {
	public static void SearchByName(String userName){
		int n = ReadCsv.Name.indexOf(userName);
		if(n==-1)
			System.out.println("Sorry no such Name found... Try again");
		else
			System.out.println("The Student is ....." + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..." + ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..." + ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n]) ;
		
	}
	
	public static void SearchByRoll(String userRoll){
		int n = ReadCsv.Roll.indexOf(userRoll);
		if(n==-1)
			System.out.println("Sorry no such Roll No found... Try again");
		else
			System.out.println("The Student is ....." + '\n' + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..." + ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..." + ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n]) ;
	}
	
	public static void SearchByClass(String userClass){
		System.out.println("The Students in Class " + userClass + " are.....");
		System.out.println(" ");
		int z=1,r=-1;
		for(int j=0;j<ReadCsv.i;j++){
			if(userClass.equals(ReadCsv.Class.get(j))){
				System.out.println("Student " + z + "....." + '\n' + '\n' + "Name..." + ReadCsv.Name.get(j) + '\n' + "Roll Number..." + ReadCsv.Roll.get(j) + '\n' + "Class..." + ReadCsv.Class.get(j)+ '\n' + "DOB..." + ReadCsv.Dob.get(j) + '\n' + "Contact..." + ReadCsv.Phone[j]) ;
				System.out.println(" ");
				r=100;
				z++;
			}
		}
		if(r==-1)
			System.out.println("Sorry no such Class found... Try again");
	}
	public static void SearchByRange(String userLow,String userHigh){
		test: {
		System.out.println("The Students are.....");
		int z,y;
		z = Integer.parseInt(userLow);
		y = Integer.parseInt(userHigh);
		if(z>y){
			System.out.println("Please input Roll No in correct order");
			break test;
		}
		int i=1;
		int userLow_index=-1, userHigh_index=-1;
		for (int j=0;j<ReadCsv.i;j++){
			if(userLow.equals(SortRoll.toSort[j])){
				userLow_index = j;
				break;
			}
		}
		for (int k=0;k<ReadCsv.i;k++){
			if(userHigh.equals(SortRoll.toSort[k])){
				userHigh_index = k;
				break;
			}
		}
		if(userLow_index==-1 || userHigh_index==-1 )
			System.out.println("Sorry no such Roll No found... Try again");
		else{
			while(userLow_index<=userHigh_index){
				int n = ReadCsv.Roll.indexOf(SortRoll.toSort[userLow_index]);
				System.out.println('\n' + "The Student " + i + "....." + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..." + ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..." + ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n]) ;
				i++;
				++userLow_index;
				
			
			}
		}
	}
}

}
