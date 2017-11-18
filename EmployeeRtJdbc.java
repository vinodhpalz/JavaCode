import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRt {

	public static void main(String[] args) {
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Employee Id:");
			int empId = Integer.parseInt(br.readLine());
			
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			String query = "select * from Employee where EMPID = ?";
			
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, empId);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			}
			rs.close();
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
