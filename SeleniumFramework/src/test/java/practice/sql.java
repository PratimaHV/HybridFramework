package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;



public class sql 
{

	public static void main(String[] args) throws SQLException
	{
	//step 1:Register or load the MySql database
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//step 2: Get connect to database
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
		
		//step 3:create sql statement
		Statement stat=conn.createStatement();
	
	String selectQuery="select*from student";
	
	//step 4: Execute statement/query
	ResultSet result=stat.executeQuery(selectQuery);
	
	while(result.next())
	{
		System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
	
	}
	//step 5:close the database connection
	conn.close();
	}
}
