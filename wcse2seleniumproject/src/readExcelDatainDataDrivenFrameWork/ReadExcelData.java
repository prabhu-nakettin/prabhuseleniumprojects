package readExcelDatainDataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		//To read the single data from the Excel Sheet
		
		FileInputStream fis = new FileInputStream("./data/TestDeta.xlsx");//provide the path of file
		Workbook wb = WorkbookFactory.create(fis);  //make the file ready for read
		Sheet Sheet = wb.getSheet("IPL");// get into the sheet
		Row row = Sheet.getRow(1);//get the desired row
		Cell cell = row.getCell(1);//get the desired col/cell
		String data = cell.getStringCellValue();   //read the from cell
		System.out.println(data);
		
		
		

	
		
		
	}

}
