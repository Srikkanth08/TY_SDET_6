package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest 
{
	@Test
	public void executeQueryTest() throws Throwable 
	{
		
		Connection con=null;
		try 
		{
			//Step-1: Register The Driver
			Driver dr = new Driver();
			DriverManager.registerDriver(dr);
			
			//Step-2: Connect To DataBase
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			
			//Step-3: Create A Statement
			Statement s = con.createStatement();
			
			//Step-4: Execute The Query
			ResultSet Result = s.executeQuery("select * from students_info;");
			
			while(Result.next())
			{
				System.out.println(Result.getString(1)+" "+Result.getString(2));
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
		//Step-5: Close The Connection
		con.close();
		}
	}
}
