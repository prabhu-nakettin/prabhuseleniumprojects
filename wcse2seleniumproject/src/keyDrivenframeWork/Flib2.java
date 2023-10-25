package keyDrivenframeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.interactions.Interactive;

public class Flib2 implements IAutoConstant
{
	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
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

		return value;
	}
}




