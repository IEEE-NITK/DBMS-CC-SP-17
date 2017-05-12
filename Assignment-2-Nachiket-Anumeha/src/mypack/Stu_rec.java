/*
 *Student Record Main Class
 *
 *Authors @Nachiket @Anumeha
 * 
 * External JAR Files used: opencsv-3.9.jar
 */

package mypack;


import java.util.*;
import java.io.*;
import com.opencsv.*;


public class Stu_rec {
	
	//Method to search student by Name
	public static void searchN(String key,ArrayList<student> stud){
		
		for(student it: stud){
			if(key.equals(it.getName())){
				System.out.println("Name : "+it.getName()+" Contact : "+it.getContact()+" Roll : "+it.getRoll()+" Section : "+it.getStd()+" Date : "+it.getBdate());

			}
		}
	}
	//Method to search student by Roll Number
	public static void searchR(int key,ArrayList<student> stud){
		
		for(student it: stud){
		
			if(key==it.getRoll()){
				System.out.println("Name : "+it.getName()+" Roll : "+it.getRoll()+" Section : "+it.getStd()+" Date : "+it.getBdate());
				
			}
		}
	}
	//Method to search students in a given Roll Number Range
	public static void getRange(int upper,int lower,ArrayList<student> stud){
			
		for(student it: stud){
		
			if((lower<=it.getRoll())&&(upper>=it.getRoll())){
				System.out.println("Name : "+it.getName()+"     Roll : "+it.getRoll());
			}
		}
	}
	//Method to search student of given Class
	public static void getClass(String key,ArrayList<student> stud){
		
			for(student it: stud){
		
				if(key.equals(it.getStd())){
					System.out.println(it.getName());
			}
		}
	}
	public static void main(String args[]) throws Exception{
		String csvLocation="/home/nac/workspace/Record/data.csv";
	
		CSVReader reader = new CSVReader(new FileReader(csvLocation));	
		
		ArrayList<student> stud =new  ArrayList<student>();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] read;
	
		while ((read = reader.readNext()) != null) {
		
	   		student stu =new student(read[0],Integer.parseInt(read[1]),read[2],read[3],Long.parseLong(read[4]));
	   		stud.add(stu);
	   
		}
	
		reader.close();
		int choice=0;
		while(choice!=5){
		choice = 0;
		System.out.println("Enter your choice to \n1]Search by Student Name");
		System.out.println("2]Search by Roll");
		System.out.println("3]Get All Students of a given Class ");
		System.out.println("4]Get All Student Names which have Roll Number in given range");
		System.out.println("5]Exit Program ");
		choice=Integer.parseInt(br.readLine());
		switch(choice){
		
		case 1: 
			   
				System.out.println("Enter name");
			    String key=br.readLine();
			    searchN(key,stud);
			    break;
		case 2: 
		   
				System.out.println("Enter Roll:");
				int r=Integer.parseInt(br.readLine());
				searchR(r,stud);
				break;
		case 3: 
		   
				System.out.println("Enter Class or Standard:");
				String s=br.readLine();
				getClass(s,stud);
				break;
		case 4: 
				System.out.println("Enter Upper Range Roll:");
				int u=Integer.parseInt(br.readLine());
				System.out.println("Enter Lower Range Roll:");
				int l=Integer.parseInt(br.readLine());
				getRange(u,l,stud);
				break;
		default:
				break;
		}
	}
		
 
	}
}   
