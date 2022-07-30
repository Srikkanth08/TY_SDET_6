package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest 
{
	@Test
	public void executeUpdateTest() throws Throwable
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
			
			//Step-4: Execute Non-Select Query
			int Result = s.executeUpdate("insert into students_info(regno, firstname, middlename, lastname) values('3','Shyam','Shinga','Rai');");
			if(Result==1)
			{
				System.out.println("Data is Added in Database Successfully");
			}
			else
			{
				System.out.println("Give Right Query then see now it is not added");
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			con.close();
		}
		
		 
	}
}
