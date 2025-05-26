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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLoginData {

	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cell;
	int index = 0;

	@Test(dataProvider = "getLoginData")
	public void setLoginData(String username, String password, String flag) {

		rows = sheet.createRow(index);
		cell = rows.createCell(0);

		cell.setCellValue(username);

		// rows = sheet.createRow(0);
		cell = rows.createCell(1);

		cell.setCellValue(password);

		// rows = sheet.createRow(0);
		cell = rows.createCell(2);

		cell.setCellValue(flag);

		index++;

	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] { new Object[] { "UserName", "Password", "Flag" },
				new Object[] { "Deepak", "Paratkar", "true" }, new Object[] { "Pratik", "Patni", "false" },
				new Object[] { "Soumya", "tiwari", "true" }, new Object[] { "Rohit", "Yadav", "False" },
				new Object[] { "John", "Mathew", "true" },

		};
	}

	@BeforeTest
	public void beforeTest() {

		file = new File("CreateLoginDataFile.xlsx"); // create a file.
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
