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

public class WriteDataIntoMultipleLines {

	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

	@Test
	public void WriteMultipleLines() {
		rows = sheet.createRow(0);
		cell = rows.createCell(0);
		cell.setCellValue("Nitin");
		
		//rows = sheet.createRow(0);
		cell = rows.createCell(1);
		cell.setCellValue("Sachin");
		
		
		rows = sheet.createRow(1);
		cell = rows.createCell(0);
		cell.setCellValue("Ketaki");
		
		cell = rows.createCell(1);
		cell.setCellValue("Rane");
		
		
		rows = sheet.createRow(2);
		cell = rows.createCell(0);
		cell.setCellValue("Neha");
		
		cell = rows.createCell(1);
		cell.setCellValue("Saxena");
		
		
		rows = sheet.createRow(3);
		cell = rows.createCell(0);
		cell.setCellValue("Swapnil");
		
		cell = rows.createCell(1);
		cell.setCellValue("Tiwari");
		
		
		
	}

	@BeforeTest
	public void beforeTest() {

		file = new File("MyMultipleLinesFile.xlsx"); // create a file.
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
