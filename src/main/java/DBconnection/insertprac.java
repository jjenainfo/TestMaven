package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//45:SRF290214832
		String url="jdbc:mysql://10.10.5.60:3306/dtdc_ctbs_plus";
		String uname="dtdc";
		String pass="permit";
		String query = "insert into dtdc_f_srf_booking values(382,'SRF290214832')";
		
		try {
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			
			int count =st.executeUpdate(query);
			
			System.out.println(count+"row/s affected");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
