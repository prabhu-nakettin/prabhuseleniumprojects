package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

public class ForMePractice
{	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./data/config.properties"); //path of property
		
		 Properties pro = new Properties();
		
		pro.load(fis);
		
		String data = pro.getProperty("username");
		
		System.out.println(data);
		
	
		
		
		
	}

}
