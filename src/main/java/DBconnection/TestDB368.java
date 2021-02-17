package DBconnection;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB368 {

	public static <Int> void main(String arg[]) {
		String url = "jdbc:mysql://10.10.5.60:3306/dtdc_ctbs_plus";
		String uname = "dtdc";
		String pass = "permit";
		
		try {
			Connection con = DriverManager.getConnection(url, uname, pass);
			if (con != null) {
				System.out.println("Connection done");

				Statement stmt = con.createStatement();
				
				DataInputStream KB=new DataInputStream(System.in); 
				try {
					System.out.println("Enter cn number");
					String cn_no=KB.readLine();
					String queryString = "SELECT * FROM DTDC_F_BOOKING WHERE CONSG_NUMBER='"+cn_no+"'";
					ResultSet rs= stmt.executeQuery(queryString);
					if(rs.next()) { 
						System.out.println(rs.getString(1)+","+rs.getString(11)+","+rs.getString(12)+","+rs.getString(16)+","+rs.getString(66)); 
						}
					 else {
				        System.out.println("Record Not Found...");
				        }
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
