package assn3;

import java.sql.*;

public class Javasql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment-3","root","root");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("CREATE TABLE Survived(PassengerId INT(5), Survived CHAR(1));");
			//creates table survived with attributes listed above
			
			st.executeUpdate("INSERT INTO Survived(PassengerId) SELECT PassengerId FROM `titanic`;");
			//inserts PassengerId in Survived table from titanic table
			
			st.executeUpdate("UPDATE `Survived`,`titanic` SET Survived.Survived='Y' WHERE Survived.PassengerId=titanic.PassengerId AND (titanic.Age<=4 OR titanic.Age>=60 OR (titanic.Sex='female' AND titanic.Age<=19 AND titanic.Pclass=1));");
			//sets Survived Column's values to 'Y' for the conditions listed
			
			st.executeUpdate("UPDATE `Survived` SET Survived='N' WHERE Survived IS NULL;");
			//sets Survived Column's values to 'N' for values that were NULL
			
		}catch(Exception ex){
			System.out.println("Error: "+ex);
		}
		
	}

}
