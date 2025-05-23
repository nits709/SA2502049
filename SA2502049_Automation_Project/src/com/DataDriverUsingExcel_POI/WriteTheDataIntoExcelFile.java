package com.DataDriverUsingExcel_POI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WriteTheDataIntoExcelFile {
	// shortcut to import libraries = cntrl + shift + o from keyboard.

	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

	@Test
	public void writeDataInToFile() {

		rows = sheet.createRow(0);  // create a row at zero index
		cell = rows.createCell(0);  // create a cell inside row at zero index.
		cell.setCellValue("Piyush");
	}

	@BeforeTest
	public void beforeTest() {

		file = new File("MyFirstExcelFile.xlsx"); // create a file.
		try {
			fos = new FileOutputStream(file);
			wb = new XSSFWorkbook();
			// sheet = wb.createSheet(); this function create sheet by index
			sheet = wb.createSheet("MyFirstSheet");
		} catch (FileNotFoundException e) { // checked | compilation

			e.printStackTrace();
			e.getLocalizedMessage();
			e.getMessage();
		}

	}

	@AfterTest
	public void afterTest() throws IOException {
		
		wb.write(fos); // write the pysical data into the excel file.
		wb.close();
		fos.close();
		
		
	}

}
