//To Connect H2 Database with Embedded Mode

import java.sql.*;
class TestEmpSql
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("org.h2.Driver");
			System.out.println("1");
			Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
			System.out.println("2");
			String query = "insert into Employee values(101,'Arun')";
			System.out.println("3");
			Statement st = con.createStatement();
			st.execute(query);
			System.out.println("4");
			System.out.println("Success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}