package ieee_dbms;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class assignment1 {
  public static void main(String[] args) {

    try {
    	 Class.forName("com.mysql.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment-3", "root", "");
       System.out.println("Connection successful");
       Statement stms=conn.createStatement();
      String sql="CREATE TABLE survival"+"(id INTEGER NOT NULL,"+"survived VARCHAR(10),"+"Pclass INTEGER ,"+"Age INTEGER ,"+"Sex VARCHAR(30))";
       stms.executeUpdate(sql);
       int rows=stms.executeUpdate("INSERT INTO survival(id) SELECT PassengerId FROM titanic");
     sql="DELETE FROM survival WHERE id=0";
       stms.executeUpdate(sql);
       
       sql="UPDATE survival INNER JOIN titanic ON survival.id = titanic.PassengerId SET survival.Age = titanic.Age";
       
       stms.executeUpdate(sql);
 sql="UPDATE survival INNER JOIN titanic ON survival.id = titanic.PassengerId SET survival.Pclass = titanic.Pclass";
       
       stms.executeUpdate(sql);
 sql="UPDATE survival INNER JOIN titanic ON survival.id = titanic.PassengerId SET survival.Sex = titanic.Sex";
       
       stms.executeUpdate(sql); 
     sql="UPDATE survival SET survived='N'";
      stms.executeUpdate(sql);
      sql="UPDATE survival set survived='Y' WHERE (Age>0 && Age<=4)";
      stms.executeUpdate(sql);
      sql="UPDATE survival set survived='Y' WHERE Age>=60";
      stms.executeUpdate(sql);
      sql="UPDATE survival set survived='Y' WHERE (Sex='female' && Pclass=1 && (Age>4 && Age<=19))";
      stms.executeUpdate(sql);
      
      sql="ALTER TABLE survival DROP Pclass";
      stms.executeUpdate(sql);
      sql="ALTER TABLE survival DROP Sex";
      stms.executeUpdate(sql);
      sql="ALTER TABLE survival DROP Age";
      stms.executeUpdate(sql);
      
       
       
       
       
       
       
       

       
    } catch (Exception e) {
       System.err.println(e);
    }
  }
}
