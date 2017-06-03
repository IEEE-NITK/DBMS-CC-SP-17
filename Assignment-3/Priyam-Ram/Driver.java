package simpleDBMS;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			// 1. Creating a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Survivors?useSSL=false", "root", "ilikeapples!");
			
			// 2. Creating a statement
			Statement myStmt = myConn.createStatement();
			
			// 3. Performing SQL data manipulation
			
			// 3.1: This creates a table 'survived' with attributes ( 'PassengerID' and 'survived' ) 
			int myRs = myStmt.executeUpdate("CREATE TABLE survived (PassengerID INT(4) PRIMARY KEY, survived CHAR(1));");
			// 3.2:  This inserts PassengerID values into table 'survived'
			myStmt.executeUpdate("INSERT INTO survived (PassengerID) SELECT PassengerId FROM titanic");
		    // 3.3: Assigns a 'Y' when condition satisfies
			myStmt.executeUpdate("UPDATE survived,titanic SET survived = 'Y' WHERE (Age IS NOT NULL AND NOT(AGE='')) AND survived.PassengerID=titanic.PassengerId AND (titanic.Age<=4 OR titanic.Age>=60 OR ( titanic.Sex='female' AND titanic.Age<=19 AND titanic.Pclass=1 ))");
			// 3.4: Rest all NULL values are assigned 'N'
			myStmt.executeUpdate("UPDATE survived, titanic SET survived = 'N' WHERE survived IS NULL OR survived='';");
			
		}
		catch (Exception errorMsg){
			errorMsg.printStackTrace();;
			
		}

	}

}
