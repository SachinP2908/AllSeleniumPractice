package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {
	public static void main(String[] args) throws Exception {
		 
		
		Properties prop=new Properties();
		String path = System.getProperty("user.dir")+"//config.properties";
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		
		String engine = prop.getProperty("browser");
		System.out.println(engine);
	}
}
