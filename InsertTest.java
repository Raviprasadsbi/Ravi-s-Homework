import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;

public class InsertTest {

	public static void main(String[] args) {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			
			int appId = 223 ;
			String Name="jack";
			String Email="asb@gmail.com";
			String address="Belapur";
			String mobile="9703245654";
			String DOB="1982-12-09";
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
			pst.setInt(1, appId);
			pst.setString(2, Name);
			pst.setString(3, Email);
			pst.setString(4, address);
			pst.setString(5, mobile);
			
			Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			pst.setDate(6,sqlDate);
			System.out.println("prepared statement is created..."+pst);
			
			
			
			
			
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BANK_APPLICANT where APPLICANT_ID="+appId);
			System.out.println("query fired...got the results....");
			int z=rs.getInt(1);
			if(z=appId) {
				System.out.println("record already exists");
				
			}
			
			else
			
				int row = pst.executeUpdate();
			System.out.println("row inserted..."+row);

			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(SQLException e) {
			System.out.println("Some problem : "+e);
		}
		
	}

}
