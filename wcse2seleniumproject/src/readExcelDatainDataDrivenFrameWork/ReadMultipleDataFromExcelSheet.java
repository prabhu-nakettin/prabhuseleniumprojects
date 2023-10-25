package readExcelDatainDataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadMultipleDataFromExcelSheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//To Read Multiple Data from Excel sheet
		
		for(int i=1;i<=5;i++)
		{
		
		FileInputStream fis = new FileInputStream("./data/TestDeta.xlsx"); // provide path of file
		Workbook wb = HSSFWorkbookFactory.create(fis);//maake the file ready for read
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(i);
		Cell col = row.getCell(0);
		String data = col.getStringCellValue();
		System.out.println(data);
		Thread.sleep(2000);
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

