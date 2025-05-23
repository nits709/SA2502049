package com.DataDriverUsingExcel_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {

	String filePath = "/Volumes/Renuka/TrainingExcelFiles/Book2.xlsx";

	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;

//	@Test
//	public void readDataFromExcelFile() {
//
//		rows = sheet.getRow(0);
//		cell = rows.getCell(0);
//
//		System.out.println(cell.getStringCellValue()); // username
//
//		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue()); // password
//		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue()); // result
//
//	}

	@Test
	public void readfullDataFromFile() {

		int totalsRows = sheet.getPhysicalNumberOfRows(); // would return total no. of rows

		int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells();// would return total no. of column

		for (int i = 0; i < totalsRows; i++) {

			rows = sheet.getRow(i);
			for (int j = 0; j < totalcolumns; j++) {

				cell = rows.getCell(j);

				System.out.print(cell.getStringCellValue() + "|");
			}

			System.out.println();
		}

	}

	@BeforeTest
	public void beforeTest() throws IOException {

		file = new File(filePath);
		System.out.println("is file exists " + file.exists());
		System.out.println("is file exists " + file.getAbsolutePath());
		try {
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("LoginData");
			// wb.getSheetAt(0);

		} catch (FileNotFoundException e) { // checked | compilation

			e.printStackTrace();
			e.getLocalizedMessage();
			e.getMessage();
		}

	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();

	}
}
