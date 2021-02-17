package makemytrip;

import java.io.FileInputStream;
import java.util.Properties;

public class CTBSprop {
	
	static Properties prop=new Properties();
	static FileInputStream fis;
	public static void  readProperties() {
		
		 try {
				fis = new FileInputStream(".\\TestMaven\\src\\test\\java\\makemytrip\\CTBSplus.properties");
				prop.load(fis);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		    String username = prop.getProperty("user_name");
		    String password = prop.getProperty("password");
		    String url = prop.getProperty("url");
		
	}

}
