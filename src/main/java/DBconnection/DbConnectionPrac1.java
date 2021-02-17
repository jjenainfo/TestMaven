package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://10.10.5.60:3306/dtdc_ctbs_plus";
		String uname = "dtdc";
		String pass = "permit";
		
		
		try {
			Connection con = DriverManager.getConnection(url,uname,pass);
			
			if (con != null) {
				System.out.println("Success");
			}
			
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from DTDC_F_SRF_BOOKING where SRF_Ref_Number = 'SRF595653432'");
			
			if(rs.next()) {
				System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+",");
			}
			else
			{
				System.out.println("Record Not found");
			}
			st.close();
			con.close();
			
		  } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	
	
		}

	
 
}
