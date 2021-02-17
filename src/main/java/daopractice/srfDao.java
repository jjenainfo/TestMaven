package daopractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class srfDao {
	srfModule srfModule;
	
	public srfModule getSrf(int srfId) {
		
		String url="jdbc:mysql://10.10.5.60:3306/dtdc_ctbs_plus";
		String uname="dtdc";
		String pass="permit";
		String query = "select SRF_Ref_Number from dtdc_f_srf_booking where Request_ID=" +srfId;
		
		srfModule.srfId= srfId;
		
		try {
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String srf = rs.getString(1);
			srfModule.srfNumber = srf;
			return srfModule;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	

}

