/*
 *Student Class
 *
 *Authors @Nachiket @Anumeha
 * 
 * 
 */

package mypack;


public class student {
	public static int count=0;
	private String name;
	private int roll;
	private String std;
	private String  bdate;
	private long contact;
	
	student(String n, int r, String s, String b, long c){
		name=n;
		roll=r;
		std=s;
		bdate=b;
		contact=c;
	}
	
	public String getName(){
		return name;
	}
	public int getRoll(){
		return roll;
	}
	public String getStd(){
		return std;
	}
	public String getBdate(){
		return bdate;
	}
	public long getContact(){
		return contact;
	}
}