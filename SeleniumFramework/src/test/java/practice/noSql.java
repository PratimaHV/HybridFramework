package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class noSql 
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
		
		String query="insert into student(first_name,last_name,address)values('raju','BN','INDIA')";
		
		//step 4:Execute query
		int result=stat.executeUpdate(query);
		
		if(result==1)
		{
			System.out.println("user is created");
		}
		else
		{
			System.out.println("user is not created");
		}

	}

}
