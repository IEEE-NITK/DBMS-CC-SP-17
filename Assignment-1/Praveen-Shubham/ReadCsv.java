package StudentRecorder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCsv {
	public static ArrayList<String>Name = new ArrayList<String>();
	public static ArrayList<String>Roll = new ArrayList<String>();
	public static ArrayList<String>Class = new ArrayList<String>();
	public static ArrayList<String>Dob = new ArrayList<String>();
	public static long[] Phone;
	public static int i = 0;
	
	public static void Read(){
		Phone = new long[100000];
		
		try{
			CsvReader data = new CsvReader("D:\\hlpr9\\Java_Files\\Assingnment1\\src\\StudentRecorder\\Data_Real.csv");
			data.readHeaders();
			while(data.readRecord()){
				Name.add(data.get("Name"));
				Roll.add(data.get("Roll Number"));
				Class.add(data.get("Class"));
				Dob.add(data.get("DOB"));
				long y=Long.parseLong(data.get("Contact"));
				Phone[i] = y;
				i++;
			
				
				
			}
			data.close();
				
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
