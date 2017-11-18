import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Employee Id:");
			int empId = Integer.parseInt(br.readLine());
			
			String query = "delete from Employee where EMPID = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, empId);
			
			ps.execute();
			System.out.println("Success");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
