package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadthepropertyData 
{
	public static void main(String[] args) throws IOException 
	{	
		FileInputStream fis = new FileInputStream("./data/config.properties"); //provide the path of file
		
		// read the property data
		
		Properties pro = new Properties();
		
		// we need to use this method
		
		pro.load(fis);		// make the file ready for read
		
		String data = pro.getProperty("url");
		
		System.out.println(data);
		
		
		
	}
}

		
		
		
		

