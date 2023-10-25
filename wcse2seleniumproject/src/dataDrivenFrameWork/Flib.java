package dataDrivenFrameWork;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib        // we dont create main for useing Flib
{	
	//TO Store Gereric reusable Methods// non staic Meythod

	//read the data from excel sheet

	public String readExcelData(String excelpath,String sheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{ 
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);   
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);//get the desired row
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;

	}
	
	// to get the all row count
	public int rowcount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);

		int lastrow = sheet.getLastRowNum();  // it will read all the last row count
		return lastrow;


	}

	//to write data in excel sheet
	public void writexcelData(String excelpath,String sheetName,int rowcount,int cellcount,String prabhu) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(prabhu);



	}
}
























