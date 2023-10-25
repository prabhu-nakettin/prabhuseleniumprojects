package keyDrivenframeWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {   //it is used  to store generic reusable method
	
	
	public String readexcelData(String excelpath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);  // 
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
	}

	//generic reusable method to get last row count//getlastrownum

	public int rowcount(String excelpath,String sheetName ) throws EncryptedDocumentException, IOException
	{	
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);

		int rc = sheet.getLastRowNum();
		return rc;
	}

	//generic reusable method to write the data in xecel sheet

	public void writeExcelData(String excelpath,String sheetName,int rowcount,int cellcount,String prabhu) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row rw = sheet.getRow(rowcount);
		Cell cell = rw.createCell(cellcount);
		cell.setCellValue(prabhu);
	}
	
	//generic reusable method to read the data from property filefile

	public String readPropertyData(String proppath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(proppath);

		Properties pro = new Properties(); //it will read the prpperty file
		
		pro.load(fis);    //read the property file which we want
		
		String value = pro.getProperty(key);// marke the file ready for read 
		
		return value; //

	}

}
