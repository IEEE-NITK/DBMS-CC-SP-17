package StudentRecorder;

public class Searcher {
	public static String SearchByName(String userName) {
		int n = ReadCsv.Name.indexOf(userName);
		String t = new String();
		if (n == -1){
			System.out.println("Sorry no such Name found... Try again");
			t = "Sorry no such Name found... Try again";
		}
		else{
			t = "The Student is ....." + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..."+ ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..." + ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n];
			System.out.println("The Student is ....." + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..." + ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..."+  ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n]) ;
		}
		return t;
	}

	public static String SearchByRoll(String userRoll) {
		int n = ReadCsv.Roll.indexOf(userRoll);
		String t = new String();
		if (n == -1){
			System.out.println("Sorry no such Roll No found... Try again");
			t = "Sorry no such Roll No found... Try again";
		}
		else{
			System.out.println("The Student is ....." + '\n' + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..." + ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..." + ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n]) ;
			t = ("The Student is ....." + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..." + ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..."+ ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n]);
		}
		return t;
	}

	public static String SearchByClass(String userClass) {
		System.out.println("The Students in Class " + userClass + " are.....");
		System.out.println(" ");
		String t = new String();
		int z = 1, r = -1;
		for (int j = 0; j < ReadCsv.i; j++) {
			if (userClass.equals(ReadCsv.Class.get(j))) {
				System.out.println("Student " + z + "....." + '\n' + '\n' + "Name..." + ReadCsv.Name.get(j) + '\n'	+ "Roll Number..." + ReadCsv.Roll.get(j) + '\n' + "Class..." + ReadCsv.Class.get(j) + '\n' + "DOB..." + ReadCsv.Dob.get(j) + '\n' + "Contact..." + ReadCsv.Phone[j]);
				System.out.println(" ");
				r = 100;
				z++;
			}
		}
		if (r == -1){
			System.out.println("Sorry no such Class found... Try again");
			t = "Sorry no such Class found... Try again";
		}
		return t;
	}

	public static String SearchByRange(String userLow, String userHigh) {
		String t = new String();

		test: {
			System.out.println("The Students are.....");
			int z, y;
			z = Integer.parseInt(userLow);
			y = Integer.parseInt(userHigh);
			if (z > y) {
				System.out.println("Please input Roll No in correct order");
				t = "Please input Roll No in correct order";
				break test;
			}
			int i = 1;
			int userLow_index = -1, userHigh_index = -1;
			for (int j = 0; j < ReadCsv.i; j++) {
				if (userLow.equals(SortRoll.toSort[j])) {
					userLow_index = j;
					break;
				}
			}
			for (int k = 0; k < ReadCsv.i; k++) {
				if (userHigh.equals(SortRoll.toSort[k])) {
					userHigh_index = k;
					break;
				}
			}
			if (userLow_index == -1 || userHigh_index == -1) {
				System.out.println("Sorry no such Roll No found... Try again");
				t = "Sorry no such Roll No found... Try again";
			}
			else {
				while (userLow_index <= userHigh_index) {
					int n = ReadCsv.Roll.indexOf(SortRoll.toSort[userLow_index]);
					System.out.println('\n' + "The Student " + i + "....." + '\n' + "Name..." + ReadCsv.Name.get(n) + '\n' + "Roll Number..." + ReadCsv.Roll.get(n) + '\n' + "Class..." + ReadCsv.Class.get(n) + '\n' + "DOB..." + ReadCsv.Dob.get(n) + '\n' + "Contact..." + ReadCsv.Phone[n]);
					i++;
					++userLow_index;

				}
			}
		}
		return t;
	}

}
