package Exception;   // File not found Exception 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCreation 
{
	 public static void main(String[] args) throws FileNotFoundException // this is checked type Exception compiler awere about this Exception
	 {
		 String path="C:\\Users\\User\\File\\note.text";
		 
		 FileOutputStream f = new FileOutputStream(path);
		 
		 System.out.println("File is created");		 
		  
		
	}
	 
}
