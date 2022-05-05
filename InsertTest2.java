import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;

public class InsertTest2 {

	public static void main(String[] args) {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			
			
			Statement st = conn.createStatement();
			System.out.println("statement is created..."+st);
			int aID=223;
			String Bname="jack";
			String Bemail="xyz@gmail.com";
			String Baddress="Mumbai";
			String BmobileNumber="9703254912";
			
			ResultSet rs = st.executeQuery("SELECT * FROM BANK_APPLICANT");
			if(rs.getInt(1)=aID) {
				System.out.println("record exists");
			}
			else {
				
			
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
		     pst.setInt(1, aID);
			 pst.setString(2, Bname);
			 pst.setString(3, Bemail);
			 pst.setString(4, Baddress);
			 pst.setString(5, BmobileNumber);
			
			Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			pst.setDate(6,sqlDate);
			System.out.println("prepared statement is created..."+pst);
			
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
