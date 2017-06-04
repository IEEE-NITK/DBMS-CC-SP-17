import java.io.*;
import java.util.*;
import java.sql.*;

public class Main 
{
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static String DB_URL = "jdbc:mysql://localhost/Titanic";

		static final String USER = "root";
		static final String PASS = "";//Enter the password
 
		public static void main(String[] args) 
		{
			Connection conn = null;
			Statement stmt = null;

			
			try
			{
				
				Class.forName("com.mysql.jdbc.Driver");
	    			
				System.out.println("Connecting to the selected database.\n\n");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Connected to the database successfully");
      
				System.out.println("Creating table in given database.");
				stmt = conn.createStatement();
      
				String sql = "CREATE TABLE survived " +
							"(Id INTEGER , " +
							" Survived CHAR, " + 
							" PRIMARY KEY ( Id ))"; 

				stmt.executeUpdate(sql);
				System.out.println("The table has been created.\n");
				System.out.println("Inserting records into the table.");
				stmt = conn.createStatement();
				stmt.executeUpdate("INSERT INTO survived (Id) SELECT PassengerId FROM titanic");
				
				sql="UPDATE survived SET Survived='N'";
				     stmt.executeUpdate(sql);
				sql = "UPDATE survived,titanic SET Survived = 'Y' WHERE (survived.Id=titanic.PassengerId) AND ((titanic.Age>0 && titanic.Age<=4 ) OR titanic.Age>=60 OR (titanic.Sex='female' && titanic.Pclass=1 && titanic.Age<=19));";				
				stmt.executeUpdate(sql);
				}catch(SQLException se){
    		  se.printStackTrace();
    		   }catch(Exception e){
    		    e.printStackTrace();
    		   }finally{
    		     try{
    		       if(stmt!=null)
    		       conn.close();
    		   }catch(SQLException se){
    		      }
    		      try{
    		         if(conn!=null)
    		            conn.close();
    		      }catch(SQLException se){
    		         se.printStackTrace();
    		      }
    		      }
    		   System.out.println("Goodbye!");
	}//end main
}
 

	


