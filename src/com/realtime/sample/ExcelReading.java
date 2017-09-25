package com.realtime.sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading {
	
	public void ReadExcelFile() throws IOException {
		
		 XSSFSheet ExcelWSheet;
		 
		 XSSFWorkbook ExcelWBook;

		 XSSFCell Cell;

		 XSSFRow Row;

		String Path ="G:\\Selenium\\testdata.xlsx";
		String SheetName ="Sheet1";
		int rownum = 0;
		try {

			// Open the Excel file

		FileInputStream ExcelFile = new FileInputStream(Path);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
		rownum= ExcelWSheet.getPhysicalNumberOfRows();
		
			for(int i=0;i<rownum;i++){
			
			int noOfColumns = ExcelWSheet.getRow(i).getPhysicalNumberOfCells();
			for(int j=0;j<noOfColumns;)
			{
				Cell = ExcelWSheet.getRow(i).getCell(j);
				Cell.setCellType(Cell.CELL_TYPE_STRING);
				
			//	Cell.setce
				 
				String username = Cell.getStringCellValue();
				Cell = ExcelWSheet.getRow(i).getCell(++j);
				Cell.setCellType(Cell.CELL_TYPE_STRING);

				String pwd = Cell.getStringCellValue();
				datadriven(username, pwd);
				
			//	System.out.println(CellData);
			}
		}

		
			
		} catch (Exception e){

			throw (e);

		}

}
	
	public void datadriven(String username, String pwd) {
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\DINESH REDDY\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);

		driver.close();
	}

public static void main(String args[]) throws IOException

{
	ExcelReading obj = new ExcelReading();
	obj.ReadExcelFile();
	
}

}
