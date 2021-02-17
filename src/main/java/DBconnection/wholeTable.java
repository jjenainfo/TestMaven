package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class wholeTable {

	public static void main(String[] args) {
		String url="jdbc:mysql://10.10.5.60:3306/dtdc_ctbs_plus";
		String uname="dtdc";
		String pass="permit";
		String query = "select * from dtdc_f_srf_booking";
		
		try {
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1)+":"+rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
