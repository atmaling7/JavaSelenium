package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Dws_login.properties");
		prop.load(fis);
		String browser =  prop.getProperty("browser");
		System.out.println(browser);
		String url =  prop.getProperty("url");
		System.out.println(url);
		String username =  prop.getProperty("username");
		System.out.println(username);
		String pass =  prop.getProperty("password");
		System.out.println(pass);
	}
}
